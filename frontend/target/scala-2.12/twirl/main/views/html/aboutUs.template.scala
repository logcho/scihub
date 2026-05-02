
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import helper._

object aboutUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("About Us")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""

"""),format.raw/*4.1*/("""<div class="container">
    <div class="row">
        <div class="col s12">
            <div class="card-panel">
                <h4 class="center">About Us</h4>
                <div class="row">
                    <div class="col m8 s12 offset-l2">
                        <div class="row">


                            <div class="col s12 card-panel">
                                <div>
                                    <h6 class="center">Computer Science Team
                                        <span>
                                            <h6>
                                                <a href="https://lab.smudsi.org/" target="_blank"
                                                    class="blue-text text-darken-2">(Data Science Infrastructure Lab
                                                    Website)</a>
                                            </h6>
                                        </span>
                                    </h6>
                                </div>
                                <div class="row">
                                    <div class="col s12 m10 offset-m1">
                                        <ul class="collection" id="currentContributors">
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*30.60*/routes/*30.66*/.Assets.at("images/users/github.png")),format.raw/*30.103*/("""' alt="Jia Zhang"
                                                    class="circle">
                                                <span class="title" style="font-weight: bold"><a
                                                        href="https://s2.smu.edu/~jiazhang/"
                                                        class="blue-text text-darken-2">Jia Zhang</a></span>
                                                <p>
                                                    <small>Cruse C. and Marjorie F. Calahan Centennial Chair in
                                                        Engineering, Professor, Department of Computer Science</small>
                                                </p>
                                            </li>
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*41.60*/routes/*41.66*/.Assets.at("images/users/github.png")),format.raw/*41.103*/("""'
                                                    alt="Nahed Abdelgaber" class="circle">
                                                <span class="title" style="font-weight: bold">Nahed Abdelgaber</span>
                                                <p>
                                                    <small>Ph.D. student</small>
                                                </p>
                                            </li>

                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*50.60*/routes/*50.66*/.Assets.at("images/users/github.jpg")),format.raw/*50.103*/("""' alt="Chang Liu"
                                                    class="circle">
                                                <span class="title" style="font-weight: bold">Chang Liu</span>
                                                <p>
                                                    <small>Ph.D. student</small>
                                                </p>
                                            </li>
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*58.60*/routes/*58.66*/.Assets.at("images/users/github.JPG")),format.raw/*58.103*/("""' alt="Yuxuan Sun"
                                                    class="circle">
                                                <span class="title" style="font-weight: bold">Yuxuan Sun</span>
                                                <p>
                                                    <small>Ph.D. student</small>
                                                </p>
                                            </li>

                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*67.60*/routes/*67.66*/.Assets.at("images/users/github.jpg")),format.raw/*67.103*/("""'
                                                    alt="Ali Haqqani" class="circle">
                                                <span class="title" style="font-weight: bold">Ali Haqqani</span>
                                                <p>
                                                    <small>M.S. student</small>
                                                </p>
                                            </li>


                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*77.60*/routes/*77.66*/.Assets.at("images/users/github.jpeg")),format.raw/*77.104*/("""'
                                                    alt="Weizheng Xie" class="circle">
                                                <span class="title" style="font-weight: bold">Weizheng Xie</span>
                                                <p>
                                                    <small>M.S. student</small>
                                                </p>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>




                            <div class="col s12 card-panel">
                                <div>
                                    <h6 class="center">CS Industry Advisory Board
                                        <span>
                                        </span>
                                    </h6>
                                </div>
                                <div class="row">
                                    <div class="col s12 m10 offset-m1">
                                        <ul class="collection" id="currentContributors">
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*103.60*/routes/*103.66*/.Assets.at("images/users/github.jpeg")),format.raw/*103.104*/("""'
                                                    alt="Andrew Dickerson" class="circle">
                                                <div class="title"
                                                    style="margin-left:20px; padding-top:13px; font-weight: bold">Andrew
                                                    Dickerson</div>
                                            </li>

                                        </ul>
                                    </div>
                                </div>
                            </div>

                            <div class="col s12 card-panel">
                                <div>
                                    <h6 class="center">Alumni
                                        <span>
                                        </span>
                                    </h6>
                                </div>
                                <div class="row">
                                    <div class="col s12 m10 offset-m1">
                                        <ul class="collection" id="currentContributors">
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*126.60*/routes/*126.66*/.Assets.at("images/users/github.jpeg")),format.raw/*126.104*/("""' alt="Xihao Xie"
                                                    class="circle">
                                                <div class="title"
                                                    style="margin-left:20px; padding-top:13px; font-weight: bold">Dr.
                                                    Xihao Xie</div>
                                            </li>
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*133.60*/routes/*133.66*/.Assets.at("images/users/github.png")),format.raw/*133.103*/("""' alt="Beichen Hu"
                                                    class="circle">
                                                <div class="title"
                                                    style="margin-left:20px; padding-top:13px; font-weight: bold">Dr.
                                                    Beichen Hu</div>
                                            </li>
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*140.60*/routes/*140.66*/.Assets.at("images/users/github.jpeg")),format.raw/*140.104*/("""'
                                                    alt="Junhao Shen" class="circle">
                                                <div class="title"
                                                    style="margin-left:20px; padding-top:13px; font-weight: bold">Dr.
                                                    Junhao Shen</div>
                                            </li>
                                            <li class="collection-item avatar">
                                                <img src='"""),_display_(/*147.60*/routes/*147.66*/.Assets.at("images/users/github.png")),format.raw/*147.103*/("""' alt="Qiuyu Luo"
                                                    class="circle">
                                                <div class="title"
                                                    style="margin-left:20px; padding-top:13px; font-weight: bold">Qiuyu
                                                    Luo</div>
                                                <p class="title" style="margin-left:20px; font-weight: bold">
                                                    <small>M.S. student</small>
                                                </p>
                                            </li>

                                            </p>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>

                            """),format.raw/*168.37*/("""

                        """),format.raw/*170.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 02 14:50:22 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/aboutUs.scala.html
                  HASH: d4232f765db40f4328b7d5df320de6fea336f544
                  MATRIX: 814->1|1218->18|1242->34|1281->36|1309->38|2712->1414|2727->1420|2786->1457|3723->2367|3738->2373|3797->2410|4411->2997|4426->3003|4485->3040|5084->3612|5099->3618|5158->3655|5760->4230|5775->4236|5834->4273|6438->4850|6453->4856|6513->4894|7853->6206|7869->6212|7930->6250|9209->7501|9225->7507|9286->7545|9842->8073|9858->8079|9918->8116|10476->8646|10492->8652|10553->8690|11113->9222|11129->9228|11189->9265|12138->10466|12193->10492
                  LINES: 31->1|41->2|41->2|41->2|43->4|69->30|69->30|69->30|80->41|80->41|80->41|89->50|89->50|89->50|97->58|97->58|97->58|106->67|106->67|106->67|116->77|116->77|116->77|142->103|142->103|142->103|165->126|165->126|165->126|172->133|172->133|172->133|179->140|179->140|179->140|186->147|186->147|186->147|203->168|205->170
                  -- GENERATED --
              */
          