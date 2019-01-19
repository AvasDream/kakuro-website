
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
                        <li><a href=""""), _display_( /*42.39*/ routes /*42.45*/ .ApplicationController.index), format.raw /*42.73*/ ("""">"""), _display_( /*42.76*/ Messages("home")), format.raw /*42.92*/ ("""</a></li>
                        """), _display_( /*43.26*/ user /*43.30*/ .map /*43.34*/ { u =>
            _display_(Seq[Any](format.raw /*43.41*/ ("""
                          """), format.raw /*44.27*/ ("""<li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Kakuro<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href=""""), _display_( /*47.45*/ routes /*47.51*/ .KakuroController.kakuro), format.raw /*47.75*/ ("""">Game</a></li>
                              <li><a href=""""), _display_( /*48.45*/ routes /*48.51*/ .KakuroController.rules), format.raw /*48.74*/ ("""">Rules</a></li>
                            </ul>
                          </li>
                          <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Snake<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href=""""), _display_( /*54.45*/ routes /*54.51*/ .SnakeController.snake), format.raw /*54.73*/ ("""">Game</a></li>
                            </ul>
                          </li>
                        """)))
          }), format.raw /*57.26*/ ("""
                    """), format.raw /*58.21*/ ("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                        """), _display_( /*60.26*/ user /*60.30*/ .map /*60.34*/ { u =>
            _display_(Seq[Any](format.raw /*60.41*/ ("""
                            """), format.raw /*61.29*/ ("""<li><a href=""""), _display_( /*61.43*/ routes /*61.49*/ .ApplicationController.index), format.raw /*61.77*/ ("""">"""), _display_( /*61.80*/ u /*61.81*/ .fullName), format.raw /*61.90*/ ("""</a></li>
                            <li><a href=""""), _display_( /*62.43*/ routes /*62.49*/ .ApplicationController.signOut), format.raw /*62.79*/ ("""">"""), _display_( /*62.82*/ Messages("sign.out")), format.raw /*62.102*/ ("""</a></li>
                        """)))
          } /*63.26*/ .getOrElse /*63.36*/ {
            _display_(Seq[Any](format.raw /*63.38*/ ("""
                            """), format.raw /*64.29*/ ("""<li><a href=""""), _display_( /*64.43*/ routes /*64.49*/ .SignInController.view), format.raw /*64.71*/ ("""">"""), _display_( /*64.74*/ Messages("sign.in")), format.raw /*64.93*/ ("""</a></li>
                            <li><a href=""""), _display_( /*65.43*/ routes /*65.49*/ .SignUpController.view), format.raw /*65.71*/ ("""">"""), _display_( /*65.74*/ Messages("sign.up")), format.raw /*65.93*/ ("""</a></li>
                        """)))
          }), format.raw /*66.26*/ ("""
                    """), format.raw /*67.21*/ ("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """), _display_( /*73.18*/ content), format.raw /*73.25*/ ("""
            """), format.raw /*74.13*/ ("""</div>
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
                  DATE: Sat Jan 19 14:08:06 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/main.scala.html
                  HASH: ede8cd054564a2a9260f6023010bb42c591f57fd
                  MATRIX: 572->1|789->122|819->126|1123->404|1137->410|1189->442|1236->462|1262->467|1568->746|1583->752|1663->810|1732->852|1747->858|1833->922|1902->964|1917->970|1967->999|2036->1041|2051->1047|2103->1078|2172->1120|2187->1126|2238->1156|2654->1545|2669->1551|2745->1605|2830->1663|2845->1669|2924->1726|3009->1784|3024->1790|3078->1823|3477->2195|3527->2224|3813->2483|3828->2489|3877->2517|4090->2703|4105->2709|4154->2737|4184->2740|4221->2756|4284->2792|4297->2796|4310->2800|4355->2807|4411->2835|4743->3140|4758->3146|4803->3170|4891->3231|4906->3237|4950->3260|5393->3676|5408->3682|5451->3704|5592->3814|5642->3836|5763->3930|5776->3934|5789->3938|5834->3945|5892->3975|5933->3989|5948->3995|5997->4023|6027->4026|6037->4027|6067->4036|6147->4089|6162->4095|6213->4125|6243->4128|6285->4148|6340->4184|6359->4194|6399->4196|6457->4226|6498->4240|6513->4246|6556->4268|6586->4271|6626->4290|6706->4343|6721->4349|6764->4371|6794->4374|6834->4393|6901->4429|6951->4451|7147->4620|7175->4627|7217->4641
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|57->33|57->33|62->38|62->38|62->38|66->42|66->42|66->42|66->42|66->42|67->43|67->43|67->43|67->43|68->44|71->47|71->47|71->47|72->48|72->48|72->48|78->54|78->54|78->54|81->57|82->58|84->60|84->60|84->60|84->60|85->61|85->61|85->61|85->61|85->61|85->61|85->61|86->62|86->62|86->62|86->62|86->62|87->63|87->63|87->63|88->64|88->64|88->64|88->64|88->64|88->64|89->65|89->65|89->65|89->65|89->65|90->66|91->67|97->73|97->73|98->74
                  -- GENERATED --
              */
