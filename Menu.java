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
    

  }else if(scelta == 2){
    System.out.println("USCITA");
    //p.clearScreen();
    System.out.print("\033[H\033[2J"); 
    System.out.flush(); 
    
  }else if(scelta == 3){
    flagMenu = true;
  }

}

}



}