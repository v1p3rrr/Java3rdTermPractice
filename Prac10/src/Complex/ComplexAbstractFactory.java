package Complex;

import Complex.Complex;

public interface ComplexAbstractFactory {
    public Complex createComplex();

    public Complex createComplex(int real, int image);
}
