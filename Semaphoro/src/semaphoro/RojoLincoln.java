/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoro;

/**
 *
 * @author Alexateam
 */
public class RojoLincoln extends Thread{
    
    
    
    
    
    @Override
    public void run(){
   Thread rojo = new RojoLincoln();

	               
                         setName("Rojo");
	        	System.out.println("\nAvenida. Abraham Lincoln ===> " + this.getName());
	                System.out.println(" Avenida 27 de Frebreo ===> Verde " ); 
         
	                  
            
                        try {
                rojo.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
	               
	        	
                       }
	
    
    
}
