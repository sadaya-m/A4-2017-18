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

import javax.swing.*;
import java.text.DecimalFormat;

public class TamagotchiClient
{  // begin class
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****

    // ***** declaration of variables *****
        
        String strout;

    // ***** create objects *****

        ProgramInfo programInfo = new ProgramInfo();

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


    // ***** output *****

        // all formatted ouput is printed in this section

    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class