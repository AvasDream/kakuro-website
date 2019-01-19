
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
      <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.1/p5.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.1/addons/p5.dom.min.js"></script>
      <script src="/assets/vue/background.js"></script>
        <div class="row">
            <hr class="col-md-6" />
            <h4 class="col-md-8" style="color: white">"""), _display_( /*10.56*/ Messages("welcome.signed.in")), format.raw /*10.85*/ ("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""), _display_( /*12.28*/ user /*12.32*/ .avatarURL.getOrElse(routes.Assets.at("images/silhouette.png"))), format.raw /*12.95*/ ("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6" style="color: white"><strong>"""), _display_( /*19.71*/ Messages("first.name")), format.raw /*19.93*/ (""":</strong></p><p class="col-md-6" style="color: white">"""), _display_( /*19.149*/ user /*19.153*/ .firstName.getOrElse("None")), format.raw /*19.181*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6" style="color: white"><strong>"""), _display_( /*22.71*/ Messages("last.name")), format.raw /*22.92*/ (""":</strong></p><p class="col-md-6" style="color: white">"""), _display_( /*22.148*/ user /*22.152*/ .lastName.getOrElse("None")), format.raw /*22.179*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6" style="color: white"><strong>"""), _display_( /*25.71*/ Messages("full.name")), format.raw /*25.92*/ (""":</strong></p><p class="col-md-6" style="color: white">"""), _display_( /*25.148*/ user /*25.152*/ .fullName.getOrElse("None")), format.raw /*25.179*/ ("""</p>
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
                  DATE: Sat Jan 19 18:07:10 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/home.scala.html
                  HASH: f4d07959b4cfc8e6193a16c45b319b3f69eb5761
                  MATRIX: 552->1|723->77|753->82|801->122|840->124|872->130|1315->546|1365->575|1473->656|1486->660|1570->723|1865->991|1908->1013|1992->1069|2006->1073|2056->1101|2218->1236|2260->1257|2344->1313|2358->1317|2407->1344|2569->1479|2611->1500|2695->1556|2709->1560|2758->1587|2867->1666
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|34->10|34->10|36->12|36->12|36->12|43->19|43->19|43->19|43->19|43->19|46->22|46->22|46->22|46->22|46->22|49->25|49->25|49->25|49->25|49->25|54->30
                  -- GENERATED --
              */
