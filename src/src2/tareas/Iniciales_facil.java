package src2.tareas;

import libs.Input;

public class Iniciales_facil {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		String s = Input.get_string();
				   print_initials(s);

	}
	
	public static void print_initials(String name) {
		
		String [] s = name.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].charAt(0) >= 'A' && s[i].charAt(0) <= 'Z')
				System.out.print(s[i].charAt(0));
		}
			
	}

}
