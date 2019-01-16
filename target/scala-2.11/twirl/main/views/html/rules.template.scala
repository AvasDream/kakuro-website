
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rules_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class rules extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User)(implicit messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main(Messages("kakuro.rules"), Some(user))/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
  """),format.raw/*4.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.48*/routes/*4.54*/.Assets.at("stylesheets/main.css")),format.raw/*4.88*/("""">
      <div id="rule">
          <h1>Hier finden Sie die Regeln das Kakuro Spiel</h1>
          <br>
          <img src="/assets/images/rules/1362.gif" width="250" height="250">
          <img src="/assets/images/rules/1363.gif" width="250" height="250">
          <br>
          <h2 ><b>Kakuro Regeln</b></h2>
          <p>Kakuros sind leicht zu lernende, sprachunabhängige Logikrätsel, die einen hohen Suchtfaktor haben
              und in die Fußstapfen der weltweit erfolgreichen Sudokus treten. Nur durch reine Logik und einfache
              +/- Rechnungen führen die Zahlen-Kreuzworträtsel Sie in eine faszinierende Welt von Zahlenkombinationen,
              die Sie niemals für möglich gehalten hätten.
              Kakuros können am besten als Zahlen-Kreuzworträtsel bezeichnet werden, die in unzähligen Variationen und
              in fast allen Größen erhältlich sind. Dabei gibt es verschiedene Schwierigkeitsstufen, von sehr leicht
              bis extrem schwierig, für die man fünf Minuten bis zu mehrere Stunden brauchen kann. Nur ein kleiner
              Fehler und Sie stecken auf dem Weg zur Lösung fest ...</p>
              <br>
              <b>Hier zeigen wir Ihnen Schritt für Schritt wie man ein Kakuro Spiel lösen kann.</b>
          <br>
          <h2 class="schritt"><b>Schritt1</b></h2>
          <p>Bei den Kakuro-Rätseln dreht sich alles um bestimmte Zahlenkombinationen. Betrachten wir den Dreierblock
              mit der 22 in Reihe 1. Die einzig möglichen Kombinationen sind 5+8+9 und 6+7+9. Wie auch immer muss die
              Zahl in a1 kleiner sein als 6 wegen der vorgegebenen 6 in Spalte a. 5 ist also die einzig mögliche Zahl
              für das Feld a1. Jetzt kann der senkrechte Block mühelos fertiggestellt werden, da die fehlende Zahl für
              a2 1 sein muss.</p>
          <br>
          <img src="/assets/images/rules/1365_schritt1.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt2</b></h2>
          <p>Von Schritt 1 wissen wir, dass die Felder b1 und c1 8 und 9 enthalten müssen, wir wissen allerdings noch
              nicht, in welcher Reihenfolge. Schauen wir uns die 11 in Spalte c genauer an. Wenn die 9 in Feld c1
              platziert wird, muss in c2 und in c3 eine 1 stehen, was nicht erlaubt ist. Das bedeutet, dass die 8 in
              c1 gehört und die 9 in b1.</p>
          <br>
          <img src="/assets/images/rules/1366_schritt2.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt3</b></h2>
          <p>Jetzt sehen wir in Spalte c zwei leere Felder, die zusammen 3 ergeben müssen. Die einzig mögliche
              Kombination ist 2+1, aber wieder wissen wir nicht in welcher Reihenfolge. Da Reihe 2 schon eine 1
              enthält, kann in c2 nur die 2 platziert werden, womit jetzt auch Spalte c und Reihe 2 gelöst wären.</p>
          <br>
          <img src="/assets/images/rules/1367_schritt3.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt4</b></h2>
          <p>Betrachten wir jetzt den Fünferblock in Spalte f mit der 16 darüber. Das ist ein magischer Block,
              weil die einzige Kombination, die 16 ergibt 1+2+3+4+5+6 ist. Wir haben jetzt alle Zahlen für diesen
              Block, allerdings fehlt uns noch die Reihenfolge. Untersuchen wir also den Zweierblock in Reihe 3 mit
              der 15. Hier sind nur zwei Kombinationen möglich: 6+9 und 7+8. Da das Feld f3 der Überschneidungspunkt
              ist, muss es die 6 enthalten, weil das die einzige gemeinsame Zahl ist. Also muss in g3 die 9 stehen. </p>
          <br>
          <img src="/assets/images/rules/1368_schritt4.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt5</b></h2>
          <p>Der Zweierblock in Reihe 1 mit der 13 als Zahlvorgabe lässt als Zahlenkombinationen 4+9, 5+8 und 6+7
              zu. Dieser kreuzt den Fünferblock von Spalte f, in der noch 1, 2, 3 und 4 fehlen. Also ist die einzig
              mögliche Zahl für f1 die 4. Jetzt kann auch der Zweierblock in Reihe 1 fertiggestellt werden, indem
              die 9 in e1 platziert wird. Damit löst sich auch der Zweierblock in Spalte e, da jetzt klar ist, dass
              in e1 eine 3 gehört.</p>
          <br>
          <img src="/assets/images/rules/1369_schritt5.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt6</b></h2>
          <p>Die 8 in Reihe 2 hat jetzt noch zwei freie Felder, deren Summe 5 ergeben muss. Es gibt zwei mögliche
              Kombinationen: 1+4 und 2+3, wobei 2+3 nicht erlaubt ist, da der Block schon eine 3 enthält. Außerdem
              kann die 4 nicht in Spalte f stehen, denn dort gibt es bereits eine 4.
              <br>
              <br>Das heißt, dass die 1 in f2 und die 4 in g2 gehört.</br></p>
          <br>
          <img src="/assets/images/rules/1370_schritt6.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt7</b></h2>
          <p>Im Fünferblock in Spalte f fehlen jetzt nur noch zwei Zahlen, und zwar 2 und 3. Schauen wir uns den
              Viererblock in Reihe 5 an. Wenn f5 eine 2 enthält, dann müssen die restlichen drei Felder zusammen 25
              ergeben. Das ist aber nicht möglich, da 7+8+9=24. Aus diesem Grund kann also in f5 nur die 3 und in
              f4 die 2 stehen.</p>
          <br>
          <img src="/assets/images/rules/1371_schritt7.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt8</b></h2>
          <p>Wir stoßen nun auf eine besondere Situation, die auf der rechten Seite des Rätsels entstanden ist. Wenn
              wir eine senkrechte Summe der Spalten d, e, f und g erstellen, erhalten wir 22+12+13+16+21=84. Wenn wir
              in derselben Ecke eine waagerechte Summe ausrechnen, bekommen wir ohne Feld d3 13+8+15+12+27=75. d3 ist
              also für die Differenz verantwortlich, also 84-75=9. Um den Block in Reihe 3 zu vervollständigen erhält
              b3 eine 3.</p>
          <br>
          <img src="/assets/images/rules/1372_schritt8.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt9</b></h2>
          <p>Gehen wir zurück zu dem Fünferblock mit der 27 in Reihe 5, in dem es noch drei leere Felder gibt, die
              zusammen 24 ergeben müssen. Diese drei Felder bilden nun ihren eigenen magischen Block, denn die einzig
              mögliche Kombination ist 7+8+9, in welcher Reihenfolge auch immer. Die 9 kann nicht in Feld d5 oder g5
              stehen, denn beide Spalten enthalten bereits eine 9. Also kann die 9 nur in e5 platziert werden. Jetzt
              können wir auch die 4 in e4 eintragen.</p>
          <br>
          <img src="/assets/images/rules/1373_schritt9.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt10</b></h2>
          <p>Der Viererblock in Reihe 4 mit der vorgegebenen 12 enthält noch zwei freie Felder, die zusammen 6 ergeben
              müssen. Die möglichen Kombinationen sind 2+4 und 1+5, aber offensichtlich passt nur 1+5. Jetzt müssen wir
              nur noch entscheiden, welche Zahl in welches Feld gehört. Wenn wir versuchen, die 1 in d4 zu platzieren,
              sehen wir sofort, dass d5 höher als 9 sein muss. Deshalb ist klar, dass die 5 in d4 gehört und die 1 in
              g4. Nun können wir auch die Spalten d und g vervollständigen: mit der 8 für d6 und der 7 für g5.</p>
          <br>
          <img src="/assets/images/rules/1374_schritt10.gif" width="250" height="250">
          <br>
          <h2 class="schritt"><b>Schritt11</b></h2>
          <p>Betrachten wir abschließend den Fünferblock in Spalte b. Dort gibt es noch zwei freie Felder, die zusam
              men 14 ergeben müssen, also sind die Kombinationen 5+9 und 6+8 möglich. Die 9 ist in Spalte b bereits
              enthalten, also bleibt nur 6+8. Wenn wir die 6 in b5 platzieren, müsste a5 ebenfalls eine 6 bekommen,
              also bleibt 8 als einziger Kandidat für b5 übrig. Jetzt ist es kein Problem mehr, die restlichen Felder
              b4, a4 und a5 auszufüllen.</p>
          <br>
          <img src="/assets/images/rules/1375_schritt11.gif" width="250" height="250">
          <br>
          <h3>So nun du weißt unsere Regeln. Genieß es!!!</h3>
          <a href="#rule"> <aside><h4>Zurück zum Anfang</h4></aside> </a>
          <a href="/"> <aside><h4>Zurück zum Spiel</h4></aside> </a>
      </div>
""")))}),format.raw/*122.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(user)(messages,webJarAssets)

  def f:((models.User) => (Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messages,webJarAssets) => apply(user)(messages,webJarAssets)

  def ref: this.type = this

}


}

/**/
object rules extends rules_Scope0.rules
              /*
                  -- GENERATED --
                  DATE: Wed Jan 16 17:45:11 CET 2019
                  SOURCE: C:/Users/Tyrell Wellick/git/kakuro-website/app/views/rules.scala.html
                  HASH: f590d72471744fc75984302edf57aa29d345c834
                  MATRIX: 554->1|725->77|755->82|805->124|844->126|874->130|945->175|959->181|1013->215|9734->8905
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4|28->4|146->122
                  -- GENERATED --
              */
          