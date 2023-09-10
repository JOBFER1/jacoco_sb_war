package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JacocoSbWarApplicationTests {

	@Test
	void contextLoads() {
//		assertEquals(true, true );
	}
	
   @Test
   public void main() {
	   JacocoSbWarApplication.main(new String[] {});
   }

}
