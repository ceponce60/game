
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[models.User],Form[models.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[models.User], form: Form[models.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(Seq[Any](/*3.2*/layout/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

    <h2>New User</h2>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Users.create)/*7.47*/{_display_(Seq[Any](format.raw/*7.48*/("""

        """),_display_(Seq[Any](/*9.10*/helper/*9.16*/.inputText(form("name"), '_label -> "Name"))),format.raw/*9.59*/("""
        """),_display_(Seq[Any](/*10.10*/helper/*10.16*/.inputText(form("emailAddress"), '_label -> "Email Address"))),format.raw/*10.76*/("""

        <input type="submit" value="New User" />
    """)))})),format.raw/*13.6*/("""

    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Email Address</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            """),_display_(Seq[Any](/*25.14*/for(user <- users) yield /*25.32*/ {_display_(Seq[Any](format.raw/*25.34*/("""
                <tr>
                    <td>"""),_display_(Seq[Any](/*27.26*/user/*27.30*/.name)),format.raw/*27.35*/("""</td>
                    <td>"""),_display_(Seq[Any](/*28.26*/user/*28.30*/.emailAddress)),format.raw/*28.43*/("""</td>
                    <td>
                        <a href='"""),_display_(Seq[Any](/*30.35*/routes/*30.41*/.Users.edit(user.id))),format.raw/*30.61*/("""'>Edit</a>
                    </td>
                    <td>
                        """),_display_(Seq[Any](/*33.26*/helper/*33.32*/.form(action = routes.Users.delete(user.id))/*33.76*/{_display_(Seq[Any](format.raw/*33.77*/("""
                            <input type="submit" value="Delete!" />
                        """)))})),format.raw/*35.26*/("""
                    </td>
                </tr>
            """)))})),format.raw/*38.14*/("""
        </tbody>
    </table>
""")))})),format.raw/*41.2*/("""
"""))}
    }
    
    def render(users:List[models.User],form:Form[models.User]): play.api.templates.HtmlFormat.Appendable = apply(users,form)
    
    def f:((List[models.User],Form[models.User]) => play.api.templates.HtmlFormat.Appendable) = (users,form) => apply(users,form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 17 16:03:27 PST 2017
                    SOURCE: /home/juan/Scala/game/app/views/index.scala.html
                    HASH: c6104547003e50173c441ee29ed7f445113e0a69
                    MATRIX: 585->1|730->52|767->55|780->61|819->63|883->93|897->99|940->134|978->135|1024->146|1038->152|1102->195|1148->205|1163->211|1245->271|1332->327|1600->559|1634->577|1674->579|1757->626|1770->630|1797->635|1864->666|1877->670|1912->683|2013->748|2028->754|2070->774|2193->861|2208->867|2261->911|2300->912|2426->1006|2520->1068|2583->1100
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|34->13|46->25|46->25|46->25|48->27|48->27|48->27|49->28|49->28|49->28|51->30|51->30|51->30|54->33|54->33|54->33|54->33|56->35|59->38|62->41
                    -- GENERATED --
                */
            