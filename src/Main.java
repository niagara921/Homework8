public class Main {
    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printMessageLeapYear(boolean isLeap, int year) {
        if (isLeap) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " Год не является високосным");
        }


    }

    public static void printMessageClientVersion(int clientOs, int clientDeviceYear) {
        if (clientOs != 0 && clientOs != 1 || clientDeviceYear < 2000) {
            System.out.println("Переданы неверные параметры");
            return;
        }
        String message = "Установите обычную версию для Android";
        if (clientOs == 0) {
            message = message.replace("Android", "iOS");
        }
        if (clientDeviceYear < 2015) {
            message = message.replace("обычную", "лайт");
        }
        System.out.println(message);
    }

    public static int calculateDeliveryTime(int distance) {
        if (distance > 0 && distance < 20) {
            return 1;
        } else if (distance >= 20 && distance < 60) {
            return 2;
        } else if (distance >= 60 && distance < 100) {
            return 3;
        }else {
            throw new IllegalArgumentException("Доставка больше 100 км не производится");
        }
    }
    public static void printMessageDeliveryDays(int days){
        System.out.printf("Потребуется %s дня(дней) для доставки", days);
    }


    public static void main(String[] args) {
        int year = 2022;
        printMessageLeapYear(isLeap(year), year);

        //  Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2013;
        printMessageClientVersion(clientOS, clientDeviceYear);

        // Задача 3

        int deliveryDistance = 95;
        int days = calculateDeliveryTime(deliveryDistance);
        printMessageDeliveryDays( days);
    }
}