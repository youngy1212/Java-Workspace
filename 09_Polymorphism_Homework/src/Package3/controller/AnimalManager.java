package Package3.controller;

import Package3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal [] an = new Animal[5];
		
		
		for(int i =0; i<an.length; i++) {
			if(1 == (int)(Math.random()*2+1)) {
				an[i] = new Dog();
			}else {
				an[i] = new Cat();
			}
			
			an[i].speak();
		}
		
		
	}

}
