package Complex;

import Complex.Complex;

public class MainComplex {
    public MainComplex(){
    }

    public static void main(String[] args) {
        ComplexAbstractFactory factory;
        factory = new ConcreteFactory();
        Complex first = factory.createComplex(1,3);
        Complex second = factory.createComplex();
        System.out.println(first + "; " + second);
        second.sum(first);
        first.sum(second);
        System.out.println(first + "; " + second);
        Complex third = factory.createComplex(-1, -8);
        first.sum(third);
        System.out.println(first);
        int a = 2; int b = -1;
        a=a+b;
        System.out.println(a);

    }
}
