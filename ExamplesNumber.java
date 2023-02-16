// import tester.*;

interface Number {
    int numerator();
    int denominator();
    Number add(Number other);
    Number multiply(Number other);
    String toString();
    double toDouble();
  }

class WholeNumber implements Number {
    int n;

    WholeNumber(int n) {
        this.n = n;}

    public int numerator() {
        return this.n;}

    public int denominator() {
        return 1;}

    public Number add(Number other) {if(other instanceof WholeNumber) {return new WholeNumber(other.numerator() + this.n);}
        else if(other instanceof Fraction) {
            return new Fraction((numerator() * other.numerator()) + (denominator() * other.denominator()), this.denominator() * other.denominator());
        }
    return other;
    }

    public Number multiply(Number other) {if(other instanceof WholeNumber) {return new WholeNumber(other.numerator() * this.n);}
        else if(other instanceof Fraction) {
            return new Fraction(numerator() * other.numerator(), denominator() * other.denominator());}
    return other; 
        }

    public String toString() {return n + "";}

    public double toDouble() {return n * 1.0;}
}

class Fraction implements Number {
    int n;
    int d;

    Fraction(int n, int d) { this.n = n; this.d = d; }

    public int numerator() {return this.n;}

    public int denominator() {return this.d;}

    public Number add(Number other) {if(other instanceof WholeNumber) {return new WholeNumber(other.numerator() + this.n);}
    else if(other instanceof Fraction) {
        return new Fraction((numerator() * other.numerator()) + (denominator() * other.denominator()), this.denominator() * other.denominator());
    }
    return other;
}

    public Number multiply(Number other) {if(other instanceof WholeNumber) {return new WholeNumber(other.numerator() * this.n);}
    else if(other instanceof Fraction) {
        return new Fraction(numerator() * other.numerator(), denominator() * other.denominator());}
    return other; 
    }

    public String toString() { return this.n + "/" + this.d;}

    public double toDouble() { return this.n / this.d;}

}

class ExamplesNumber {
    // Exploration
    double sum = 0.1 + 0.2 + 0.3;
    double sum2 = 0.1 + (0.2 + 0.3);

    Fraction oneTenth = new Fraction(1, 10);
    Fraction twoTenth = new Fraction(2, 10);
    Fraction threeTenth = new Fraction(3, 10);

    String sumTest = oneTenth.add(twoTenth).add(threeTenth).toString();
    String sumTest2 = oneTenth.add(twoTenth.add(threeTenth)).toString();
}