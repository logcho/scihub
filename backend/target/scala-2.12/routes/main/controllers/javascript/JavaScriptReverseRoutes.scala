// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganchoi/Desktop/scihub/backend/conf/routes
// @DATE:Sat May 02 14:40:59 CDT 2026

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:40
package controllers.javascript {

  // @LINE:409
  class ReverseReviewerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:410
    def reviewerDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerDetail",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:412
    def reviewerList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerList",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerList" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:414
    def searchReviewerByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.searchReviewerByCondition",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/search/conditions" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:409
    def addReviewer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.addReviewer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/addReviewer"})
        }
      """
    )
  
    // @LINE:411
    def updateReviewer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.updateReviewer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/updateReviewer"})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:380
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:383
    def getJobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getJobList",
      """
        function(pageNum0,pageLimit1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/jobs" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (pageLimit1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1)), (sortCriteria2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria2))])})
        }
      """
    )
  
    // @LINE:382
    def updateUserStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateUserStatus",
      """
        function(userId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + "/status"})
        }
      """
    )
  
    // @LINE:380
    def getUserList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getUserList",
      """
        function(pageNum0,pageLimit1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (pageLimit1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1)), (sortCriteria2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria2))])})
        }
      """
    )
  
    // @LINE:381
    def getUserDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getUserDetail",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:384
    def getJobDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getJobDetail",
      """
        function(jobType0,jobId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/jobs/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("jobType", jobType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId1))})
        }
      """
    )
  
    // @LINE:385
    def getOrganizationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getOrganizationList",
      """
        function(pageNum0,pageLimit1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/organizations" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (pageLimit1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1)), (sortCriteria2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria2))])})
        }
      """
    )
  
    // @LINE:386
    def getTechnologyList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getTechnologyList",
      """
        function(pageNum0,pageLimit1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/technologies" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (pageLimit1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1)), (sortCriteria2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria2))])})
        }
      """
    )
  
  }

  // @LINE:72
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def getTeamMembersByProjectId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getTeamMembersByProjectId",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/teammember/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:75
    def deleteProjectPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteProjectPDF",
      """
        function(projectId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteProjectPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:72
    def addProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addProject",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/addProject"})
        }
      """
    )
  
    // @LINE:87
    def deleteProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteProject",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:90
    def checkProjectNameAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.checkProjectNameAvailability",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/isProjectNameExisted"})
        }
      """
    )
  
    // @LINE:94
    def getMyEnrolledProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getMyEnrolledProjects",
      """
        function(pageLimit0,pageNum1,sortCriteria2,userId3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/getMyEnrolledProjects" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2), (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("userId", userId3)])})
        }
      """
    )
  
    // @LINE:73
    def updateProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.updateProject",
      """
        function(projectId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/updateProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:89
    def checkProjectExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.checkProjectExist",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/checkProjectExist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:88
    def getProjectsByCreator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getProjectsByCreator",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/getProjectsByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:91
    def saveDescriptionImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.saveDescriptionImage",
      """
        function(projectId0,imageNumber1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/saveDescriptionImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("imageNumber", imageNumber1))})
        }
      """
    )
  
    // @LINE:99
    def getIdByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getIdByName",
      """
        function(name0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/getIdByName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
          }
        
        }
      """
    )
  
    // @LINE:79
    def getProjectById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getProjectById",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:83
    def setPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.setPDF",
      """
        function(projectId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/setPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:84
    def addTeamMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addTeamMember",
      """
        function(projectId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/addTeamMember/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:92
    def renameDescriptionImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.renameDescriptionImage",
      """
        function(projectId0,imageNumber1,currentImageNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/renameDescriptionImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("imageNumber", imageNumber1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("currentImageNumber", currentImageNumber2))})
        }
      """
    )
  
    // @LINE:80
    def getProjectCreator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getProjectCreator",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/getProjectCreator/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:97
    def updateProjectDes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.updateProjectDes",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/updatedes"})
        }
      """
    )
  
    // @LINE:86
    def deleteTeamMember: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteTeamMember",
      """
        function(memberId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteTeamMember/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("memberId", memberId0))})
        }
      """
    )
  
    // @LINE:85
    def setTeamMemberPhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.setTeamMemberPhoto",
      """
        function(memberId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/setTeamMemberPhoto/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("memberId", memberId0))})
        }
      """
    )
  
    // @LINE:76
    def projectList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:82
    def setImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.setImage",
      """
        function(projectId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/setImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:96
    def getAllProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getAllProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/allproject"})
        }
      """
    )
  
    // @LINE:81
    def searchProjectsByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.searchProjectsByCondition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/search/conditions"})
        }
      """
    )
  
    // @LINE:74
    def deleteProjectImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteProjectImage",
      """
        function(projectId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteProjectImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
  }

  // @LINE:213
  class ReverseTAJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:223
    def getTAJobById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.getTAJobById",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:229
    def getTAJobsByPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.getTAJobsByPublisher",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/getTAJobsByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:230
    def checkTAJobExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.checkTAJobExist",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/checkTAJobExist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:216
    def deleteTAJobPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.deleteTAJobPDF",
      """
        function(tajobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/deleteTAJobPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:219
    def tajobUpdateStatue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobUpdateStatue",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/updateStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:224
    def getTAJobPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.getTAJobPublisher",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/getTAJobPublisher/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:214
    def updateTAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.updateTAJob",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/updateTAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:232
    def getIdByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.getIdByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/getIdByName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:228
    def deleteTAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.deleteTAJob",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/deleteTAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:227
    def setPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.setPDF",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/setPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:217
    def tajobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:220
    def getTAJobApplicationById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.getTAJobApplicationById",
      """
        function(tajobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobApplicationId", tajobApplicationId0))})
        }
      """
    )
  
    // @LINE:231
    def checkTAJobNameAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.checkTAJobNameAvailability",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/isTAJobNameExisted"})
        }
      """
    )
  
    // @LINE:225
    def searchTAJobsByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.searchTAJobsByCondition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/search/conditions"})
        }
      """
    )
  
    // @LINE:213
    def addTAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.addTAJob",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/addTAJob"})
        }
      """
    )
  
    // @LINE:215
    def deleteTAJobImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.deleteTAJobImage",
      """
        function(tajobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/deleteTAJobImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:226
    def setImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.setImage",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/setImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:218
    def applyTAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.applyTAJob",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/applyTAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
  }

  // @LINE:345
  class ReverseTechnologyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:345
    def addTechnology: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.addTechnology",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/addTechnology"})
        }
      """
    )
  
    // @LINE:354
    def searchTechnologiesByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.searchTechnologiesByCondition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/search/conditions"})
        }
      """
    )
  
    // @LINE:447
    def setFiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.setFiles",
      """
        function(serviceId0,fileName1,fileType2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/setFiles/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("serviceId", serviceId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("fileName", fileName1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("fileType", fileType2)])})
        }
      """
    )
  
    // @LINE:448
    def getFileById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.getFileById",
      """
        function(serviceId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/fileDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("serviceId", serviceId0))})
        }
      """
    )
  
    // @LINE:349
    def technologyList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:352
    def getTechnologyById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.getTechnologyById",
      """
        function(technologyId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
    // @LINE:346
    def updateTechnology: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.updateTechnology",
      """
        function(technologyId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/updateTechnology/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
  }

  // @LINE:421
  class ReversePaperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:438
    def paperSearchList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperSearchList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/search"})
        }
      """
    )
  
    // @LINE:435
    def authorRelation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.authorRelation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/authorRelation"})
        }
      """
    )
  
    // @LINE:437
    def ldaTopicDistribution: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.ldaTopicDistribution",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/ldaTopicList"})
        }
      """
    )
  
    // @LINE:432
    def paperAuthorList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperAuthorList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperAuthorList"})
        }
      """
    )
  
    // @LINE:421
    def addPaper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.addPaper",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/addPaper"})
        }
      """
    )
  
    // @LINE:424
    def deletePaper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.deletePaper",
      """
        function(paperId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/deletePaper" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("paperId", paperId0)])})
        }
      """
    )
  
    // @LINE:426
    def getPaperById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.getPaperById",
      """
        function(paperId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paperId", paperId0))})
        }
      """
    )
  
    // @LINE:423
    def getAuthorByPaperId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.getAuthorByPaperId",
      """
        function(paperId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/author" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("paperId", paperId0)])})
        }
      """
    )
  
    // @LINE:428
    def deleteAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.deleteAuthor",
      """
        function(memberId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/deleteAuthor" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("memberId", memberId0)])})
        }
      """
    )
  
    // @LINE:433
    def storeDBLP: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.storeDBLP",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/loadPaper"})
        }
      """
    )
  
    // @LINE:436
    def storeDBLPSchema: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.storeDBLPSchema",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/loadSchema"})
        }
      """
    )
  
    // @LINE:427
    def addAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.addAuthor",
      """
        function(paperId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/addAuthor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paperId", paperId0))})
        }
      """
    )
  
    // @LINE:422
    def paperList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperList",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperList" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:434
    def loadLDA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.loadLDA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/lda"})
        }
      """
    )
  
  }

  // @LINE:395
  class ReverseAuthorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:402
    def userListAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userListAdmin",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userListAdmin" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:405
    def topAuthors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.topAuthors",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/topAuthors"})
        }
      """
    )
  
    // @LINE:395
    def addAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.addAuthor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/addAuthor"})
        }
      """
    )
  
    // @LINE:396
    def authorDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorDetail",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:400
    def userDetailAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userDetailAdmin",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userDetailAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:401
    def updateUserAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.updateUserAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/updateUserAdmin"})
        }
      """
    )
  
    // @LINE:398
    def authorList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorList",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorList" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:404
    def searchAuthorByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.searchAuthorByCondition",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/search" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:397
    def updateAuthor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.updateAuthor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/updateAuthor"})
        }
      """
    )
  
  }

  // @LINE:322
  class ReverseBugReportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:323
    def getBugReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.getBugReport",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getBugReport/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:326
    def updateBugReportSolved: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.updateBugReportSolved",
      """
        function(bugId0,fixerId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/updateBugReportSolved/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("bugId", bugId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("fixerId", fixerId1))})
        }
      """
    )
  
    // @LINE:322
    def addBugReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.addBugReport",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/addBugReport"})
        }
      """
    )
  
    // @LINE:329
    def getAllUnsolvedBugReports: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.getAllUnsolvedBugReports",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllUnsolvedBugReports/json"})
        }
      """
    )
  
    // @LINE:325
    def deleteBugReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.deleteBugReport",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/deleteBugReport/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:330
    def getAllSolvedBugReports: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.getAllSolvedBugReports",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllSolvedBugReports/json"})
        }
      """
    )
  
    // @LINE:327
    def getAllBugReports: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.getAllBugReports",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/getAllBugReports/json" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:324
    def updateBugReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.updateBugReport",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/updateBugReport/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:309
  class ReverseOrganizationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:309
    def organizationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationList"})
        }
      """
    )
  
    // @LINE:314
    def organizationUpdate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationUpdate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationUpdate"})
        }
      """
    )
  
    // @LINE:315
    def organizationListbyName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationListbyName",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationListByName" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:311
    def addUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.addUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/addUsers"})
        }
      """
    )
  
    // @LINE:313
    def organizationDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationDetail",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:310
    def organizationListPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationListPage",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationListPage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:312
    def registerOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.registerOrganization",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/register"})
        }
      """
    )
  
  }

  // @LINE:249
  class ReverseCourseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:251
    def approveTA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.approveTA",
      """
        function(courseId0,week1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/approve/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("courseId", courseId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("week", week1))})
        }
      """
    )
  
    // @LINE:250
    def getCourseDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.getCourseDetails",
      """
        function(courseId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses/details/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("courseId", courseId0))})
        }
      """
    )
  
    // @LINE:249
    def listCourses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.listCourses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
  }

  // @LINE:268
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:300
    def userActivation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userActivation",
      """
        function(hashcode0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hashcode", hashcode0))})
        }
      """
    )
  
    // @LINE:272
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updateUser"})
        }
      """
    )
  
    // @LINE:297
    def getActiveUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getActiveUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getActiveUsers/json"})
        }
      """
    )
  
    // @LINE:283
    def autoRegisterUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.autoRegisterUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/autoRegisterUser"})
        }
      """
    )
  
    // @LINE:287
    def getAllNormalUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllNormalUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getAllNormalUsers"})
        }
      """
    )
  
    // @LINE:298
    def sendPasswordEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.sendPasswordEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/sendPasswordEmail"})
        }
      """
    )
  
    // @LINE:268
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/addUser"})
        }
      """
    )
  
    // @LINE:270
    def getResearcherInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getResearcherInfo",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getResearcherInfo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:288
    def updateImageByUserId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateImageByUserId",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updateImageForUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:301
    def sendRegisterEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.sendRegisterEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/validate"})
        }
      """
    )
  
    // @LINE:295
    def userSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userSearch",
      """
        function(display_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/search/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("display_name", display_name0))})
        }
      """
    )
  
    // @LINE:273
    def userLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userLogin"})
        }
      """
    )
  
    // @LINE:269
    def userDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userDetail",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:305
    def getUserByEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserByEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getUserByEmail"})
        }
      """
    )
  
    // @LINE:279
    def inactivateUserPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.inactivateUserPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userDelete"})
        }
      """
    )
  
    // @LINE:302
    def resendRegisterEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.resendRegisterEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/validate/resend"})
        }
      """
    )
  
    // @LINE:289
    def deleteImageByUserId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteImageByUserId",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user/deleteImageForUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:275
    def userList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userList",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userList" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:271
    def getStudentInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getStudentInfo",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getStudentInfo/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:278
    def searchUserByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.searchUserByCondition",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/search/conditions" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:299
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updatePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updatePassword"})
        }
      """
    )
  
    // @LINE:286
    def getAllUsersInAllRoles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllUsersInAllRoles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/getAllUsers"})
        }
      """
    )
  
    // @LINE:304
    def updateLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateLevel",
      """
        function(uid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updateLevel/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("uid", uid0))})
        }
      """
    )
  
    // @LINE:276
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.validateEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/validateEmail"})
        }
      """
    )
  
    // @LINE:274
    def checkNewUserEmailAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.checkNewUserEmailAvailability",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/checkEmail"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:336
  class ReverseSuggestionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:338
    def suggestionList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionList",
      """
        function(pageLimit0,offset1,sortCriteria2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionList/json" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].javascriptUnbind + """)("offset", offset1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:337
    def getSuggestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.getSuggestion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/getSuggestion/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:340
    def deleteSuggestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.deleteSuggestion",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/deleteSuggestion/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:336
    def addSuggestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.addSuggestion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/addSuggestion"})
        }
      """
    )
  
    // @LINE:339
    def updateSuggestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.updateSuggestion",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/updateSuggestion/id/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:341
    def updateSuggestionSolved: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.updateSuggestionSolved",
      """
        function(suggestionId0,implementorId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/updateSuggestionSolve/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("implementorId", implementorId1))})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:180
  class ReverseRAJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:206
    def listProfessorsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.listProfessorsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/professors"})
        }
      """
    )
  
    // @LINE:197
    def deleteRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.deleteRAJob",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/deleteRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:205
    def sendRAJobAppliedEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.sendRAJobAppliedEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/sendAppliedEmail"})
        }
      """
    )
  
    // @LINE:192
    def getRAJobById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getRAJobById",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:180
    def addRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.addRAJob",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/addRAJob"})
        }
      """
    )
  
    // @LINE:189
    def getRAJobApplicationById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getRAJobApplicationById",
      """
        function(rajobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobApplicationId", rajobApplicationId0))})
        }
      """
    )
  
    // @LINE:183
    def deleteRAJobImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.deleteRAJobImage",
      """
        function(rajobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/deleteRAJobImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:194
    def searchRAJobsByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.searchRAJobsByCondition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/search/conditions"})
        }
      """
    )
  
    // @LINE:188
    def giveRAJobOffertoStudent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.giveRAJobOffertoStudent",
      """
        function(rajobApplicationId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/updateRAjobApplicationStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobApplicationId", rajobApplicationId0))})
        }
      """
    )
  
    // @LINE:199
    def getRAJobsByApplicant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getRAJobsByApplicant",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/getRAJobsByApplicant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:202
    def getIdByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getIdByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/getIdByName/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:203
    def sendOfferEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.sendOfferEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/offer"})
        }
      """
    )
  
    // @LINE:200
    def checkRAJobExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.checkRAJobExist",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/checkRAJobExist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:207
    def scheduleInterview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.scheduleInterview",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/interview/schedule"})
        }
      """
    )
  
    // @LINE:196
    def setPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.setPDF",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/setPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:198
    def getRAJobsByPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getRAJobsByPublisher",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/getRAJobsByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:187
    def rajobUpdateStatue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobUpdateStatue",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/updateStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:181
    def updateRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.updateRAJob",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/updateRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:201
    def checkRAJobNameAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.checkRAJobNameAvailability",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/isRAJobNameExisted"})
        }
      """
    )
  
    // @LINE:204
    def sendRAJobPostedEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.sendRAJobPostedEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/sendPostedEmail"})
        }
      """
    )
  
    // @LINE:185
    def rajobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:208
    def getScheduledInterviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getScheduledInterviews",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/interview/job/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:193
    def getRAJobPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.getRAJobPublisher",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/getRAJobPublisher/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:195
    def setImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.setImage",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/setImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:184
    def deleteRAJobPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.deleteRAJobPDF",
      """
        function(rajobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/deleteRAJobPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:182
    def closeRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.closeRAJob",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/closeRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:186
    def applyRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.applyRAJob",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/applyRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
  }

  // @LINE:104
  class ReverseChallengeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def getChallengeApplicationIdById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getChallengeApplicationIdById",
      """
        function(challengeApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationDetailId/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0))})
        }
      """
    )
  
    // @LINE:126
    def getChallengesByApplicant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getChallengesByApplicant",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/getChallengesByApplicant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:109
    def challengeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:112
    def applyChallenge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.applyChallenge",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/applyChallenge/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:113
    def getChallengeById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getChallengeById",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:125
    def closeChallenge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.closeChallenge",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/closeChallenge/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:110
    def challengeListAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeListAdmin",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeListAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:117
    def giveChallengeOffertoStudent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.giveChallengeOffertoStudent",
      """
        function(challengeApplicationId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/updateChallengeApplicationStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0))})
        }
      """
    )
  
    // @LINE:120
    def getApplicationsByChallengeId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getApplicationsByChallengeId",
      """
        function(challengeType0,challengeId1,pageLimit2,pageNum3,sortCriteria4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/getApplications/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("challengeType", challengeType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit2), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum3), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria4)])})
        }
      """
    )
  
    // @LINE:106
    def updateChallengeAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.updateChallengeAdmin",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/updateChallengeAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:114
    def getChallengesByPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getChallengesByPublisher",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/getChallengesByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:104
    def addChallenge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.addChallenge",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/addChallenge"})
        }
      """
    )
  
    // @LINE:115
    def getChallengeApplicationById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getChallengeApplicationById",
      """
        function(challengeApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0))})
        }
      """
    )
  
    // @LINE:122
    def getImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.getImage",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/getImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:123
    def setPdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.setPdf",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/setPdf/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:124
    def searchChallenges: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.searchChallenges",
      """
        function(pageLimit0,pageNum1,sortCriteria2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/search" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum1), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria2)])})
        }
      """
    )
  
    // @LINE:105
    def updateChallenge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.updateChallenge",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/updateChallenge/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:119
    def challengeUpdateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeUpdateStatus",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/updateStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:121
    def setImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.setImage",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/setImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
  }

  // @LINE:154
  class ReverseJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def jobUpdateStatue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobUpdateStatue",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/updateStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:169
    def getJobsByPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getJobsByPublisher",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/getJobsByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:159
    def applyJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.applyJob",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/applyJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:155
    def updateJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.updateJob",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/updateJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:156
    def deleteJobImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.deleteJobImage",
      """
        function(jobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "job/deleteJobImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:157
    def deleteJobPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.deleteJobPDF",
      """
        function(jobId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "job/deleteJobPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:154
    def addJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.addJob",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/addJob"})
        }
      """
    )
  
    // @LINE:171
    def checkJobExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.checkJobExist",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/checkJobExist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:168
    def deleteJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.deleteJob",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/deleteJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:163
    def getJobById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getJobById",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:167
    def setPDF: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.setPDF",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/setPDF/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:165
    def searchJobsByCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.searchJobsByCondition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/search/conditions"})
        }
      """
    )
  
    // @LINE:158
    def jobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
    // @LINE:161
    def getJobApplicationById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getJobApplicationById",
      """
        function(jobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobApplicationId", jobApplicationId0))})
        }
      """
    )
  
    // @LINE:170
    def getJobsByApplicant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getJobsByApplicant",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/getJobsByApplicant/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:164
    def getJobPublisher: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getJobPublisher",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/getJobPublisher/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:174
    def getApplicationsByJobId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.getApplicationsByJobId",
      """
        function(jobType0,jobId1,pageLimit2,pageNum3,sortCriteria4) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/getApplications/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("jobType", jobType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit2), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum3), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria4)])})
        }
      """
    )
  
    // @LINE:172
    def checkJobNameAvailability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.checkJobNameAvailability",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/isJobNameExisted"})
        }
      """
    )
  
    // @LINE:166
    def setImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.setImage",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/setImage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
  }

  // @LINE:259
  class ReverseCourseTAAssignmentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:260
    def getCourseTAAssignmentById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.getCourseTAAssignmentById",
      """
        function(Id0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/status/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("Id", Id0))})
          }
        
        }
      """
    )
  
    // @LINE:259
    def addAssignment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.addAssignment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/addAssignment"})
        }
      """
    )
  
    // @LINE:261
    def courseTAAssignmentList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.courseTAAssignmentList",
      """
        function(Id0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/assignmentList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("Id", Id0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
  }

  // @LINE:445
  class ReverseFileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:449
    def uploadRawFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.uploadRawFile",
      """
        function(tableName0,fileType1,recordId2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "file/upload/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableName", tableName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("fileType", fileType1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("recordId", recordId2))})
        }
      """
    )
  
    // @LINE:445
    def getFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.getFile",
      """
        function(tableName0,fileType1,tableRecorderId2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableName", tableName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("fileType", fileType1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableRecorderId", tableRecorderId2))})
        }
      """
    )
  
    // @LINE:446
    def checkFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.checkFile",
      """
        function(tableName0,fileType1,tableRecorderId2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/checkFile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableName", tableName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("fileType", fileType1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableRecorderId", tableRecorderId2))})
        }
      """
    )
  
  }

  // @LINE:431
  class ReverseGraphController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:431
    def printPrimeConnections: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GraphController.printPrimeConnections",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "graph/primePOC"})
        }
      """
    )
  
  }

  // @LINE:442
  class ReverseLogController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:442
    def operationLogging: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LogController.operationLogging",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "log/loggingOperation"})
        }
      """
    )
  
  }

  // @LINE:239
  class ReverseTACandidateController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:242
    def getAssignmentsByUserId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.getAssignmentsByUserId",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tacandidate/assignments/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:239
    def addTACandidate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.addTACandidate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tacandidate/addTACandidate"})
        }
      """
    )
  
    // @LINE:241
    def getTACandidateById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.getTACandidateById",
      """
        function(Id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tacandidate/candidateDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
    // @LINE:240
    def tacandidateList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.tacandidateList",
      """
        function(userId0,pageLimit1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tacandidate/tacandidateList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageLimit", pageLimit1), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (""" + implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].javascriptUnbind + """)("sortCriteria", sortCriteria3)])})
        }
      """
    )
  
  }


}
