import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    public static void task1() {
        System.out.println("Задание 1");
        int finalSum = 0;
        int numberOfMonths = 1;
        while (finalSum < 2459000) {
            finalSum = (int) ((finalSum + 15000) + (finalSum * 0.01));
            numberOfMonths++;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + finalSum + " рублей.");
        }
        }

    public static void task2() {
        System.out.println("Задание 2");
           int a = 1;
           for (;a <= 10;a++) {
               System.out.print(a + " ");
           }
        System.out.println();
           int b = 11;
           while (b>1){
               b--;
               System.out.print(b + " ");
           }
        System.out.println();
        }

        public static void task3(){
            System.out.println("Задание 3");
            int population = 12000000;
            int birth = 17;
            int deaths = 8;
            for (int a=1; a<11; a++) {
                int populationGrowth = (int) (population*(birth/(double)1000) - population*(deaths/(double)1000));
                population = population + populationGrowth;
                System.out.println("Год " + a + ", численность населения составляет " + population);
            }
        }

        public static void task4() {
            System.out.println("Задание 4");
            double sum = 15_000;
            int a=1;
            while (sum < 12_000_000) {
                sum = sum + sum * 0.07;
                System.out.println("Месяц " + a + " ,сумма накоплений " + sum);
                a++;
            }
    }

    public static void task5() {
        System.out.println("Задание 5");
        double sum = 15_000;
        int a=1;
        while (sum < 12_000_000) {
            sum = sum + sum * 0.07;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + " ,сумма накоплений " + sum);
                a++;
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        double sum = 15_000;
        int a = 1;
        DecimalFormat decimalFormat = new DecimalFormat();
        while (a < 100) {
            sum = sum + sum * 0.07;
            if (a % 6 == 0) {
                System.out.println("Месяц " + a + " ,сумма накоплений " + decimalFormat.format(sum));
                a++;
            }
        }
    }
    public static void task7() {
            System.out.println("Задание 7");
            int friday = 4;
            while (friday < 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }

        }

    public static void task8() {
        System.out.println("Задание 8");
        int now = 2023;
        int past = now - 200;
        int future = now + 100;
        for (int a=past; a<future; a++) {
            if (a % 79 ==0) {
                System.out.println(a);
            }
        }
    }
    }