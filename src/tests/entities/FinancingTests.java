package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void entryShouldReturnTwentryPercentOfTotalAmount() {
		
		Financing f = new Financing(100000.0 , 2000.0,80);
		double expectedValue =20000.0;
		
		double result  = f.entry();
		
		Assertions.assertEquals(expectedValue, result);
	}
	
	@Test
	public void quotaShouldReturnCorrectQuotaValue() {
		
		Financing f = new Financing(100000.0 , 2000.0,80);
		double expectedValue = 1000.0;
			
		double result  = f.quota();
		
		Assertions.assertEquals(expectedValue, result);
	
	}
	
	@Test
	public void constructorShouldSetValuesWhenValidData() {
		
		Financing f = new Financing(100000.0 , 2000.0,80);
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
		 
	}
	
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenIvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing f = new Financing(100000.0 , 2000.0,79);
			
		});
		
	}
	
	@Test
	public void setTotalAmountShouldSetValueWhenValidData() {
		
		Financing f = new Financing( 90000.0 , 2000.0,80);
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		
		 
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenIvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class , ()->{
			Financing f = new Financing(100000.0 , 2000.0,80);
			
			f.setTotalAmount(110000.0);	
		});
		
	}
	
	
	@Test
	public void setIncomeShouldSetValuesWhenValidData() {
		
		Financing f = new Financing(100000.0 , 2000.0,80);
		f.setIncome(3000.0);
		Assertions.assertEquals(3000.0, f.getIncome());
		
		 
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenIvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class , ()->{
			Financing f = new Financing(100000.0 , 2000.0,80);
			
			f.setIncome(1500.0);
			
		});
		
	}
	
	@Test
	public void setMonthShouldSetValuesWhenValidData() {
		
		Financing f = new Financing(100000.0 , 2000.0,80);
		f.setMonths(80);

		Assertions.assertEquals(80, f.getMonths());
		 
	}
	
	
	@Test
	public void setMonthShouldThrowIllegalArgumentExceptionWhenIvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class , ()->{
			Financing f = new Financing(100000.0 , 2000.0,80);
			
			f.setMonths(79);
			
		});
		
	}
	
	
	
	
}
