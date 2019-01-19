
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Tyrell Wellick/git/kakuro-website/conf/routes
// @DATE:Sat Jan 19 18:31:49 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  KakuroController_7: controllers.KakuroController,
  // @LINE:9
  SnakeController_5: controllers.SnakeController,
  // @LINE:20
  ApplicationController_6: controllers.ApplicationController,
  // @LINE:22
  SocialAuthController_3: controllers.SocialAuthController,
  // @LINE:24
  SignUpController_0: controllers.SignUpController,
  // @LINE:27
  SignInController_1: controllers.SignInController,
  // @LINE:31
  Assets_2: controllers.Assets,
  // @LINE:32
  WebJarAssets_4: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    KakuroController_7: controllers.KakuroController,
    // @LINE:9
    SnakeController_5: controllers.SnakeController,
    // @LINE:20
    ApplicationController_6: controllers.ApplicationController,
    // @LINE:22
    SocialAuthController_3: controllers.SocialAuthController,
    // @LINE:24
    SignUpController_0: controllers.SignUpController,
    // @LINE:27
    SignInController_1: controllers.SignInController,
    // @LINE:31
    Assets_2: controllers.Assets,
    // @LINE:32
    WebJarAssets_4: controllers.WebJarAssets
  ) = this(errorHandler, KakuroController_7, SnakeController_5, ApplicationController_6, SocialAuthController_3, SignUpController_0, SignInController_1, Assets_2, WebJarAssets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, KakuroController_7, SnakeController_5, ApplicationController_6, SocialAuthController_3, SignUpController_0, SignInController_1, Assets_2, WebJarAssets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/kakuro""", """controllers.KakuroController.kakuro"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/kakuro/rules""", """controllers.KakuroController.rules"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """games/snake""", """controllers.SnakeController.snake"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/initgame""", """controllers.KakuroController.initGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/set/""" + "$" + """row<[^/]+>/""" + "$" + """col<[^/]+>/""" + "$" + """value<[^/]+>""", """controllers.KakuroController.setValue(row:Int, col:Int, value:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/delete/""" + "$" + """row<[^/]+>/""" + "$" + """col<[^/]+>""", """controllers.KakuroController.deleteValue(row:Int, col:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/undo""", """controllers.KakuroController.undo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/redo""", """controllers.KakuroController.redo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/save""", """controllers.KakuroController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/kakuro/load""", """controllers.KakuroController.load"""),
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


  // @LINE:6
  private[this] lazy val controllers_KakuroController_kakuro0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/kakuro")))
  )
  private[this] lazy val controllers_KakuroController_kakuro0_invoker = createInvoker(
    KakuroController_7.kakuro,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "kakuro",
      Nil,
      "GET",
      """ Website calls""",
      this.prefix + """games/kakuro"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_KakuroController_rules1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/kakuro/rules")))
  )
  private[this] lazy val controllers_KakuroController_rules1_invoker = createInvoker(
    KakuroController_7.rules,
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
  private[this] lazy val controllers_SnakeController_snake2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("games/snake")))
  )
  private[this] lazy val controllers_SnakeController_snake2_invoker = createInvoker(
    SnakeController_5.snake,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SnakeController",
      "snake",
      Nil,
      "GET",
      """""",
      this.prefix + """games/snake"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_KakuroController_initGame3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/initgame")))
  )
  private[this] lazy val controllers_KakuroController_initGame3_invoker = createInvoker(
    KakuroController_7.initGame,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "initGame",
      Nil,
      "GET",
      """ API calls""",
      this.prefix + """api/kakuro/initgame"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_KakuroController_setValue4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/set/"), DynamicPart("row", """[^/]+""",true), StaticPart("/"), DynamicPart("col", """[^/]+""",true), StaticPart("/"), DynamicPart("value", """[^/]+""",true)))
  )
  private[this] lazy val controllers_KakuroController_setValue4_invoker = createInvoker(
    KakuroController_7.setValue(fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "setValue",
      Seq(classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """api/kakuro/set/""" + "$" + """row<[^/]+>/""" + "$" + """col<[^/]+>/""" + "$" + """value<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_KakuroController_deleteValue5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/delete/"), DynamicPart("row", """[^/]+""",true), StaticPart("/"), DynamicPart("col", """[^/]+""",true)))
  )
  private[this] lazy val controllers_KakuroController_deleteValue5_invoker = createInvoker(
    KakuroController_7.deleteValue(fakeValue[Int], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "deleteValue",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      """""",
      this.prefix + """api/kakuro/delete/""" + "$" + """row<[^/]+>/""" + "$" + """col<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_KakuroController_undo6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/undo")))
  )
  private[this] lazy val controllers_KakuroController_undo6_invoker = createInvoker(
    KakuroController_7.undo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "undo",
      Nil,
      "GET",
      """""",
      this.prefix + """api/kakuro/undo"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_KakuroController_redo7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/redo")))
  )
  private[this] lazy val controllers_KakuroController_redo7_invoker = createInvoker(
    KakuroController_7.redo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "redo",
      Nil,
      "GET",
      """""",
      this.prefix + """api/kakuro/redo"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_KakuroController_save8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/save")))
  )
  private[this] lazy val controllers_KakuroController_save8_invoker = createInvoker(
    KakuroController_7.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "save",
      Nil,
      "GET",
      """""",
      this.prefix + """api/kakuro/save"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_KakuroController_load9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/kakuro/load")))
  )
  private[this] lazy val controllers_KakuroController_load9_invoker = createInvoker(
    KakuroController_7.load,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KakuroController",
      "load",
      Nil,
      "GET",
      """""",
      this.prefix + """api/kakuro/load"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ApplicationController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index10_invoker = createInvoker(
    ApplicationController_6.index,
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

  // @LINE:21
  private[this] lazy val controllers_ApplicationController_signOut11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut11_invoker = createInvoker(
    ApplicationController_6.signOut,
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

  // @LINE:22
  private[this] lazy val controllers_SocialAuthController_authenticate12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate12_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_SignUpController_view13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view13_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_SignUpController_submit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit14_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_SignInController_view15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view15_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_SignInController_submit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit16_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_WebJarAssets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at18_invoker = createInvoker(
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
  
    // @LINE:6
    case controllers_KakuroController_kakuro0_route(params) =>
      call { 
        controllers_KakuroController_kakuro0_invoker.call(KakuroController_7.kakuro)
      }
  
    // @LINE:7
    case controllers_KakuroController_rules1_route(params) =>
      call { 
        controllers_KakuroController_rules1_invoker.call(KakuroController_7.rules)
      }
  
    // @LINE:9
    case controllers_SnakeController_snake2_route(params) =>
      call { 
        controllers_SnakeController_snake2_invoker.call(SnakeController_5.snake)
      }
  
    // @LINE:12
    case controllers_KakuroController_initGame3_route(params) =>
      call { 
        controllers_KakuroController_initGame3_invoker.call(KakuroController_7.initGame)
      }
  
    // @LINE:13
    case controllers_KakuroController_setValue4_route(params) =>
      call(params.fromPath[Int]("row", None), params.fromPath[Int]("col", None), params.fromPath[Int]("value", None)) { (row, col, value) =>
        controllers_KakuroController_setValue4_invoker.call(KakuroController_7.setValue(row, col, value))
      }
  
    // @LINE:14
    case controllers_KakuroController_deleteValue5_route(params) =>
      call(params.fromPath[Int]("row", None), params.fromPath[Int]("col", None)) { (row, col) =>
        controllers_KakuroController_deleteValue5_invoker.call(KakuroController_7.deleteValue(row, col))
      }
  
    // @LINE:15
    case controllers_KakuroController_undo6_route(params) =>
      call { 
        controllers_KakuroController_undo6_invoker.call(KakuroController_7.undo)
      }
  
    // @LINE:16
    case controllers_KakuroController_redo7_route(params) =>
      call { 
        controllers_KakuroController_redo7_invoker.call(KakuroController_7.redo)
      }
  
    // @LINE:17
    case controllers_KakuroController_save8_route(params) =>
      call { 
        controllers_KakuroController_save8_invoker.call(KakuroController_7.save)
      }
  
    // @LINE:18
    case controllers_KakuroController_load9_route(params) =>
      call { 
        controllers_KakuroController_load9_invoker.call(KakuroController_7.load)
      }
  
    // @LINE:20
    case controllers_ApplicationController_index10_route(params) =>
      call { 
        controllers_ApplicationController_index10_invoker.call(ApplicationController_6.index)
      }
  
    // @LINE:21
    case controllers_ApplicationController_signOut11_route(params) =>
      call { 
        controllers_ApplicationController_signOut11_invoker.call(ApplicationController_6.signOut)
      }
  
    // @LINE:22
    case controllers_SocialAuthController_authenticate12_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate12_invoker.call(SocialAuthController_3.authenticate(provider))
      }
  
    // @LINE:24
    case controllers_SignUpController_view13_route(params) =>
      call { 
        controllers_SignUpController_view13_invoker.call(SignUpController_0.view)
      }
  
    // @LINE:25
    case controllers_SignUpController_submit14_route(params) =>
      call { 
        controllers_SignUpController_submit14_invoker.call(SignUpController_0.submit)
      }
  
    // @LINE:27
    case controllers_SignInController_view15_route(params) =>
      call { 
        controllers_SignInController_view15_invoker.call(SignInController_1.view)
      }
  
    // @LINE:28
    case controllers_SignInController_submit16_route(params) =>
      call { 
        controllers_SignInController_submit16_invoker.call(SignInController_1.submit)
      }
  
    // @LINE:31
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:32
    case controllers_WebJarAssets_at18_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at18_invoker.call(WebJarAssets_4.at(file))
      }
  }
}
