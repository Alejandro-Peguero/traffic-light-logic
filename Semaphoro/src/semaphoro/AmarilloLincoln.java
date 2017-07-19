/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoro;

/**
 *
 * @author Alexateam
 */
public class AmarilloLincoln extends Thread {
    boolean encendido = true;
	
    
    
    
    @Override
    public void run()
	    {
	       Thread amarillaAL = new AmarilloLincoln();
	       while (encendido == true) {
	           try
	           {
	        	   for (int i = 5; i > 0; i--)  {	
	        	   
	        	 
                               
                               amarillaAL.sleep((long) (1000));
	        	       setName("Amarillo");
	        	      System.out.println("\nAvenida Abraham Linconln =======> " + this.getName() + " "+ i);
              
	        	   
               
                              if (i == 5)
                           {
	        	   		
	        	   encendido = false;
                           boolean hp = true;
	        	
                           }
                                
	        	  	
	           }}
	           catch(InterruptedException e)
	           {
	           
           }
	        }
	    
	     
	    }
}
