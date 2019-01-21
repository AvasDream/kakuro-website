
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object main_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String, Option[models.User], Html, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (title: String, user: Option[models.User] = None)(content: Html)(implicit messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.123*/ ("""

"""), format.raw /*3.1*/ ("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""), _display_( /*9.59*/ routes /*9.65*/ .Assets.at("images/favicon.ico")), format.raw /*9.97*/ ("""">
        <title>"""), _display_( /*10.17*/ title), format.raw /*10.22*/ ("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        <link rel="stylesheet" href=""""), _display_( /*13.39*/ routes /*13.45*/ .WebJarAssets.at(webJarAssets.locate("bootstrap.min.css"))), format.raw /*13.103*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*14.39*/ routes /*14.45*/ .WebJarAssets.at(webJarAssets.locate("bootstrap-theme.min.css"))), format.raw /*14.109*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*15.39*/ routes /*15.45*/ .Assets.at("styles/main.css")), format.raw /*15.74*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*16.39*/ routes /*16.45*/ .Assets.at("styles/kakuro.css")), format.raw /*16.76*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*17.39*/ routes /*17.45*/ .Assets.at("styles/snake.css")), format.raw /*17.75*/ ("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script type="text/javascript" src=""""), _display_( /*23.46*/ routes /*23.52*/ .WebJarAssets.at(webJarAssets.locate("jquery.min.js"))), format.raw /*23.106*/ (""""></script>
        <script type="text/javascript" src=""""), _display_( /*24.46*/ routes /*24.52*/ .WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))), format.raw /*24.109*/ (""""></script>
        <script type="text/javascript" src=""""), _display_( /*25.46*/ routes /*25.52*/ .Assets.at("javascripts/main.js")), format.raw /*25.85*/ (""""></script>

    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""), _display_( /*33.48*/ Messages("toggle.navigation")), format.raw /*33.77*/ ("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""), _display_( /*38.52*/ routes /*38.58*/ .ApplicationController.index), format.raw /*38.86*/ ("""">Game Center</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        """), _display_( /*42.26*/ user /*42.30*/ .map /*42.34*/ { u =>
            _display_(Seq[Any](format.raw /*42.41*/ ("""
                          """), format.raw /*43.27*/ ("""<li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Kakuro<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href=""""), _display_( /*46.45*/ routes /*46.51*/ .KakuroController.kakuro), format.raw /*46.75*/ ("""">Game</a></li>
                              <li><a href=""""), _display_( /*47.45*/ routes /*47.51*/ .KakuroController.rules), format.raw /*47.74*/ ("""">Rules</a></li>
                            </ul>
                          </li>
                          <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Snake<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href=""""), _display_( /*53.45*/ routes /*53.51*/ .SnakeController.snake), format.raw /*53.73*/ ("""">Game</a></li>
                            </ul>
                          </li>
                        """)))
          }), format.raw /*56.26*/ ("""
                    """), format.raw /*57.21*/ ("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                        """), _display_( /*59.26*/ user /*59.30*/ .map /*59.34*/ { u =>
            _display_(Seq[Any](format.raw /*59.41*/ ("""
                            """), format.raw /*60.29*/ ("""<li><a href=""""), _display_( /*60.43*/ routes /*60.49*/ .ApplicationController.index), format.raw /*60.77*/ ("""">"""), _display_( /*60.80*/ u /*60.81*/ .fullName), format.raw /*60.90*/ ("""</a></li>
                            <li><a href=""""), _display_( /*61.43*/ routes /*61.49*/ .ApplicationController.signOut), format.raw /*61.79*/ ("""">"""), _display_( /*61.82*/ Messages("sign.out")), format.raw /*61.102*/ ("""</a></li>
                        """)))
          } /*62.26*/ .getOrElse /*62.36*/ {
            _display_(Seq[Any](format.raw /*62.38*/ ("""
                            """), format.raw /*63.29*/ ("""<li><a href=""""), _display_( /*63.43*/ routes /*63.49*/ .SignInController.view), format.raw /*63.71*/ ("""">"""), _display_( /*63.74*/ Messages("sign.in")), format.raw /*63.93*/ ("""</a></li>
                            <li><a href=""""), _display_( /*64.43*/ routes /*64.49*/ .SignUpController.view), format.raw /*64.71*/ ("""">"""), _display_( /*64.74*/ Messages("sign.up")), format.raw /*64.93*/ ("""</a></li>
                        """)))
          }), format.raw /*65.26*/ ("""
                    """), format.raw /*66.21*/ ("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """), _display_( /*72.18*/ content), format.raw /*72.25*/ ("""
            """), format.raw /*73.13*/ ("""</div>
        </main>

    </body>
</html>
"""))
        }
      }
    }

    def render(title: String, user: Option[models.User], content: Html, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(title, user)(content)(messages, webJarAssets)

    def f: ((String, Option[models.User]) => (Html) => (Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (title, user) => (content) => (messages, webJarAssets) => apply(title, user)(content)(messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object main extends main_Scope0.main
/*
                  -- GENERATED --
                  DATE: Mon Jan 21 13:03:32 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/main.scala.html
                  HASH: b492cbbed85731f92f2957e4369cb912011dc65a
                  MATRIX: 572->1|789->122|819->126|1123->404|1137->410|1189->442|1236->462|1262->467|1568->746|1583->752|1663->810|1732->852|1747->858|1833->922|1902->964|1917->970|1967->999|2036->1041|2051->1047|2103->1078|2172->1120|2187->1126|2238->1156|2654->1545|2669->1551|2745->1605|2830->1663|2845->1669|2924->1726|3009->1784|3024->1790|3078->1823|3477->2195|3527->2224|3813->2483|3828->2489|3877->2517|4077->2690|4090->2694|4103->2698|4148->2705|4204->2733|4536->3038|4551->3044|4596->3068|4684->3129|4699->3135|4743->3158|5186->3574|5201->3580|5244->3602|5385->3712|5435->3734|5556->3828|5569->3832|5582->3836|5627->3843|5685->3873|5726->3887|5741->3893|5790->3921|5820->3924|5830->3925|5860->3934|5940->3987|5955->3993|6006->4023|6036->4026|6078->4046|6133->4082|6152->4092|6192->4094|6250->4124|6291->4138|6306->4144|6349->4166|6379->4169|6419->4188|6499->4241|6514->4247|6557->4269|6587->4272|6627->4291|6694->4327|6744->4349|6940->4518|6968->4525|7010->4539
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|57->33|57->33|62->38|62->38|62->38|66->42|66->42|66->42|66->42|67->43|70->46|70->46|70->46|71->47|71->47|71->47|77->53|77->53|77->53|80->56|81->57|83->59|83->59|83->59|83->59|84->60|84->60|84->60|84->60|84->60|84->60|84->60|85->61|85->61|85->61|85->61|85->61|86->62|86->62|86->62|87->63|87->63|87->63|87->63|87->63|87->63|88->64|88->64|88->64|88->64|88->64|89->65|90->66|96->72|96->72|97->73
                  -- GENERATED --
              */
