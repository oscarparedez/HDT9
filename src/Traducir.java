import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Traducir {
	
//	DIRECTORIO PERSONAL DEL USUARIO
	private String path = System.getProperty("user.dir");
	private File file = new File(path+"/src/ejemplo.txt");
	
    Map<String,String> keyMap;

    Association<String,String> association = new Association<>();

    void traducirArchivo(){
    	
        try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				
				String linea = scan.nextLine();
	            String[] palabras = linea.split(" ");

	            for(int i = 0; i<palabras.length; i++){

	                String palabra = palabras[i];
	                if(palabra.contains(".")) {
	                    StringBuilder ultimaPalabra = new StringBuilder(palabra);
	                    ultimaPalabra.deleteCharAt(ultimaPalabra.length()-1);
	                    palabras[i]=String.valueOf(ultimaPalabra);
	                }
	                
	                palabras[i]="*"+palabras[i]+"*";
	            }
	            
	            Map<String,String> keyMap = association.ordenarPalabras(association.house);

	            Set<String> keysList=keyMap.keySet();

	            Object[] keysArray=keysList.toArray();

	            for(int i=0;i<palabras.length;i++)
	            {
	                for(int j=0;j<keyMap.size();j++)
	                {
	                    if(palabras[i].equals(keysArray[j]))
	                    {
	                    	palabras[i]=keyMap.get(keysArray[j]);
	                        break;
	                    }
	                }
	            }
	            
	            StringBuilder sb= new StringBuilder(palabras[palabras.length-1]);
	            sb.append(".");
	            palabras[palabras.length-1]=String.valueOf(sb);
	            String sentence="";

	            for(int i=0;i<palabras.length;i++)
	            {
	                sentence+=(palabras[i])+" ";
	            }
	            System.out.println(sentence);
	            
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}