
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object snake_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class snake extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: models.User)(implicit messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.78*/ ("""

"""), _display_( /*3.2*/ main(Messages("snake.title"), Some(user)) /*3.43*/ {
            _display_(Seq[Any](format.raw /*3.45*/ ("""
  """), format.raw /*4.3*/ ("""<script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.1/p5.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.1/addons/p5.dom.min.js"></script>
  <!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/0.7.1/addons/p5.sound.min.js"></script> -->
  <script src="/assets/vue/snake.js"></script>
  <div class="row">
    <div class="col-lg-8">
      <div id="snakeCanvas"></div>
    </div>
    <div class="col-lg-4">
      <div class="well well-lg kakuro-controlls">
        <h3 class="controll_text">Snake</h3>
        <hr>
        <p class="controll_text">Use the arrow keys or "w","a","s","d" to navigate.</p>
        <hr>
        <div class="snake_setting">
          <h3 class="controll_text" id="snake_score">Score: 0</h3>
        </div>
        <div class="radio">
          <label style="color: white"><input type="radio" id="l1" value="Level 1" name="optradio" style="color: white" checked>Level 1</label>
        </div>
        <div class="radio">
          <label style="color: white"><input type="radio" id="l2" value="Level 2" class="controll_text" style="color: white" name="optradio">Level 2</label>
        </div>
        <div class="radio disabled">
          <label style="color: white"><input type="radio" id="l3"  value="Level 3" class="controll_text"  name="optradio">Level 3</label>
        </div>
        <button id="snake_start" type="button" class="btn btn-secondary" onclick="startGame()">Start</button>
      </div>
    </div>
  </div>
""")))
          }), format.raw /*34.2*/ ("""
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
object snake extends snake_Scope0.snake
/*
                  -- GENERATED --
                  DATE: Mon Jan 21 13:35:24 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/snake.scala.html
                  HASH: dc3ab2d43627ba6e43e641484a8e21f884c4eb1a
                  MATRIX: 554->1|725->77|755->82|804->123|843->125|873->129|2439->1665
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|58->34
                  -- GENERATED --
              */
