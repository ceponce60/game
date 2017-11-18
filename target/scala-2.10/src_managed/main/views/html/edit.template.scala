
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, user: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

"""),_display_(Seq[Any](/*3.2*/layout/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

    <h2>Update User</h2>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Users.update(id))/*7.51*/{_display_(Seq[Any](format.raw/*7.52*/("""

        """),_display_(Seq[Any](/*9.10*/helper/*9.16*/.inputText(user("name"), '_label -> "Name"))),format.raw/*9.59*/("""
        """),_display_(Seq[Any](/*10.10*/helper/*10.16*/.inputText(user("emailAddress"), '_label -> "Email Address"))),format.raw/*10.76*/("""

        <input type="submit" value="Update User" />
    """)))})),format.raw/*13.6*/("""
""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(id:Long,user:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(id,user)
    
    def f:((Long,Form[User]) => play.api.templates.HtmlFormat.Appendable) = (id,user) => apply(id,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 12 21:22:55 PST 2017
                    SOURCE: /home/juan/Scala/game/app/views/edit.scala.html
                    HASH: c62edad9df4a991b511cb0d51d438b7db83559fa
                    MATRIX: 564->1|686->29|723->32|736->38|775->40|842->73|856->79|903->118|941->119|987->130|1001->136|1065->179|1111->189|1126->195|1208->255|1298->314|1331->316
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|34->13|35->14
                    -- GENERATED --
                */
            