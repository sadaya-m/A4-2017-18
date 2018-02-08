package TamagotchiClient;

// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         Assignment 4
//
//  Description:	client code to demonstrate behaviours of tamagotchi class
//
//
//  Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import Tamagotchi.Tamagotchi;
import Tamagotchi.Tamagotchi.happinessLevel;
import Tamagotchi.Tamagotchi.hungerLevel;
import java.io.*;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class TamagotchiClient
{  // begin class
    public static void main(String args[]) throws IOException
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        String strout;
        String strin;
        String delim = "[ :]+";		// delimiter string for splitting input string
        String[] tokens = null;          // array for splitting input

    // ***** create objects *****

        ProgramInfo programInfo = new ProgramInfo();
        BufferedReader fin = new BufferedReader(new FileReader("tamagotchiList.txt"));
        ArrayList<Tamagotchi> Pet = new ArrayList<Tamagotchi>();

    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);
        
    // ***** Print Banner *****

        strout = programInfo.getBanner("Assignment 4 Tamagotchi");
	System.out.println(strout);

    // ***** get input *****

        // all input is gathered in this section
        // remember to put ConsoleReader.class into the
        // same folder.

    // ***** processing *****

        strin = fin.readLine();
        
        while(strin != null){
            tokens = strin.split(delim);        //split string into tokens
            happinessLevel t = happinessLevel.valueOf(tokens[2]);
            hungerLevel h = hungerLevel.valueOf(tokens[3]);
            Boolean b = Boolean.valueOf(tokens[4]);
            Pet.add(new Tamagotchi(tokens[0], Integer.parseInt(tokens[1]), t, h, b));
            strin = fin.readLine();
        }//end eof loop

    // ***** output *****

        System.out.println(Pet.get(0).isSick());

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class