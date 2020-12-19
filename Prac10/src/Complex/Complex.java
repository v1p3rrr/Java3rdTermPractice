package Complex;

public class Complex {
    int real;
    int image;

    public Complex(){
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image){
        this.real = real;
        this.image = image;
    }

    public int real(){
        return this.real;
    }

    public int image(){
        return this.image;
    }

    public void sum(Complex c){
        this.real = this.real + c.real();
        this.image = this.image + c.image();
    }

    @Override
    public String toString() {
        if (image>0) return (real + "+" + image +"i");
        else if (image<0) return (real + "" + image + "i");
        else return (""+real);
    }
}
