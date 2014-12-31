package tddpart1;

public class Money {
	protected int amount;
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
		}
/*	Money times(int multiplier) {
		return Money.franc(amount * multiplier);
		}*/
/*	Money times(int amount) {
		return null;
		}*/
	protected String currency;
	String currency() {
	return currency;
	}
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
		}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
		} 
	static Money franc(int amount) {
		return new Money(amount, "CHF");
		}
	public String toString() {
		return amount + " " + currency;
		}
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}
}
