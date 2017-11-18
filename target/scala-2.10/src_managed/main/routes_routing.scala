// @SOURCE:/home/juan/Scala/game/conf/routes
// @HASH:92022df276ede7df54bc7c124b41384e4697fed1
// @DATE:Fri Nov 17 15:57:07 PST 2017


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_Users_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_States_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
        

// @LINE:7
private[this] lazy val controllers_States_attack2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("battle/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("enemy_id", """[^/]+""",true))))
        

// @LINE:8
private[this] lazy val controllers_Users_create3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user"))))
        

// @LINE:9
private[this] lazy val controllers_Users_edit4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_Users_update5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_Users_delete6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("user/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Users.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.States.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """battle/$id<[^/]+>/$enemy_id<[^/]+>""","""controllers.States.attack(id:Long, enemy_id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user""","""controllers.Users.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>""","""controllers.Users.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>""","""controllers.Users.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>/delete""","""controllers.Users.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_Users_index0(params) => {
   call { 
        invokeHandler(controllers.Users.index, HandlerDef(this, "controllers.Users", "index", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_States_index1(params) => {
   call { 
        invokeHandler(controllers.States.index, HandlerDef(this, "controllers.States", "index", Nil,"GET", """""", Routes.prefix + """index"""))
   }
}
        

// @LINE:7
case controllers_States_attack2(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("enemy_id", None)) { (id, enemy_id) =>
        invokeHandler(controllers.States.attack(id, enemy_id), HandlerDef(this, "controllers.States", "attack", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """battle/$id<[^/]+>/$enemy_id<[^/]+>"""))
   }
}
        

// @LINE:8
case controllers_Users_create3(params) => {
   call { 
        invokeHandler(controllers.Users.create, HandlerDef(this, "controllers.Users", "create", Nil,"POST", """""", Routes.prefix + """user"""))
   }
}
        

// @LINE:9
case controllers_Users_edit4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """user/$id<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_Users_update5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """user/$id<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Users_delete6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """user/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:14
case controllers_Assets_at7(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     