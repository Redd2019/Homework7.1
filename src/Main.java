public class Main {
    public static void main(String[] args) {
        task1();
    }


    public static void task1() {
        int finalSum = 0;
        int numberOfMonths = 1;
        while (finalSum < 2459000) {
            finalSum = (int) ((finalSum + 15000) + (finalSum * 0.01));
            numberOfMonths++;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + finalSum + " рублей.");
        }
        }

    }