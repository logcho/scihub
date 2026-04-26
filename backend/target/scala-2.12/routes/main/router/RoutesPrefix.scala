// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganchoi/Desktop/scihub/backend/conf/routes
// @DATE:Sat Apr 25 17:27:04 CDT 2026


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
