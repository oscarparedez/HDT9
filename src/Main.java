import java.util.*;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        Traducir traducir = new Traducir();
        
        System.out.println("INGRESE [1] PARA IMPLEMENTAR SPLAY TREE O [2] PARA IMPLEMENTAR HASHMAP.");
        int opcion = scan.nextInt();
		
        if(opcion == 1) {
        	
        	
        	
        } else if(opcion == 2) {
        	
        	FactoryMap<String> fabrica = new FactoryMap<String>();
        	Map<String, String> tipoDeMapa = fabrica.tipoMap("HashMap");
        	
        
        	Map<String, String> mapa;
			try {
				mapa = traducir.armarDiccionario(tipoDeMapa);
	        	System.out.println(traducir.traducirArchivo(mapa));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        


	}

}
