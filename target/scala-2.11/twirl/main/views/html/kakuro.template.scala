
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object kakuro_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class kakuro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[models.User,scala.collection.mutable.Map[String, Int],Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, fieldMap: scala.collection.mutable.Map[String, Int])(implicit messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.131*/("""

"""),_display_(/*3.2*/main(Messages("home.title"), Some(user))/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""
  """),format.raw/*4.3*/("""<div class="container">
      <div class="row justify-content-center">
          <button type="button" class="btn btn-primary" id="initButton">Start Game</button>
          <button type="button" class="btn btn-primary" id="clearButton">Clear Game</button>
      </div>
      <div class="row justify-content-center">
          <div class="col-sm-6">
              <div class="input-group">
                  <div class="input-group-prepend">
                      <span class="input-group-text" id="">Set: row col value</span>
                  </div>
                  <input type="text" class="form-control" id="row" value="">
                  <input type="text" class="form-control" id="col" value="">
                  <input type="text" class="form-control" id="value" value="">
                  <button type="button" class="btn btn-success" id="setButton">Set</button>
              </div>
          </div>
      </div>
      <br>
      <div class="row justify-content-center">
          <div class="col-lg-6">
              <table class="table table-bordered table-dark">
                  <thead>
                  <tr>
                      <th scope="col">#</th>
                      <th scope="col">1</th>
                      <th scope="col">2</th>
                      <th scope="col">3</th>
                      <th scope="col">4</th>
                      <th scope="col">5</th>
                      <th scope="col">6</th>
                      <th scope="col">7</th>
                      <th scope="col">8</th>
                  </tr>
                  </thead>
                  <tbody>
                  """),_display_(/*40.20*/for(row <- 0 until 8) yield /*40.41*/ {_display_(Seq[Any](format.raw/*40.43*/("""
                      """),format.raw/*41.23*/("""<tr>
                          <th class="align-content-center" scope="row">"""),_display_(/*42.73*/(row + 1)),format.raw/*42.82*/("""</th>
                              <div>
                                  """),_display_(/*44.36*/for(col <- 0 until 8) yield /*44.57*/ {_display_(Seq[Any](format.raw/*44.59*/("""
                                      """),_display_(/*45.40*/if(fieldMap.get(row.toString + "." + col.toString).get == 1)/*45.100*/ {_display_(Seq[Any](format.raw/*45.102*/("""
                                          """),format.raw/*46.43*/("""<td class="align-middle" id=""""),_display_(/*46.73*/row),format.raw/*46.76*/("""."""),_display_(/*46.78*/col),format.raw/*46.81*/(""""></td>
                                      """)))}),format.raw/*47.40*/("""
                                      """),_display_(/*48.40*/if(fieldMap.get(row.toString + "." + col.toString).get == 2)/*48.100*/{_display_(Seq[Any](format.raw/*48.101*/("""
                                          """),format.raw/*49.43*/("""<td class="success" id=""""),_display_(/*49.68*/row),format.raw/*49.71*/("""."""),_display_(/*49.73*/col),format.raw/*49.76*/("""">
                                              <table class="table-borderless table-sm">
                                                  <tbody>
                                                      <tr id=""""),_display_(/*52.64*/row),format.raw/*52.67*/("""."""),_display_(/*52.69*/col),format.raw/*52.72*/(""".1">
                                                          <td></td>
                                                          <td id=""""),_display_(/*54.68*/row),format.raw/*54.71*/("""."""),_display_(/*54.73*/col),format.raw/*54.76*/(""".1.2"></td>
                                                      </tr>
                                                      <tr id=""""),_display_(/*56.64*/row),format.raw/*56.67*/("""."""),_display_(/*56.69*/col),format.raw/*56.72*/(""".2">
                                                          <td id=""""),_display_(/*57.68*/row),format.raw/*57.71*/("""."""),_display_(/*57.73*/col),format.raw/*57.76*/(""".2.1"></td>
                                                          <td></td>
                                                      </tr>
                                                  </tbody>
                                              </table>
                                          </td>
                                      """)))}),format.raw/*63.40*/("""
                                      """),_display_(/*64.40*/if(fieldMap.get(row.toString + "." + col.toString).get == 0)/*64.100*/{_display_(Seq[Any](format.raw/*64.101*/("""
                                          """),format.raw/*65.43*/("""<td id=""""),_display_(/*65.52*/row),format.raw/*65.55*/("""."""),_display_(/*65.57*/col),format.raw/*65.60*/(""""></td>
                                      """)))}),format.raw/*66.40*/("""
                                  """)))}),format.raw/*67.36*/("""
                              """),format.raw/*68.31*/("""</div>
                      </tr>
                  """)))}),format.raw/*70.20*/("""
                  """),format.raw/*71.19*/("""</tbody>
              </table>
          </div>
      </div>
      <div class="row justify-content-center">
          <button type="button" class="btn btn-primary" id="undoButton">Undo</button>
          <button type="button" class="btn btn-primary" id="redoButton">Redo</button>
          <button type="button" class="btn btn-primary" id="saveButton">Save</button>
          <button type="button" class="btn btn-primary" id="loadButton">Load</button>
          <button type="button" class="btn btn-primary" id="clearValButton">Clear</button>
          <button type="button" class="btn btn-primary" id="checkButton">Check</button>
      </div>
  </div>
""")))}),format.raw/*84.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,fieldMap:scala.collection.mutable.Map[String, Int],messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(user,fieldMap)(messages,webJarAssets)

  def f:((models.User,scala.collection.mutable.Map[String, Int]) => (Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (user,fieldMap) => (messages,webJarAssets) => apply(user,fieldMap)(messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object kakuro extends kakuro_Scope0.kakuro
              /*
                  -- GENERATED --
                  DATE: Wed Jan 16 17:45:11 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/kakuro.scala.html
                  HASH: bbbd6294e53130d478b88f50aab97e5032ed6bb3
                  MATRIX: 598->1|823->130|853->135|901->175|940->177|970->181|2663->1847|2700->1868|2740->1870|2792->1894|2897->1972|2927->1981|3033->2060|3070->2081|3110->2083|3178->2124|3248->2184|3289->2186|3361->2230|3418->2260|3442->2263|3471->2265|3495->2268|3574->2316|3642->2357|3712->2417|3752->2418|3824->2462|3876->2487|3900->2490|3929->2492|3953->2495|4195->2710|4219->2713|4248->2715|4272->2718|4441->2860|4465->2863|4494->2865|4518->2868|4682->3005|4706->3008|4735->3010|4759->3013|4859->3086|4883->3089|4912->3091|4936->3094|5314->3441|5382->3482|5452->3542|5492->3543|5564->3587|5600->3596|5624->3599|5653->3601|5677->3604|5756->3652|5824->3689|5884->3721|5971->3777|6019->3797|6717->4465
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|64->40|64->40|64->40|65->41|66->42|66->42|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|70->46|70->46|71->47|72->48|72->48|72->48|73->49|73->49|73->49|73->49|73->49|76->52|76->52|76->52|76->52|78->54|78->54|78->54|78->54|80->56|80->56|80->56|80->56|81->57|81->57|81->57|81->57|87->63|88->64|88->64|88->64|89->65|89->65|89->65|89->65|89->65|90->66|91->67|92->68|94->70|95->71|108->84
                  -- GENERATED --
              */
          