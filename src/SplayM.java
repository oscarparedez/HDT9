
public class SplayM<K, V> implements Map<K, V>{
	
	//Instancia del árbol
	SplayTree arbol = new SplayTree();

	@Override
	public void put(K k, V v) {
		
		SplayNode nodo = new SplayNode(k.toString(), v.toString());
		arbol.insert(nodo);
	}

	@Override
	public String get(K k) {
		
		String traduccion = arbol.search(k.toString());
		if(traduccion != null) {
			return "* "+ traduccion.toUpperCase()+" * ";
		}
		else {
			return  "* "+k.toString()+" * ";
		}
		
	}

}
