
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
                <th>Name</th>
                <th>Email Address</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            """),_display_(Seq[Any](/*16.14*/for(state <- states) yield /*16.34*/ {_display_(Seq[Any](format.raw/*16.36*/("""
                <tr>
                    <td>"""),_display_(Seq[Any](/*18.26*/state/*18.31*/.name)),format.raw/*18.36*/("""</td>
                    <td>
                        <a href='"""),_display_(Seq[Any](/*20.35*/routes/*20.41*/.States.attack(1, state.enemy_id))),format.raw/*20.74*/("""'>Edit</a>
                    </td>
                    <td></td>
                    <td></td>
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
                    DATE: Fri Nov 17 16:55:56 PST 2017
                    SOURCE: /home/juan/Scala/game/app/views/battle.scala.html
                    HASH: b8f771a2498f2d883d9f944ebba4a205a3c4b1ab
                    MATRIX: 569->1|691->29|728->32|741->38|780->40|1068->292|1104->312|1144->314|1227->361|1241->366|1268->371|1369->436|1384->442|1439->475|1633->637|1696->669
                    LINES: 19->1|22->1|24->3|24->3|24->3|37->16|37->16|37->16|39->18|39->18|39->18|41->20|41->20|41->20|47->26|50->29
                    -- GENERATED --
                */
            