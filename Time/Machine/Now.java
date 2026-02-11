package Machine;
import java.time.Instant;

public class Now {
    private final Instant now; //MUUTUMATU MUUTUSTES
    //siin nimetame sinise now, variable

    public Now() {
        this.now = Instant.now(); //HETKE LOOMINE
    } //meetod

    public Instant getNow() {
        return now;
    }// meetod 

    public void displayNow() {
        System.out.println("Instant now: " + now);
    }

    public static void main(String[] args) {
       Now now = new Now();
       now.displayNow(); 
    }
}

/* l6ime Hetke v6i Momendi 
(krt kunagi ei otsustanudki), 
praeguse hetke?

i ran and got
Instant now: 2026-02-11T13:13:45.133952Z

Instant Now m6istmine eeldab mult gregooriuse kalendri m6istmist.. millegip2rast lootsin siin sekundeid n2ha?
 */
