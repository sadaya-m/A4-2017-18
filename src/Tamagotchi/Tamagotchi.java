package Tamagotchi;

import javax.swing.JOptionPane;

/* **********************************************************
 * Programmer:	Ma Pauline Sadaya
 * Class:	CS30S
 * 
 * Assignment:	Assignment 4 Tamagotchi
 *
 * Description:	Tamagotchi super class to demonstrate inheritance and behaviours of
                tamagotchi objects derived from this class
 * *************************************************************/
 
 // import files here as needed
 
 
 public class Tamagotchi
 {  // begin class
 	
    // *********** class constants ********** 
     
        public enum happinessLevel{
            Sad, Ok, Happy;
	}//end enum happinessLevel
        
        public enum hungerLevel{
            Low, Medium, High;
        }//end enum hungerLevel

    // ********** instance variable **********
     
        private String name;
        private int age;
        private happinessLevel Happy = null;
        private hungerLevel Hunger = null;
        private boolean sick;

    // ********** constructors ***********
        
        /************************************
        * Purpose: default constructor
        * Interface:
        *   in: none
        *   out: none
        ************************************/
        public Tamagotchi(){
        }//end default constructor
     
        /************************************
        * Purpose: initialized constructor
        * Interface:
        *   in:     String Name
        *           int age
        *           happinessLevel Happy
        *           hungerLevel Hunger
        *           boolean sick
        *   out: none
        ************************************/
        public Tamagotchi(String n, int a, happinessLevel h, hungerLevel hu, boolean s){
            name = n;
            age = a;
            Happy = h;
            Hunger = hu;
            sick = s;
        }// end initialized constructor

    // ********** accessors **********
    
        /*****************************************************
         Purpose: get name of tamagotchi
         Interface: IN: none							
         Returns: name
         *****************************************************/
        public String getName() {
            return name;
        }

        /*****************************************************
         Purpose: get age of tamagotchi
         Interface: IN: none							
         Returns: age
         *****************************************************/        
        public int getAge() {
            return age;
        }
        
        /*****************************************************
         Purpose: get happiness level of tamagotchi
         Interface: IN: none							
         Returns: happiness level
         *****************************************************/
        public happinessLevel getHappy() {
            return Happy;
        }

        /*****************************************************
         Purpose: get hunger level of tamagotchi
         Interface: IN: none							
         Returns: hunger level
         *****************************************************/
        public hungerLevel getHunger() {
            return Hunger;
        }

        /*****************************************************
         Purpose: determine if tamagotchi is sick
         Interface: IN: none							
         Returns: happiness level
         *****************************************************/
        public boolean isSick() {
            return sick;
        }
        
    // ********** mutators **********

        /*****************************************************
         Purpose: Tamagotchi eats something and relevant changes are
            made to the animals state
         Interface: IN: none
         Returns: none
        *****************************************************/	 
	 public void eat(){
            if(Hunger == hungerLevel.Low){
                JOptionPane.showMessageDialog(null, "Feed me! I'm starving");
            }
            else{
                JOptionPane.showMessageDialog(null, "Food is good. Food is life");
            }
	} // end eat
         
        /*****************************************************
         Purpose: Tamagotchi is sick
         Interface: IN: none
         Returns: none
        *****************************************************/	 
	 public void sick(){
            if(sick == true){
                JOptionPane.showMessageDialog(null, "Cough cough.. Sniff..");
            }
	} // end eat
         
         /*****************************************************
         Purpose: Tamagotchi is either sad,ok,or happy
         Interface: IN: none
         Returns: none
        *****************************************************/	 
	 public void happy(){
            if(Happy == happinessLevel.Happy){
                JOptionPane.showMessageDialog(null, "Let's play!");
            }
            else{
                JOptionPane.showMessageDialog(null, "...");
            }
	} // end eat
 
 }  // end class