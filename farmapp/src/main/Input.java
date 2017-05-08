<<<<<<< HEAD
package main; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	 private static Scanner scanner = new Scanner(System.in);

	 public static int getInt(String getMSG, String errorMSG) {
		    int data;
		    System.out.println(getMSG);
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
	 
	 public static int getIntMax(String getMSG, String errorMSG, int max) {
	        int data;
	        System.out.print(getMSG);
	        data = scanner.nextInt();
	        scanner.nextLine();
	        if(data>max || data<0) {
	            System.out.println(errorMSG);
	            data = getIntMax(getMSG, errorMSG, max);
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

	 public static char getChar(String getMSG, String errorMSG, char rule[]) {
	        char data;
	        System.out.print(getMSG);
	        data = scanner.nextLine().charAt(0);
	        boolean checker = false;
	        for (char c : rule) {
	            if(c == data) {
	                checker = true;
	            }
	        }
	        if(!checker) {
	            System.out.println(errorMSG);
	            data = getChar(getMSG, errorMSG, rule);
	        }
	        return data;
	    }

	 public static String getString(String getMSG, String blankMSG) {
	        String data;
	        System.out.print(getMSG);
	        data = scanner.nextLine();
	        if(data.equals("")) {
	            System.out.println(blankMSG);
	            data = getString(getMSG,blankMSG);
	        }
	        return data;
	    }
	 
	 public static double getDouble(String getMSG, String errorMSG) {
		 	        double data;
		 	        System.out.print(getMSG);
			        try {
		 	            data = scanner.nextDouble();
		 	            scanner.nextLine();
		 	        }
		 	        catch (InputMismatchException e) {
		            scanner.nextLine();
		            System.out.println(errorMSG);
		            data = getDouble(getMSG, errorMSG);
		         }
		         return data;
		     }
=======
package main; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	 private static Scanner scanner = new Scanner(System.in);

	 public static int getInt(String getMSG, String errorMSG) {
		    int data;
		    System.out.println(getMSG);
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
	 
	 public static int getIntMax(String getMSG, String errorMSG, int max) {
	        int data;
	        System.out.print(getMSG);
	        try {
		        data = scanner.nextInt();
		        scanner.nextLine();
		    
		        if(data>max || data<0) {
		        	System.out.println(errorMSG);
		        	data = getIntMax(getMSG, errorMSG, max);
		        }
	        }catch (InputMismatchException e) {
		        scanner.nextLine();
		        System.out.print(errorMSG);
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

	 public static char getChar(String getMSG, String errorMSG, char rule[]) {
	        char data;
	        System.out.print(getMSG);
	        data = scanner.nextLine().charAt(0);
	        boolean checker = false;
	        for (char c : rule) {
	            if(c == data) {
	                checker = true;
	            }
	        }
	        if(!checker) {
	            System.out.println(errorMSG);
	            data = getChar(getMSG, errorMSG, rule);
	        }
	        return data;
	    }

	 public static String getString(String getMSG, String blankMSG) {
	        String data;
	        System.out.print(getMSG);
	        data = scanner.nextLine();
	        if(data.equals("")) {
	            System.out.println(blankMSG);
	            data = getString(getMSG,blankMSG);
	        }
	        return data;
	    }
	 
	 public static double getDouble(String getMSG, String errorMSG) {
		 	        double data;
		 	        System.out.print(getMSG);
			        try {
		 	            data = scanner.nextDouble();
		 	            scanner.nextLine();
		 	        }
		 	        catch (InputMismatchException e) {
		            scanner.nextLine();
		            System.out.println(errorMSG);
		            data = getDouble(getMSG, errorMSG);
		         }
		         return data;
		     }
>>>>>>> origin/master
}