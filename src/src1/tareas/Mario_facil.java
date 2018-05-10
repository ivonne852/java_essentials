package src1.tareas;

import libs.Input;

public class Mario_facil {

	public static void main(String[] args) {
		System.out.println("How many level has the pyramid?");
		int i = Input.get_int();
		        make_pryramid(Input.getIntegerInput(i));

	}
	
	public static void make_pryramid(int level) {
				
		for(int i=1; i<=level; i++ ) {
			for (int j=0; j<level-i; j++)
				System.out.print(" ");
			
			for(int k=0; k<=i; k++)
				System.out.print("#");
			
			System.out.println();
		}
		
	}

}
