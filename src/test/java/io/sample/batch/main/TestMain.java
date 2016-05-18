package io.sample.batch.main;

public class TestMain {

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {

			System.out.println("test >> " + i);

		    switch(i) {
		        case 0: 
		        	break; 
		        case 1: 
		        	System.out.print("one "); 
		        case 2: 
		        	System.out.print("two "); 
		        case 3: 
		        	System.out.print("three "); 
		    }
		}
		System.out.println("done");

	}
}
