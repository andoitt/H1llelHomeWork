public class HW2Task1 {
    public static void main(String[] args) {

            int sum = 0;
            int average = 0;

            for (String str : args){
                System.out.println(str);
                int i = Integer.valueOf(str);
                sum = sum + i;
                average = sum / 5;


            }

            System.out.println("Среднее арифметеское по заданным в ручную параметрам (2,4,6,8,10) = " + average);
        }
    }


