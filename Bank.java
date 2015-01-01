package tddpart1;

import java.util.Hashtable;

public class Bank {
	private Hashtable rates = new Hashtable();
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
		}
	/*int rate(String from, String to) {
		return (from.equals("CHF") && to.equals("USD"))
		? 2 
		: 1;
		}*/
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
		}
	int rate(String from, String to) {
		if (from.equals(to)) return 1;
		Integer rate= (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
		}
}
 