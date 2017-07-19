/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexateam
 */
public class Verde extends Thread {
    
          boolean encendido = true;
	  boolean verdeEncendido = true;
	  boolean amarilloEncendido = true;
	  int counter = 50;
          
        
   public void run(){
            Thread verde = new Verde();
            System.out.println("\nAvenida 27 De Febrero");
            System.out.println("Avenida Abrahan Lincoln esta Rojo");
	    for (int v = 45; v > 0 ; v--) 
	               {
                           
                            setName("Verde"); 
                            System.out.println(this.getName() + " " + v);
                            counter = counter - 1;
	                if (counter %5 ==0 )
	                {
	                	System.out.println("Av. Abraham Lincoln ======> Rojo " + counter); 
	                   if (counter == 0)
	                   
	                   
	                   {
	                       counter = 50;
	                       encendido = false;
	                   
	                   }
	                 }
          
                        
                        
                        
                        
                        try {
                verde.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Verde.class.getName()).log(Level.SEVERE, null, ex);
            }
	               
	        	
                       }
                       }}

