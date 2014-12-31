package tddpart1;

public class Franc extends Money{
	//private String currency;

	Franc(int amount, String currency) {
		super(amount, currency);
		}
	
	/*String currency() {
	return currency;
	}*/
	
/*	Money times(int multiplier) {
			return new Franc(amount * multiplier, currency);
		}*/
	/*public boolean equals(Object object) {
	Franc franc= (Franc) object;
	return amount == franc.amount;
	}*/
}
