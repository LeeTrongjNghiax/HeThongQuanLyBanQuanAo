package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import jdk.jfr.Description;

public class Regex {
	String regSDT = "^[0]{1}\\d{9,10}";
	String regTenSP = "^[A-Za-z]{2,6}(\\s[A-Za-z0-9]*)*";
	
	@Test
	public void test() {
//		assertEquals(true, "01211111111".matches(regSDT));
		
		assertEquals(true, "Ao Thun trang 1".matches(regTenSP));
	}
	
	@Test
	public void test1() {
//		assertEquals(true, "a899481151".matches(regSDT));
		
		assertEquals(true, "1 Ao Thua".matches(regTenSP));
	}
	
	@Test
	public void test2() {
//		assertEquals(true, "0a99481151".matches(regSDT));
		
		assertEquals(true, "Quan *".matches(regTenSP));
	}
	
	@Test
	public void test3() {
//		assertEquals(true, "089948b151".matches(regSDT));
		
		assertEquals(true, "Quan 1".matches(regTenSP));
	}
}
