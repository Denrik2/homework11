public class Main {
    public static int calculatingYear(int year) {
        System.out.println("Задание №1");
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год — високосный год");
            } else System.out.println(year + " год — невисокосный год");
        } else System.out.println(year + " год — невисокосный год");
        return year;
    }

    public static int definingVersion(int[] model) {
        System.out.println("Задание №2");
        int clientDeviceYear = model[1];
        int clientOS = model[0];
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
        return clientOS;
    }

    public static int calculationOfDeliveryDays(int distance) {
        System.out.println("Задание 3");
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("доставки нет");
        }
        return distance;
    }
    public static void main(String[] args) {
        int year = 2000;
        calculatingYear(year);
        int[] model = new int[] {0, 2008};
        definingVersion(model);
        int distance = 95;
        calculationOfDeliveryDays(distance);
    }
}