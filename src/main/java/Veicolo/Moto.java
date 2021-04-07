package Veicolo;

import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Auto{ //classe moto a cui estendo la superclasse Auto
    //dichiaro nuovi ArrayList per il catalogo moto oltre a variabili, metodi e Arraylist presenti ed ereditati dalla classe auto
    ArrayList <String> moto = new ArrayList <String>();
    ArrayList <String> moto1 = new ArrayList <String>(); 
    public Moto(){} //costruttore
    public void pay()
    {
        super.pay();
    }
    public void Leggi()
    {
        //riempimento ArrayList Moto
        moto.add("0) Ducati");
        moto.add("1) Yamaha");
        moto.add("2) Triumph");
        moto.add("3) Suzuki");
        moto.add("4) Honda");
        moto.add("5) Kawasaki");
        moto.add("6) KTM");
        moto.add("7) Aprilia");
        moto.add("8) Harley-Davidson");
        //riempimento ArrayList vernice
        vernice.add("0) Nero");
        vernice.add("1) Nero Grafite");
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
        //conta il totale degli elementi presente nell'arraylist moto
        System.out.println("\nLe marche di moto in totale sono: " +moto.size());                                           
        Scanner p = new Scanner(System.in);
        do
        {
            System.out.println(moto); 
            System.out.println("Quale marca di moto scegli tra queste?" + "\n Inserisci un numero DA 0 A 8");
            a = p.nextInt(); 
        }while ((a < 0) || (a > 8)) ;     
        System.out.println(moto.get(a)); //prendo il valore inserito da utente e lo associo all'arraylist per far scegliere la marca di moto da lui desiderata
        if(moto.get(a).equalsIgnoreCase("0) Ducati"))  
        {
            System.out.println("Hai Selezionato Ducati\n");
            moto1.add("0) Ducati Panigale V4 SP");      //aggiunta elementi ArrayList moto1
            moto1.add("1) Ducati Superleggera V4");
            moto1.add("2) Ducati Monster 821 Stealth");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt(); //facciamo scegliere all'utente quale modello desidera
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) Ducati Panigale V4 SP"))  
            {
                do
                { 
                    System.out.println(vernice);  //dopo selezione marca e modello moto stampo arraylist vernice con tutti i colori disponibili per il veicolo scelto
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); //richiedo il colore a utente
                }while((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore)); //stampo il colore scelto dall'utente
                System.out.println("Prezzo: 37.000 euro\n");
            } 
            else if(moto1.get(b).equalsIgnoreCase("1) Ducati Superleggera V4"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 100.000 euro\n"); 
            }
            else if (moto1.get(b).equalsIgnoreCase("2) Ducati Monster 821 Stealth"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 10.990 euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("1) Yamaha"))
        {
            System.out.println("Hai selezionato Yamaha");
            moto1.add("0) YZF-125");           
            moto1.add("1) MT-09");
            moto1.add("2) YZF-600 R6");
            moto1.add("3) MT-10"); 
            do
            {
                System.out.println(moto1); 
                System.out.println("Seleziona modello: "); 
                b = p.nextInt(); 
            }while((b < 0) || (b > 3));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) YZF-125"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt();     
                }while ((colore < 0) || (colore > 15));   
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 5.299 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("1) MT-09"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 9.499 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("2) YZF-600 R6"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.290 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("3) MT-10"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 13.899 euro\n");
            }
        }
        else if (moto.get(a).equalsIgnoreCase("2) Triumph"))
        {
            moto1.add("0) Trident 660");
            moto1.add("1) Speed Triple 1200RS");
            moto1.add("2) Bonneville T120");
            moto1.add("3) Tiger 850 Sport");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt();
            }while((b < 0) || (b > 3));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) Trident 660"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 7.995 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("1) Speed Triple 1200RS"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 17.600 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("2) Bonneville T120"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.600 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("3) Tiger 850 Sport"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.600 euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("3) Suzuki"))
        {
            System.out.println("Hai selezionato Suzuki");
            moto1.add("0) GSX-R 150");
            moto1.add("1) SV-650");
            moto1.add("2) Katana");
            moto1.add("3) DR 650RE");
            moto1.add("4) RV 200 VanVan");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt(); 
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) GSX-R 150"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 4.590 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("1) SV-650"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 12.600 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("2) Katana"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 13.690 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("3) DR 650RE"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 5.090 euro\n"); 
            }
            else if (moto1.get(b).equalsIgnoreCase("4) RV 200 VanVan"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 12.600 euro\n");
            }
        }  
        else if (moto.get(a).equalsIgnoreCase("4) Honda"))
        {
            System.out.println("Hai selezionato Honda");
            moto1.add("0) CBR 150R");
            moto1.add("1) CBR 250RR");
            moto1.add("2) CRF 300 Rally");
            moto1.add("3) CBR 500R");
            moto1.add("4) MSX 125 Grom");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt(); //facciamo scegliere all'utente quale modello desidera
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) CBR 150R"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 5.500 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("1) CBR 250RR"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 2.500 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("2) CRF 300 Rally"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 9.750 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("3) CBR 500R"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 6.990 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("4) MSX 125 Grom"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 4.500 euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("5) Kawasaki"))
        {
            System.out.println("Hai selezionato Kawasaki");
            moto1.add("0) Z 400");
            moto1.add("1) Z 650");
            moto1.add("2) ZX-10R Ninja");
            moto1.add("3) Ninja 650");
            moto1.add("4) Versys-X 300");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt();
            }while((b < 0) || (b > 4));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) Z400"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 4.500 euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("1) Z 650"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 4.500 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("2) ZX-10R Ninja"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 4.500 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("3) Ninja 650"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 7.990 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("4) Versys-X 300 "))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 5.500  euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("6) KTM"))
        {
            System.out.println("Hai selezionato KTM");
            moto1.add("0) 125 Duke");
            moto1.add("1) 390 Duke");
            moto1.add("2) 450 SMR");
            moto1.add("3) RC 390");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt(); 
            }while((b < 0) || (b > 3));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) 125 Duke"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 5.140 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("1) 390 Duke"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 3.900 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("2) 450 SMR"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 10.990 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("3) RC 390"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 5.500  euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("7) Aprilia"))
        {
            System.out.println("Hai selezionato Aprilia");
            moto1.add("0) SL 900");
            moto1.add("1) RS 660");
            moto1.add("2) RSV-4 RR");
            moto1.add("3) Tuono V4 1100 RR");
            do
            {
                System.out.println(moto1);  
                System.out.println("Seleziona modello: ");
                b = p.nextInt(); 
            }while((b < 0) || (b > 3));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) SL 900"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 8.580  euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("1) RS 660"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 11.050  euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("2) RSV-4 RR"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 20.990  euro\n");
            }
            else if (moto1.get(b).equalsIgnoreCase("3) Tuono V4 1100 RR"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 16.140 euro\n");
            }
        }
        else if(moto.get(a).equalsIgnoreCase("8) Harley-Davidson"))
        {
            System.out.println("Hai selezionato Harley-Davidson");
            moto1.add("0) Pan America 1250");
            moto1.add("1) Road Glide Special 114");
            moto1.add("2) CVO Street Limited");
            do
            {
                System.out.println(moto1);
                System.out.println("Seleziona modello: ");  
                b = p.nextInt(); 
            }while((b < 0) || (b > 2));
            System.out.println("Hai scelto: " + moto1.get(b));
            if(moto1.get(b).equalsIgnoreCase("0) Pan America 1250"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get(colore));
                System.out.println("Prezzo: 18.700  euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("1) Road Glide Special 114"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 29.950 euro\n");
            }
            else if(moto1.get(b).equalsIgnoreCase("2) CVO Street Limited"))
            {
                do
                { 
                    System.out.println(vernice);     
                    System.out.println("Scegli colore: "); 
                    colore = sc.nextInt(); 
                }while ((colore < 0) || (colore > 15));
                System.out.println("Hai scelto: " + vernice.get (colore));
                System.out.println("Prezzo: 43.700  euro\n");
            }
        }
        //pulizia degli arraylist usati, alla fine di tutto il processo
        moto.clear();
        moto1.clear();
        vernice.clear();
    }
}