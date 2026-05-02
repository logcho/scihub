
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
/*1.2*/import java.util.List
/*2.2*/import models.RAJobApplication
/*3.2*/import com.fasterxml.jackson.databind.JsonNode

object raInterviewSchedule extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,List[RAJobApplication],List[JsonNode],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(jobId: Long, applications: List[RAJobApplication], interviews: List[JsonNode]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
        $(document).ready(function()"""),format.raw/*8.37*/("""{"""),format.raw/*8.38*/("""
            """),format.raw/*9.13*/("""$('.modal').modal();
            $('.tabs').tabs();
            $('.datepicker').datepicker("""),format.raw/*11.41*/("""{"""),format.raw/*11.42*/("""
                """),format.raw/*12.17*/("""format: 'yyyy-mm-dd'
            """),format.raw/*13.13*/("""}"""),format.raw/*13.14*/(""");
            $('.timepicker').timepicker();
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/(""");
        
        function proposeTimeSlots(appId) """),format.raw/*17.42*/("""{"""),format.raw/*17.43*/("""
            """),format.raw/*18.13*/("""$('#applicantId').val(appId);
            var modal = M.Modal.getInstance(document.getElementById('scheduleModal'));
            modal.open();
        """),format.raw/*21.9*/("""}"""),format.raw/*21.10*/("""

        """),format.raw/*23.9*/("""function cancelInterview(interviewId) """),format.raw/*23.47*/("""{"""),format.raw/*23.48*/("""
            """),format.raw/*24.13*/("""if(confirm("Are you sure you want to cancel this interview? A notification will be sent to the student.")) """),format.raw/*24.120*/("""{"""),format.raw/*24.121*/("""
                """),format.raw/*25.17*/("""// Mock AJAX call to cancel
                M.toast("""),format.raw/*26.25*/("""{"""),format.raw/*26.26*/("""html: 'Interview cancelled. Notification sent to student.'"""),format.raw/*26.84*/("""}"""),format.raw/*26.85*/(""");
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""
        
        """),format.raw/*30.9*/("""function rescheduleInterview(interviewId) """),format.raw/*30.51*/("""{"""),format.raw/*30.52*/("""
            """),format.raw/*31.13*/("""// Open modal to reschedule
            var modal = M.Modal.getInstance(document.getElementById('scheduleModal'));
            modal.open();
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""

        """),_display_(/*36.10*/if(flash.containsKey("success"))/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
            """),format.raw/*37.13*/("""$(document).ready(function() """),format.raw/*37.42*/("""{"""),format.raw/*37.43*/("""
                """),format.raw/*38.17*/("""M.toast("""),format.raw/*38.25*/("""{"""),format.raw/*38.26*/("""html: '"""),_display_(/*38.34*/flash/*38.39*/.get("success")),format.raw/*38.54*/("""'"""),format.raw/*38.55*/("""}"""),format.raw/*38.56*/(""");
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""");
        """)))}),format.raw/*40.10*/("""
        """),_display_(/*41.10*/if(flash.containsKey("error"))/*41.40*/ {_display_(Seq[Any](format.raw/*41.42*/("""
            """),format.raw/*42.13*/("""$(document).ready(function() """),format.raw/*42.42*/("""{"""),format.raw/*42.43*/("""
                """),format.raw/*43.17*/("""M.toast("""),format.raw/*43.25*/("""{"""),format.raw/*43.26*/("""html: '"""),_display_(/*43.34*/flash/*43.39*/.get("error")),format.raw/*43.52*/("""', classes: 'red'"""),format.raw/*43.69*/("""}"""),format.raw/*43.70*/(""");
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/(""");
        """)))}),format.raw/*45.10*/("""
    """),format.raw/*46.5*/("""</script>
""")))};
Seq[Any](format.raw/*4.81*/("""

"""),format.raw/*47.2*/("""

"""),_display_(/*49.2*/main("Schedule RA Interview", scripts)/*49.40*/ {_display_(Seq[Any](format.raw/*49.42*/("""
    """),format.raw/*50.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4>Schedule RA Job Interviews</h4>
                    <p class="grey-text">Project/Job ID: """),_display_(/*55.59*/jobId),format.raw/*55.64*/("""</p>
                    
                    <ul class="tabs" style="margin-top: 20px; margin-bottom: 20px;">
                        <li class="tab col s6"><a class="active" href="#applicants">Applicants</a></li>
                        <li class="tab col s6"><a href="#scheduled">Scheduled Interviews</a></li>
                    </ul>

                    <div id="applicants" class="col s12" style="margin-top: 20px;">
                        <table class="striped responsive-table">
                            <thead>
                                <tr>
                                    <th>Applicant Name</th>
                                    <th>Status</th>
                                    <th>Applied Time</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),_display_(/*73.34*/if(applications.isEmpty)/*73.58*/ {_display_(Seq[Any](format.raw/*73.60*/("""
                                    """),format.raw/*74.37*/("""<tr>
                                        <td colspan="4" class="center">No applications found.</td>
                                    </tr>
                                """)))}/*77.35*/else/*77.40*/{_display_(Seq[Any](format.raw/*77.41*/("""
                                    """),_display_(/*78.38*/for(app <- applications) yield /*78.62*/ {_display_(Seq[Any](format.raw/*78.64*/("""
                                        """),format.raw/*79.41*/("""<tr>
                                            <td>"""),_display_(/*80.50*/app/*80.53*/.getApplicant().getFirstName()),format.raw/*80.83*/(""" """),_display_(/*80.85*/app/*80.88*/.getApplicant().getLastName()),format.raw/*80.117*/("""</td>
                                            <td><span class="new badge purple darken-1" data-badge-caption=""""),_display_(/*81.110*/app/*81.113*/.getStatus()),format.raw/*81.125*/(""""></span></td>
                                            <td>"""),_display_(/*82.50*/app/*82.53*/.getCreatedTime()),format.raw/*82.70*/("""</td>
                                            <td>
                                                <button class="btn waves-effect waves-light blue" onclick="proposeTimeSlots("""),_display_(/*84.126*/app/*84.129*/.getId()),format.raw/*84.137*/(""")">
                                                    Schedule
                                                </button>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*89.38*/("""
                                """)))}),format.raw/*90.34*/("""
                            """),format.raw/*91.29*/("""</tbody>
                        </table>
                    </div>

                    <div id="scheduled" class="col s12" style="margin-top: 20px;">
                        <table class="striped responsive-table">
                            <thead>
                                <tr>
                                    <th>Applicant Name</th>
                                    <th>Proposed/Scheduled Time</th>
                                    <th>Status</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),_display_(/*106.34*/if(interviews.isEmpty)/*106.56*/ {_display_(Seq[Any](format.raw/*106.58*/("""
                                    """),format.raw/*107.37*/("""<tr>
                                        <td colspan="4" class="center">No interviews scheduled yet.</td>
                                    </tr>
                                """)))}/*110.35*/else/*110.40*/{_display_(Seq[Any](format.raw/*110.41*/("""
                                    """),_display_(/*111.38*/for(interview <- interviews) yield /*111.66*/ {_display_(Seq[Any](format.raw/*111.68*/("""
                                        """),format.raw/*112.41*/("""<tr>
                                            <td>
                                                """),_display_(/*114.50*/if(interview.has("rajobApplication") && interview.get("rajobApplication").has("applicant"))/*114.141*/ {_display_(Seq[Any](format.raw/*114.143*/("""
                                                    """),_display_(/*115.54*/interview/*115.63*/.get("rajobApplication").get("applicant").get("firstName").asText()),format.raw/*115.130*/("""
                                                    """),_display_(/*116.54*/interview/*116.63*/.get("rajobApplication").get("applicant").get("lastName").asText()),format.raw/*116.129*/("""
                                                """)))}/*117.51*/else/*117.56*/{_display_(Seq[Any](format.raw/*117.57*/("""
                                                    """),format.raw/*118.53*/("""Unknown
                                                """)))}),format.raw/*119.50*/("""
                                            """),format.raw/*120.45*/("""</td>
                                            <td>
                                                """),_display_(/*122.50*/if(interview.has("chosenTime") && !interview.get("chosenTime").isNull() && !interview.get("chosenTime").asText().isEmpty())/*122.173*/ {_display_(Seq[Any](format.raw/*122.175*/("""
                                                    """),format.raw/*123.53*/("""<strong>"""),_display_(/*123.62*/interview/*123.71*/.get("chosenTime").asText()),format.raw/*123.98*/("""</strong>
                                                """)))}/*124.51*/else/*124.56*/{_display_(Seq[Any](format.raw/*124.57*/("""
                                                    """),_display_(/*125.54*/if(interview.has("proposedTimesList") && interview.get("proposedTimesList").size() > 0)/*125.141*/ {_display_(Seq[Any](format.raw/*125.143*/("""
                                                        """),format.raw/*126.57*/("""<ul style="margin: 0; padding-left: 15px;">
                                                        """),_display_(/*127.58*/for(i <- 0 until interview.get("proposedTimesList").size()) yield /*127.117*/ {_display_(Seq[Any](format.raw/*127.119*/("""
                                                            """),format.raw/*128.61*/("""<li><em>"""),_display_(/*128.70*/interview/*128.79*/.get("proposedTimesList").get(i).asText()),format.raw/*128.120*/("""</em></li>
                                                        """)))}),format.raw/*129.58*/("""
                                                        """),format.raw/*130.57*/("""</ul>
                                                    """)))}/*131.55*/else/*131.60*/{_display_(Seq[Any](format.raw/*131.61*/("""
                                                        """),format.raw/*132.57*/("""<em>"""),_display_(/*132.62*/interview/*132.71*/.get("proposedTimes").asText()),format.raw/*132.101*/("""</em>
                                                    """)))}),format.raw/*133.54*/("""
                                                """)))}),format.raw/*134.50*/("""
                                            """),format.raw/*135.45*/("""</td>
                                            <td><span class="new badge purple darken-1" data-badge-caption=""""),_display_(/*136.110*/interview/*136.119*/.get("status").asText()),format.raw/*136.142*/(""""></span></td>
                                            <td>
                                                <button class="btn waves-effect waves-light blue" onclick="rescheduleInterview("""),_display_(/*138.129*/interview/*138.138*/.get("id").asLong()),format.raw/*138.157*/(""")">
                                                    Reschedule
                                                </button>
                                                <button class="btn waves-effect waves-light red" onclick="cancelInterview("""),_display_(/*141.124*/interview/*141.133*/.get("id").asLong()),format.raw/*141.152*/(""")">
                                                    Cancel
                                                </button>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*146.38*/("""
                                """)))}),format.raw/*147.34*/("""
                            """),format.raw/*148.29*/("""</tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Schedule Modal -->
    <div id="scheduleModal" class="modal">
        <form action=""""),_display_(/*158.24*/routes/*158.30*/.RAJobController.scheduleInterviewPOST(jobId)),format.raw/*158.75*/("""" method="POST">
            <div class="modal-content">
                <h5>Propose Interview Time Slots</h5>
                <p>Propose up to 3 time slots for an interview. The student will receive an email/in-app notification to confirm.</p>
                <input type="hidden" id="applicantId" name="applicantId" />
                
                <div class="row">
                    <h6 class="col s12">Slot 1 (Required)</h6>
                    <div class="input-field col s6">
                        <input type="text" class="datepicker" id="date1" name="date1" required>
                        <label for="date1">Date</label>
                    </div>
                    <div class="input-field col s6">
                        <input type="text" class="timepicker" id="time1" name="time1" required>
                        <label for="time1">Time</label>
                    </div>
                </div>
                
                <div class="row">
                    <h6 class="col s12">Slot 2 (Optional)</h6>
                    <div class="input-field col s6">
                        <input type="text" class="datepicker" id="date2" name="date2">
                        <label for="date2">Date</label>
                    </div>
                    <div class="input-field col s6">
                        <input type="text" class="timepicker" id="time2" name="time2">
                        <label for="time2">Time</label>
                    </div>
                </div>
                
                <div class="row">
                    <h6 class="col s12">Slot 3 (Optional)</h6>
                    <div class="input-field col s6">
                        <input type="text" class="datepicker" id="date3" name="date3">
                        <label for="date3">Date</label>
                    </div>
                    <div class="input-field col s6">
                        <input type="text" class="timepicker" id="time3" name="time3">
                        <label for="time3">Time</label>
                    </div>
                </div>
                
            </div>
            <div class="modal-footer">
                <a href="#!" class="modal-close waves-effect waves-red btn-flat">Cancel</a>
                <button type="submit" class="waves-effect waves-green btn blue">Send Notification</button>
            </div>
        </form>
    </div>
""")))}),format.raw/*207.2*/("""
"""))
      }
    }
  }

  def render(jobId:Long,applications:List[RAJobApplication],interviews:List[JsonNode]): play.twirl.api.HtmlFormat.Appendable = apply(jobId,applications,interviews)

  def f:((Long,List[RAJobApplication],List[JsonNode]) => play.twirl.api.HtmlFormat.Appendable) = (jobId,applications,interviews) => apply(jobId,applications,interviews)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 02 14:50:20 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/raInterviewSchedule.scala.html
                  HASH: 026826ddc46f65953219bd5ebd17c415d8ff0de4
                  MATRIX: 814->1|843->24|881->56|1282->104|1439->186|1453->193|1533->197|1564->202|1659->270|1687->271|1727->284|1847->376|1876->377|1921->394|1982->427|2011->428|2092->482|2121->483|2202->536|2231->537|2272->550|2450->701|2479->702|2516->712|2582->750|2611->751|2652->764|2788->871|2818->872|2863->889|2943->941|2972->942|3058->1000|3087->1001|3130->1016|3159->1017|3195->1026|3224->1027|3269->1045|3339->1087|3368->1088|3409->1101|3585->1250|3614->1251|3652->1262|3693->1294|3733->1296|3774->1309|3831->1338|3860->1339|3905->1356|3941->1364|3970->1365|4005->1373|4019->1378|4055->1393|4084->1394|4113->1395|4156->1410|4185->1411|4228->1423|4265->1433|4304->1463|4344->1465|4385->1478|4442->1507|4471->1508|4516->1525|4552->1533|4581->1534|4616->1542|4630->1547|4664->1560|4709->1577|4738->1578|4781->1593|4810->1594|4853->1606|4885->1611|4935->183|4964->1622|4993->1625|5040->1663|5080->1665|5112->1670|5392->1923|5418->1928|6373->2856|6406->2880|6446->2882|6511->2919|6709->3099|6722->3104|6761->3105|6826->3143|6866->3167|6906->3169|6975->3210|7056->3264|7068->3267|7119->3297|7148->3299|7160->3302|7211->3331|7354->3446|7367->3449|7401->3461|7492->3525|7504->3528|7542->3545|7750->3725|7763->3728|7793->3736|8080->3992|8145->4026|8202->4055|8899->4724|8931->4746|8972->4748|9038->4785|9243->4971|9257->4976|9297->4977|9363->5015|9408->5043|9449->5045|9519->5086|9650->5189|9752->5280|9794->5282|9876->5336|9895->5345|9985->5412|10067->5466|10086->5475|10175->5541|10245->5592|10259->5597|10299->5598|10381->5651|10470->5708|10544->5753|10676->5857|10810->5980|10852->5982|10934->6035|10971->6044|10990->6053|11039->6080|11118->6140|11132->6145|11172->6146|11254->6200|11352->6287|11394->6289|11480->6346|11609->6447|11686->6506|11728->6508|11818->6569|11855->6578|11874->6587|11938->6628|12038->6696|12124->6753|12203->6813|12217->6818|12257->6819|12343->6876|12376->6881|12395->6890|12448->6920|12539->6979|12621->7029|12695->7074|12839->7189|12859->7198|12905->7221|13126->7413|13146->7422|13188->7441|13465->7689|13485->7698|13527->7717|13813->7971|13879->8005|13937->8034|14197->8266|14213->8272|14280->8317|16720->10726
                  LINES: 31->1|32->2|33->3|38->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|49->11|49->11|50->12|51->13|51->13|53->15|53->15|55->17|55->17|56->18|59->21|59->21|61->23|61->23|61->23|62->24|62->24|62->24|63->25|64->26|64->26|64->26|64->26|65->27|65->27|66->28|66->28|68->30|68->30|68->30|69->31|72->34|72->34|74->36|74->36|74->36|75->37|75->37|75->37|76->38|76->38|76->38|76->38|76->38|76->38|76->38|76->38|77->39|77->39|78->40|79->41|79->41|79->41|80->42|80->42|80->42|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|82->44|82->44|83->45|84->46|86->4|88->47|90->49|90->49|90->49|91->50|96->55|96->55|114->73|114->73|114->73|115->74|118->77|118->77|118->77|119->78|119->78|119->78|120->79|121->80|121->80|121->80|121->80|121->80|121->80|122->81|122->81|122->81|123->82|123->82|123->82|125->84|125->84|125->84|130->89|131->90|132->91|147->106|147->106|147->106|148->107|151->110|151->110|151->110|152->111|152->111|152->111|153->112|155->114|155->114|155->114|156->115|156->115|156->115|157->116|157->116|157->116|158->117|158->117|158->117|159->118|160->119|161->120|163->122|163->122|163->122|164->123|164->123|164->123|164->123|165->124|165->124|165->124|166->125|166->125|166->125|167->126|168->127|168->127|168->127|169->128|169->128|169->128|169->128|170->129|171->130|172->131|172->131|172->131|173->132|173->132|173->132|173->132|174->133|175->134|176->135|177->136|177->136|177->136|179->138|179->138|179->138|182->141|182->141|182->141|187->146|188->147|189->148|199->158|199->158|199->158|248->207
                  -- GENERATED --
              */
          