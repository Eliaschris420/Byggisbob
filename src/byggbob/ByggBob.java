/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package byggbob;
import java.util.Scanner;
/**
 *
 * @author elias.cristiansson
 */
public class ByggBob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Spelare 1 är i starten");
        int spelarplats = 0;
        int spelarplats2 = 0;
        //Den här while loopen gör så att spelet går tills någon har nått plats 100/slutet
       while(spelarplats<100)
       {
           int tärning1= (int)(Math.random()*6+1);
           System.out.println("Nu är det spelare 1 tur");
           System.out.println("Du slog en " + tärning1);
           spelarplats= spelarplats + tärning1;
           System.out.println("Spelare 1 är nu på ruta "  + spelarplats);
           //Båda av dem här styckena är spelare som slår ett nummer 1-6 och de slår efter varandra
           int tärning2= (int)(Math.random()*6+1);
           System.out.println("Nu är det spelare 2 tur");
           System.out.println("Du slog en " + tärning2);
           spelarplats2 = spelarplats2 + tärning2;
           System.out.println("Spelare 2 är nu på ruta " + spelarplats2);
         
           // Alla de här if satserna är händelse rutor och om man hamnar på en av dem så händer grejen som if satsen säger.
           if(spelarplats==5)
           {
               spelarplats =spelarplats - 4;
               System.out.println("Du har hamnat på en händelse ruta. Du hamnar på plats " + spelarplats);
          
           }
           
            if(spelarplats2==5)
           {
               spelarplats2 =spelarplats2 - 4;
               System.out.println("Du har hamnat på en händelse ruta. Du hamnar på plats " + spelarplats2);
          
           }
            
           if(spelarplats==16)
           {
               spelarplats++;
               System.out.println("Du går fram ett steg");
           }
           
           if(spelarplats2==16)
           {
               spelarplats2++;
               System.out.println("Du går fram ett steg");
           }
           
           if(spelarplats==30)
           {
               spelarplats= spelarplats + 20;
               System.out.println("Du hamnar på ruta 50");
           }
           
            if(spelarplats2==30)
           {
               spelarplats2= spelarplats2 + 20;
               System.out.println("Du hamnar på ruta 50");
           }
           
           if(spelarplats==50)
           {
               spelarplats = spelarplats - 10;
               System.out.println("Oj då, det verkar som du hamnat fel. Du går tillbaka tio steg, du är nu på ruta 40");
           }
           
           if(spelarplats2==50)
           {
               spelarplats2 = spelarplats2 - 10;
               System.out.println("Oj då, det verkar som du hamnat fel. Du går tillbaka tio steg, du är nu på ruta 40");
           }
           
           if(spelarplats==67)
           {
               spelarplats = spelarplats + 2;
               System.out.println("Yippe, du går fram 2 steg, du är nu på ruta 69");
           }
           
            if(spelarplats2==67)
           {
               spelarplats2 = spelarplats2 + 2;
               System.out.println("Yippe, du går fram 2 steg, du är nu på ruta 69");
           }
           
           if(spelarplats==85)
           {
               spelarplats = spelarplats - 20;
               System.out.println("Aj aj aj, nu gick det riktigt dåligt, du går tillbaka 20 steg, du är nu på ruta 65");
           }
           
           if(spelarplats2==85)
           {
               spelarplats2 = spelarplats2 - 20;
               System.out.println("Aj aj aj, nu gick det riktigt dåligt, du går tillbaka 20 steg, du är nu på ruta 65");
           }
           
           if(spelarplats==99)
           {
               spelarplats = spelarplats - 99;
               System.out.println("Grattis, du går tillbaka till starten!");
           }
           
            if(spelarplats2==99)
           {
               spelarplats2 = spelarplats2 - 99;
               System.out.println("Grattis, du går tillbaka till starten!");
           }
       }
       
       
        System.out.println(spelarplats);
        System.out.println(spelarplats2);
    }
    
}
