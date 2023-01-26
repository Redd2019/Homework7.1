public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
    }