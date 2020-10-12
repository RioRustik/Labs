package fraction;

public class Fraction {
    int numerator, denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString(){
        return this.numerator+"/"+this.denominator;
    }

    public void sum(Fraction sum){
        if(this.denominator != sum.denominator){
            System.out.println(new Fraction(this.numerator * sum.denominator + this.denominator*sum.numerator,this.denominator* sum.denominator));
        }
        else System.out.println(new Fraction(this.numerator+ sum.numerator, this.denominator));
    }
    public void sum(int x){
        this.sum(new Fraction(x,1));
    }

    public void minus (Fraction minus){
        if(this.denominator != minus.denominator){
            System.out.println(new Fraction(this.numerator * minus.denominator - this.denominator*minus.numerator,this.denominator* minus.denominator));
        }
        else System.out.println(new Fraction(this.numerator - minus.numerator, this.denominator));
    }
    public void minus(int x){
        this.minus(new Fraction(x,1));
    }

    public void multiply (Fraction multiply){
        System.out.println(new Fraction(this.numerator * multiply.numerator,this.denominator * multiply.denominator));
    }
    public void multiply(int x){
        this.multiply(new Fraction(x,1));
    }
    public void split (Fraction split){
        System.out.println(new Fraction(this.numerator * split.denominator,this.denominator * split.numerator));
    }
    public void split(int x){
        this.split(new Fraction(x,1));
    }



}
