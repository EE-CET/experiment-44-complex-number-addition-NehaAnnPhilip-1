import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // TODO: parameterized constructor Complex(int real, int imag)
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // TODO: Method to add two complex numbers: add(Complex other) returning new Complex
    Complex add(Complex other) {
        int sumReal = this.real + other.real;
        int sumImag = this.imag + other.imag;
        return new Complex(sumReal, sumImag);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read real1, imag1
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        
        // TODO: Read real2, imag2
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        
        // TODO: Create two Complex objects
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        
        // TODO: Add them
        Complex result = c1.add(c2);
        
        // TODO: Print result in "real + imagi" format (e.g., "6 + 8i")
        System.out.println(result.real + " + " + result.imag + "i");
        
        sc.close();
    }
}
