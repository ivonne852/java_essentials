package src1.tareas;

import libs.Input;

public class Botellas_agua {

	public static void main(String[] args) {
		System.out.println("How long was your shower? ");
		int i = Input.get_int();
		
		while (i <= 0 ) {
			System.out.println("Please enter a valid number of minutes");
			i = Input.get_int(); 
		}
		
		time_water_bottles(i);
	}
	
	public static void time_water_bottles(int time) {
		int bottle=12;
		int result=time*bottle;
		System.out.println(time + " minute(s) equal to "+ result +" water bottle(s)");
	}
}
