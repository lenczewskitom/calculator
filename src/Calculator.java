public class Calculator {

    public int A = 10;
    public int B = 5;

    public void addNumbers() {
        System.out.println("A + B = " + (A + B));
    }

    public void substractNumbers() {
        System.out.println("A - B = " + (A-B));
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.addNumbers();
        calculator.substractNumbers();

    }
}
