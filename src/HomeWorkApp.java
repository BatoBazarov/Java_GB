public class HomeWorkApp {
    public static void main (String [] args) {
        printThreeWords();
        checkSumSign();
        printCol();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("sum is positive");
        } else {
            System.out.println("sum is negative");
        }
    }

    public static void printCol() {
        int value = 101;
        if (value <=0) {
            System.out.println("red");
        } if (value>0 && value<100) {
            System.out.println("yellow");
        } if (value>100) {
            System.out.println("green");
        }
    }

    public static void compareNumbers() {
        int a = 40;
        int b = 40;
        if  (a>=b) {
            System.out.println("a>=b");
        } if (a<b) {
            System.out.println("a<b");
        }
    }

}
