package Veicolo;
public class Modello
{
    String marca;
    String nomeModello;
    public Modello(String marca, String nomeModello){
        this.marca = marca;
        this.nomeModello = nomeModello;
    }
    @Override
    public String toString(){
        return this.marca + "," + this.nomeModello;
    }
}
