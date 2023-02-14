package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int result = euler2.calculate(896847);
        System.out.println(result);
    }

    int calculate(int limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        int temp;
        int sum = 0;

        do {
            temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            if (secondNumber % 2 == 0) {
                sum = sum + secondNumber;
            }
        } while (secondNumber < limit);

        return sum;
    }
}
