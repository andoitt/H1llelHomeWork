public class AverageTwoNumbers {
    public static void main(String[] args) {

            int sum = 0;
            int average = 0;

            for (String str : args){
                System.out.println(str);
                int i = Integer.valueOf(str);
                sum = sum + i;
                average = sum / 2;

            }

            System.out.println("Среднее арифметеское двух чисел  = " + average);
        }
    }
