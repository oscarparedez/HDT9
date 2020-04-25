import java.io.*;
import java.util.*;

public class Traducir {
	
//	DIRECTORIO PERSONAL DEL USUARIO
	private String path = System.getProperty("user.dir");
	File archivoEjemplo;

	String traducirArchivo(Map<String, String> m){
		
	    String lineaArmada = "";
	    String texto = "";
		
	    try {
	    	
	    	archivoEjemplo = new File(path+"/src/ejemplo.txt");
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

	
    Map<String, String> armarDiccionario(Map<String, String> m) throws Exception {
    	
        BufferedReader bufferedreader = new BufferedReader(new FileReader(path+"/src/Spanish.txt"));
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