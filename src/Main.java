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
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        //TASK 2
        System.out.println("");
                int[] inputArray2 = {255, 200, 300, 400, 500};
                int nalog = 13;
                double[] outputArray2 = new double[inputArray2.length];

                int index = 0; // Переменная для отслеживания индекса
                for (int value : inputArray2) {
                    outputArray2[index] = (int) Math.round(value * nalog / 100.0);
                    index++; // Увеличиваем индекс на каждой итерации
                }

                System.out.println(Arrays.toString(inputArray2));
                System.out.println(Arrays.toString(outputArray2));
        // TASK 3
        System.out.println("");
        int[] inputArray3 = {2550, 2000, 3000, 4000, 4400};
        int b = 5000;
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int value2:inputArray3) {
            outputArray3[index] = inputArray3[index] > b;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));


            //TASK 4
            System.out.println("");
        int[] inputArray4 = {1500, -200, 3000, -50, 4500};
        boolean allPositive = true;

        for (int val : inputArray4) {
            if (val < 0) {
                allPositive = false;
                break; //
            }
        }

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("Результат (Все >= 0): " + allPositive);

        //TASK 5
        System.out.println("");
        int[] inputArray5 = {1500, -200, 111, 45, -511};

        int count=0;


        for (int value5:inputArray5) {
            if (value5>0){
                count++;
            }
        }
        int [] result={count};
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("result: " + Arrays.toString(result));
    }


}









