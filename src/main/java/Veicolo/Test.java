package Veicolo;

import java.util.Scanner;
public class Test 
{
    public static void main(String[] args) 
    {
       String nome = "MyVehicleBuy";
       String user;
       String premi;
       String risp = "";
       String scelta = "";
       //inizializzo a 5 due variabili che mi serviranno per contare i tentativi rimasti dopo aver inserito male username o password 
       int x = 5; 
       int y = 5;
       int stop = 0;
       Submit name = new Submit();
       Domicilio ind = new Domicilio();
       String username = "";       
       String password = "";      
       String a;
       Auto car = new Auto(); //dichiaro l'oggetto auto appartenente alla classe Auto
       Moto moto = new Moto();
       Scanner input = new Scanner (System.in);
       Scanner in = new Scanner (System.in);
       Scanner c = new Scanner(System.in);
       System.out.println("Benvenuto in " + nome + ",registrati per esplorare il nostro catalogo e scegliere il veicolo che fa al caso tuo!. \n");
       System.out.println("Premi qualsiasi tasto per iniziare la registrazione...");
       premi = input.next();
       try {
            Thread.sleep(1000);
        } catch (Exception e){}
       System.out.println("Inizio registrazione");
       name.user(username);
       name.Password(password);
       name.Welcome();
       System.out.println("\nAccedi con nome utente e password \n");
       do
       {  //fai questo.....
        System.out.println("Inserisci username: ");            //chiedo all'utente di inserire username
        user = in.nextLine();
        if(user.equals(name.getUsername()))                 //se lo username digitato corrisponde
        {
            System.out.println("Nome utente corretto\n");   //Stampo corretto
        } 
        else  
        {
            x--;    //decremento x di uno rispetto al valore precedente
            System.out.println("Nome utente errato\n");     
            System.out.println("Tentativi rimasti: " + x);
            if (x == 0)  //se x da 5 diventa 0
            {
                System.out.println("Numero tentativi massimi raggiunti, attendere 30 secondi prima di poter riprovare\n"); //stampiamo num max tentativi raggiunti
                x = 5;  //resettiamo il contatore
                stop++; //incrementiamo stop
                if(stop == 3) //se stop arriva 3
                {
                    System.out.println("Troppi tentativi fatti, chiusura della in corso per sicurezza...");
                    System.exit(0); //chiusura del programma
                }
                try{
                Thread.sleep(30000);                
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        stop = 0; //rinizializzo stop a 0 per poter fare lo stesso procedimento con la password
        }while(!user.equals(name.getUsername()));     // ricomincia ciclo finchè lo username inserito non corrisponde       
        do
        {
            System.out.println("Inserisci la password: "); //chiediamo la password per l'accesso
            a = c.nextLine();   //input utente
            if(a.equals(name.getPassword())) //verifico che la password inserita sia la stessa digitata durante la registrazione
            {
                System.out.println("Password corretta \n");  //stampo password corretta
            }
            else                                              //altrimenti
            {
                y--;          //decremento y (tentativi)
                System.out.println("Password errata\n");
                System.out.println("Tentativi rimenenti: " + y);
                if(y == 0)          //se i tentativi raggiungono lo 0 
                {
                    System.out.println("Numero tentativi massimi raggiunti, attendere 30 secondi prima di poter riprovare \n");
                    y = 5;
                    stop++; //incremento stop 
                    if(stop == 3)
                    {
                        System.out.println("Troppi tentativi fatti, chiusura del programma in corso....");
                        System.exit(0);
                    }
                    try
                    {
                        Thread.sleep(30000);        //attesa di 30 secondi prima di poter riprovare a inserire la password
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }while(!a.equals(name.getPassword()));
        try{
            System.out.println("Accesso in corso...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
        System.out.println("Accesso eseguito\n");
        System.out.println("Benvenuto in " + nome + ", " + user +"\n");
        System.out.println("Digita 1 per accedere ai cataloghi o 0 per uscire");
        do{
            scelta = in.nextLine();
            switch(scelta)
            {
                case "1": 
                    do
                    {
                        int choose;
                        Scanner sc = new Scanner(System.in);
                        do
                        {
                            System.out.println("\nCATALOGO");
                            System.out.println("Quale catalogo vuoi aprire, auto o moto? \n" + "Digita 1 o 2 oppure 0 per uscire");
                            choose = sc.nextInt();
                            switch(choose)
                            {
                                case 1 :  
                                {
                                    car.Leggi(); 
                                    ind.pulisci();
                                    ind.getDomicilio();  
                                    risp = "";
                                    while(!risp.equalsIgnoreCase("si") && (!risp.equalsIgnoreCase("no"))) 
                                    {
                                        System.out.println("Vuoi procedere al pagamento? (si/no)");
                                        risp = c.nextLine();
                                    }
                                    if(risp.equalsIgnoreCase("si"))
                                    {
                                        car.pay();
                                        ind.resoconto(); //richiamo procedura resoconto dell'operazione effettuata dove stamperà ciò che ce scritto all'interno della procedura
                                    }
                                    else 
                                    System.out.println("\nRitorno al catalogo");
                                    break;
                                }
                                case 2: 
                                {
                                    moto.Leggi(); //Avvio procedura leggi che ci mostra tutto l'array di auto e ci fa interagire su quale scegliere e tutto il procedimento fino al pagamento e alla spedizione
                                    //richiamo procedure della classe Domicilio
                                    ind.pulisci();
                                    ind.getDomicilio();
                                    risp = "";
                                    while(!risp.equalsIgnoreCase("si") && (!risp.equalsIgnoreCase("no")))
                                    {
                                        System.out.println("Vuoi procedere al pagamento? (si/no)");
                                        risp = c.nextLine();
                                    }
                                    if(risp.equalsIgnoreCase("si"))
                                    {
                                        moto.pay();
                                        ind.resoconto(); //richiamo procedura resoconto dell'operazione effettuata dove stamperà ciò che ce scritto all'interno della procedura
                                    }
                                    else 
                                    System.out.println("\nRitorno al catalogo");
                                    break;
                                }
                                case 0: 
                                {
                                    System.out.println("Arrivederci, " +user);
                                    System.exit(0);
                                    break;
                                }
                                default: 
                                {
                                    System.out.println("Comando non riconosciuto!");
                                    break;
                                }
                            }
                        } while((choose != 1) || (choose != 2)); //
                    }while(risp.equalsIgnoreCase("no"));
                case "0": 
                {
                    System.out.println("Arrivederci, " +user);
                    System.exit(0);
                    break;
                }    
                default: 
                System.out.println("errore!");
                break;
            }
        }while((!scelta.equalsIgnoreCase("1") || (!scelta.equalsIgnoreCase("0")))); 
    }
} 
