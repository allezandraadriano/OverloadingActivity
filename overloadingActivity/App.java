public class App {

    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        System.out.println("The sum of 45 and 62 is " +sum2(45,62) + ".");
        System.out.println("The sum of 55, 234 and 357 is " +sum3(55,234,357) + ".");


        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100) + ".");



       System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8) + ".");

    }

    private static int greaterValue(int a, int b) {

        int f = 0;

        if (a>b){
            f = a;
        }
        else if (a<b){
            f = b;
        }
        return f;
    }

    private static double greaterValue(double a, double b) {

        double f = 0;

        if (a>b){
            f = a;
        }
        else if (a<b){
            f = b;
        }
        return f;
    }
}
