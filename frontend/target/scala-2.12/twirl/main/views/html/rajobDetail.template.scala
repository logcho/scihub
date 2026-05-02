
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
/*1.2*/import org.apache.commons.lang3.StringUtils

object rajobDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[RAJob,Long,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rajob: RAJob, userId: Long, userTypes: String, tableName: String, rajobFileType: String, tableRecorderId: String,
backendPort: String, rajobDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("RAJob Profile")/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<link href='"""),_display_(/*9.14*/routes/*9.20*/.Assets.at("stylesheets/textarea-resize.css")),format.raw/*9.65*/("""' rel="stylesheet" />

<div class="container">
    <div class="row">
        <div class="col s12">
            <div class="card-panel">

                <h4 class="center">RA Job: """),_display_(/*16.45*/rajob/*16.50*/.getTitle),format.raw/*16.59*/("""</h4>

                <div class="row">
                    <div class="col s4">
                        <div class="center">
                            <img class="circle" id="showImg" src=""""),_display_(/*21.68*/routes/*21.74*/.Assets.at("images/smu.jpeg")),format.raw/*21.103*/("""" width="360"
                                height="360" style="border-width: 1px;
                                    border-style: solid;
                                    border-radius: 50%;
                                    height: auto;
                                    width: 70%;">
                        </div>
                    </div>
                    <div class="col s8">
                        <table class="striped responsive-table">
                            <tbody>
                                <tr>
                                    <th style="max-width: 50px">RA Job Title</th>
                                    <td style="word-wrap: break-word;">"""),_display_(/*34.73*/rajob/*34.78*/.getTitle),format.raw/*34.87*/("""</td>
                                </tr>

                                <tr>
                                    <th style="max-width: 50px">Department/Lab Name</th>
                                    """),_display_(/*39.38*/if(rajob.getOrganization!="null" && rajob.getOrganization != "")/*39.102*/ {_display_(Seq[Any](format.raw/*39.104*/("""
                                    """),format.raw/*40.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*40.73*/rajob/*40.78*/.getOrganization),format.raw/*40.94*/("""</td>
                                    """)))}/*41.39*/else/*41.44*/{_display_(Seq[Any](format.raw/*41.45*/("""
                                    """),format.raw/*42.37*/("""<td>-</td>
                                    """)))}),format.raw/*43.38*/("""
                                """),format.raw/*44.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Goals</th>
                                    """),_display_(/*48.38*/if(rajob.getGoals!="null" && rajob.getGoals != "")/*48.88*/ {_display_(Seq[Any](format.raw/*48.90*/("""
                                    """),format.raw/*49.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*49.73*/rajob/*49.78*/.getGoals),format.raw/*49.87*/("""</td>
                                    """)))}/*50.39*/else/*50.44*/{_display_(Seq[Any](format.raw/*50.45*/("""
                                    """),format.raw/*51.37*/("""<td>-</td>
                                    """)))}),format.raw/*52.38*/("""
                                """),format.raw/*53.33*/("""</tr>
                                <tr>
                                    <th style="width: 200px;">Short Description</th>
                                    """),_display_(/*56.38*/if(rajob.getShortDescription != "null" && rajob.getShortDescription != "")/*56.112*/ {_display_(Seq[Any](format.raw/*56.114*/("""
                                    """),format.raw/*57.37*/("""<td style="white-space: pre-wrap; word-wrap: break-word; text-align: left;">
                                        """),_display_(/*58.42*/rajob/*58.47*/.getShortDescription),format.raw/*58.67*/("""</td>
                                    """)))}/*59.39*/else/*59.44*/{_display_(Seq[Any](format.raw/*59.45*/("""
                                    """),format.raw/*60.37*/("""<td>-</td>
                                    """)))}),format.raw/*61.38*/("""
                                """),format.raw/*62.33*/("""</tr>

                                <tr>
                                    <th style="width: 200px;">Long Description</th>
                                    """),_display_(/*66.38*/if(rajob.getLongDescription != "null" && rajob.getLongDescription != "")/*66.110*/ {_display_(Seq[Any](format.raw/*66.112*/("""
                                    """),format.raw/*67.37*/("""<td style="white-space: pre-wrap; word-wrap: break-word; text-align: left;">
                                        """),_display_(/*68.42*/rajob/*68.47*/.getLongDescription),format.raw/*68.66*/("""</td>
                                    """)))}/*69.39*/else/*69.44*/{_display_(Seq[Any](format.raw/*69.45*/("""
                                    """),format.raw/*70.37*/("""<td>-</td>
                                    """)))}),format.raw/*71.38*/("""
                                """),format.raw/*72.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Fields</th>
                                    """),_display_(/*75.38*/if(rajob.getFields!="null" && rajob.getFields != "")/*75.90*/ {_display_(Seq[Any](format.raw/*75.92*/("""
                                    """),format.raw/*76.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*76.73*/rajob/*76.78*/.getFields),format.raw/*76.88*/("""</td>
                                    """)))}/*77.39*/else/*77.44*/{_display_(Seq[Any](format.raw/*77.45*/("""
                                    """),format.raw/*78.37*/("""<td>-</td>
                                    """)))}),format.raw/*79.38*/("""
                                """),format.raw/*80.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Required Expertise</th>
                                    """),_display_(/*83.38*/if(rajob.getRequiredExpertise!="null" && rajob.getRequiredExpertise != "")/*83.112*/ {_display_(Seq[Any](format.raw/*83.114*/("""
                                    """),format.raw/*84.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*84.73*/rajob/*84.78*/.getRequiredExpertise),format.raw/*84.99*/("""</td>
                                    """)))}/*85.39*/else/*85.44*/{_display_(Seq[Any](format.raw/*85.45*/("""
                                    """),format.raw/*86.37*/("""<td>-</td>
                                    """)))}),format.raw/*87.38*/("""
                                """),format.raw/*88.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Preferred Expertise</th>
                                    """),_display_(/*91.38*/if(rajob.getPreferredExpertise!="null" && rajob.getPreferredExpertise != "")/*91.114*/ {_display_(Seq[Any](format.raw/*91.116*/("""
                                    """),format.raw/*92.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*92.73*/rajob/*92.78*/.getPreferredExpertise),format.raw/*92.100*/("""</td>
                                    """)))}/*93.39*/else/*93.44*/{_display_(Seq[Any](format.raw/*93.45*/("""
                                    """),format.raw/*94.37*/("""<td>-</td>
                                    """)))}),format.raw/*95.38*/("""
                                """),format.raw/*96.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Location</th>
                                    """),_display_(/*99.38*/if(rajob.getLocation!="null" && rajob.getLocation != "")/*99.94*/ {_display_(Seq[Any](format.raw/*99.96*/("""
                                    """),format.raw/*100.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*100.73*/rajob/*100.78*/.getLocation),format.raw/*100.90*/("""</td>
                                    """)))}/*101.39*/else/*101.44*/{_display_(Seq[Any](format.raw/*101.45*/("""
                                    """),format.raw/*102.37*/("""<td>-</td>
                                    """)))}),format.raw/*103.38*/("""
                                """),format.raw/*104.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">RA Job Type</th>
                                    <td style="word-wtap: break-word;">
                                        """),_display_(/*108.42*/if(rajob.getRaTypes!="null" && rajob.getRaTypes != "" )/*108.97*/ {_display_(Seq[Any](format.raw/*108.99*/("""
                                        """),_display_(/*109.42*/if(rajob.getRaTypes == 1)/*109.67*/{_display_(Seq[Any](format.raw/*109.68*/("""
                                        """),format.raw/*110.41*/("""Hourly RA (Graduate Students: $20/Hour; Undergraduate Student: $15/Hour)
                                        """)))}),format.raw/*111.42*/("""
                                        """),_display_(/*112.42*/if(rajob.getRaTypes == 2)/*112.67*/ {_display_(Seq[Any](format.raw/*112.69*/("""
                                        """),format.raw/*113.41*/("""Full-time RA (Tuition waiver + $2500/Month)
                                        """)))}),format.raw/*114.42*/("""
                                        """)))}/*115.43*/else/*115.47*/{_display_(Seq[Any](format.raw/*115.48*/("""
                                        """),format.raw/*116.41*/("""N/A
                                        """)))}),format.raw/*117.42*/("""
                                    """),format.raw/*118.37*/("""</td>
                                </tr>
                                """),format.raw/*120.42*/("""
                                    """),format.raw/*121.87*/("""
                                    """),format.raw/*122.77*/("""
                                        """),format.raw/*123.108*/("""
                                        """),format.raw/*124.65*/("""
                                        """),format.raw/*125.54*/("""
                                        """),format.raw/*126.49*/("""
                                        """),format.raw/*127.47*/("""
                                        """),format.raw/*128.47*/("""
                                        """),format.raw/*129.108*/("""
                                        """),format.raw/*130.65*/("""
                                        """),format.raw/*131.54*/("""
                                        """),format.raw/*132.49*/("""
                                        """),format.raw/*133.47*/("""
                                        """),format.raw/*134.51*/("""
                                    """),format.raw/*135.47*/("""
                                """),format.raw/*136.33*/("""<tr>
                                    <th style="max-width: 50px">RA Job URL</th>
                                    """),_display_(/*138.38*/if(rajob.getUrl !=null && rajob.getUrl != "")/*138.83*/ {_display_(Seq[Any](format.raw/*138.85*/("""
                                    """),format.raw/*139.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*139.73*/rajob/*139.78*/.getUrl),format.raw/*139.85*/("""</td>
                                    """)))}/*140.39*/else/*140.44*/{_display_(Seq[Any](format.raw/*140.45*/("""
                                    """),format.raw/*141.37*/("""<td>-</td>
                                    """)))}),format.raw/*142.38*/("""
                                """),format.raw/*143.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">RA Job Publisher</th>
                                    """),_display_(/*147.38*/if(rajob.getRajobPublisher!="null" && rajob.getRajobPublisher != "")/*147.106*/ {_display_(Seq[Any](format.raw/*147.108*/("""
                                    """),format.raw/*148.37*/("""<td style="word-wrap: break-word;">"""),_display_(/*148.73*/rajob/*148.78*/.getRajobPublisher.getUserName),format.raw/*148.108*/("""</td>
                                    """)))}/*149.39*/else/*149.44*/{_display_(Seq[Any](format.raw/*149.45*/("""
                                    """),format.raw/*150.37*/("""<td>-</td>
                                    """)))}),format.raw/*151.38*/("""
                                """),format.raw/*152.33*/("""</tr>
                                """),format.raw/*160.40*/("""
                                """),_display_(/*161.34*/if(rajobDocument)/*161.51*/ {_display_(Seq[Any](format.raw/*161.53*/("""
                                """),format.raw/*162.33*/("""<tr>
                                    <th style="max-width: 50px">RA Job Document</th>
                                    <td style="word-wrap: break-word;">
                                        <a href="javascript:void(0);"
                                            data-url=""""),_display_(/*166.56*/routes/*166.62*/.FileController.getFile(tableName, rajobFileType, tableRecorderId)),format.raw/*166.128*/(""""
                                            class="blue-text text-darken-3" onclick="openAndCheckNewTabUrl(this)">
                                            Download RA Job Document
                                        </a>
                                    </td>
                                </tr>
                                """)))}),format.raw/*172.34*/("""
                            """),format.raw/*173.29*/("""</tbody>
                        </table>
                    </div>
                </div>
                <div class="row center">
                    """),format.raw/*178.43*/("""
                    """),_display_(/*179.22*/if(userTypes == "0")/*179.42*/ {_display_(Seq[Any](format.raw/*179.44*/("""
                    """),format.raw/*180.21*/("""<a href=""""),_display_(/*180.31*/routes/*180.37*/.AdminController.jobManagement(1, "id")),format.raw/*180.76*/(""""
                        class="btn waves-effect waves-light blue darken-2">
                        Back to job management
                    </a>
                    """)))}),format.raw/*184.22*/("""
                    """),_display_(/*185.22*/if(rajob.getRajobPublisher().getId().equals(userId) || userTypes == "0")/*185.94*/ {_display_(Seq[Any](format.raw/*185.96*/("""
                    """),format.raw/*186.21*/("""<a href=""""),_display_(/*186.31*/routes/*186.37*/.RAJobController.rajobEditPage(rajob.getId, rajob.getStatus())),format.raw/*186.99*/(""""
                        class="btn waves-effect waves-light blue darken-2">
                        Edit RA Job Info</a>
                    <a href=""""),_display_(/*189.31*/routes/*189.37*/.RAJobController.raInterviewSchedulePage(rajob.getId())),format.raw/*189.92*/(""""
                        class="btn waves-effect waves-light purple darken-2">
                        Schedule Interviews</a>
                    """)))}),format.raw/*192.22*/("""
                    """),format.raw/*193.21*/("""<a href=""""),_display_(/*193.31*/routes/*193.37*/.RAJobController.rajobList(1, "id")),format.raw/*193.72*/(""""
                        class="btn waves-effect waves-light blue darken-2">
                        Back to RA Job List</a>

                    """),_display_(/*197.22*/if((userTypes == "4" || userTypes == "0") && !rajob.getRajobApplicationIdList.contains(userId) &&
                    rajob.getStatus != "closed" )/*198.50*/ {_display_(Seq[Any](format.raw/*198.52*/("""
                    """),format.raw/*199.21*/("""<a href=""""),_display_(/*199.31*/routes/*199.37*/.RAJobController.rajobApplyPage(rajob.getId)),format.raw/*199.81*/(""""
                        class="btn waves-effect waves-light green darken-2">
                        Apply Job
                    </a>
                    """)))}),format.raw/*203.22*/("""
                    """),_display_(/*204.22*/if(rajob.getRajobPublisher().getId().equals(userId) || userTypes == "0" )/*204.95*/ {_display_(Seq[Any](format.raw/*204.97*/("""
                    """),format.raw/*205.21*/("""<a href=""""),_display_(/*205.31*/routes/*205.37*/.RAJobController.closeRAJob(rajob.getId)),format.raw/*205.77*/(""""
                        class="btn waves-effect waves-light blue darken-2">
                        Close RA Job</a>
                    """)))}),format.raw/*208.22*/("""

                """),format.raw/*210.17*/("""</div>
            </div>
        </div>
    </div>
</div>

<script>
    function openAndCheckNewTabUrl(link) """),format.raw/*217.42*/("""{"""),format.raw/*217.43*/("""
        """),format.raw/*218.9*/("""const url = link.getAttribute('data-url');

        fetch(url, """),format.raw/*220.20*/("""{"""),format.raw/*220.21*/(""" """),format.raw/*220.22*/("""method: 'HEAD' """),format.raw/*220.37*/("""}"""),format.raw/*220.38*/(""").then(response => """),format.raw/*220.57*/("""{"""),format.raw/*220.58*/("""
            """),format.raw/*221.13*/("""if (response.ok) """),format.raw/*221.30*/("""{"""),format.raw/*221.31*/("""
                """),format.raw/*222.17*/("""const newTab = window.open(url, '_blank');
                if (!newTab) """),format.raw/*223.30*/("""{"""),format.raw/*223.31*/("""
                    """),format.raw/*224.21*/("""alert("Please allow pop-ups in your browser to view this file.");
                """),format.raw/*225.17*/("""}"""),format.raw/*225.18*/("""
            """),format.raw/*226.13*/("""}"""),format.raw/*226.14*/(""" """),format.raw/*226.15*/("""else """),format.raw/*226.20*/("""{"""),format.raw/*226.21*/("""
                """),format.raw/*227.17*/("""alert("The user did not upload this file");
            """),format.raw/*228.13*/("""}"""),format.raw/*228.14*/("""
        """),format.raw/*229.9*/("""}"""),format.raw/*229.10*/(""")
            .catch(error => """),format.raw/*230.29*/("""{"""),format.raw/*230.30*/("""
                """),format.raw/*231.17*/("""console.error("Error checking the URL:", error);
                alert("Failed to check the file. Please try again later.");
            """),format.raw/*233.13*/("""}"""),format.raw/*233.14*/(""");
    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""
"""),format.raw/*235.1*/("""</script>

""")))}))
      }
    }
  }

  def render(rajob:RAJob,userId:Long,userTypes:String,tableName:String,rajobFileType:String,tableRecorderId:String,backendPort:String,rajobDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def f:((RAJob,Long,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument) => apply(rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 02 14:50:19 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/rajobDetail.scala.html
                  HASH: ce3b5f0c85e5dca6b0fe9fd9fbfb7f57d3d828f1
                  MATRIX: 814->1|1215->46|1447->208|1492->205|1520->224|1547->226|1576->247|1615->249|1643->251|1682->264|1696->270|1761->315|1969->496|1983->501|2013->510|2234->704|2249->710|2300->739|3016->1428|3030->1433|3060->1442|3295->1650|3369->1714|3410->1716|3475->1753|3538->1789|3552->1794|3589->1810|3651->1854|3664->1859|3703->1860|3768->1897|3847->1945|3908->1978|4091->2134|4150->2184|4190->2186|4255->2223|4318->2259|4332->2264|4362->2273|4424->2317|4437->2322|4476->2323|4541->2360|4620->2408|4681->2441|4873->2606|4957->2680|4998->2682|5063->2719|5208->2837|5222->2842|5263->2862|5325->2906|5338->2911|5377->2912|5442->2949|5521->2997|5582->3030|5774->3195|5856->3267|5897->3269|5962->3306|6107->3424|6121->3429|6161->3448|6223->3492|6236->3497|6275->3498|6340->3535|6419->3583|6480->3616|6663->3772|6724->3824|6764->3826|6829->3863|6892->3899|6906->3904|6937->3914|6999->3958|7012->3963|7051->3964|7116->4001|7195->4049|7256->4082|7451->4250|7535->4324|7576->4326|7641->4363|7704->4399|7718->4404|7760->4425|7822->4469|7835->4474|7874->4475|7939->4512|8018->4560|8079->4593|8275->4762|8361->4838|8402->4840|8467->4877|8530->4913|8544->4918|8588->4940|8650->4984|8663->4989|8702->4990|8767->5027|8846->5075|8907->5108|9092->5266|9157->5322|9197->5324|9263->5361|9327->5397|9342->5402|9376->5414|9439->5458|9453->5463|9493->5464|9559->5501|9639->5549|9701->5582|9966->5819|10031->5874|10072->5876|10142->5918|10177->5943|10217->5944|10287->5985|10433->6099|10503->6141|10538->6166|10579->6168|10649->6209|10766->6294|10828->6337|10842->6341|10882->6342|10952->6383|11029->6428|11095->6465|11200->6550|11266->6637|11332->6714|11403->6822|11473->6887|11543->6941|11613->6990|11683->7037|11753->7084|11824->7192|11894->7257|11964->7311|12034->7360|12104->7407|12174->7458|12240->7505|12302->7538|12452->7660|12507->7705|12548->7707|12614->7744|12678->7780|12693->7785|12722->7792|12785->7836|12799->7841|12839->7842|12905->7879|12985->7927|13047->7960|13242->8127|13321->8195|13363->8197|13429->8234|13493->8270|13508->8275|13561->8305|13624->8349|13638->8354|13678->8355|13744->8392|13824->8440|13886->8473|13953->8942|14015->8976|14042->8993|14083->8995|14145->9028|14460->9315|14476->9321|14565->9387|14941->9731|14999->9760|15181->9935|15231->9957|15261->9977|15302->9979|15352->10000|15390->10010|15406->10016|15467->10055|15670->10226|15720->10248|15802->10320|15843->10322|15893->10343|15931->10353|15947->10359|16031->10421|16212->10574|16228->10580|16305->10635|16486->10784|16536->10805|16574->10815|16590->10821|16647->10856|16823->11004|16980->11151|17021->11153|17071->11174|17109->11184|17125->11190|17191->11234|17382->11393|17432->11415|17515->11488|17556->11490|17606->11511|17644->11521|17660->11527|17722->11567|17894->11707|17941->11725|18080->11835|18110->11836|18147->11845|18239->11908|18269->11909|18299->11910|18343->11925|18373->11926|18421->11945|18451->11946|18493->11959|18539->11976|18569->11977|18615->11994|18716->12066|18746->12067|18796->12088|18907->12170|18937->12171|18979->12184|19009->12185|19039->12186|19073->12191|19103->12192|19149->12209|19234->12265|19264->12266|19301->12275|19331->12276|19390->12306|19420->12307|19466->12324|19632->12461|19662->12462|19697->12469|19726->12470|19755->12471
                  LINES: 31->1|36->2|40->5|43->3|45->6|46->7|46->7|46->7|48->9|48->9|48->9|48->9|55->16|55->16|55->16|60->21|60->21|60->21|73->34|73->34|73->34|78->39|78->39|78->39|79->40|79->40|79->40|79->40|80->41|80->41|80->41|81->42|82->43|83->44|87->48|87->48|87->48|88->49|88->49|88->49|88->49|89->50|89->50|89->50|90->51|91->52|92->53|95->56|95->56|95->56|96->57|97->58|97->58|97->58|98->59|98->59|98->59|99->60|100->61|101->62|105->66|105->66|105->66|106->67|107->68|107->68|107->68|108->69|108->69|108->69|109->70|110->71|111->72|114->75|114->75|114->75|115->76|115->76|115->76|115->76|116->77|116->77|116->77|117->78|118->79|119->80|122->83|122->83|122->83|123->84|123->84|123->84|123->84|124->85|124->85|124->85|125->86|126->87|127->88|130->91|130->91|130->91|131->92|131->92|131->92|131->92|132->93|132->93|132->93|133->94|134->95|135->96|138->99|138->99|138->99|139->100|139->100|139->100|139->100|140->101|140->101|140->101|141->102|142->103|143->104|147->108|147->108|147->108|148->109|148->109|148->109|149->110|150->111|151->112|151->112|151->112|152->113|153->114|154->115|154->115|154->115|155->116|156->117|157->118|159->120|160->121|161->122|162->123|163->124|164->125|165->126|166->127|167->128|168->129|169->130|170->131|171->132|172->133|173->134|174->135|175->136|177->138|177->138|177->138|178->139|178->139|178->139|178->139|179->140|179->140|179->140|180->141|181->142|182->143|186->147|186->147|186->147|187->148|187->148|187->148|187->148|188->149|188->149|188->149|189->150|190->151|191->152|192->160|193->161|193->161|193->161|194->162|198->166|198->166|198->166|204->172|205->173|210->178|211->179|211->179|211->179|212->180|212->180|212->180|212->180|216->184|217->185|217->185|217->185|218->186|218->186|218->186|218->186|221->189|221->189|221->189|224->192|225->193|225->193|225->193|225->193|229->197|230->198|230->198|231->199|231->199|231->199|231->199|235->203|236->204|236->204|236->204|237->205|237->205|237->205|237->205|240->208|242->210|249->217|249->217|250->218|252->220|252->220|252->220|252->220|252->220|252->220|252->220|253->221|253->221|253->221|254->222|255->223|255->223|256->224|257->225|257->225|258->226|258->226|258->226|258->226|258->226|259->227|260->228|260->228|261->229|261->229|262->230|262->230|263->231|265->233|265->233|266->234|266->234|267->235
                  -- GENERATED --
              */
          