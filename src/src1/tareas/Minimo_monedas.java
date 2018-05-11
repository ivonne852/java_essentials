package src1.tareas;

import libs.Input;

public class Minimo_monedas {

	public static void main(String[] args) {
		System.out.println("What is your change?");
		double d = Input.get_double()*100;
				   return_coins((int) d);
	}
	
	public static void return_coins(int change) {
		
		int [] coins = {25,10,5,1};
		int numCoins = 0;
				
		for (int i = 0; i < coins.length; i++) {
			numCoins += change/coins[i];
			change %= coins[i];
						
			if (change == 0) 
				break;		
		}
		System.out.println("Total of coins: "+numCoins);
	}
	
}
