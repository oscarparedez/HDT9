import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscarHashTest {

	@Test
	void test() {
		boolean prueba;
		SplayTree arbol = new SplayTree();
		SplayNode nodo = new SplayNode();
		arbol.insert(nodo);
		prueba = arbol.isEmpty();
		
		assertEquals(false, prueba);
	}

}
