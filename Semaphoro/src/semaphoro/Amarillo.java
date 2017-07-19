/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoro;

/**
 *
 * @author Alexateam
 */
public class Amarillo extends Thread {
    
boolean encendido = true;
	
    @Override
	
    public void run()
	    {
	       
	       while (encendido == true) {
	           try
	           {
	        	   for (int i = 5; i > 0; i--)  {	
	        	   
	        	 
                               Thread.sleep((long) (1000));
	        	   setName("Amarillo");
                           System.out.println("\nAvenida 27 de Febrero =======>" + this.getName() + " "+ i);
	        	   if (i == 5)
                           {
	        	   		
	        	   encendido = false;
	        	
                           }
                                
	        	  	
	           }}
	           catch(InterruptedException e)
	           {
	    }
	        }
	    
	     
	    }



}
