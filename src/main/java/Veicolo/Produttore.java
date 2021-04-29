package Veicolo;
import java.util.ArrayList;

public class Produttore{
    String nomeMarca;
    ArrayList<Modello> modello = new ArrayList<Modello>();
    public Produttore(String nomeMarca, ArrayList<Modello> modello){
        this.nomeMarca = nomeMarca;
        this.modello = modello;
    }
    @Override
    public String toString(){
     return this.nomeMarca;
    }
}