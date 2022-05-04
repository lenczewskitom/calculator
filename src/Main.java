class Calculator {

    public int A = 10;
    public int B = 5;

    public void addNumbers() {
        System.out.println("A + B = " + (A + B));
    }

    public void substractNumbers() {
        System.out.println("A - B = " + (A-B));
    }
}
public class Main {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();

        calculator1.addNumbers();
        calculator1.substractNumbers();

    }
}