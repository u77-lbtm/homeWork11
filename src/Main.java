import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TASK 1
        int inputArray1[] = {8, 15, 16, 32, 42};
        int max = inputArray1[0];
        int min = inputArray1[0];
        double sum = 0;

        for (int num : inputArray1) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double average = sum / inputArray1.length;
        double outputArray1[] = {sum, max, min, average};
        System.out.println(Arrays.toString(outputArray1));
        //TASK 2
        System.out.println("");
        int inputArray2[] = {255, 200, 300, 400};
        int nalog = 13;
        int[] outputArray2 = new int[inputArray2.length];
        for (int index = 0; index < inputArray2.length; index++) {
            outputArray2[index] = (int) Math.round(inputArray2[index] * nalog / 100);
        }
            // TASK 3
            System.out.println("");
            int[] inputArray3 = {2550, 2000, 3000, 4000};
            int b = 5000;
            boolean[] outputArray3 = new boolean[inputArray3.length];
            for (int i = 0; i < inputArray3.length; i++) {
                outputArray3[i] = inputArray3[i] > b;
            }
            //TASK 4
            System.out.println("");
            int[] inputArray4 = {1500, -200, 3000, -50, 4500};
                 boolean[] outputArray4 = new boolean[inputArray4.length];

                    for (int i = 0; i < inputArray4.length; i++) {
                        outputArray4[i] = inputArray4[i] >= 0;
                    }
                    System.out.println("inputArray4:  " + Arrays.toString(inputArray4));
                    System.out.println("outputArray4: " + Arrays.toString(outputArray4));
        //TASK 5
        System.out.println("");
        int[] inputArray5 = {1500, -200, 111, 45, -511};

        boolean[] outputArray5 = new boolean[5];


        for (int i = 0; i < inputArray5.length; i++) {
            outputArray5[i] = inputArray5[i] > 0;
        }

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    }


}









