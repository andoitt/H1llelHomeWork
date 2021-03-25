public class AverageRandomNumbers {

    public static void main(String[] args) {

        double sum = 0;
        double average = 0d;

        for (String str : args){
            System.out.println(str);
            int i = Integer.valueOf(str);
            sum = sum + i;
            average = sum / args.length;

        }

        System.out.println("Среднее арифметеское по заданным в ручную параметрам  = " + average);
    }
}
