
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], siteKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import helper._

def /*4.6*/scripts/*4.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.17*/("""
        """),format.raw/*5.9*/("""<script type="text/javascript" src='"""),_display_(/*5.46*/routes/*5.52*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.102*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*6.46*/routes/*6.52*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.104*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*7.46*/routes/*7.52*/.Assets.at("javascripts/cshub_login.js")),format.raw/*7.92*/("""'></script>
    """)))};
Seq[Any](format.raw/*1.58*/("""
    """),format.raw/*3.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(/*10.2*/main("Login", scripts)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""
    """),_display_(/*11.6*/helper/*11.12*/.form(routes.UserController.userLogin)/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
        """),format.raw/*12.9*/("""<div class="container">
            <div class="row">
                <div class="col m6 s12 offset-m3" style="top: ">
                    <div class="card-panel z-depth-0">
                        <form class="form-signin" onsubmit="return checkFormValid();">
                        """),format.raw/*17.143*/("""
                        """),format.raw/*18.25*/("""<h3 class="form-signin-heading" align="center">Log in</h3>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="email" name="email" id="email" class="validate"
                                    required="" autofocus="" value='"""),_display_(/*22.70*/userForm("email")/*22.87*/.value),format.raw/*22.93*/("""' onchange="checkValidEmail()">
                                    <label for="email">Email address</label>
                                    <span id="emailMsg" class="helper-text" data-error="" style="color: red"></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="password" name="password" id="password" class="validate"
                                    required="" value='"""),_display_(/*30.57*/userForm("password")/*30.77*/.value),format.raw/*30.83*/("""'>
                                    <label for="password">Password</label>
                                </div>
                            </div>
"""),format.raw/*34.50*/("""
"""),format.raw/*35.44*/("""
"""),format.raw/*36.104*/("""
"""),format.raw/*37.72*/("""
"""),format.raw/*38.45*/("""
"""),format.raw/*39.39*/("""
                            """),format.raw/*40.29*/("""<div class="row">
                                """),_display_(/*41.34*/if(flash.contains("error"))/*41.61*/ {_display_(Seq[Any](format.raw/*41.63*/("""
                                    """),format.raw/*42.37*/("""<p class="center" style="color: red">"""),_display_(/*42.75*/flash/*42.80*/.get("error")),format.raw/*42.93*/("""</p>
                                """)))}),format.raw/*43.34*/("""
                                """),_display_(/*44.34*/if(flash.contains("showResendActivation") && flash.get("showResendActivation") == "true")/*44.123*/ {_display_(Seq[Any](format.raw/*44.125*/("""
                                    """),format.raw/*45.37*/("""<p class="center" style="margin-top: 10px;">
                                        Didn't receive the activation email?
                                        <a id="resendActivationLink" href="javascript:void(0);" onclick="resendActivationEmail('"""),_display_(/*47.130*/userForm("email")/*47.147*/.value),format.raw/*47.153*/("""')">
                                            Click here to resend.
                                        </a>
                                    </p>
                                """)))}),format.raw/*51.34*/("""

                                """),format.raw/*53.33*/("""<div class="g-recaptcha col s12" data-sitekey=""""),_display_(/*53.81*/siteKey),format.raw/*53.88*/(""""></div>
                            </div>
                            <div class="actions row center">
                                <button class="btn waves-effect waves-light blue darken-2" type="submit">
                                    Sign in <i class="material-icons right">exit_to_app</i></button>
                            </div>
                          <div class="row center">
                                <span>
                                    <a href='"""),_display_(/*61.47*/routes/*61.53*/.UserController.userForgotPasswordPage()),format.raw/*61.93*/("""'>Forgot password?</a>
                                </span>
                            </div>
                            <div class="row center">
                                <span>
                                    New User?
                                    <a href='"""),_display_(/*67.47*/routes/*67.53*/.UserController.userRegisterPage()),format.raw/*67.87*/("""'>Sign up</a>
                                </span>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
   """)))}),format.raw/*76.5*/("""

""")))}),format.raw/*78.2*/("""

"""),format.raw/*80.1*/("""<script>

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

        // When the user clicks the button, open the modal
        btn.onclick = function () """),format.raw/*86.35*/("""{"""),format.raw/*86.36*/("""
            """),format.raw/*87.13*/("""modal.style.display = "block";
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""

        """),format.raw/*90.9*/("""// When the user clicks on <span> (x), close the modal
        span.onclick = function () """),format.raw/*91.36*/("""{"""),format.raw/*91.37*/("""
            """),format.raw/*92.13*/("""modal.style.display = "none";
        """),format.raw/*93.9*/("""}"""),format.raw/*93.10*/("""

        """),format.raw/*95.9*/("""// When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) """),format.raw/*96.43*/("""{"""),format.raw/*96.44*/("""
            """),format.raw/*97.13*/("""if (event.target == modal) """),format.raw/*97.40*/("""{"""),format.raw/*97.41*/("""
                """),format.raw/*98.17*/("""modal.style.display = "none";
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/("""

        """),format.raw/*102.9*/("""function resendActivationEmail(email) """),format.raw/*102.47*/("""{"""),format.raw/*102.48*/("""
            """),format.raw/*103.13*/("""$.get('"""),_display_(/*103.21*/routes/*103.27*/.UserController.resendActivationEmail()),format.raw/*103.66*/("""', """),format.raw/*103.69*/("""{"""),format.raw/*103.70*/(""" """),format.raw/*103.71*/("""email: email """),format.raw/*103.84*/("""}"""),format.raw/*103.85*/(""")
                    .done(function(data) """),format.raw/*104.42*/("""{"""),format.raw/*104.43*/("""
                        """),format.raw/*105.25*/("""alert(data);
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/(""")
                    .fail(function(xhr, status, error) """),format.raw/*107.56*/("""{"""),format.raw/*107.57*/("""
                        """),format.raw/*108.25*/("""alert("Error: " + xhr.responseText);
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/(""");
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""
"""),format.raw/*111.1*/("""</script>
"""))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],siteKey:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,siteKey)

  def f:((play.data.Form[models.User],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,siteKey) => apply(userForm,siteKey)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 02 14:50:22 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/login.scala.html
                  HASH: 53ec47d9f674f4892e7b200860e2c95a142d2d66
                  MATRIX: 1139->1|1268->63|1296->85|1311->92|1391->96|1426->105|1489->142|1503->148|1574->198|1657->255|1671->261|1744->313|1827->370|1841->376|1901->416|1957->57|1988->79|2019->433|2048->436|2079->458|2119->460|2151->466|2166->472|2213->510|2253->512|2289->521|2603->924|2656->949|3020->1286|3046->1303|3073->1309|3674->1883|3703->1903|3730->1909|3910->2110|3939->2154|3969->2258|3998->2330|4027->2375|4056->2414|4113->2443|4191->2494|4227->2521|4267->2523|4332->2560|4397->2598|4411->2603|4445->2616|4514->2654|4575->2688|4674->2777|4715->2779|4780->2816|5059->3067|5086->3084|5114->3090|5335->3280|5397->3314|5472->3362|5500->3369|6010->3852|6025->3858|6086->3898|6395->4180|6410->4186|6465->4220|6705->4430|6738->4433|6767->4435|7019->4659|7048->4660|7089->4673|7155->4712|7184->4713|7221->4723|7339->4813|7368->4814|7409->4827|7474->4865|7503->4866|7540->4876|7674->4982|7703->4983|7744->4996|7799->5023|7828->5024|7873->5041|7943->5083|7972->5084|8009->5093|8039->5094|8077->5104|8144->5142|8174->5143|8216->5156|8252->5164|8268->5170|8329->5209|8361->5212|8391->5213|8421->5214|8463->5227|8493->5228|8565->5271|8595->5272|8649->5297|8711->5330|8741->5331|8827->5388|8857->5389|8911->5414|8997->5471|9027->5472|9066->5483|9096->5484|9125->5485
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|45->7|45->7|45->7|47->1|48->3|49->8|51->10|51->10|51->10|52->11|52->11|52->11|52->11|53->12|58->17|59->18|63->22|63->22|63->22|71->30|71->30|71->30|75->34|76->35|77->36|78->37|79->38|80->39|81->40|82->41|82->41|82->41|83->42|83->42|83->42|83->42|84->43|85->44|85->44|85->44|86->45|88->47|88->47|88->47|92->51|94->53|94->53|94->53|102->61|102->61|102->61|108->67|108->67|108->67|117->76|119->78|121->80|127->86|127->86|128->87|129->88|129->88|131->90|132->91|132->91|133->92|134->93|134->93|136->95|137->96|137->96|138->97|138->97|138->97|139->98|140->99|140->99|141->100|141->100|143->102|143->102|143->102|144->103|144->103|144->103|144->103|144->103|144->103|144->103|144->103|144->103|145->104|145->104|146->105|147->106|147->106|148->107|148->107|149->108|150->109|150->109|151->110|151->110|152->111
                  -- GENERATED --
              */
          