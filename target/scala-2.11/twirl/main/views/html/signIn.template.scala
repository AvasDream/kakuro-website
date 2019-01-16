
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signIn_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[forms.SignInForm.Data],com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry,RequestHeader,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signInForm: Form[forms.SignInForm.Data], socialProviders: com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.mohiva.play.silhouette.impl.providers.oauth2.ClefProvider
import b3.inline.fieldConstructor

Seq[Any](format.raw/*1.207*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main(Messages("sign.in.title"))/*6.33*/ {_display_(Seq[Any](format.raw/*6.35*/("""
    """),_display_(/*7.6*/request/*7.13*/.flash.get("error").map/*7.36*/ { msg =>_display_(Seq[Any](format.raw/*7.45*/("""
        """),format.raw/*8.9*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger alert-error">
            <a href="#" class="close" data-dismiss="alert">&times;</a>
            <strong>"""),_display_(/*10.22*/Messages("error")),format.raw/*10.39*/("""</strong> """),_display_(/*10.50*/msg),format.raw/*10.53*/("""
        """),format.raw/*11.9*/("""</div>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*14.18*/Messages("sign.in.credentials")),format.raw/*14.49*/("""</legend>
        """),_display_(/*15.10*/helper/*15.16*/.form(action = routes.SignInController.submit())/*15.64*/ {_display_(Seq[Any](format.raw/*15.66*/("""
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),_display_(/*17.14*/b3/*17.16*/.email(signInForm("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg")),format.raw/*17.149*/("""
            """),_display_(/*18.14*/b3/*18.16*/.password(signInForm("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg")),format.raw/*18.161*/("""
            """),_display_(/*19.14*/b3/*19.16*/.checkbox(signInForm("rememberMe"), '_text -> Messages("remember.me"), 'checked -> true)),format.raw/*19.104*/("""
            """),format.raw/*20.13*/("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""),_display_(/*22.112*/Messages("sign.in")),format.raw/*22.131*/("""</button>
                </div>
            </div>
        """)))}),format.raw/*25.10*/("""

        """),format.raw/*27.9*/("""<div>
            <p class="not-a-member">"""),_display_(/*28.38*/Messages("not.a.member")),format.raw/*28.62*/(""" """),format.raw/*28.63*/("""<a href=""""),_display_(/*28.73*/routes/*28.79*/.SignUpController.view),format.raw/*28.101*/("""">"""),_display_(/*28.104*/Messages("sign.up.now")),format.raw/*28.127*/("""</a></p>
        </div>

        """),_display_(/*31.10*/if(socialProviders.providers.nonEmpty)/*31.48*/ {_display_(Seq[Any](format.raw/*31.50*/("""
            """),format.raw/*32.13*/("""<div class="social-providers">
                <p>"""),_display_(/*33.21*/Messages("or.use.social")),format.raw/*33.46*/("""</p>
                <div>
                """),_display_(/*35.18*/for(p <- socialProviders.providers if p.id != "clef") yield /*35.71*/ {_display_(Seq[Any](format.raw/*35.73*/("""
                    """),format.raw/*36.21*/("""<a href=""""),_display_(/*36.31*/routes/*36.37*/.SocialAuthController.authenticate(p.id)),format.raw/*36.77*/("""" class="provider """),_display_(/*36.96*/p/*36.97*/.id),format.raw/*36.100*/("""" title=""""),_display_(/*36.110*/Messages(p.id)),format.raw/*36.124*/(""""><img src=""""),_display_(/*36.137*/routes/*36.143*/.Assets.at(s"images/providers/${p.id}.png")),format.raw/*36.186*/("""" width="64px" height="64px" alt=""""),_display_(/*36.221*/Messages(p.id)),format.raw/*36.235*/(""""></a>
                """)))}),format.raw/*37.18*/("""
                """),format.raw/*38.17*/("""</div>
                """),_display_(/*39.18*/defining(socialProviders.get[ClefProvider])/*39.61*/ { clef =>_display_(Seq[Any](format.raw/*39.71*/("""
                    """),_display_(/*40.22*/if(clef.isDefined)/*40.40*/ {_display_(Seq[Any](format.raw/*40.42*/("""
                        """),format.raw/*41.25*/("""<script type="text/javascript" src="https://clef.io/v3/clef.js" class="clef-button" data-app-id=""""),_display_(/*41.123*/clef/*41.127*/.get.settings.clientID),format.raw/*41.149*/("""" data-color="blue" data-style="flat" data-redirect-url=""""),_display_(/*41.207*/clef/*41.211*/.get.settings.redirectURL),format.raw/*41.236*/("""" data-type="login"></script>
                    """)))}),format.raw/*42.22*/("""
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</div>
        """)))}),format.raw/*45.10*/("""

    """),format.raw/*47.5*/("""</fieldset>
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(signInForm:Form[forms.SignInForm.Data],socialProviders:com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarAssets)

  def f:((Form[forms.SignInForm.Data],com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry) => (RequestHeader,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarAssets) => apply(signInForm,socialProviders)(request,messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object signIn extends signIn_Scope0.signIn
              /*
                  -- GENERATED --
                  DATE: Wed Jan 16 17:45:12 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/signIn.scala.html
                  HASH: 58e319555db558de053188f59792f1f79c3d8e03
                  MATRIX: 651->1|1054->206|1084->317|1112->320|1151->351|1190->353|1222->360|1237->367|1268->390|1314->399|1350->409|1541->573|1579->590|1617->601|1641->604|1678->614|1721->627|1754->633|1843->695|1895->726|1942->746|1957->752|2014->800|2054->802|2096->817|2111->823|2147->838|2189->853|2200->855|2355->988|2397->1003|2408->1005|2575->1150|2617->1165|2628->1167|2738->1255|2780->1269|2968->1429|3009->1448|3104->1512|3143->1524|3214->1568|3259->1592|3288->1593|3325->1603|3340->1609|3384->1631|3415->1634|3460->1657|3524->1694|3571->1732|3611->1734|3653->1748|3732->1800|3778->1825|3851->1871|3920->1924|3960->1926|4010->1948|4047->1958|4062->1964|4123->2004|4169->2023|4179->2024|4204->2027|4242->2037|4278->2051|4319->2064|4335->2070|4400->2113|4463->2148|4499->2162|4555->2187|4601->2205|4653->2230|4705->2273|4753->2283|4803->2306|4830->2324|4870->2326|4924->2352|5050->2450|5064->2454|5108->2476|5194->2534|5208->2538|5255->2563|5338->2615|5388->2634|5430->2648|5478->2665|5513->2673|5557->2687
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|30->7|30->7|30->7|30->7|31->8|33->10|33->10|33->10|33->10|34->11|35->12|36->13|37->14|37->14|38->15|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|45->22|45->22|48->25|50->27|51->28|51->28|51->28|51->28|51->28|51->28|51->28|51->28|54->31|54->31|54->31|55->32|56->33|56->33|58->35|58->35|58->35|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|59->36|60->37|61->38|62->39|62->39|62->39|63->40|63->40|63->40|64->41|64->41|64->41|64->41|64->41|64->41|64->41|65->42|66->43|67->44|68->45|70->47|71->48
                  -- GENERATED --
              */
          