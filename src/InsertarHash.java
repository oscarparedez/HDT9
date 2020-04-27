import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertarHashTest {

	@Test
	void test() {
		Map<String,String> mapa = new Association<String, String>();
		mapa.put("hello", "hola");
		boolean prueba;
		prueba = mapa.get("hello") != null;
		
		assertEquals(prueba, true);
	}

}
