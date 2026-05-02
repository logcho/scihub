
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

object rajobListPostedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[RAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajobs: List[RAJob],
        pageNum: Integer,
        offset: Integer,
        total: Integer,
        count: Integer,
        pageLimit: Integer,
        id: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*10.2*/import helper._;
/*11.2*/import models._;
/*12.2*/import models.RAJob;

def /*14.2*/scripts/*14.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.13*/("""
    """),format.raw/*15.5*/("""<script type = "module" src='"""),_display_(/*15.35*/routes/*15.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*15.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*18.43*/("""{"""),format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""var technologiesArray = []
                """),_display_(/*20.18*/for(i <- 0 until rajobs.size) yield /*20.47*/ {_display_(Seq[Any](format.raw/*20.49*/("""
                """),format.raw/*21.17*/("""var json = """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/(""";
                json.id = '"""),_display_(/*22.29*/rajobs/*22.35*/.get(i).getId()),format.raw/*22.50*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*25.31*/rajobs/*25.37*/.get(i).getTitle),format.raw/*25.53*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArray.push(json)
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""$("#nasaText").text(JSON.stringify(technologiesArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/(""");

            function jumpToPage(pageNum) """),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""

                """),format.raw/*41.17*/("""pageNum =  parseInt(pageNum);

                var url = "/job/searchPOST?pageNum=" + (pageNum);
                var form = $(document.createElement('form'));
                $(form).attr("action", url);
                $(form).attr("method", "GET");
                $(form).css("display", "none");


                var form_searchString = $("<input>")
                        .attr("type", "text")
                        .attr("name", "searchString")
                        .val(searchString);
                $(form).append($(form_searchString));

                form.appendTo(document.body);
                $(form).submit();
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""

            """),format.raw/*60.13*/("""function string2Map(str) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""

                """),format.raw/*62.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var array = splitedString.split(";");
                for(var i=0; i<array.length; i++)"""),format.raw/*65.50*/("""{"""),format.raw/*65.51*/("""
                    """),format.raw/*66.21*/("""var idAndEventsString = array[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*67.69*/("""{"""),format.raw/*67.70*/("""}"""),format.raw/*67.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*75.55*/("""{"""),format.raw/*75.56*/("""
                        """),format.raw/*76.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                    """),format.raw/*79.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""

                """),format.raw/*83.17*/("""return map;
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/("""

    """),format.raw/*86.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*88.25*/("""{"""),format.raw/*88.26*/("""
                """),format.raw/*89.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*92.13*/("""}"""),format.raw/*92.14*/("""

            """),format.raw/*94.13*/(""".truncate-text """),format.raw/*94.28*/("""{"""),format.raw/*94.29*/("""
                """),format.raw/*95.17*/("""display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
                overflow: hidden;
                text-overflow: ellipsis;
                max-height: 4.5em; /* 3 lines approx if line-height is 1.5em */
                line-height: 1.5em;
                cursor: pointer;
                white-space: normal;
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""
    """),format.raw/*105.5*/("""</style>
""")))};
Seq[Any](format.raw/*9.40*/("""
"""),format.raw/*13.1*/("""
"""),format.raw/*106.2*/("""

"""),_display_(/*108.2*/main("My Posted RAJobs", scripts)/*108.35*/ {_display_(Seq[Any](format.raw/*108.37*/("""
    """),format.raw/*109.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the my posted job lists." >
                        My Posted RAJobs
                    </h6>
                </div>
            </div>

            """),_display_(/*120.14*/if(rajobs.size() > 0)/*120.35*/ {_display_(Seq[Any](format.raw/*120.37*/("""
                """),format.raw/*121.17*/("""<div class="col s8 offset-s2">
                    <h4>RAJob List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*133.60*/{
                            offset + 1
                        }),format.raw/*135.26*/(""" """),format.raw/*135.27*/("""to """),_display_(/*135.31*/{
                            offset + count
                        }),format.raw/*137.26*/(""" """),format.raw/*137.27*/("""of """),_display_(/*137.31*/total),format.raw/*137.36*/("""</h6>
                    </div>
                </div>
                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">RAJob Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Fields</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">View Applications</th>
                            <th style="cursor: pointer;">Interviews</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*155.22*/for((entry, index) <- rajobs.zipWithIndex if entry.getStatus() != "closed") yield /*155.97*/ {_display_(Seq[Any](format.raw/*155.99*/("""
                        """),format.raw/*156.25*/("""<tr>
                            <td>"""),_display_(/*157.34*/entry/*157.39*/.getId()),format.raw/*157.47*/("""</td>


                            """),format.raw/*160.90*/("""
                            """),format.raw/*161.132*/("""
                            """),format.raw/*162.86*/("""
                            """),format.raw/*163.70*/("""
                            """),format.raw/*164.69*/("""
                            """),format.raw/*165.145*/("""
                            """),format.raw/*166.62*/("""
                            """),format.raw/*167.29*/("""<td>

                            """),_display_(/*169.30*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*169.87*/ {_display_(Seq[Any](format.raw/*169.89*/("""
                                """),format.raw/*170.33*/("""<a href = """"),_display_(/*170.45*/routes/*170.51*/.RAJobController.rajobDetail(entry.getId())),format.raw/*170.94*/("""">"""),_display_(/*170.97*/entry/*170.102*/.getTitle()),format.raw/*170.113*/("""</a>
                                <span class=""""),_display_(/*171.47*/entry/*171.52*/.getId()),format.raw/*171.60*/(""" """),format.raw/*171.61*/("""editable" data-name="title"></span>
                                """),format.raw/*172.108*/("""
                                """),format.raw/*173.114*/("""
                                """),format.raw/*174.81*/("""
                                """),format.raw/*175.94*/("""
                                """),format.raw/*176.74*/("""
                            """)))}/*177.31*/else/*177.36*/{_display_(Seq[Any](format.raw/*177.37*/("""
                                """),format.raw/*178.33*/("""<span class=""""),_display_(/*178.47*/entry/*178.52*/.getId()),format.raw/*178.60*/(""" """),format.raw/*178.61*/("""editable" data-name="title">&ensp; -</span>
                            """)))}),format.raw/*179.30*/("""
                            """),format.raw/*180.29*/("""</td>

                            """),format.raw/*182.101*/("""
                            """),format.raw/*183.143*/("""

                            """),format.raw/*185.97*/("""
                            """),format.raw/*186.70*/("""
                            """),format.raw/*187.69*/("""
                            """),format.raw/*188.156*/("""
                            """),format.raw/*189.62*/("""

                            """),format.raw/*191.29*/("""<td>

                            """),_display_(/*193.30*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*193.109*/ {_display_(Seq[Any](format.raw/*193.111*/("""
                                """),format.raw/*194.33*/("""<span class=""""),_display_(/*194.47*/entry/*194.52*/.getId()),format.raw/*194.60*/(""" """),format.raw/*194.61*/("""editable truncate-text" data-name="shortDescription" title=""""),_display_(/*194.122*/entry/*194.127*/.getShortDescription()),format.raw/*194.149*/("""">
                                    """),format.raw/*195.123*/("""
                                    """),format.raw/*196.129*/("""
                                    """),format.raw/*197.85*/("""
                                    """),format.raw/*198.109*/("""
                                    """),format.raw/*199.78*/("""
                                    """),_display_(/*200.38*/entry/*200.43*/.getShortDescription()),format.raw/*200.65*/("""
                                """),format.raw/*201.33*/("""</span>
                            """)))}/*202.31*/else/*202.36*/{_display_(Seq[Any](format.raw/*202.37*/("""
                                """),format.raw/*203.33*/("""<span class=""""),_display_(/*203.47*/entry/*203.52*/.getId()),format.raw/*203.60*/(""" """),format.raw/*203.61*/("""editable truncate-text" data-name="shortDescription">&ensp; -</span>
                            """)))}),format.raw/*204.30*/("""
                            """),format.raw/*205.29*/("""</td>

                            """),format.raw/*207.91*/("""
                            """),format.raw/*208.133*/("""

                            """),format.raw/*210.87*/("""
                            """),format.raw/*211.70*/("""
                            """),format.raw/*212.69*/("""
                            """),format.raw/*213.146*/("""
                            """),format.raw/*214.62*/("""
                            """),format.raw/*215.29*/("""<td>
                            """),_display_(/*216.30*/if(entry.getFields() != null && entry.getFields().nonEmpty)/*216.89*/ {_display_(Seq[Any](format.raw/*216.91*/("""
                                """),format.raw/*217.33*/("""<span class=""""),_display_(/*217.47*/entry/*217.52*/.getId()),format.raw/*217.60*/(""" """),format.raw/*217.61*/("""editable truncate-text" data-name="fields" title=""""),_display_(/*217.112*/entry/*217.117*/.getFields()),format.raw/*217.129*/("""">
                                    """),format.raw/*218.113*/("""
                                    """),format.raw/*219.119*/("""
                                    """),format.raw/*220.85*/("""
                                    """),format.raw/*221.99*/("""
                                    """),format.raw/*222.78*/("""
                                    """),_display_(/*223.38*/entry/*223.43*/.getFields()),format.raw/*223.55*/("""
                                """),format.raw/*224.33*/("""</span>
                            """)))}/*225.31*/else/*225.36*/{_display_(Seq[Any](format.raw/*225.37*/("""
                                """),format.raw/*226.33*/("""<span class=""""),_display_(/*226.47*/entry/*226.52*/.getId()),format.raw/*226.60*/(""" """),format.raw/*226.61*/("""editable truncate-text" data-name="fields">&ensp; -</span>
                            """)))}),format.raw/*227.30*/("""
                            """),format.raw/*228.29*/("""</td>

                            """),format.raw/*230.95*/("""
                            """),format.raw/*231.69*/("""
                            """),format.raw/*232.147*/("""
                            """),format.raw/*233.70*/("""
                            """),format.raw/*234.103*/("""
                            """),format.raw/*235.65*/("""
                            """),format.raw/*236.141*/("""
                            """),format.raw/*237.66*/("""
                            """),format.raw/*238.67*/("""
                            """),format.raw/*239.65*/("""
                            """),format.raw/*240.138*/("""
                            """),format.raw/*241.66*/("""
                            """),format.raw/*242.62*/("""



                            """),_display_(/*246.30*/if(entry.getStatus() == "open")/*246.61*/ {_display_(Seq[Any](format.raw/*246.63*/("""
                                """),format.raw/*247.33*/("""<td>
                                    <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                </td>
                            """)))}/*250.31*/else if(entry.getStatus() == "pending")/*250.70*/{_display_(Seq[Any](format.raw/*250.71*/("""
                            """),format.raw/*251.29*/("""<td>
                                <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                            </td>
                            """),format.raw/*254.101*/("""
                            """),format.raw/*255.69*/("""
                            """),format.raw/*256.142*/("""
                            """),format.raw/*257.70*/("""
                            """)))}/*258.30*/else/*258.34*/{_display_(Seq[Any](format.raw/*258.35*/("""
                            """),format.raw/*259.29*/("""<td>
                                <span class="new badge blue darken-3" data-badge-caption="updated"></span>
                            </td>
                            """)))}),format.raw/*262.30*/("""

                            """),_display_(/*264.30*/if(entry.getNumberOfApplicants()>0)/*264.65*/ {_display_(Seq[Any](format.raw/*264.67*/("""
                                """),format.raw/*265.33*/("""<td>
                                    <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*266.99*/routes/*266.105*/.JobController.jobApplicationsList("rajob", entry.getId(), 1, "")),format.raw/*266.170*/("""">view</a>
                                </td>
                            """)))}/*268.31*/else/*268.36*/{_display_(Seq[Any](format.raw/*268.37*/("""
                                """),format.raw/*269.33*/("""<td>
                                    <a class="btn disabled">view</a>
                                </td>
                            """)))}),format.raw/*272.30*/("""
                            """),format.raw/*273.29*/("""<td>
                                <a class="waves-effect waves-light blue btn" href=""""),_display_(/*274.85*/routes/*274.91*/.RAJobController.raInterviewSchedulePage(entry.getId())),format.raw/*274.146*/("""">Schedule</a>
                            </td>

                        </tr>
                    """)))}),format.raw/*278.22*/("""
                    """),format.raw/*279.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*285.30*/if(pageNum == 1)/*285.46*/ {_display_(Seq[Any](format.raw/*285.48*/("""
                                """),format.raw/*286.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*290.31*/else/*290.36*/{_display_(Seq[Any](format.raw/*290.37*/("""
                                """),format.raw/*291.33*/("""<li class="waves-effect"><a href=""""),_display_(/*291.68*/routes/*291.74*/.RAJobController.rajobListPostedByUser(1)),format.raw/*291.115*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*293.68*/routes/*293.74*/.RAJobController.rajobListPostedByUser(pageNum - 1)),format.raw/*293.125*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*295.30*/("""
                            """),_display_(/*296.30*/if(beginIndexForPagination > 1)/*296.61*/ {_display_(Seq[Any](format.raw/*296.63*/("""
                                """),format.raw/*297.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*300.30*/("""
                            """),_display_(/*301.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*301.100*/ {_display_(Seq[Any](format.raw/*301.102*/("""
                                """),format.raw/*302.33*/("""<li """),_display_(/*302.38*/if(pageNum == i)/*302.54*/ {_display_(Seq[Any](format.raw/*302.56*/("""
                                    """),format.raw/*303.37*/("""class="active"""")))}),format.raw/*303.52*/("""><a href=""""),_display_(/*303.63*/routes/*303.69*/.RAJobController.rajobListPostedByUser(i)),format.raw/*303.110*/("""">"""),_display_(/*303.113*/i),format.raw/*303.114*/("""</a></li>
                            """)))}),format.raw/*304.30*/("""
                            """),_display_(/*305.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*305.87*/ {_display_(Seq[Any](format.raw/*305.89*/("""
                                """),format.raw/*306.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*309.30*/("""
                            """),_display_(/*310.30*/if((offset + count) >= total)/*310.59*/ {_display_(Seq[Any](format.raw/*310.61*/("""
                                """),format.raw/*311.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*315.31*/else/*315.36*/{_display_(Seq[Any](format.raw/*315.37*/("""
                                """),format.raw/*316.33*/("""<li class="waves-effect"><a href=""""),_display_(/*316.68*/routes/*316.74*/.RAJobController.rajobListPostedByUser(pageNum + 1)),format.raw/*316.125*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*318.68*/routes/*318.74*/.RAJobController.rajobListPostedByUser((total - 1) / pageLimit + 1)),format.raw/*318.141*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*320.30*/("""
                        """),format.raw/*321.25*/("""</ul>
                    </div>
                </div>
            """)))}/*324.15*/else/*324.20*/{_display_(Seq[Any](format.raw/*324.21*/("""
                """),format.raw/*325.17*/("""<h5>No rajobs registered yet.</h5>
            """)))}),format.raw/*326.14*/("""
            """),format.raw/*327.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*332.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*332.79*/ {_display_(Seq[Any](format.raw/*332.81*/("""
                        """),format.raw/*333.25*/("""<ul class="pagination center-align">
                        """),_display_(/*334.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*334.65*/ {_display_(Seq[Any](format.raw/*334.67*/("""
                            """),_display_(/*335.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*335.68*/ {_display_(Seq[Any](format.raw/*335.70*/("""
                                """),_display_(/*336.34*/if(j != pageNum)/*336.50*/ {_display_(Seq[Any](format.raw/*336.52*/("""
                                    """),format.raw/*337.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*337.87*/routes/*337.93*/.RAJobController.rajobListPostedByUser(j)),format.raw/*337.134*/("""'>"""),_display_(/*337.137*/j),format.raw/*337.138*/("""</a></li>
                                """)))}/*338.34*/else/*338.38*/{_display_(Seq[Any](format.raw/*338.39*/("""
                                    """),format.raw/*339.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*339.79*/routes/*339.85*/.RAJobController.rajobListPostedByUser(j)),format.raw/*339.126*/("""">"""),_display_(/*339.129*/j),format.raw/*339.130*/("""</a></li>
                                """)))}),format.raw/*340.34*/("""
                            """)))}),format.raw/*341.30*/("""
                        """)))}),format.raw/*342.26*/("""
                        """),format.raw/*343.25*/("""</ul>
                    """)))}),format.raw/*344.22*/("""
                    """),format.raw/*345.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

            <div id="enrollPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*358.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*358.79*/ {_display_(Seq[Any](format.raw/*358.81*/("""
                        """),format.raw/*359.25*/("""<ul class="pagination center-align">
                        """),_display_(/*360.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*360.65*/ {_display_(Seq[Any](format.raw/*360.67*/("""
                            """),_display_(/*361.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*361.68*/ {_display_(Seq[Any](format.raw/*361.70*/("""
                                """),_display_(/*362.34*/if(j != pageNum)/*362.50*/ {_display_(Seq[Any](format.raw/*362.52*/("""
                                    """),format.raw/*363.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*363.87*/routes/*363.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*363.140*/("""'>"""),_display_(/*363.143*/j),format.raw/*363.144*/("""</a></li>
                                """)))}/*364.34*/else/*364.38*/{_display_(Seq[Any](format.raw/*364.39*/("""
                                    """),format.raw/*365.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*365.79*/routes/*365.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*365.132*/("""">"""),_display_(/*365.135*/j),format.raw/*365.136*/("""</a></li>
                                """)))}),format.raw/*366.34*/("""
                            """)))}),format.raw/*367.30*/("""
                        """)))}),format.raw/*368.26*/("""
                        """),format.raw/*369.25*/("""</ul>
                    """)))}),format.raw/*370.22*/("""
                    """),format.raw/*371.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

            <div id="searchPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*384.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*384.79*/ {_display_(Seq[Any](format.raw/*384.81*/("""
                        """),format.raw/*385.25*/("""<ul class="pagination center-align">
                        """),_display_(/*386.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*386.65*/ {_display_(Seq[Any](format.raw/*386.67*/("""
                            """),_display_(/*387.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*387.68*/ {_display_(Seq[Any](format.raw/*387.70*/("""
                                """),_display_(/*388.34*/if(j != pageNum)/*388.50*/ {_display_(Seq[Any](format.raw/*388.52*/("""
                                    """),format.raw/*389.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*389.111*/j),format.raw/*389.112*/(""")">"""),_display_(/*389.116*/j),format.raw/*389.117*/("""</a></li>
                                """)))}/*390.34*/else/*390.38*/{_display_(Seq[Any](format.raw/*390.39*/("""
                                    """),format.raw/*391.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*391.103*/j),format.raw/*391.104*/(""")">"""),_display_(/*391.108*/j),format.raw/*391.109*/("""</a></li>
                                """)))}),format.raw/*392.34*/("""
                            """)))}),format.raw/*393.30*/("""
                        """)))}),format.raw/*394.26*/("""
                        """),format.raw/*395.25*/("""</ul>
                    """)))}),format.raw/*396.22*/("""
                    """),format.raw/*397.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*407.2*/("""
"""))
      }
    }
  }

  def render(rajobs:List[RAJob],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[RAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 02 14:50:20 CDT 2026
                  SOURCE: /Users/loganchoi/Desktop/scihub/frontend/app/views/rajobListPostedByUser.scala.html
                  HASH: 35fc191385e14f19b62242340f98b976f16d1263
                  MATRIX: 1193->1|1515->251|1540->269|1565->287|1599->310|1614->317|1695->321|1727->326|1784->356|1799->362|1858->400|1977->491|2006->492|2051->509|2122->553|2167->582|2207->584|2252->601|2291->612|2320->613|2349->614|2406->644|2421->650|2457->665|2574->755|2589->761|2626->777|2828->948|2873->965|3165->1229|3194->1230|3267->1275|3296->1276|3342->1294|4015->1939|4044->1940|4086->1954|4139->1979|4168->1980|4214->1998|4443->2199|4472->2200|4521->2221|4651->2323|4680->2324|4709->2325|5142->2730|5171->2731|5224->2756|5377->2881|5406->2882|5455->2903|5589->3009|5618->3010|5664->3028|5716->3052|5745->3053|5778->3059|5852->3105|5881->3106|5926->3123|6071->3240|6100->3241|6142->3255|6185->3270|6214->3271|6259->3288|6668->3668|6698->3669|6731->3674|6780->249|6808->308|6837->3684|6867->3687|6910->3720|6951->3722|6984->3727|7507->4222|7538->4243|7579->4245|7625->4262|8163->4772|8251->4838|8281->4839|8313->4843|8405->4913|8435->4914|8467->4918|8494->4923|9429->5830|9521->5905|9562->5907|9616->5932|9682->5970|9697->5975|9727->5983|9792->6080|9851->6212|9909->6298|9967->6368|10025->6437|10084->6582|10142->6644|10200->6673|10263->6708|10330->6765|10371->6767|10433->6800|10473->6812|10489->6818|10554->6861|10585->6864|10601->6869|10635->6880|10714->6931|10729->6936|10759->6944|10789->6945|10887->7088|10950->7202|11012->7283|11074->7377|11136->7451|11186->7482|11200->7487|11240->7488|11302->7521|11344->7535|11359->7540|11389->7548|11419->7549|11524->7622|11582->7651|11647->7758|11706->7901|11765->7999|11823->8069|11881->8138|11940->8294|11998->8356|12057->8386|12120->8421|12210->8500|12252->8502|12314->8535|12356->8549|12371->8554|12401->8562|12431->8563|12521->8624|12537->8629|12582->8651|12651->8776|12718->8905|12784->8990|12851->9099|12917->9177|12983->9215|12998->9220|13042->9242|13104->9275|13161->9313|13175->9318|13215->9319|13277->9352|13319->9366|13334->9371|13364->9379|13394->9380|13524->9478|13582->9507|13646->9604|13705->9737|13764->9825|13822->9895|13880->9964|13939->10110|13997->10172|14055->10201|14117->10235|14186->10294|14227->10296|14289->10329|14331->10343|14346->10348|14376->10356|14406->10357|14486->10408|14502->10413|14537->10425|14606->10540|14673->10659|14739->10744|14805->10843|14871->10921|14937->10959|14952->10964|14986->10976|15048->11009|15105->11047|15119->11052|15159->11053|15221->11086|15263->11100|15278->11105|15308->11113|15338->11114|15458->11202|15516->11231|15580->11332|15638->11401|15697->11548|15755->11618|15814->11721|15872->11786|15931->11927|15989->11993|16047->12060|16105->12125|16164->12263|16222->12329|16280->12391|16341->12424|16382->12455|16423->12457|16485->12490|16692->12678|16741->12717|16781->12718|16839->12747|17045->12995|17103->13064|17162->13206|17220->13276|17270->13306|17284->13310|17324->13311|17382->13340|17589->13515|17648->13546|17693->13581|17734->13583|17796->13616|17927->13719|17944->13725|18032->13790|18130->13869|18144->13874|18184->13875|18246->13908|18419->14049|18477->14078|18594->14167|18610->14173|18688->14228|18821->14329|18871->14350|19100->14551|19126->14567|19167->14569|19229->14602|19594->14948|19608->14953|19648->14954|19710->14987|19773->15022|19789->15028|19853->15069|20037->15225|20053->15231|20127->15282|20279->15402|20337->15432|20378->15463|20419->15465|20481->15498|20743->15728|20801->15758|20889->15828|20931->15830|20993->15863|21026->15868|21052->15884|21093->15886|21159->15923|21206->15938|21245->15949|21261->15955|21325->15996|21357->15999|21381->16000|21452->16039|21510->16069|21577->16126|21618->16128|21680->16161|21942->16391|22000->16421|22039->16450|22080->16452|22142->16485|22507->16831|22521->16836|22561->16837|22623->16870|22686->16905|22702->16911|22776->16962|22963->17121|22979->17127|23069->17194|23218->17311|23272->17336|23361->17406|23375->17411|23415->17412|23461->17429|23541->17477|23583->17490|23836->17715|23910->17772|23951->17774|24005->17799|24095->17861|24151->17900|24192->17902|24250->17932|24298->17970|24339->17972|24401->18006|24427->18022|24468->18024|24534->18061|24612->18111|24628->18117|24692->18158|24724->18161|24748->18162|24811->18205|24825->18209|24865->18210|24931->18247|25001->18289|25017->18295|25081->18336|25113->18339|25137->18340|25212->18383|25274->18413|25332->18439|25386->18464|25445->18491|25495->18512|26002->18991|26076->19048|26117->19050|26171->19075|26261->19137|26317->19176|26358->19178|26416->19208|26464->19246|26505->19248|26567->19282|26593->19298|26634->19300|26700->19337|26778->19387|26794->19393|26864->19440|26896->19443|26920->19444|26983->19487|26997->19491|27037->19492|27103->19529|27173->19571|27189->19577|27259->19624|27291->19627|27315->19628|27390->19671|27452->19701|27510->19727|27564->19752|27623->19779|27673->19800|28180->20279|28254->20336|28295->20338|28349->20363|28439->20425|28495->20464|28536->20466|28594->20496|28642->20534|28683->20536|28745->20570|28771->20586|28812->20588|28878->20625|28981->20699|29005->20700|29038->20704|29062->20705|29125->20748|29139->20752|29179->20753|29245->20790|29340->20856|29364->20857|29397->20861|29421->20862|29496->20905|29558->20935|29616->20961|29670->20986|29729->21013|29779->21034|30076->21300
                  LINES: 35->1|46->10|47->11|48->12|50->14|50->14|52->14|53->15|53->15|53->15|53->15|56->18|56->18|57->19|58->20|58->20|58->20|59->21|59->21|59->21|59->21|60->22|60->22|60->22|63->25|63->25|63->25|66->28|67->29|75->37|75->37|77->39|77->39|79->41|96->58|96->58|98->60|98->60|98->60|100->62|103->65|103->65|104->66|105->67|105->67|105->67|113->75|113->75|114->76|116->78|116->78|117->79|119->81|119->81|121->83|122->84|122->84|124->86|126->88|126->88|127->89|130->92|130->92|132->94|132->94|132->94|133->95|142->104|142->104|143->105|145->9|146->13|147->106|149->108|149->108|149->108|150->109|161->120|161->120|161->120|162->121|174->133|176->135|176->135|176->135|178->137|178->137|178->137|178->137|196->155|196->155|196->155|197->156|198->157|198->157|198->157|201->160|202->161|203->162|204->163|205->164|206->165|207->166|208->167|210->169|210->169|210->169|211->170|211->170|211->170|211->170|211->170|211->170|211->170|212->171|212->171|212->171|212->171|213->172|214->173|215->174|216->175|217->176|218->177|218->177|218->177|219->178|219->178|219->178|219->178|219->178|220->179|221->180|223->182|224->183|226->185|227->186|228->187|229->188|230->189|232->191|234->193|234->193|234->193|235->194|235->194|235->194|235->194|235->194|235->194|235->194|235->194|236->195|237->196|238->197|239->198|240->199|241->200|241->200|241->200|242->201|243->202|243->202|243->202|244->203|244->203|244->203|244->203|244->203|245->204|246->205|248->207|249->208|251->210|252->211|253->212|254->213|255->214|256->215|257->216|257->216|257->216|258->217|258->217|258->217|258->217|258->217|258->217|258->217|258->217|259->218|260->219|261->220|262->221|263->222|264->223|264->223|264->223|265->224|266->225|266->225|266->225|267->226|267->226|267->226|267->226|267->226|268->227|269->228|271->230|272->231|273->232|274->233|275->234|276->235|277->236|278->237|279->238|280->239|281->240|282->241|283->242|287->246|287->246|287->246|288->247|291->250|291->250|291->250|292->251|295->254|296->255|297->256|298->257|299->258|299->258|299->258|300->259|303->262|305->264|305->264|305->264|306->265|307->266|307->266|307->266|309->268|309->268|309->268|310->269|313->272|314->273|315->274|315->274|315->274|319->278|320->279|326->285|326->285|326->285|327->286|331->290|331->290|331->290|332->291|332->291|332->291|332->291|334->293|334->293|334->293|336->295|337->296|337->296|337->296|338->297|341->300|342->301|342->301|342->301|343->302|343->302|343->302|343->302|344->303|344->303|344->303|344->303|344->303|344->303|344->303|345->304|346->305|346->305|346->305|347->306|350->309|351->310|351->310|351->310|352->311|356->315|356->315|356->315|357->316|357->316|357->316|357->316|359->318|359->318|359->318|361->320|362->321|365->324|365->324|365->324|366->325|367->326|368->327|373->332|373->332|373->332|374->333|375->334|375->334|375->334|376->335|376->335|376->335|377->336|377->336|377->336|378->337|378->337|378->337|378->337|378->337|378->337|379->338|379->338|379->338|380->339|380->339|380->339|380->339|380->339|380->339|381->340|382->341|383->342|384->343|385->344|386->345|399->358|399->358|399->358|400->359|401->360|401->360|401->360|402->361|402->361|402->361|403->362|403->362|403->362|404->363|404->363|404->363|404->363|404->363|404->363|405->364|405->364|405->364|406->365|406->365|406->365|406->365|406->365|406->365|407->366|408->367|409->368|410->369|411->370|412->371|425->384|425->384|425->384|426->385|427->386|427->386|427->386|428->387|428->387|428->387|429->388|429->388|429->388|430->389|430->389|430->389|430->389|430->389|431->390|431->390|431->390|432->391|432->391|432->391|432->391|432->391|433->392|434->393|435->394|436->395|437->396|438->397|448->407
                  -- GENERATED --
              */
          