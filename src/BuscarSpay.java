import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscarSpayTest {

	void test() {
		SplayTree arbol = new SplayTree();
		SplayNode nodo = new SplayNode("hello", "hola");
		arbol.insert(nodo);
		String pruebas = arbol.search("hello");
		
		assertEquals("hola", "hola");
	}
}