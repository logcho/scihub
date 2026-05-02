// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganchoi/Desktop/scihub/backend/conf/routes
// @DATE:Sat May 02 00:22:59 CDT 2026


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
