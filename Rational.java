//Arpita Abrol,  Vincent Liok
//APCS1 pd10
//HW33 -- Do You Even Add, Bro?
//2015-11-19

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

    //return rational as a floating point 
    public static float floatValue(Rational num){
	return (float)num.numerator/num.denominator;
    }
    
    //multiply rationals
    public void multiply( Rational num ) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Num;
	this.denominator = num1Den * num2Den;
    }

    //divide rationals
    public void divide( Rational num ) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Den;
	this.denominator = num1Den * num2Num;
    }

    //add rationals
    public void add( Rational num ) {
	int num1Num = this.numerator * num.denominator;
	int num1Den = this.denominator * num.denominator;
	int num2Num = num.numerator * this.denominator;
	int num2Den = num.denominator * this.denominator;
	this.numerator = (num1Num + num2Num);
	this.denominator = num1Den;
	this.reduce();
    }

    //subtract rationals
    public void subtract( Rational num ) {
	int num1Num = this.numerator * num.denominator;
	int num1Den = this.denominator * num.denominator;
	int num2Num = num.numerator * this.denominator;
	int num2Den = num.denominator * this.denominator;
	this.numerator = (num1Num - num2Num);
	this.denominator = num1Den;
	this.reduce();
    }

    //returms min of two nums
    public static int max(int a, int b){
	if (a > b){
	    return a;
	}
	else{
	    return b;
	}
    }

    //returns max of two nums
    public static int min(int a, int b){
	if (a < b){
	    return a;
	}
	else{
	    return b;
	}
    }

    //uses Euclid's algorithim to find GCD
    public static int gcd(int a, int b){
	if ((a == 0) || (b == 0)){
	    return 0;
	}
	int min = min(a,b);
	int max = max(a,b);
	if ((max % min)==0){
	    return min;
	}
	else{
	    return gcd(min,(max % min));
	}
    }


    //reduces a rational--rational given in params
    public static void reduce( Rational number ) {
	int num = number.numerator;
	int den = number.denominator;
	int theGCD = gcd(num, den);
	num = num / theGCD;
	den = den / theGCD;
	number.numerator = num;
	number.denominator = den;
    }

    //reduces a rational--no params needed (use this)
    public void reduce() {
	int num = this.numerator;
	int den = this.denominator;
	int theGCD = gcd(num, den);
	num = num / theGCD;
	den = den / theGCD;
	this.numerator = num;
	this.denominator = den;
    }


    //main method
    public static void main( String[]args ) {
	Rational bob = new Rational(1,3);
	Rational emma = new Rational(2,6);
	Rational kevin = new Rational(1,9);
	Rational jimbo = new Rational(3,6);
	Rational alex = new Rational(2,4);
	Rational emily = new Rational(3,4);
	System.out.println( bob + "\n" + emma + "\n" + kevin + "\n" + jimbo );
	bob.add(emma);
	System.out.println( "bob + emma = " + bob);
	emma.subtract(kevin);
	System.out.println( "emma - kevin = " + emma);
	jimbo.reduce();
	System.out.println( jimbo );
	reduce(alex);
	System.out.println( alex );
    }
    
}//end class
