public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(i);
        }

        String[] strArray = {"One", "Two", "Three"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        strArray[1] = "Five";
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");

            }
            System.out.println();
        }
    }
}
