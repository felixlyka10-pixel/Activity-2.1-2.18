package helloworld.variables;

public class DemoVariables8 {
    public static void main(String[] args) {
        int intNo = 296;
        short shortNo = 19;
        long longNo = 1234567876543L;
        int value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
        int poly = (2 * 5 * 5) + (3 * 5) + 7;
        int num1 = 1, num2 = 2, num3, num4;

        System.out.println("The int is " + intNo);
        System.out.println("The short is " + shortNo);
        System.out.println("The long is " + longNo);

        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        modulus = value1 % value2;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulus is " + modulus);
        System.out.println("The value of the second-degree polynomial is " + poly);

        num3 = ++num2;
        num4 = num1++;
        num3++;

        System.out.println("The value of num1 is " + num1);
        System.out.println("The value of num2 is " + num2);
        System.out.println("The value of num3 is " + num3);
        System.out.println("The value of num4 is " + num4);
    }
}
