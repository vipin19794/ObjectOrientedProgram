import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgeLabz.Utility.Util;

class JUnitTest {

	
	@Test
	void test1() 
	{
           assertEquals("Thursday",Util.calculateDay(21,11,2019));
    }
	
	@Test
	void test2() 
	{
           assertEquals(4,Util.squareRoot(16),Math.exp(-15));
    }
	
	@Test
	void test3() 
	{      int arr[] = {1,0,0,0,0,0,0,0,0};
           assertArrayEquals(arr,Util.vendingMachine(1000));
    }
	
	@Test
	void test4() 
	{      
		assertEquals("110101",Util.toBinary(53));
    }
	
	@Test
	void test5()
	{      
		assertEquals("53",Util.toDecimal("110101"));
  }
	
	@Test
	void test6() 
	{      
		assertEquals("101011",Util.stringReverse("110101"));
    }
	
	@Test
	void test7() 
	{
           assertEquals(0.09280494014035894,Util.monthlyPayment(5.0,4.5,0.1),Math.exp(-15));
    }
	
	@Test
	void test8() 
	{      
		assertEquals(113.0,Util.fahrenheitToCelsius(45.0),Math.exp(-15));
    }
	
	@Test
	void test9() 
	{      
		assertEquals(1.6669444444444457,Util.celsiusToFahrenheit(35.0005),Math.exp(-15));
    }
}
