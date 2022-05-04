public class lesson3 {

    public static void main(String[] args) {
        IntegerArray();
        fillArray();
        changeArray();
        fillDiagonal();
        twoArguments(5,8);
    }

    public static void IntegerArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println("Exercise 1");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "-" + arr[i] + " ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        System.out.println("\nExercise 2");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i] + " ");
        }
    }

    public static void changeArray() {
        System.out.println("Exercise 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.println(arr[i] + "");
            }
        }
    }


    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        System.out.println("Exercise 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr [i][i]=1;
                arr [i][5-i-1]=1;
            System.out.print("[" + arr [i][j] +"]" + "");
            }
            System.out.println();
        }
    }
    public  static  void  twoArguments ( int len , int initialValue ) {
        int[] arr = new int[len];
        System.out.println("Exercise 5");
        for (int i = 0; i < len; i++) {
            arr [i] = initialValue;
            System.out.println("[" + i + "]" + arr [i] + "");
        }
    }
}







