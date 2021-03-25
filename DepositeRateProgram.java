public class DepositeRateProgram {

    public static void main(String[] args) {

        double grivnaDeposit = 10000;
        double percent = 0.04d;
        double perYearPercent;

        for (int year = 1; year <= 5 ; year++) {
             grivnaDeposit += grivnaDeposit * percent;

            System.out.println("За " + year + " год, У Вас накопилась " + grivnaDeposit + " сумма гривны");

            perYearPercent = (grivnaDeposit + grivnaDeposit*percent) - grivnaDeposit;
            System.out.println("За " + year + " год, Вы получили " + perYearPercent + " накопленной прибыли про проценту");

        }
    }
}
