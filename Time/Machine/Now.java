package Machine;

import java.time.Instant;

public class Now {
    private final Instant now; //MUUTUMATU MUUTUSTES

    public Now() {
        this.now = Instant.now(); //HETKE LOOMINE as java kysib OSilt mis kell n
    }

    public Instant getNow() {
        return now; //HETKE ARVUTAMINE
    }

    public void displayNow() {
        System.out.println("now: " + now);//HETK INFONA EKRAANIL
    }

    public static void main(String[] args) {
       Now now = new Now(); // klass variable = function run the method to create the moment
       now.displayNow(); // variable.displayresults
    }
}

/* l6ime Hetke v6i Momendi 
(krt kunagi ei otsustanudki), 
praeguse hetke?

i ran and got
Instant now: 

2026-02-11T13:13:45.133952Z
2026-02-12T08:23:21.605191Z

Instant Now m6istmine eeldab mult gregooriuse kalendri m6istmist.. millegip2rast lootsin siin sekundeid n2ha?

probleemne on ka MASIN v ENGINE v MOOTOR. juba m6tlesin ka kutsuda AJUx. time brain. kolkaplika time brain. pls, yes. LOL
 */
