package main; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	 private static Scanner scanner = new Scanner(System.in);

	 public static int getInt(String getMSG, String errorMSG) {
		    int data;
		    System.out.print(getMSG);
		    try {
		        data = scanner.nextInt();
		        scanner.nextLine();
		    }
		    catch (InputMismatchException e) {
		        scanner.nextLine();
		        System.out.println(errorMSG);
		        data = getInt(getMSG, errorMSG);
		    }
		    return data;
	 }

	 public static int getAmount(String getMSG, String errorMSG, String errorMSGMinus) {
	        int amount = getInt(getMSG,errorMSG);
	        while(amount < 0) {
	            System.out.println(errorMSGMinus);
	            amount =  getInt(getMSG,errorMSG);
	        }
	        return amount;
	 }



}