/*/
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de Datos
 * Hoja de trabajo 09
 * Autores: Oscar Saravia y Oscar Paredez
 */
import java.util.*;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        Operaciones op = new Operaciones();
        Factory<String> fabrica = new Factory<String>();
        
        //Menú principal
        System.out.println("---------- BIENVENIDO ----------");
        System.out.println("Por favor ingrese la implementacion que quiere utilizar: ");
        System.out.println("1. SplayTree\n"
        		+ "2. Map");
        int opcion = scan.nextInt();
		
        //Condicional para el factory
        if(opcion == 1) {
        	Map<String, String> tipoDeMapa = fabrica.tipoMap(1); 
        	Map<String, String> mapa;
        	try {
        		mapa = op.armarDiccionario(tipoDeMapa);
	        	System.out.println(op.importarTexto(mapa));
        	}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } 
        else if(opcion == 2) {
           	Map<String, String> tipoDeMapa = fabrica.tipoMap(2);      
        	Map<String, String> mapa;
			try {
				mapa = op.armarDiccionario(tipoDeMapa);
	        	System.out.println(op.importarTexto(mapa));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
        


	}

}
