package com.org.personaldev.firstpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTutorial {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner userInput = new Scanner(System.in);
		int testCaseNum = userInput.nextInt();
			int sizeOfSet = userInput.nextInt();
			int nSpaceInt[] = new int[sizeOfSet];
			
			for (int i = 0; i < nSpaceInt.length; i++) {
				nSpaceInt[i]=userInput.nextInt();
			}
			
			userInput.close();
			System.out.println(testCaseNum);
			System.out.println(sizeOfSet);
			for (int i : nSpaceInt) {
				System.out.print("|"+i);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = "";
        while(scan.hasNextLine()){
            s = s + scan.nextLine();
        }
        // Write your code here.
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
