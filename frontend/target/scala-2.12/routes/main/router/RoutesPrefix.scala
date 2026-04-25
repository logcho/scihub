
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganchoi/Desktop/CSHub-Fall2025/frontend/conf/routes
// @DATE:Mon Feb 09 16:10:54 CST 2026


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
