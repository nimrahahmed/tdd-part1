package tddpart1;

public class Dollar {

	int amount ;

	Dollar(int amount) {
		this.amount= amount;
	}
	
	void times(int multiplier) {
		amount= amount * multiplier;
		}
}

