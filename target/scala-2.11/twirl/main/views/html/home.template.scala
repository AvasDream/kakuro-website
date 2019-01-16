
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object home_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: models.User)(implicit messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.78*/ ("""

"""), _display_( /*3.2*/ main(Messages("home.title"), Some(user)) /*3.42*/ {
            _display_(Seq[Any](format.raw /*3.44*/ ("""
    """), format.raw /*4.5*/ ("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""), _display_( /*7.35*/ Messages("welcome.signed.in")), format.raw /*7.64*/ ("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""), _display_( /*9.28*/ user /*9.32*/ .avatarURL.getOrElse(routes.Assets.at("images/silhouette.png"))), format.raw /*9.95*/ ("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*16.50*/ Messages("first.name")), format.raw /*16.72*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*16.107*/ user /*16.111*/ .firstName.getOrElse("None")), format.raw /*16.139*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*19.50*/ Messages("last.name")), format.raw /*19.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*19.106*/ user /*19.110*/ .lastName.getOrElse("None")), format.raw /*19.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*22.50*/ Messages("full.name")), format.raw /*22.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*22.106*/ user /*22.110*/ .fullName.getOrElse("None")), format.raw /*22.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*25.50*/ Messages("email")), format.raw /*25.67*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*25.102*/ user /*25.106*/ .email.getOrElse("None")), format.raw /*25.130*/ ("""</p>
                </div>
            </div>
        </div>
    </div>
""")))
          }), format.raw /*30.2*/ ("""
"""))
        }
      }
    }

    def render(user: models.User, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(user)(messages, webJarAssets)

    def f: ((models.User) => (Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messages, webJarAssets) => apply(user)(messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object home extends home_Scope0.home
/*
                  -- GENERATED --
                  DATE: Wed Jan 16 13:21:43 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/play-silhouette-seed/app/views/home.scala.html
                  HASH: 260b5d33263a23c44db9460b888e739317cc8097
                  MATRIX: 552->1|723->77|753->82|801->122|840->124|872->130|1042->274|1091->303|1198->384|1210->388|1293->451|1567->698|1610->720|1673->755|1687->759|1737->787|1878->901|1920->922|1983->957|1997->961|2046->988|2187->1102|2229->1123|2292->1158|2306->1162|2355->1189|2496->1303|2534->1320|2597->1355|2611->1359|2657->1383|2766->1462
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|33->9|33->9|33->9|40->16|40->16|40->16|40->16|40->16|43->19|43->19|43->19|43->19|43->19|46->22|46->22|46->22|46->22|46->22|49->25|49->25|49->25|49->25|49->25|54->30
                  -- GENERATED --
              */
