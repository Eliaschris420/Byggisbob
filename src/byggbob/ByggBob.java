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
       while(spelarplats<=100 && spelarplats2<=100)
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
            
           if(spelarplats==16) //Det här är en händelse som är ett quiz
           {
               System.out.println("Spelare 1, vad är viktigast för oss människor,");
               System.out.println("1, Vatten");
               System.out.println("2, Läsk");
               System.out.println("3, Öl");
               int svar = 1;
               int gissning =input.nextInt();
               input.nextLine();
               if(gissning != svar)
               {
                   System.out.println("Det är fel, det rätta svaret 1");
                   spelarplats = spelarplats - 10;
               }
               else
               {
                   System.out.println("Bra jobbat, svaret är rätt");
               }
           }
           
           if(spelarplats2==16)
           {
               System.out.println("Spelare 2, vad är viktigast för oss människor,");
               System.out.println("1, Vatten");
               System.out.println("2, Läsk");
               System.out.println("3, Öl");
               int svar2 = 1;
               int gissning2 =input.nextInt();
               input.nextLine();
               if(gissning2 != svar2)
               {
                   System.out.println("Det är fel, det rätta svaret 1");
                   spelarplats2 = spelarplats2 - 10;
               }
               else
               {
                   System.out.println("Bra jobbat, svaret är rätt");
               }
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
           
           if(spelarplats==67)// Det här en till händelse fast en ekvation
           {
           System.out.println("Spelare 1, x + 12 = 10, vad är x");
                    int svar3 = -2;
                    int gissning3 = input.nextInt();
                    input.nextLine();
                    if (gissning3 != svar3)
                    {
                        System.out.println("Det är fel, svaret är -2");
                        spelarplats = spelarplats - 10;
                    }
                    else
                    {
                        System.out.println("Bra jobbat");
                        spelarplats = spelarplats + 10;
                    {
           }
           }
           
            if(spelarplats2==67)
           {
              System.out.println("Spelare 1, x + 12 = 10, vad är x");
                    int svar4 = -2;
                    int gissning4 = input.nextInt();
                    input.nextLine();
                    if (gissning4 != svar4)
                    {
                        System.out.println("Det är fel, svaret är -2");
                        spelarplats2 = spelarplats2 - 10;
                    }
                    else
                    {
                        System.out.println("Bra jobbat");
                        spelarplats2 = spelarplats2 + 10;
                    {
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
       
           }
       }
    }
       if (spelarplats<=100)
       {
           System.out.println("Grattis spelare 2, du vann");
       }
       if (spelarplats2<=100)
       {
           System.out.println("Grattis spelare 1, du vann");
       }
       if (spelarplats>=100 && spelarplats2>=100)
       {
           System.out.println("Det blir oavgjort");
           
           
       }
        System.out.println("Spelare 1, " + spelarplats);
        System.out.println("Spelare 2, " + spelarplats2);
    }
}



      
    
    

