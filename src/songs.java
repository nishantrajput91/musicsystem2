
import javazoom.jl.player.Player;

import java.io.FileInputStream;

import java.util.Scanner;

public class songs
{

    public static String Nishant[] = {"muqabla.mp3", "Dus Bahane.mp3", "Sawan Aaya.mp3", "Malhari.mp3", "coka.mp3", "3 peg.mp3",

            "kya baat ay.mp3", "Faded.mp3", "On & On.mp3", "Believer.mp3","scam 1992.mp3","kgf.mp3","fillhal.mp3"};

    public static int i;

    public static void play(String name) throws Exception
    {

        FileInputStream j = new FileInputStream(name);

        Player k = new Player(j);

        k.play();
    }

    public static void display()
    {

            System.out.println("Welcome to Nishant Music System\n");

            System.out.println("Party songs");

            System.out.println("press 0 for muqabla");

            System.out.println("press 1 for Dus Bahane");

            System.out.println("press 2 for Sawan aya");

            System.out.println("press 3 for Malhari\n");

            System.out.println("Punjabi songs");

            System.out.println("press 4 for coka");

            System.out.println("press 5 for 3peg");

            System.out.println("press 6 for kya baat ay\n");

            System.out.println("English songs");

            System.out.println("press 7 for faded");

            System.out.println("press 8 for on and on");

            System.out.println("press 9 for Believer\n");

            System.out.println("Ringtones");

            System.out.println("press 10 for scam 1992");

            System.out.println("press 11 for kGF");

            System.out.println("press 12 for filhal\n");

            System.out.println("Enter number of your choice");

            Scanner h = new Scanner(System.in);

            i = h.nextInt();

    }

    public static void main(String args[]) throws Exception
    {
        int j=0;

        while(j>=0)

        {
            display();

            for (int y = 0; y <= 12; y++) {

                if (i == y) {
                    String h = Nishant[i];

                    play(h);
                }

            j++;

            }
        }
    }
}