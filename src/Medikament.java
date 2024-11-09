import java.time.LocalDateTime;
import java.util.Stack;

public class Medikament {
    String name;
    double dosierung;
    LocalDateTime zeitpunkt;

    public Medikament(String name, double dosierung, LocalDateTime zeitpunkt) {
        this.name = name;
        this.dosierung = dosierung;
        this.zeitpunkt = zeitpunkt;
    }
}

class MedikamentStack{
    Stack<Medikament> MedikamentenStack = new Stack<>();

    public void medikamentHinzufügen(Medikament medikament){
        MedikamentenStack.push(medikament);
    }


}
