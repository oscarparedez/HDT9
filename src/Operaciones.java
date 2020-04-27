import java.io.*;
import java.util.*;

public class Operaciones {
	
//	DIRECTORIO PERSONAL DEL USUARIO
	private String path = System.getProperty("user.dir");
	File archivoEjemplo;

	//Método para importar el texto del archivo
	String importarTexto(Map<String, String> m){
		
	    String lineaArmada = "";
	    String texto = "";
		
	    try {
	    	
	    	archivoEjemplo = new File(path+"/ejemplo.txt");
			Scanner scan = new Scanner(archivoEjemplo);
			
			while(scan.hasNextLine()) {
				
				String linea = scan.nextLine();
				
				String[] palabrasLinea = linea.split(" ");
				
				for(int i=0; i < palabrasLinea.length; i++) {
					
					String palabra = palabrasLinea[i];
					String palabraTraducida = m.get(palabra);
					lineaArmada = lineaArmada + palabraTraducida;
					
				}
		           lineaArmada = lineaArmada + "\n\n";
			}
			texto = texto + lineaArmada;
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	    return texto;
	}

	
    //Método para armar el diccionario
	Map<String, String> armarDiccionario(Map<String, String> m) throws Exception {
    	
        BufferedReader bufferedreader = new BufferedReader(new FileReader(path+"/Spanish.txt"));
        String linea;
        String palabraAnterior = "";
    		
		while((linea = bufferedreader.readLine()) != null) {
      
            String[] parejaDePalabras = linea.split("\\s+|,|\\[|/", 2);
            String palabra = parejaDePalabras[0];
            String traduccionPalabra = parejaDePalabras[1];
        
            if(!palabraAnterior.equalsIgnoreCase(palabra)) {
                m.put(palabra, traduccionPalabra);
                palabraAnterior = palabra;  
            }   
		}
        return m;
    }
}