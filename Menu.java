import java.util.*;



public class Menu{
PulisciSchermo p = new PulisciSchermo();


public void sottoMenu(){

boolean flagMenu = false;
while(!flagMenu){

  System.out.println("Iola questo è il menu");
  System.out.println("1) fai questo");
  System.out.println("2) pulisci");
  System.out.println("3) esci");
  Scanner in = new Scanner(System.in);
  System.out.println("Inserisci la scelta: ");
  int scelta = in.nextInt();

  if(scelta == 1){
    System.out.println("La prima scelta");
    System.out.println("Prova stampa su branch nuovo!!!");
    

  }else if(scelta == 2){
    System.out.println("USCITA");
    p.clearScreen();

    
  }else if(scelta == 3){
    flagMenu = true;
  }

}

}



}