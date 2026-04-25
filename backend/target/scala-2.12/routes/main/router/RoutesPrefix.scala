// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganchoi/Desktop/CSHub-Fall2025/backend/conf/routes
// @DATE:Mon Apr 20 14:12:18 CDT 2026


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
