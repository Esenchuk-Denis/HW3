public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 2
        System.out.println("Task 2");
        int clientOs = 0;
        int clientDeviceYear = 2013;
        if (clientOs == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

// Task 3
        System.out.println("Task 3");
        int year = 2004;

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1585");
        }

// Task 4
        System.out.println("Task 4");
        int deliveryDistance = 101;
        int day = 0;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 3;
            System.out.println("Потребуется дней: " + day);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}