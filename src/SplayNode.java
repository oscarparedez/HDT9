//Se utilizó la implementacion propuesta en la página https://www.sanfoundry.com/java-program-implement-splay-tree/
public class SplayNode
 {    
     SplayNode left, right, parent;
     String palabra_ingles;
     String palabra_espanol;
 
     
     public SplayNode(String ingles, String espanol)
     {
         left = null;
         right = null;
         parent = null;
         palabra_ingles = ingles;
         palabra_espanol = espanol;
     }
     
     public SplayNode(){
    	 
    	 left = null;
         right = null;
         parent = null;
         palabra_ingles = null;
         palabra_espanol = null;

     }          
     
}