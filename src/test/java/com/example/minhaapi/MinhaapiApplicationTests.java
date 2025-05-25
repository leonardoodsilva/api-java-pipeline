package com.example.minhaapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MinhaapiApplicationTests {

	@Test
	void testSomaSimples() {
		int resultado = 2 + 2;
		assertEquals(4, resultado);
	}

}
