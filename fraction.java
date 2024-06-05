public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString()
    {
        if (this.denominator==0) return "Дробь задана неверно";

        if (this.numerator==0) return "0";

        return this.numerator+"/"+this.denominator;
    }

    public void reduction()
    {
       int maxFind=Math.min(this.numerator,this.denominator)/2;

       for(int i=2;i<maxFind;)
       {
           if((this.numerator%i==0) &&(this.denominator%i==0))
           {
               this.denominator/=i;
               this.numerator/=i;
               maxFind/=i;

           }
           i=(i==2)?3:i+2;

       }
    }

    public fraction sum(fraction f)
    {
       int resultDenominator=this.denominator * f.denominator;

       int resultNumerator=this.numerator*f.denominator+this.denominator* f.numerator;

       fraction result=new fraction(resultNumerator,resultDenominator);
       result.reduction();

       return result;
    }

    public static void main(String[] args) {
        fraction f1=new fraction(5,15);
        fraction f2=new fraction(7,8);

        System.out.println(f1.toString()+" + "+f2.toString()+" = " + f1.sum(f2).toString());
    }
}
