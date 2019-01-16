
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Tyrell Wellick/git/kakuro-website/conf/routes
// @DATE:Wed Jan 16 16:40:32 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
