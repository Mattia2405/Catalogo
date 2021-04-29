package Veicolo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class Main
{
   //funzione che legga un file csv qualsiasi
   static ArrayList<String> Leggi(String file){
    String riga;
    ArrayList<String> lettura = new ArrayList<String>();
    try(BufferedReader read = new BufferedReader(new FileReader(file))){
      while ((riga = read.readLine()) != null){
        lettura.add(riga);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lettura;
}
public static void main(String[] args)
{
  //creo due arraylist che leggeranno i due file csv
  //arraylist che serve me immagazzinare marca e modelli agganciati 
  ArrayList<Produttore> customers = new ArrayList<Produttore>();
  ArrayList<String> modello = Main.Leggi("modelli.csv");
  ArrayList<String> produttore = Main.Leggi("produttori.csv");
  ArrayList<Modello> model = new ArrayList<Modello>();
  //creazione ciclo per poi creare un array dentro e dividere
  for(int index = 0; index < modello.size(); index++)
  {
    String contenutoModello = modello.get(index);
    String [] Separa = contenutoModello.split(","); //divido il file in due colonne separate da una virgola
    model.add(new Modello(Separa[0], Separa[1])); /*creo un arraylist di tipo modello e gli aggiungo i parametri costruttore della classe modello 
                                                    che leggerà l'array separa da contenuto modello */
  }
  for(int index = 0; index<produttore.size(); index++)
  {
    String contenutoProduttore = produttore.get(index);
    ArrayList<Modello> ModelloPerMarca = new ArrayList<Modello>(); //creazione arraylist che ci aiuta a filtrare una data marca con dati modelli
    for(int j = 0; j < model.size();j++)
    {
      Modello modelloPreso = model.get(j);  //modello singolo preso (contiene due elementi per riga: marca, modello)
      if(modelloPreso.marca.equalsIgnoreCase(contenutoProduttore)) //se il modello preso ha la marca uguale alla marca produttore letta allora...
      {
        ModelloPerMarca.add(modelloPreso); //all'interno dell'arraylist modellopermarca (vuoto) inserisci quegli elementi
      }
    } 
    Produttore prod = new Produttore(contenutoProduttore, ModelloPerMarca); //creata variabile di tipo produttore che avrà due parametri: la marca, e il modello.
    customers.add(prod);
  }
  for(int i = 0; i < customers.size(); i++)
  {
    Produttore marcasingola = customers.get(i);
    System.out.println(marcasingola + ":"); 
    for(int j = 0; j < marcasingola.modello.size(); j++)
    {
      System.out.println(marcasingola.modello.get(j));
    }
    System.out.println("------");
  }
}
}