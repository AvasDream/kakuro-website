
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
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""), _display_( /*27.48*/ Messages("toggle.navigation")), format.raw /*27.77*/ ("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""), _display_( /*32.52*/ routes /*32.58*/ .ApplicationController.index), format.raw /*32.86*/ ("""">Game Center</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""), _display_( /*36.39*/ routes /*36.45*/ .ApplicationController.index), format.raw /*36.73*/ ("""">"""), _display_( /*36.76*/ Messages("home")), format.raw /*36.92*/ ("""</a></li>
                        """), _display_( /*37.26*/ user /*37.30*/ .map /*37.34*/ { u =>
            _display_(Seq[Any](format.raw /*37.41*/ ("""
                          """), format.raw /*38.27*/ ("""<li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Kakuro<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href=""""), _display_( /*41.45*/ routes /*41.51*/ .KakuroController.kakuro), format.raw /*41.75*/ ("""">Game</a></li>
                              <li><a href=""""), _display_( /*42.45*/ routes /*42.51*/ .KakuroController.rules), format.raw /*42.74*/ ("""">Rules</a></li>
                            </ul>
                          </li>
                          <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Snake<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                              <li><a href="#">Game</a></li>
                              <li><a href="#">Rules</a></li>
                            </ul>
                          </li>
                        """)))
          }), format.raw /*52.26*/ ("""
                    """), format.raw /*53.21*/ ("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                        """), _display_( /*55.26*/ user /*55.30*/ .map /*55.34*/ { u =>
            _display_(Seq[Any](format.raw /*55.41*/ ("""
                            """), format.raw /*56.29*/ ("""<li><a href=""""), _display_( /*56.43*/ routes /*56.49*/ .ApplicationController.index), format.raw /*56.77*/ ("""">"""), _display_( /*56.80*/ u /*56.81*/ .fullName), format.raw /*56.90*/ ("""</a></li>
                            <li><a href=""""), _display_( /*57.43*/ routes /*57.49*/ .ApplicationController.signOut), format.raw /*57.79*/ ("""">"""), _display_( /*57.82*/ Messages("sign.out")), format.raw /*57.102*/ ("""</a></li>
                        """)))
          } /*58.26*/ .getOrElse /*58.36*/ {
            _display_(Seq[Any](format.raw /*58.38*/ ("""
                            """), format.raw /*59.29*/ ("""<li><a href=""""), _display_( /*59.43*/ routes /*59.49*/ .SignInController.view), format.raw /*59.71*/ ("""">"""), _display_( /*59.74*/ Messages("sign.in")), format.raw /*59.93*/ ("""</a></li>
                            <li><a href=""""), _display_( /*60.43*/ routes /*60.49*/ .SignUpController.view), format.raw /*60.71*/ ("""">"""), _display_( /*60.74*/ Messages("sign.up")), format.raw /*60.93*/ ("""</a></li>
                        """)))
          }), format.raw /*61.26*/ ("""
                    """), format.raw /*62.21*/ ("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """), _display_( /*68.18*/ content), format.raw /*68.25*/ ("""
            """), format.raw /*69.13*/ ("""</div>
        </main>
        <script type="text/javascript" src=""""), _display_( /*71.46*/ routes /*71.52*/ .WebJarAssets.at(webJarAssets.locate("jquery.min.js"))), format.raw /*71.106*/ (""""></script>
        <script type="text/javascript" src=""""), _display_( /*72.46*/ routes /*72.52*/ .WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))), format.raw /*72.109*/ (""""></script>
        <script type="text/javascript" src=""""), _display_( /*73.46*/ routes /*73.52*/ .Assets.at("javascripts/main.js")), format.raw /*73.85*/ (""""></script>
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
                  DATE: Wed Jan 16 16:37:38 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/main.scala.html
                  HASH: 35ef281caf40a3d598619ffba0c32410720484a1
                  MATRIX: 572->1|789->122|819->126|1123->404|1137->410|1189->442|1236->462|1262->467|1568->746|1583->752|1663->810|1732->852|1747->858|1833->922|1902->964|1917->970|1967->999|2699->1704|2749->1733|3035->1992|3050->1998|3099->2026|3312->2212|3327->2218|3376->2246|3406->2249|3443->2265|3506->2301|3519->2305|3532->2309|3577->2316|3633->2344|3965->2649|3980->2655|4025->2679|4113->2740|4128->2746|4172->2769|4791->3357|4841->3379|4962->3473|4975->3477|4988->3481|5033->3488|5091->3518|5132->3532|5147->3538|5196->3566|5226->3569|5236->3570|5266->3579|5346->3632|5361->3638|5412->3668|5442->3671|5484->3691|5539->3727|5558->3737|5598->3739|5656->3769|5697->3783|5712->3789|5755->3811|5785->3814|5825->3833|5905->3886|5920->3892|5963->3914|5993->3917|6033->3936|6100->3972|6150->3994|6346->4163|6374->4170|6416->4184|6513->4254|6528->4260|6604->4314|6689->4372|6704->4378|6783->4435|6868->4493|6883->4499|6937->4532
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|51->27|51->27|56->32|56->32|56->32|60->36|60->36|60->36|60->36|60->36|61->37|61->37|61->37|61->37|62->38|65->41|65->41|65->41|66->42|66->42|66->42|76->52|77->53|79->55|79->55|79->55|79->55|80->56|80->56|80->56|80->56|80->56|80->56|80->56|81->57|81->57|81->57|81->57|81->57|82->58|82->58|82->58|83->59|83->59|83->59|83->59|83->59|83->59|84->60|84->60|84->60|84->60|84->60|85->61|86->62|92->68|92->68|93->69|95->71|95->71|95->71|96->72|96->72|96->72|97->73|97->73|97->73
                  -- GENERATED --
              */
