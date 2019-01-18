package controllers

import javax.inject.Inject

import com.mohiva.play.silhouette.api.{ LogoutEvent, Silhouette }
import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc.Controller
import utils.auth.DefaultEnv

import scala.concurrent.Future

import play.api.mvc._
import com.google.inject.Guice
import de.htwg.se.kakuro.controller.controllerComponent.ControllerInterface
import de.htwg.se.kakuro.KakuroModule
import de.htwg.se.kakuro.model.fieldComponent.{ CellInterface, FieldInterface }
import play.api.Logger
import play.api.libs.json._
/**
 * The basic application controller.
 *
 * @param messagesApi The Play messages API.
 * @param silhouette The Silhouette stack.
 * @param socialProviderRegistry The social provider registry.
 * @param webJarAssets The webjar assets implementation.
 */
class KakuroController @Inject() (
  val messagesApi: MessagesApi,
  silhouette: Silhouette[DefaultEnv],
  socialProviderRegistry: SocialProviderRegistry,
  implicit val webJarAssets: WebJarAssets)
  extends Controller with I18nSupport {

  /**
   * Handles the index action.
   *
   * @return The result to display.
   *
   * def index = silhouette.SecuredAction.async { implicit request =>
   * Future.successful(Ok(views.html.home(request.identity)))
   * }
   */

  val injector = Guice.createInjector(new KakuroModule)
  val controller = injector.getInstance(classOf[ControllerInterface])
  val helper = new helper;

  def kakuro = silhouette.SecuredAction.async { implicit request =>
    controller.initField
    var states = helper.getCellType(controller.getField)
    Future.successful(Ok(views.html.kakuro(request.identity, states)))
  }

  def rules = silhouette.SecuredAction.async { implicit request =>
    Future.successful(Ok(views.html.rules(request.identity)))
  }

  def initGame = silhouette.UnsecuredAction.async { implicit request =>
    controller.initField;
    val jsonField = helper.gridToJson(controller.getField).toString();
    //printf("%s", jsonField.toString())
    Future.successful(Ok(jsonField))
  }

  def setValue(row: Int, col: Int, value: Int) = silhouette.UnsecuredAction.async { implicit request =>
    controller.set(row, col, value)
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }

  def deleteValue(row: Int, col: Int) = silhouette.UnsecuredAction.async { implicit request =>
    controller.clear(row, col)
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }

  def undo = silhouette.UnsecuredAction.async { implicit request =>
    controller.undo
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }

  def redo = silhouette.UnsecuredAction.async { implicit request =>
    controller.redo
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }

  def save = silhouette.UnsecuredAction.async { implicit request =>
    controller.save
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }

  def load = silhouette.UnsecuredAction.async { implicit request =>
    controller.load
    val jsonField = helper.gridToJson(controller.getField).toString()
    Future.successful(Ok(jsonField))
  }
  /*
  Replace this with correct function
  */
  def test = silhouette.UnsecuredAction.async { implicit request =>
    Future.successful(Ok(views.html.test()))
  }

}

class helper() {

  def gridToJson(grid: FieldInterface): JsObject = {
    Json.obj(
      "grid" -> Json.obj(
        "width" -> JsNumber(grid.width),
        "height" -> JsNumber(grid.height),
        "cells" -> Json.toJson(
          for {
            row <- 0 until grid.width
            col <- 0 until grid.height
          } yield {
            Json.obj(
              "row" -> row,
              "col" -> col,
              "cell" -> Json.toJson(grid.cell(row, col))
            )
          }
        )
      )
    )
  }
  implicit val cellWrites: Writes[CellInterface] {
    def writes(cell: CellInterface): JsObject
  } = new Writes[CellInterface] {

    def writes(cell: CellInterface): JsObject = Json.obj(
      "value" -> cell.value,
      "right" -> cell.rightSum,
      "down" -> cell.downSum,
      "type" -> { if (cell.isWhite) 1 else if (cell.isBlack) 2 else 0 }
    )
  }

  def getCellType(grid: FieldInterface): scala.collection.mutable.Map[String, Int] = {
    var states = scala.collection.mutable.Map[String, Int]()
    for {
      row <- 0 until grid.width
      col <- 0 until grid.height
    } yield {
      if (grid.isWhite(row, col)) {
        states += (row.toString + "." + col.toString -> 1)
      } else if (grid.isBlack(row, col)) {
        states += (row.toString + "." + col.toString -> 2)
      } else {
        states += (row.toString + "." + col.toString -> 0)
      }
    }
    states
  }
}
