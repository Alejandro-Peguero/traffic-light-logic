/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphoro;



/**
 *
 * @author Alexateam
 */
public class Rojo extends Thread{
    
          boolean hp = true;
	 
	  int counter = 50;
    
    @Override
    public void run(){
   Thread rojo = new Rojo();

	               
                        setName("Rojo");
	        	System.out.println("\nAvenida 27 DE FEBRERO =======> " + this.getName());
	                System.out.println("\nAvenida Abraham Lincoln =====> Verde " ); 
                 
	                  
           
                        
                        
                        
                        
                        try {
                rojo.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
	               
	        	
                       }
	
    
    
    
}

    
