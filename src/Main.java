public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        byte a = 15;
        short b = 1115;
        int c = 2204115;
        long d = 1241354314L;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);

        System.out.println("Task2");
        float a1 = 27.12f;
        long  b1 = 987678965549L;
        float c1 = 2.786f;
        boolean d1 = false;
        short e1 = 569;
        short f1 = -159;
        short g1 = 27897;
        byte h1 = 67;

        System.out.println("Task3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        System.out.println("На каждого ученика рассчитано "+ 480/(LP+AS+EA) + " листов бумаги");

        System.out.println("Task4");
        short minutes = 8*20;
        short day1 = 24*60;
        short days = 24*3*60;
        int month = 30*24*60;
        System.out.println("За 20 минут машина произвела бутылок " + minutes + " штук");
        System.out.println("За день машина произвела бутылок " + day1 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + days + " штук");
        System.out.println("За месяц машина произвела бутылок " + month + " штук");

        System.out.println("Task5");
        byte klas = 120/6;
        byte summWhite = 2*20;
        byte summBrown = 4*20;
        System.out.println("В школе, где " + klas + " классов, нужно " + summWhite + " банок белой краски и " + summBrown + " банок коричневой краски");

        System.out.println("Task6");
        float bananas = 5*80;
        float milk = 2*105;
        float icecream = 2*100;
        float eggs = 4*70;
        float sumWheight = (bananas + milk + icecream + eggs)/1000;
        System.out.println("Общий вес спорт-завтрака " + sumWheight + " кг!");

        System.out.println("Task7");
        short dayOnWeight250 = 7000/250;
        short dayOnWeght500 = 7000/500;
        System.out.println("Если терять по 250 грамм в день, то " + dayOnWeight250 + " дней уйдет на похудение");
        System.out.println("Если терять по 500 грамм в день, то " + dayOnWeght500 + " дней уйдет на похудение");
        int middleDays = (dayOnWeght500+dayOnWeight250)/2;
        System.out.println("В среднем для похудения может понадобиться " + middleDays + " день");

        System.out.println("Task8");
        int mariaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mariaNewSalary = (int) (mariaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);
        int mariaSalaryYear = mariaSalary*12;
        int denisSalaryYear = denisSalary*12;
        int kristinaSalaryYear = kristinaSalary*12;
        int mariaNewSalaryYear = mariaNewSalary*12;
        int denisNewSalaryYear = denisNewSalary*12;
        int kristinaNewSalaryYear = kristinaNewSalary*12;
        System.out.println("Маша теперь получает " + mariaNewSalary + " рублей. Годовой доход вырос на " + (mariaNewSalaryYear-mariaSalaryYear) + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisNewSalaryYear-denisSalaryYear) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaNewSalaryYear-kristinaSalaryYear) + " рублей.");




    }
}