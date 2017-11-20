
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
object battle extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.State],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(states: List[models.State]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""

"""),_display_(Seq[Any](/*3.2*/layout/*3.8*/ {_display_(Seq[Any](format.raw/*3.10*/("""

    <h2>Battle</h2>
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>Attack</th>
                <th>health</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(Seq[Any](/*16.14*/for(state <- states) yield /*16.34*/ {_display_(Seq[Any](format.raw/*16.36*/("""
                <tr>
                    <td>"""),_display_(Seq[Any](/*18.26*/state/*18.31*/.id)),format.raw/*18.34*/("""</td>
                    <td>"""),_display_(Seq[Any](/*19.26*/state/*19.31*/.name)),format.raw/*19.36*/("""</td>
                    <td>
                        <a href='"""),_display_(Seq[Any](/*21.35*/routes/*21.41*/.States.attack(state.enemy_id, state.id))),format.raw/*21.81*/("""'>Attack</a>
                    </td>
                    <td>"""),_display_(Seq[Any](/*23.26*/state/*23.31*/.health)),format.raw/*23.38*/("""</td>
                    <td></td>
                </tr>
            """)))})),format.raw/*26.14*/("""
        </tbody>
    </table>
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(states:List[models.State]): play.api.templates.HtmlFormat.Appendable = apply(states)
    
    def f:((List[models.State]) => play.api.templates.HtmlFormat.Appendable) = (states) => apply(states)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 17 18:40:19 PST 2017
                    SOURCE: /home/juan/Scala/game/app/views/battle.scala.html
                    HASH: 118966d73a01874ef6ea927e4c306ac9c895f8ed
                    MATRIX: 569->1|691->29|728->32|741->38|780->40|1069->293|1105->313|1145->315|1228->362|1242->367|1267->370|1334->401|1348->406|1375->411|1476->476|1491->482|1553->522|1653->586|1667->591|1696->598|1799->669|1862->701
                    LINES: 19->1|22->1|24->3|24->3|24->3|37->16|37->16|37->16|39->18|39->18|39->18|40->19|40->19|40->19|42->21|42->21|42->21|44->23|44->23|44->23|47->26|50->29
                    -- GENERATED --
                */
            