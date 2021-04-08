package Veicolo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Auto
 */
public class Auto implements Pagamento {  //Classe Auto con implementazione dell'interfaccia Pagamento
    //Dichiarazione variabili e arraylist
    int a;
   
    double pay;
    int b;
    int colore;
   
    ArrayList<String> auto = new ArrayList<String>();
    ArrayList<String> auto1 = new ArrayList <String>();
    ArrayList<String> vernice = new ArrayList<String>();
    Scanner sc = new Scanner (System.in);
    public void Leggi() //Avvio procedura Leggi
    {
        //aggiunta elementi all'ArrayList Auto
        auto.add("0) Fiat");
        auto.add("1) Ford");
        auto.add("2) Porsche");
        auto.add("3) BMW");
        auto.add("4) Audi");
        auto.add("5) Ferrari");
        auto.add("6) Mercedes-Benz");
        auto.add("7) Jeep");
        auto.add("8) Volvo");
        auto.add("9) Toyota");
        auto.add("10) Hyundai");
        auto.add("11) Subaru");
        auto.add("12) Nissan");
        auto.add("13) Opel");
        auto.add("14) Wolkswagen");
        auto.add("15) Alfa Romeo");
        auto.add("16) Lamborghini"); 
        auto.add("17) Maserati");
        auto.add("18) Lancia");
        auto.add("19) Chevrolet");
        auto.add("20) Dodge");
        auto.add("21) Citroen");
        auto.add("22) Honda");
        auto.add("23) Mazda"); 
        auto.add("24) Mitsubishi");
        auto.add("25) Peugeot");
        auto.add("26) Renault");
        //aggiunta elementi all'ArrayList vernice
        vernice.add("0) Nero");
        vernice.add("1) Nero grafite");
        vernice.add("2) Bianco");
        vernice.add("3) Blu");
        vernice.add("4) Blu notte");
        vernice.add("5) Azzurro");
        vernice.add("6) Giallo");
        vernice.add("7) Giallo lime");
        vernice.add("8) Verde");
        vernice.add("9) Grigio");
        vernice.add("10) Viola");
        vernice.add("11) Rosa");
        vernice.add("12) Marrone");
        vernice.add("13) Rosso");
        vernice.add("14) Rosso vino");
        vernice.add("15) Arancione");
        System.out.println("\nLe marche di auto in totale sono: " +auto.size()); //conto il totale degli elementi presenti nell'arraylist                                        
        Scanner in = new Scanner(System.in);
        do
        {
            System.out.println(auto); //stampo l'ArrayList
            System.out.println("Quale marca di auto scegli tra queste? \n");
            System.out.println("Inserisci un numero DA 0 A 26");
            a = in.nextInt();     //inserimento numero da utente      
        }while ((a < 0 ) || (a > 26));     //finchè il valore inserito sarà negativo o maggiore di 26 richiedi inserimento del dato
        System.out.println(auto.get(a));   // valore inserito preso e messo dentro arraylist
        if (auto.get(a).equalsIgnoreCase("0) Fiat")) // se il valore inserito da utente (a) è 0 ed equivale alla scritta "0)Fiat" proseguiamo col blocco
        {
            System.out.println("Hai selezionato Fiat"); 
            //aggiungo modelli della marca Fiat in un nuovo array
            auto1.add("0) Punto");                  
            auto1.add("1) 500");
            auto1.add("2) Panda");
            auto1.add("3) Tipo");
            auto1.add("4) 500 Elettrica"); 
            do
            {
                System.out.println("Seleziona modello");    
                System.out.println(auto1);  //stampiamo i modelli Fiat
                b = in.nextInt(); //utente digita il numero associato al modello che desidera
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");  
            if(auto1.get(b).equalsIgnoreCase("0) Punto"))     //se ha digitato 0 quindi punto
            {
                do
                { 
                    System.out.println(vernice);     //stampiamo a schermo tutti i colori disponibili per il veicolo selezionato
                    System.out.println("Scegli colore : "); 
                    colore = sc.nextInt();      //utente sceglie il colore
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 13.000 euro\n");   //prezzo del veicolo
            }
            else if (auto1.get(b).equalsIgnoreCase("1) 500"))  
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("\nPrezzo: 14.600 euro");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Panda")) 
            {
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 13.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) Tipo"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 16.750 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) 500 Elettrica"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 25.250 euro\n");       
            }
        }
        else if (auto.get(a).equalsIgnoreCase("1) Ford"))
        {
            System.out.println("Hai selezionato Ford");
            auto1.add("0) Fiesta");
            auto1.add("1) Focus");
            auto1.add("2) Mustang");
            auto1.add("3) Escort");
            auto1.add("4) GT");
            auto1.add("5) Kuga");
            auto1.add("6) Puma");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 6));
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");
            if(auto1.get(b).equalsIgnoreCase("0) Fiesta"))
            {
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 16.330 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) Focus"))
            { 
                do
                {
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 24.400 euro\n");
            }  
            else if(auto1.get(b).equalsIgnoreCase("2) Mustang"))
            {
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 47.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) Escort"))
            {
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 19.200 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) GT"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 550.000 euro\n");
            }        
            else if(auto1.get(b).equalsIgnoreCase("5) Kuga"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 26.035 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("6) Puma"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 20.274 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("2) Porsche"))
        {
            System.out.println("Hai selezionato Porsche");
            auto1.add("0) 911 Carrera");
            auto1.add("1) Panamera");
            auto1.add("2) Cayenne");
            auto1.add("3) Macan");
            auto1.add("4) Taycan");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");
            if(auto1.get(b).equalsIgnoreCase("0) 911 Carrera")){
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 109.879 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Panamera"))
            {
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 97.080 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Cayenne"))
            {
                do
                { 
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 80.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Macan"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 63.746 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) Taycan"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 86.471 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("3) BMW"))
        {
            System.out.println("Hai selezionato BMW");
            auto1.add("0) M2");
            auto1.add("1) M4");
            auto1.add("2) X6");
            auto1.add("3) I8");
            auto1.add("4) X5");
            auto1.add("5) X1");
            auto1.add("6) X3");
            auto1.add("7) Z4");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 7));     //finchè viene inserito un numero inferiore a 0 o superiore a 2 ripeterà la sequenza altrimenti procede oltre
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");
            if(auto1.get(b).equalsIgnoreCase("0) M2"))  
            {
                System.out.println("Scegli colore");
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 62.400 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) M4"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 77.850 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) X6"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 80.370 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) I8"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 148.970 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) X5"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 68.770 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) X1"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 31.870 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("6) X3"))
            { 
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 47.620 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("7) Z4"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 42.670 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("4) Audi"))
        {
            System.out.println("Hai selezionato Audi");
            auto1.add("0) A4");
            auto1.add("1) RS6");
            auto1.add("2) R8");
            auto1.add("3) A7");
            auto1.add("4) A8");
            auto1.add("5) A1");
            auto1.add("6) TT");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 6));
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");
            if(auto1.get(b).equalsIgnoreCase("0) A4"))
            { 
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 36.300 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) RS6"))
            {
                do{
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 131.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) R8"))
            { 
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 156.000 euro\n");
            }   
            else if(auto1.get(b).equalsIgnoreCase("3) A7"))
            { 
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 62.487 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) A8"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 96.737 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("5) A1"))
            { 
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 21.600 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("6) TT"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 47.886 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("5) Ferrari"))
        {
            System.out.println("Hai selezionato Ferrari");
            auto1.add("0) California");
            auto1.add("1) F12 tdf");
            auto1.add("2) 458 Italia");
            auto1.add("3) 488");
            auto1.add("4) 599");
            auto1.add("5) 812");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 5));
            System.out.println("Hai scelto: " + auto1.get(b) + "\n");
            if(auto1.get(b).equalsIgnoreCase("0) California")){
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Prezzo: 90.000 euro\n");
                System.out.println("Hai scelto: " + vernice.get(colore));
            }
            else if (auto1.get(b).equalsIgnoreCase("1) F12 tdf"))
            {
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 1.100.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) 458 Italia"))
            { 
                do
                {
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 205.782 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) 488"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 230.668 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) 599"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 245.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("5) 812"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Prezzo: 301.000 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("6) Mercedes-Benz"))
        {
            System.out.println("Hai selezionato Mercedes-Benz");
            auto1.add("0) C63");
            auto1.add("1) Classe C");
            auto1.add("2) Classe A");
            auto1.add("3) CLA");
            auto1.add("4) CLS");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) C63"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 107.000  euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Classe C"))
            {
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt();
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 48.200 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Classe A"))
            { 
                do
                {
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 26.500 euro\n"); 
            }
            else if (auto1.get(b).equalsIgnoreCase("3) CLA"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 33.411 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) CLS"))
            { 
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 99.770 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("7) Jeep"))
        {
            System.out.println("Hai selezionato Jeep ");
            auto1.add("0) Wrangler");
            auto1.add("1) Renegade");
            auto1.add("2) Compass");
            do{
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Wrangler")){
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 49.300 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Renegade"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 23.300 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Compass"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.560 euro\n");
            } 
        }
        else if (auto.get(a).equalsIgnoreCase("8) Volvo"))
        {
            System.out.println("Hai selezionato Volvo");
            auto1.add("0) P444");
            auto1.add("1) PV544");
            auto1.add("2) S60");
            auto1.add("3) XC40");
            auto1.add("4) V40");
            auto1.add("5) V60");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) P444"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.000 euro\n");
            } 
            else if (auto1.get(b).equalsIgnoreCase("1) PV544"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.800 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) S60"))
            { 
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "+ vernice.get(colore));
                System.out.println("Prezzo: 40.505 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) XC40"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "+ vernice.get(colore));
                System.out.println("Prezzo: 29.805 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) V40"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli color: e");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 25.950 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) V60"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "+ vernice.get(colore));
                System.out.println("Prezzo: 39.305 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("9) Toyota"))
        {
            System.out.println("Hai selezionato Toyota");
            auto1.add("0) Corolla");
            auto1.add("1) Yaris");
            auto1.add("2) Supra");
            auto1.add("3) Avalon");
            auto1.add("4) Celica");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Corolla"))
            {
                do
                { 
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.160 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Yaris"))
            { 
                do
                {
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 17.215 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Supra"))
            {
                do
                { 
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 55.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Avalon"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) Celica"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 5.968 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("10) Hyundai"))
        {
            System.out.println("Hai selezionato Hyundai");
            auto1.add("0) Tucson");
            auto1.add("1) i20");
            auto1.add("2) Kona");
            auto1.add("3) i30");
            auto1.add("4) i10");
            auto1.add("5) i40");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 5));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Tucson"))
            { 
                do
                { 
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 28.600 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) i20"))
            { 
                do
                { 
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15 ));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 16.250 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Kona"))
            { 
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 21.250 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) i30"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.700 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) i10"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.350 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) i40"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 33.350 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("11) Subaru"))
        {
            System.out.println("Hai selezionato Subaru");
            auto1.add("0) Brz");
            auto1.add("1) Outback");
            auto1.add("2) XV");
            auto1.add("3) Impreza");
            auto1.add("4) WRX");
            do{
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Brz"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 38.900 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Outback"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 41.600 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) XV"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 24.050 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Impreza"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 21.850 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) WRX"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 46.590 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("12) Nissan"))
        {
            System.out.println("Hai selezionato Nissan ");
            auto1.add("0) Juke");
            auto1.add("1) GT-R");
            auto1.add("2) Quashqai");
            auto1.add("3) Silvia");
            auto1.add("4) Skyline");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Juke"))
            {
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 20.177 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) GT-R"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 107.521 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Quashqai"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 24.719 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Silvia"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 25.800 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) Skyline"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.400 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("13) Opel"))
        {
            System.out.println("Hai selezionato Opel");
            auto1.add("0) Corsa");
            auto1.add("1) Astra");
            auto1.add("2) Insignia");
            auto1.add("3) Crossland X");
            auto1.add("4) Mokka");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Corsa"))
            {
                do
                {
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 14.630 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) Astra"))
            { 
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 23.480 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Insignia"))
            { 
                do
                {
                    System.out.println(vernice);  
                    System.out.println("Scegli colore (numero da 0 a 15): ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 33.330 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Crossland X"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 19.780 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) Mokka"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 21.130 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("14) Wolkswagen"))
        {
            System.out.println("Hai selezionato Wolkswagen");
            auto1.add("0) Golf");
            auto1.add("1) Scirocco");
            auto1.add("2) Polo");
            auto1.add("3) T-Roc");
            auto1.add("4) Tayron");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Golf"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 25.266 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Scirocco"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 30.450 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Polo"))
            { 
                do
                {
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: ");   
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Prezzo: 17.508 euro\n");
                System.out.println("Hai scelto: " + vernice.get(colore));
            }
            else if (auto1.get(b).equalsIgnoreCase("3) T-Roc"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 24.216 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) Tayron"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "+ vernice.get(colore));
                System.out.println("Prezzo: 23.350 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("15) Alfa Romeo")) 
        {
            System.out.println("Hai selezionato Alfa Romeo");
            auto1.add("0) Giulia");
            auto1.add("1) Stelvio");
            auto1.add("2) Giulietta");
            auto1.add("3) 4C");
            auto1.add("4) Brera");
            auto1.add("5) 8C Competizione");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 5));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Giulia"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 40.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Stelvio"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 47.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Giulietta"))
            { 
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 21.100 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) 4C"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 75.550 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) Brera"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 29.800 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) 8C Competizione"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 250.000 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("16) Lamborghini"))
        {
            System.out.println("Hai selezionato Lamborghini");
            auto1.add("0) Gallardo");
            auto1.add("1) Aventador");
            auto1.add("2) Huracan");
            auto1.add("3) Murcielago");
            auto1.add("4) Centenario");
            auto1.add("5) Reventon");
            auto1.add("6) Urus");
            do
            {
                System.out.println("Seleziona modello");
                 System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 6));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Gallardo"))
            { 
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 150.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Aventador"))
            { 
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 346.249 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Huracan"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 197.071 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) Murcielago"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 232.220 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) Centenario"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 1.750.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) Reventon"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 1.400.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("6) Urus"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 207.999 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("17) Maserati"))
        {
            System.out.println("Hai selezionato Maserati");
            auto1.add("0) GranTurismo");
            auto1.add("1) Levante");
            auto1.add("2) Quattroporte");
            auto1.add("3) GranSport");
            auto1.add("4) GranCabrio");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) GranTurismo"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 50.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Levante"))
            {
                do
                { 
                    System.out.println(vernice);   
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 82.953 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Quattroporte"))
            {
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 129.332 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) GranSport"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 107.750 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) GranCabrio"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 149.500 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("18) Lancia"))
        {
            System.out.println("Hai selezionato Lancia");
            auto1.add("0) Delta");
            auto1.add("1) Ypsilon");
            do{
                System.out.println(auto1);
                System.out.println("Seleziona modello");
                b = in.nextInt();
            }while((b < 0) || (b > 1));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Delta"))
            { 
                do
                {
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Ypsilon"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 14.200 euro\n");
            }
        }   
        else if (auto.get(a).equalsIgnoreCase("19) Chevrolet"))
        {
            System.out.println("Hai selezionato Chevrolet");
            auto1.add("0) Camaro");
            auto1.add("1) Corvette");
            auto1.add("2) Avalanche");
            auto1.add("3) Spark");
            auto1.add("4) Aveo");
            do{
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Camaro"))
            {
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 42.300 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Corvette"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 133.870 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Avalanche"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 15.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) Spark"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 9.700 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) Aveo"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.627 euro\n");
            }
        }    
        else if (auto.get(a).equalsIgnoreCase("20) Dodge"))
        {
            System.out.println("Hai selezionato Dodge");
            auto1.add("0) Charger");
            auto1.add("1) Challenger");
            auto1.add("2) Viper");
            auto1.add("3) RAM");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 3));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("1) Charger"))
            {
                do
                { 
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 70.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Challenger"))
            {
                do
                {
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 37.000 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Viper"))
            { 
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 75.600 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) RAM"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 87.169 euro\n");
            }
        }
        else if (auto.get(a).equalsIgnoreCase("21) Citroen"))
        {
            System.out.println("Hai selezionato Citroen");
            auto1.add("0) C6");
            auto1.add("1) C5");
            auto1.add("2) C3");
            auto1.add("3) C3-XR");
            auto1.add("4) DS-4");
            auto1.add("5) DS-5");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 5));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) C6"))
            { 
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: "  + vernice.get(colore));
                System.out.println("Prezzo: 12.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) C5"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 26.085 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) C3"))
            {
                do
                {
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 13.285 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) C3-XR"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 108.800 euro\n");
            }
        }
        else if  (auto.get(a).equalsIgnoreCase("22) Honda"))
        {
            System.out.println("Hai selezionato Honda");
            auto1.add("0) Civic");
            auto1.add("1) CR-V");
            auto1.add("2) Crossroad");
            auto1.add("3) CR-Z");
            auto1.add("4) BR-V");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Civic"))
            { 
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 26.040 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) CR-V"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 35.540 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Crossroad"))
            {
                do
                { 
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.391 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) CR-Z"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 5.600 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) BR-V"))
            {
                do
                { 
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 34.300 euro\n");
            }
        }
        else if(auto.get(a).equalsIgnoreCase("23) Mazda"))
        {
            System.out.println("Hai selezionato Mazda");
            auto1.add("0) Mx-5");
            auto1.add("1) RX-7");
            auto1.add("2) Mx-3");
            auto1.add("3) CX-8");
            auto1.add("4) CX-9");
            auto1.add("5) CX-5");
            auto1.add("6) CX-7");
            auto1.add("7) CX-30");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 7));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Mx-5"))
            { 
                do
                {
                    System.out.println(vernice);    
                    System.out.println("Scegli colore: ");  
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 31.257 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Rx-7"))
            {
                do
                {
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Prezzo: 10.500 euro\n");
                System.out.println("Hai scelto: " + vernice.get(colore));
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Mx-3"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.920 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("3) CX-8"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 37.950 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("4) CX-9"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 33.960 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("5) CX-5"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 32.608  euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("6) CX-7"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 3.800 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("7) CX-30"))
            {
                do
                {
                    System.out.println(vernice);      
                    System.out.println("Scegli colore: ");
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 27.920 euro\n"); 
            }
        }
        else if (auto.get(a).equalsIgnoreCase("24) Mitsubishi"))
        {
            System.out.println("Hai selezionato Mitsubishi");
            System.out.println("Seleziona modello");
            auto1.add("0) Eclipse");
            auto1.add("1) Lancer");
            auto1.add("2) Mirage");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) Eclipse"))
            {
                do
                { 
                    System.out.println(vernice);  
                    System.out.println("Scegli colore: ");    
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 24.600 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) Lancer"))
            { 
                do
                { 
                    System.out.println(vernice);
                    System.out.println("Scegli colore: ");      
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 20.000 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("2) Mirage"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 9.000 euro\n");
            } 
        }
        else if (auto.get(a).equalsIgnoreCase("25) Peugeot"))
        {
            System.out.println("Hai selezionato Peugeot");
            System.out.println("Seleziona modello");
            auto1.add("0) 208");
            auto1.add("1) 508");
            auto1.add("2) 408");
            do{
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto1.get(b).equalsIgnoreCase("0) 208"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 15.020 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("1) 508"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 36.500 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) 408"))
            { 
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 21.000 euro\n");
            }
        }
        else if(auto.get(a).equalsIgnoreCase("26) Renault"))
        {
            System.out.println("Hai selezionato Renault");
            System.out.println("Seleziona modello");
            auto1.add("0) Megane");
            auto1.add("1) Clio");
            auto1.add("2) Captur");
            auto1.add("3) Zoe");
            auto1.add("4) Kadjar");
            auto1.add("5) Twingo");
            do
            {
                System.out.println("Seleziona modello");
                System.out.println(auto1);
                b = in.nextInt();
            }while((b < 0) || (b > 5));
            System.out.println("Hai scelto: " + auto1.get(b));
            if(auto.get(a).equalsIgnoreCase("0) Megane"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 25.826 euro\n");
            }
            else if(auto1.get(b).equalsIgnoreCase("1) Clio"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 15.687 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("2) Captur"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 20.437 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("3) Zoe"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 26.387 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("4) Kadjar"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 26.726 euro\n");
            }
            else if (auto1.get(b).equalsIgnoreCase("5) Twingo"))
            {
                do
                { 
                    System.out.println(vernice); 
                    System.out.println("Scegli colore: ");     
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.237 euro\n");
            }
        }
        //pulizia di tutti gli arraylist
        auto.clear();
        auto1.clear();
        vernice.clear();
    }     
    public void pay() //procedura pagamento
    {
        System.out.println("Pagamento in corso, attendere..."); //dopo che l'utente accetterà il pagamento visualizzerà la corretta procedura e vedrà se il pagamento andrà a buon fine
        try
        {
            Thread.sleep(1500);
        } catch (Exception e) {}
        System.out.println("Transazione eseguita");
        try
        {
            Thread.sleep(2000);
        } catch (Exception e) {}
    }
  
}