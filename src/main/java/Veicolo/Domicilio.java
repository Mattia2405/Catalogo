package Veicolo;

import java.util.ArrayList;
import java.util.Scanner;

public class Domicilio 
{
    ArrayList<String> way = new ArrayList<String>();  
    String dom;
    String city;
    int via;
    String civ;
    public void domicilio(String dom)   //procedura domicilio
    {
        this.dom = dom;            //inserimento parametro domicilio
    }
    public void pulisci() 
    {
        way.clear();    //pulizia arraylist way
    }
    public String getDomicilio()
    {
        Scanner in = new Scanner (System.in);
        Scanner sc = new Scanner(System.in);
        //aggiunta elementi per la specifica del domicilio
        way.add("Via");     
        way.add("Piazza");
        way.add("Corso");
        do
        {
            do
            {
                System.out.println("Indirizzo di Spedizione");
                System.out.println(way); //stampo a schermo e chiedo all'utente sei li suo indirizzo di domicilio inizia con via, piazza o corso
                System.out.println("\n Digita un numero da 0 a 2");
                via = sc.nextInt(); //utente digita il numero corrispondente all'iniziale del suo indirizzo di domicilio
            }while((via < 0) || (via > 2));
            System.out.println("Inserisci indirizzo domicilio (senza numero civico) per consegna veicolo ");   
            dom = in.nextLine();     //utente inserisce indirizzo con numero civico        
        }while(dom.equalsIgnoreCase("") ||(dom.length() <= 4));
        do{  
        System.out.println("Inserisci numero civico: "); 
        civ = in.nextLine();
        }while((civ.length() < 0) || (civ.length() > 4));
        do
        {
            System.out.println("Inserisci città");   //chiediamo la città di residenza
            city = in.nextLine();    
        }while (city.equalsIgnoreCase("") || (city.length() <= 3));   
        return dom; 
    }
    public void resoconto()   //procedura resoconto 
    {
        System.out.println("\nLa richiesta è stata presa in incarico"); //informiamo l'utente che la richiesta da lui fatta è andata a buon fine
        System.out.println("Il veicolo verrà presto consegnato in " + way.get(via) + " " + dom + " "+ civ + "\n" + "Città: " + city + "\n");   //mostro all'utente dove il veicolo da lui selezionato verrà consegnato (domicilio da lui inserito)
        System.out.println("Grazie per aver fatto acquisti da noi!!");
    }
}