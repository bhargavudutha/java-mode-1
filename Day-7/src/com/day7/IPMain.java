package com.day7;

import java.util.Scanner;

public class IPMain {
	 public  static int ipValidator(String ip) {
		String[] stringArray = ip.split("[.]");
		boolean status = true;
		for(int i=0;i<stringArray.length;i++) {
			if((Integer.parseInt(stringArray[i])<0 || Integer.parseInt(stringArray[i])>255))
				status = false;
		}
		if(status==true) 
			return 1;
		else 
			return -1;
		
	}
 public static void main(String[] args)
 {
	 System.out.println("enter ip address");
   Scanner sc =new Scanner(System.in);
	String IPAddress = sc.nextLine();
	int result = ipValidator(IPAddress);
	if(result ==1)
		System.out.println("Valid");
	else 
		System.out.println("Invalid");
			sc.close();
			

}
}
