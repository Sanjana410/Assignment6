package Class_6;

public class Complex_No {
	int real;
	int imag;
	Complex_No()
	{
		
	}
	
	Complex_No(int real,int imag)
	{
		this.real = real;
		this.imag = imag;
	}
	void plus(Complex_No c1,Complex_No c2)
	{
		int c3= c1.real + c2.real;
		int c4 = c1.imag + c2.imag;
		System.out.println("Complex no is :"+ c3 +"+"+ c4+"i");
	}
	void multiply(Complex_No c1,Complex_No c2)
	{
		int c5 = c1.real*c2.real;
		int c6 = c1.imag*c2.imag;
		System.out.println("Complex no is :"+ c5+"+"+c6+"i");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex_No c1 = new Complex_No(3,5);
		Complex_No c2 = new Complex_No(2,4);
		Complex_No c3 = new Complex_No();
		c3.plus(c1, c2);
		c3.multiply(c1, c2);
		

	}

}
