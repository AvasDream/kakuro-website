
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

  class kakuro extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: models.User)(implicit messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.78*/ ("""

"""), _display_( /*3.2*/ main(Messages("kakuro.title"), Some(user)) /*3.44*/ {
            _display_(Seq[Any](format.raw /*3.46*/ ("""
  """), format.raw /*4.3*/ ("""<script src="/assets/vue/vue.js"></script>
  <script src="/assets/vue/app.js"></script>
  <div class="row">
    <div class="col-lg-8">
      <div class="container" id="app">
      </div>
    </div>
    <div class="col-lg-4">
      <div class="well well-lg kakuro-controlls">
        <h3 class="controll_text">Cotrolls</h3>
        <hr>
        <h4 class="controll_text controll_text_header">Set Value:</h4>
        <p class="controll_text">To set a value, click on the Cell and then press the key of the number you want to insert.</p>
        <h4 class="controll_text controll_text_header">Delete Value:</h4>
        <p class="controll_text">To delete a value, click on the Cell and then press "d".</p>
        <h4 class="controll_text controll_text_header">Undo:</h4>
        <p class="controll_text">To undo your last move press "u" or Backspace.</p>
        <h4 class="controll_text controll_text_header">Redo:</h4>
        <p class="controll_text">To redo your last move press "r"</p>
        <h4 class="controll_text controll_text_header">Save:</h4>
        <p class="controll_text">To save the game press "s"</p>
        <h4 class="controll_text controll_text_header">Load:</h4>
        <p class="controll_text">To load a previous saved game press "l"</p>
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
object kakuro extends kakuro_Scope0.kakuro
/*
                  -- GENERATED --
                  DATE: Mon Jan 21 13:08:40 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/kakuro.scala.html
                  HASH: 1bedbbf78197a16aacf5106ad6bdf35c22091d73
                  MATRIX: 556->1|727->77|757->82|807->124|846->126|876->130|2228->1452
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|54->30
                  -- GENERATED --
              */
