package Class_6;

import java.util.Scanner;

public class Class6_Rectangle {
	
	void calculateArea(int length , int breadth){
		int area = length* breadth;
		System.out.println("Area of the rectangle is: "+ area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class6_Rectangle rect = new Class6_Rectangle();
		Scanner s1 = new Scanner(System.in);
		int l = s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		rect.calculateArea(l,b);

	}

}
