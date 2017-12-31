//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
       
        
        
         //Ask the user for these values using
         int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
          JOptionPane.YES_NO_OPTION);
         if(answer == 0) {
        	
        	 if(0 == JOptionPane.showConfirmDialog(null, "Is it a vacation?", "",
                     JOptionPane.YES_NO_OPTION)) {
        		 System.out.println("sleep in");
        	 }else {
        		 System.out.println("wake up!");
        	 }
         }else {
        	 System.out.println("sleep in");
         }
          
          //JOptionPane.showConfirmDialog(null, "Is it a weekend?", "",
            //      JOptionPane.YES_NO_OPTION);
          
          
         
    


        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
