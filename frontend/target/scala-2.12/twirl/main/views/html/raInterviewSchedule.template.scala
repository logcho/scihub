
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

object raInterviewSchedule extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script type="text/javascript">
        $(document).ready(function()"""),format.raw/*5.37*/("""{"""),format.raw/*5.38*/("""
            """),format.raw/*6.13*/("""$('.modal').modal();
            $('.tabs').tabs();
            $('.datepicker').datepicker("""),format.raw/*8.41*/("""{"""),format.raw/*8.42*/("""
                """),format.raw/*9.17*/("""format: 'yyyy-mm-dd'
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/(""");
            $('.timepicker').timepicker();
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/(""");
        
        function proposeTimeSlots(appId) """),format.raw/*14.42*/("""{"""),format.raw/*14.43*/("""
            """),format.raw/*15.13*/("""$('#applicantId').val(appId);
            var modal = M.Modal.getInstance(document.getElementById('scheduleModal'));
            modal.open();
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""

        """),format.raw/*20.9*/("""function cancelInterview(interviewId) """),format.raw/*20.47*/("""{"""),format.raw/*20.48*/("""
            """),format.raw/*21.13*/("""if(confirm("Are you sure you want to cancel this interview? A notification will be sent to the student.")) """),format.raw/*21.120*/("""{"""),format.raw/*21.121*/("""
                """),format.raw/*22.17*/("""// Mock AJAX call to cancel
                M.toast("""),format.raw/*23.25*/("""{"""),format.raw/*23.26*/("""html: 'Interview cancelled. Notification sent to student.'"""),format.raw/*23.84*/("""}"""),format.raw/*23.85*/(""");
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
        
        """),format.raw/*27.9*/("""function rescheduleInterview(interviewId) """),format.raw/*27.51*/("""{"""),format.raw/*27.52*/("""
            """),format.raw/*28.13*/("""// Open modal to reschedule
            var modal = M.Modal.getInstance(document.getElementById('scheduleModal'));
            modal.open();
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*33.2*/("""

"""),_display_(/*35.2*/main("Schedule RA Interview", scripts)/*35.40*/ {_display_(Seq[Any](format.raw/*35.42*/("""
    """),format.raw/*36.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4>Schedule RA Job Interviews</h4>
                    <p class="grey-text">Project/Job ID: """),_display_(/*41.59*/jobId),format.raw/*41.64*/("""</p>
                    
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
                                <!-- Mock Data rows -->
                                <tr>
                                    <td>John Doe</td>
                                    <td><span class="new badge purple darken-1" data-badge-caption="Pending"></span></td>
                                    <td>2026-04-25 10:00</td>
                                    <td>
                                        <button class="btn waves-effect waves-light blue" onclick="proposeTimeSlots(1)">
                                            Schedule
                                        </button>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Jane Smith</td>
                                    <td><span class="new badge purple darken-1" data-badge-caption="Pending"></span></td>
                                    <td>2026-04-24 14:30</td>
                                    <td>
                                        <button class="btn waves-effect waves-light blue" onclick="proposeTimeSlots(2)">
                                            Schedule
                                        </button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div id="scheduled" class="col s12" style="margin-top: 20px;">
                        <table class="striped responsive-table">
                            <thead>
                                <tr>
                                    <th>Applicant Name</th>
                                    <th>Scheduled Time</th>
                                    <th>Status</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <!-- Mock Data -->
                                <tr>
                                    <td>Alice Johnson</td>
                                    <td>2026-04-28 10:00 AM</td>
                                    <td><span class="new badge light-green darken-1" data-badge-caption="Confirmed"></span></td>
                                    <td>
                                        <button class="btn-flat blue-text" onclick="rescheduleInterview(101)">Reschedule</button>
                                        <button class="btn-flat red-text" onclick="cancelInterview(101)">Cancel</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Schedule Modal -->
    <div id="scheduleModal" class="modal">
        <form action="#" method="POST" onsubmit="event.preventDefault(); M.toast("""),format.raw/*115.82*/("""{"""),format.raw/*115.83*/("""html: 'Notification sent successfully!'"""),format.raw/*115.122*/("""}"""),format.raw/*115.123*/("""); M.Modal.getInstance(document.getElementById('scheduleModal')).close();">
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
""")))}),format.raw/*164.2*/("""
"""))
      }
    }
  }

  def render(jobId:Long): play.twirl.api.HtmlFormat.Appendable = apply(jobId)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (jobId) => apply(jobId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 25 17:11:43 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/raInterviewSchedule.scala.html
                  HASH: 6896f493e3c125e568664cea32977c5f7bf3bb50
                  MATRIX: 1123->1|1214->17|1228->24|1308->28|1339->33|1434->101|1462->102|1502->115|1621->207|1649->208|1693->225|1754->258|1783->259|1864->313|1893->314|1974->367|2003->368|2044->381|2222->532|2251->533|2288->543|2354->581|2383->582|2424->595|2560->702|2590->703|2635->720|2715->772|2744->773|2830->831|2859->832|2902->847|2931->848|2967->857|2996->858|3041->876|3111->918|3140->919|3181->932|3357->1081|3386->1082|3418->1087|3468->14|3497->1098|3526->1101|3573->1139|3613->1141|3645->1146|3925->1399|3951->1404|7859->5283|7889->5284|7958->5323|7989->5324|10488->7792
                  LINES: 35->1|39->3|39->3|41->3|42->4|43->5|43->5|44->6|46->8|46->8|47->9|48->10|48->10|50->12|50->12|52->14|52->14|53->15|56->18|56->18|58->20|58->20|58->20|59->21|59->21|59->21|60->22|61->23|61->23|61->23|61->23|62->24|62->24|63->25|63->25|65->27|65->27|65->27|66->28|69->31|69->31|70->32|72->1|74->33|76->35|76->35|76->35|77->36|82->41|82->41|156->115|156->115|156->115|156->115|205->164
                  -- GENERATED --
              */
          