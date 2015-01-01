package tddpart1;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExerciseTest {

	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	/*public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}*/
	/*public void testFrancMultiplication() {
		Money five = Money.franc(5); 
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}*/
	 public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	 
	 @Test public void testPlusReturnsSum() {
		 Money five= Money.dollar(5);
		 Expression result= five.plus(five);
		 Sum sum= (Sum) result;
		 assertEquals(five, sum.augend);
		 assertEquals(five, sum.addend);
		 }
		 
	 @Test public void testReduceMoney() {
		 Bank bank= new Bank();
		 Money result= bank.reduce(Money.dollar(1), "USD");
		 assertEquals(Money.dollar(1), result);
		 }
	 
	 @Test public void testSimpleAddition() {
		 Money five= Money.dollar(5);
		 Expression sum= five.plus(five);
		 Bank bank= new Bank();
		 Money reduced= bank.reduce(sum, "USD");
		 assertEquals(Money.dollar(10), reduced);
		 }
	 
	 public void testEquality() {
		 assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		 assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		 assertFalse(Money.franc(5).equals(Money.dollar(5)));
		 }
	 
	 @Test public void testArrayEquals() {
		 assertEquals(new Object[] {"abc"}, new Object[] {"abc"});
	 } 
	 public void testReduceMoneyDifferentCurrency() {
		 Bank bank= new Bank();
		 bank.addRate("CHF", "USD", 2);
		 Money result= bank.reduce(Money.franc(2), "USD");
		 assertEquals(Money.dollar(1), result);
		 }
	 
	 @Test public void testIdentityRate() {
		 assertEquals(1, new Bank().rate("USD", "USD"));
		 }
	 /*public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
		}*/
}
