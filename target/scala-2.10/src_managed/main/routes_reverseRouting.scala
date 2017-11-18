// @SOURCE:/home/juan/Scala/game/conf/routes
// @HASH:92022df276ede7df54bc7c124b41384e4697fed1
// @DATE:Fri Nov 17 15:57:07 PST 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseUsers {
    

// @LINE:11
def delete(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:8
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user")
}
                                                

// @LINE:9
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:10
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseStates {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                                                

// @LINE:7
def attack(id:Long, enemy_id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "battle/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("enemy_id", enemy_id))
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseUsers {
    

// @LINE:11
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:8
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
      }
   """
)
                        

// @LINE:9
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:10
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseStates {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.States.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
   """
)
                        

// @LINE:7
def attack : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.States.attack",
   """
      function(id,enemy_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "battle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("enemy_id", enemy_id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:5
class ReverseUsers {
    

// @LINE:11
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """user/$id<[^/]+>/delete""")
)
                      

// @LINE:8
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "POST", """""", _prefix + """user""")
)
                      

// @LINE:9
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(id), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """user/$id<[^/]+>""")
)
                      

// @LINE:10
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]), "POST", """""", _prefix + """user/$id<[^/]+>""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.index(), HandlerDef(this, "controllers.Users", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseStates {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.States.index(), HandlerDef(this, "controllers.States", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:7
def attack(id:Long, enemy_id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.States.attack(id, enemy_id), HandlerDef(this, "controllers.States", "attack", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """battle/$id<[^/]+>/$enemy_id<[^/]+>""")
)
                      
    
}
                          
}
        
    