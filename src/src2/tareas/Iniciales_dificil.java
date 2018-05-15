package src2.tareas;

import libs.Input;

public class Iniciales_dificil {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		String s = Input.get_string();
				   print_initials(s);

	}
	
	public static void print_initials(String name) {
		
		String upperCase = name.toUpperCase();
		String [] s = upperCase.split(" ");
				
		for (int i = 0; i < s.length; i++) {
			
			if(!s[i].isEmpty()) 
				if(s[i].charAt(0) >= 'A' && s[i].charAt(0) <= 'Z')
					System.out.print(s[i].charAt(0));
		}
		
	}

}
