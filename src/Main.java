import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        Traducir traducir = new Traducir();
        
        System.out.println("INGRESE [1] PARA IMPLEMENTAR SPLAY TREE O [2] PARA IMPLEMENTAR HASHMAP.");
        int opcion = scan.nextInt();
		
        if(opcion == 1) {
        	
        	
        	
        } else if(opcion == 2) {
        	HashMap_<String, String> mapa = traducir.armarDiccionario("HashMap");
            
        	
        	
        	System.out.println(traducir.traducirArchivo(mapa));
        }
        


	}

}
