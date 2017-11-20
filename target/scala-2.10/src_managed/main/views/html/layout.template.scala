
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
object layout extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!doctype html>
<html>
    <head>
        <title>_Game_</title>
    </head>
    <body>
        <h1>Game</h1>
        """),_display_(Seq[Any](/*10.10*/content)),format.raw/*10.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 17 18:40:57 PST 2017
                    SOURCE: /home/juan/Scala/game/app/views/layout.scala.html
                    HASH: f1bed3b5fdfc184d0c4172aeee98b5d0eff8911d
                    MATRIX: 555->1|664->16|820->136|849->143
                    LINES: 19->1|22->1|31->10|31->10
                    -- GENERATED --
                */
            