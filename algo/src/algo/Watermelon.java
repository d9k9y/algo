package algo;

import java.util.Scanner;

/*
 * http://codeforces.com/problemset/problem/4/A
 */
public class Watermelon {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ns = sc.nextLine();
		
		int i = Integer.parseInt(ns);
		
		if(i!=2 && i%2==0 ){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
