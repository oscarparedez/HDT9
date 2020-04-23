import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Traducir {
	
//	DIRECTORIO PERSONAL DEL USUARIO
	private String path = System.getProperty("user.dir");
	private File archivoEjemplo = new File(path+"/src/ejemplo.txt");
	private File archivoDiccionario = new File(path+"/src/Spanish.txt");	

	HashMap_<String, String> mapa ;
	
    HashMap_<String, String> armarDiccionario(String m) {
    	
    	mapa = new HashMap_<String, String>();    	
    	String palabraAnterior = "";
    	
    	try {
    		
    		Scanner scan = new Scanner(archivoDiccionario);
    		
    		while(scan.hasNextLine()) {
				String linea = scan.nextLine();
				linea = linea.toLowerCase();
				
				try
                {
                
                    String[] parejaDePalabras = linea.split("\t", 2);
                    String palabra=parejaDePalabras[0];
                    String traduccionPalabra=parejaDePalabras[1];
                
                    if(!palabraAnterior.equalsIgnoreCase(palabra))
                    {
                        
                        mapa.put(palabra, traduccionPalabra); //ingles,espanol
                        palabraAnterior = palabra;
                        
                    }   
                    
                }
                catch(Exception e)
                {
                	System.out.println(e);
                }
				
    		}
    		
    		
    	}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
    	
        return mapa; 
    	
    }

    String traducirArchivo(HashMap_<String, String> mapa){
    	
        String lineaArmada = "";
        String texto = "";
        String palabraTraducida = "";
    	
        try {
        	
			Scanner scan = new Scanner(archivoEjemplo);
			
			while(scan.hasNextLine()) {
				
				String linea = scan.nextLine();
				linea = linea.toLowerCase();
				
				String[] palabrasLinea = linea.split(" ");
				
				for(int i=0; i < palabrasLinea.length; i++) {
					
					String palabra = palabrasLinea[i];
					palabraTraducida = mapa.get(palabra);
					
					lineaArmada = lineaArmada + palabraTraducida;
					
				}
			
		           lineaArmada = lineaArmada + "\n";
	            
			}
			texto = texto + lineaArmada;
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
        
        return texto;

    }
 
}