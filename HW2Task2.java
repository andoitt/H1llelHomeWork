public class HW2Task2 {

    public static void main(String[] args) {

        int [] average = {2,4,6,8,10,11,12,13,14,15};
        int sum = 0;
        double averageResult;
        int n = average.length;

        for (int i = 0; i < n; i++) {
            sum += average[i];


        }

        averageResult = (double)sum/n;

        System.out.println("Среднее арифметическое значение произвольного кол-ва чисел = " + averageResult);
    }

}
