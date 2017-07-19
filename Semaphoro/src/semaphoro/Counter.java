
package semaphoro;

/**
 *
 * @author Alexateam
 */
public class Counter {
    
        public synchronized void cotrolador() throws InterruptedException{
            
       
            
            Verde verde = new Verde();
                   
            
            
            Amarillo amarillo = new Amarillo();
       
       Rojo rojo = new Rojo();
        VerdeLincoln verdeLincoln = new VerdeLincoln();
        AmarilloLincoln amarilloLincoln = new AmarilloLincoln();
        RojoLincoln rojoLincoln = new RojoLincoln();
         
                                verde.sleep(1000);
                    verde.start();
        
        Amarillo.sleep(44 * 1000);
        amarillo.start();
        
        rojo.sleep(6 * 1000);
        rojo.start();
       
        verdeLincoln.sleep(1000);
        verdeLincoln.start();
        
        amarilloLincoln.sleep(44 * 1000);
        amarilloLincoln.start();
        
                
        
        rojoLincoln.sleep(6 * 1000);
        rojoLincoln.start();
      
        }

}
