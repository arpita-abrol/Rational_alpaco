//Arpita Abrol,  Niels Graham
//APCS1 pd10
//HW32 -- Irrationality Stops Here
//2015-11-18

public class Rational {
    
    //instance vars
    private int numerator;
    private int denominator;

    
    //default constructor
    public Rational() {
	numerator = 0;
	denominator = 1;
    }

    //overloaded constructor
    public Rational(int a, int b){
	if (b == 0){
	    numerator = 0;
	    denominator = 1;
	} else {
	    numerator = a;
	    denominator = b;
	}
    }
	    
	    
    
    //mutators
    public void setNum( int num ) {
	numerator = num;
    }

    public void setDen( int num ) {
	denominator = num;
    }

    
    //Methods

    //string representation of num as fraction
    public String toString() {
	return numerator + "/" + denominator;
    }

    //return as a floating point 
    public static float floatValue(Rational num){
	return (float)num.numerator/num.denominator;
    }
    
    //multiply
    public void multiply( Rational num ) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Num;
	this.denominator = num1Den * num2Den;
    }

    //divide
    public void divide( Rational num) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Den;
	this.denominator = num1Den * num2Num;
    }


    //main method
    public static void main( String[]args ) {
	Rational bob = new Rational();
	Rational emma = new Rational();
	Rational kevin = new Rational(4, 9);
	Rational Jimbo = new Rational(2, 7);
	emma.setNum(10);
	bob.setNum(3);
	bob.setDen(5);
	System.out.println( emma + "\n" + bob);
	emma.multiply( bob );
	System.out.println( emma );
	System.out.println(floatValue(emma));
	System.out.println( kevin + "\n" + Jimbo);
	kevin.divide(Jimbo);
	System.out.println(kevin);
	
    }
    
}//end class
