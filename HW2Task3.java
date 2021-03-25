public class HW2Task3 {

    public static void main(String[] args) {

        int grivna = 10000;
        double grivnaPercent = 0.04d;
        // int years = 5;

        double year1 = grivna * grivnaPercent;
        double year2 = (grivna + year1) * grivnaPercent;
        double year3 = (grivna + year1 + year2) * grivnaPercent;
        double year4 = (grivna + year1 + year2 + year3) * grivnaPercent;
        double year5 = (grivna + year1 + year2 + year3 + year4) * grivnaPercent;

        System.out.println("Накопленная сумма денег за каждый год в течении пяти лет , плюс проценты : ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Накопленная сумма за первый год , плюс годовые проценты    = " + year1);
        System.out.println("Накопленная сумма за второй год , плюс годовые проценты    = " + year2);
        System.out.println("Накопленная сумма за третий год , плюс годовые проценты    = " + year3);
        System.out.println("Накопленная сумма за четвёртый год , плюс годовые проценты = " + year4);
        System.out.println("Накопленная сумма за пятый год , плюс годовые проценты     = " + year5);
    }

}
