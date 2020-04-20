import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("INGRESE [1] PARA IMPLEMENTAR SPLAY TREE O [2] PARA IMPLEMENTAR BINARY TREE.");
        int opcion = scan.nextInt();
		
		
        if(opcion == 1) {
        	
        } else if(opcion == 2) {
            Association<String,String> association =new Association<>();
            association.ordenarPalabras(association.house);
            Traducir translator = new Traducir();
            translator.traducirArchivo();
        }
        


	}

}
