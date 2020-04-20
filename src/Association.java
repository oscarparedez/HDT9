import java.util.LinkedHashMap;
import java.util.Map;

public class Association<K, V> {

    BinaryTree<String> homework = new BinaryTree<>("homework", "tarea", null, null);
    BinaryTree<String> town = new BinaryTree<>("town", "pueblo", null, null);
    BinaryTree<String> yes = new BinaryTree<>("yes", "si", null, null);
    BinaryTree<String> woman = new BinaryTree<>("woman", "mujer", town, yes);
    BinaryTree<String> dog = new BinaryTree<>("dog", "perro", null, homework);
    BinaryTree<String> house = new BinaryTree<>("house", "casa", dog, woman);
    Map<String, String> keyMap = new LinkedHashMap<>();

    int contador = 0;
    Map<String,String> ordenarPalabras(BinaryTree<String> tree) {
    	
    
        if (tree == null) {
            return null; 
        }
  
        ordenarPalabras(tree.left);
        contador++;
        keyMap.put("*"+tree.valEng()+"*", tree.valEsp()); 
        ordenarPalabras(tree.right);
        return keyMap;
        
    }
}