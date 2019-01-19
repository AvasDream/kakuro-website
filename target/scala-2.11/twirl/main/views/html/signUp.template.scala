
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object signUp_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[forms.SignUpForm.Data], RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (signInForm: Form[forms.SignUpForm.Data])(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.124*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ main(Messages("sign.up.title")) /*5.33*/ {
            _display_(Seq[Any](format.raw /*5.35*/ ("""
    """), _display_( /*6.6*/ request /*6.13*/ .flash.get("error").map /*6.36*/ { msg =>
              _display_(Seq[Any](format.raw /*6.45*/ ("""
        """), format.raw /*7.9*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-danger alert-error">
            <a href="#" class="close" data-dismiss="alert">&times;</a>
            <strong>"""), _display_( /*9.22*/ Messages("error")), format.raw /*9.39*/ ("""</strong> """), _display_( /*9.50*/ msg), format.raw /*9.53*/ ("""
        """), format.raw /*10.9*/ ("""</div>
    """)))
            }), format.raw /*11.6*/ ("""
    """), format.raw /*12.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*13.18*/ Messages("sign.up.account")), format.raw /*13.45*/ ("""</legend>
        """), _display_( /*14.10*/ helper /*14.16*/ .form(action = routes.SignUpController.submit()) /*14.64*/ {
              _display_(Seq[Any](format.raw /*14.66*/ ("""
            """), _display_( /*15.14*/ helper /*15.20*/ .CSRF.formField), format.raw /*15.35*/ ("""
            """), _display_( /*16.14*/ b3 /*16.16*/ .text(signInForm("firstName"), '_hiddenLabel -> Messages("first.name"), 'placeholder -> Messages("first.name"), 'class -> "form-control input-lg")), format.raw /*16.162*/ ("""
            """), _display_( /*17.14*/ b3 /*17.16*/ .text(signInForm("lastName"), '_hiddenLabel -> Messages("last.name"), 'placeholder -> Messages("last.name"), 'class -> "form-control input-lg")), format.raw /*17.159*/ ("""
            """), _display_( /*18.14*/ b3 /*18.16*/ .text(signInForm("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg")), format.raw /*18.148*/ ("""
            """), _display_( /*19.14*/ b3 /*19.16*/ .password(signInForm("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg")), format.raw /*19.161*/ ("""
            """), format.raw /*20.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*22.112*/ Messages("sign.up")), format.raw /*22.131*/ ("""</button>
                </div>
            </div>
            <div class="sign-in-now">
                <p>"""), _display_( /*26.21*/ Messages("already.a.member")), format.raw /*26.49*/ (""" """), format.raw /*26.50*/ ("""<a href=""""), _display_( /*26.60*/ routes /*26.66*/ .SignInController.view), format.raw /*26.88*/ ("""">"""), _display_( /*26.91*/ Messages("sign.in.now")), format.raw /*26.114*/ ("""</a></p>
            </div>
        """)))
            }), format.raw /*28.10*/ ("""
    """), format.raw /*29.5*/ ("""</fieldset>
""")))
          }), format.raw /*30.2*/ ("""
"""))
        }
      }
    }

    def render(signInForm: Form[forms.SignUpForm.Data], request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(signInForm)(request, messages, webJarAssets)

    def f: ((Form[forms.SignUpForm.Data]) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (signInForm) => (request, messages, webJarAssets) => apply(signInForm)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object signUp extends signUp_Scope0.signUp
/*
                  -- GENERATED --
                  DATE: Wed Jan 16 19:44:40 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/signUp.scala.html
                  HASH: f9f207507433b451516b90ff4485fb346ac66e76
                  MATRIX: 586->1|837->123|867->163|895->166|934->197|973->199|1005->206|1020->213|1051->236|1097->245|1133->255|1323->419|1360->436|1397->447|1420->450|1457->460|1500->473|1533->479|1622->541|1670->568|1717->588|1732->594|1789->642|1829->644|1871->659|1886->665|1922->680|1964->695|1975->697|2143->843|2185->858|2196->860|2361->1003|2403->1018|2414->1020|2568->1152|2610->1167|2621->1169|2788->1314|2830->1328|3018->1488|3059->1507|3200->1621|3249->1649|3278->1650|3315->1660|3330->1666|3373->1688|3403->1691|3448->1714|3518->1753|3551->1759|3595->1773
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|30->7|32->9|32->9|32->9|32->9|33->10|34->11|35->12|36->13|36->13|37->14|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|45->22|45->22|49->26|49->26|49->26|49->26|49->26|49->26|49->26|49->26|51->28|52->29|53->30
                  -- GENERATED --
              */
