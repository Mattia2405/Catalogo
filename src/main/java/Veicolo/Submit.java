package Veicolo;

import java.util.Scanner;
public class Submit
{
    //Dichiarazione variabili
    String username;
    String password;
    //costruttore 
    public Submit(){}
    Scanner in = new Scanner(System.in);
    public void user(String user)       //procedura user per mettere credenziali username 
    {
        do
        {
            System.out.println("Inserisci username (minimo 6 caratteri): ");
            user = in.nextLine();
            username = user;
        }while(username.length() < 6);    
    }
    public void Password(String pass)       //procedura password per mettere credenziali password 
    {
        do
        {
            System.out.println("\nInserisci password (minimo 8 caratteri): "); 
            pass = in.nextLine();
            password = pass;
        }while(password.length() < 8);
    }
    public String getPassword()
    {
        return this.password; //memorizzare la password inserita tramite procedura e passata a variabile globale per portarla in questa funzione
    }
    public String getUsername()
    {
        return username;  //memorizzare username inserito tramite procedura e passato a variabile globale per portarlo in questa funzione
    }
    public void Welcome()
    {
        System.out.println("\nRegistrazione avvenuta con successo");
        System.out.println("Qui le credenziali da te inserite (ATTENZIONE NON DIVULGARE DATI PERSONALI): ");
        String coverpass = "*".repeat(password.length()); //Scambiare la password con *
        System.out.println("username : " + username + "\n" + "Password: " + coverpass + "\n");  //stampiamo a schermo lo username inserito e la password ma coperta da *
    } 
}