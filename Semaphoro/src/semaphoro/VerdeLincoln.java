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
public class VerdeLincoln extends Thread{
    
          boolean encendido = true;
	  boolean verdeEncendido = true;
	  boolean amarilloEncendido = true;
	  int counter = 50;
   
          public void run(){
            Thread verde = new VerdeLincoln();
            System.out.println("\nAvenida Abrahan Lincoln");
            System.out.println("Aenida Habrahan Lincoln esta Verde");
	    for (int x = 45; x > 0 ; x--) 
	               {
                           
                            setName("Verde");
	             
	              
				System.out.println(this.getName() + " " + x);
                               counter = counter - 1;
	                if (counter %5==0 )
	              {
	               
	             System.out.println("Av. 27 de Frebrero =====> Rojo " + counter); 
	             
	                   if (counter == 0)
	                   
	                   
	                   {
	                       counter = 50;
	                      
	                 
                               
	              }
	                }
            try {
                verde.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Verde.class.getName()).log(Level.SEVERE, null, ex);
            }
	               
	        	
                       }
	}



}
