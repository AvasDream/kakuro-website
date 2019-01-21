
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Tyrell Wellick/git/kakuro-website/conf/routes
// @DATE:Mon Jan 21 14:21:29 CET 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseSignInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
    // @LINE:28
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseSnakeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def snake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SnakeController.snake",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/snake"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseKakuroController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def undo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.undo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/undo"})
        }
      """
    )
  
    // @LINE:12
    def initGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.initGame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/initgame"})
        }
      """
    )
  
    // @LINE:13
    def setValue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.setValue",
      """
        function(row0,col1,value2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/set/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("row", row0) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("col", col1) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("value", value2)})
        }
      """
    )
  
    // @LINE:16
    def redo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.redo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/redo"})
        }
      """
    )
  
    // @LINE:14
    def deleteValue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.deleteValue",
      """
        function(row0,col1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/delete/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("row", row0) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("col", col1)})
        }
      """
    )
  
    // @LINE:6
    def kakuro: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.kakuro",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/kakuro"})
        }
      """
    )
  
    // @LINE:7
    def rules: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.rules",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/kakuro/rules"})
        }
      """
    )
  
    // @LINE:17
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.save",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/save"})
        }
      """
    )
  
    // @LINE:18
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.KakuroController.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/kakuro/load"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:20
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:25
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
  }


}
