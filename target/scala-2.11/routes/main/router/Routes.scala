
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Tyrell Wellick/git/kakuro-website/conf/routes
// @DATE:Wed Jan 16 17:45:10 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  KakuroController_6: controllers.KakuroController,
  // @LINE:9
  ApplicationController_5: controllers.ApplicationController,
  // @LINE:11
  SocialAuthController_3: controllers.SocialAuthController,
  // @LINE:13
  SignUpController_0: controllers.SignUpController,
  // @LINE:16
  SignInController_1: controllers.SignInController,
  // @LINE:20
  Assets_2: controllers.Assets,
  // @LINE:21
  WebJarAssets_4: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    KakuroController_6: controllers.KakuroController,
    // @LINE:9
    ApplicationController_5: controllers.ApplicationController,
    // @LINE:11
    SocialAuthController_3: controllers.SocialAuthController,
    // @LINE:13
    SignUpController_0: controllers.SignUpController,
    // @LINE:16
    SignInController_1: controllers.SignInController,
    // @LINE:20
    Assets_2: controllers.Assets,
    // @LINE:21
    WebJarAssets_4: controllers.WebJarAssets
  ) = this(errorHandler, KakuroController_6, ApplicationController_5, SocialAuthController_3, SignUpController_0, SignInController_1, Assets_2, WebJarAssets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, KakuroController_6, ApplicationController_5, SocialAuthController_3, SignUpController_0, SignInController_1, Assets_2, WebJarAssets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/kakuro""", """controllers.KakuroController.kakuro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/kakuro/rules""", """controllers.KakuroController.rules"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_KakuroController_kakuro0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/kakuro")))
  )
  private[this] lazy val controllers_KakuroController_kakuro0_invoker = createInvoker(
    KakuroController_6.kakuro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "kakuro",
      Nil,
      "GET",
      """""",
      this.prefix + """games/kakuro"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_KakuroController_rules1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/kakuro/rules")))
  )
  private[this] lazy val controllers_KakuroController_rules1_invoker = createInvoker(
    KakuroController_6.rules,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "rules",
      Nil,
      "GET",
      """""",
      this.prefix + """games/kakuro/rules"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index2_invoker = createInvoker(
    ApplicationController_5.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_signOut3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut3_invoker = createInvoker(
    ApplicationController_5.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signOut"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SocialAuthController_authenticate4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate4_invoker = createInvoker(
    SocialAuthController_3.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignUpController_view5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view5_invoker = createInvoker(
    SignUpController_0.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SignUpController_submit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit6_invoker = createInvoker(
    SignUpController_0.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SignInController_view7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view7_invoker = createInvoker(
    SignInController_1.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_SignInController_submit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit8_invoker = createInvoker(
    SignInController_1.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_WebJarAssets_at10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at10_invoker = createInvoker(
    WebJarAssets_4.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_KakuroController_kakuro0_route(params) =>
      call { 
        controllers_KakuroController_kakuro0_invoker.call(KakuroController_6.kakuro)
      }
  
    // @LINE:6
    case controllers_KakuroController_rules1_route(params) =>
      call { 
        controllers_KakuroController_rules1_invoker.call(KakuroController_6.rules)
      }
  
    // @LINE:9
    case controllers_ApplicationController_index2_route(params) =>
      call { 
        controllers_ApplicationController_index2_invoker.call(ApplicationController_5.index)
      }
  
    // @LINE:10
    case controllers_ApplicationController_signOut3_route(params) =>
      call { 
        controllers_ApplicationController_signOut3_invoker.call(ApplicationController_5.signOut)
      }
  
    // @LINE:11
    case controllers_SocialAuthController_authenticate4_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate4_invoker.call(SocialAuthController_3.authenticate(provider))
      }
  
    // @LINE:13
    case controllers_SignUpController_view5_route(params) =>
      call { 
        controllers_SignUpController_view5_invoker.call(SignUpController_0.view)
      }
  
    // @LINE:14
    case controllers_SignUpController_submit6_route(params) =>
      call { 
        controllers_SignUpController_submit6_invoker.call(SignUpController_0.submit)
      }
  
    // @LINE:16
    case controllers_SignInController_view7_route(params) =>
      call { 
        controllers_SignInController_view7_invoker.call(SignInController_1.view)
      }
  
    // @LINE:17
    case controllers_SignInController_submit8_route(params) =>
      call { 
        controllers_SignInController_submit8_invoker.call(SignInController_1.submit)
      }
  
    // @LINE:20
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:21
    case controllers_WebJarAssets_at10_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at10_invoker.call(WebJarAssets_4.at(file))
      }
  }
}
