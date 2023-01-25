public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        }

    }