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
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


// Task 3
        System.out.println("Task 3");
        int year = 1881;

        if (year > 1584 && (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


//        if (year > 1584) {
//            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//                System.out.println(year + " год является високосным");
//            } else {
//                System.out.println(year + " год не является високосным");
//            }
//        } else {
//            System.out.println("Год должен быть больше 1585");
//        }

// Task 4
        System.out.println("Task 4");

        int deliveryDistance = 95; // Дистанция до клиента в километрах
        int deliveryDays;

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryDays = 1; // Доставка в пределах 20 км занимает сутки
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2; // Доставка в пределах от 20 км до 60 км
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3; // Доставка в пределах от 60 км до 100 км
        } else {
            deliveryDays = 0; // Свышу 100 км доставка отсутствует
            System.out.println("Доставка невозможна, расстояние превышает 100 км.");
        }


        System.out.println("Потребуется дней: " + deliveryDays);


        //Task 5
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - принадлежит сезону Зима");
                break;
            case 2:
                System.out.println("Февраль - принадлежит сезону Зима");
                break;
            case 3:
                System.out.println("Март - принадлежит сезону Весна");
                break;
            case 4:
                System.out.println("Апрель - принадлежит сезону Весна");
                break;
            case 5:
                System.out.println("Май - принадлежит сезону Весна");
                break;
            case 6:
                System.out.println("Июнь - принадлежит сезону Лето");
                break;
            case 7:
                System.out.println("Июль - принадлежит сезону Лето");
                break;
            case 8:
                System.out.println("Август - принадлежит сезону Лето");
                break;
            case 9:
                System.out.println("Сентябрь - принадлежит сезону Осень");
                break;
            case 10:
                System.out.println("Октябрь - принадлежит сезону Осень");
                break;
            case 11:
                System.out.println("Ноябрь - принадлежит сезону Осень");
                break;
            case 12:
                System.out.println("Декабрь - принадлежит сезону Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}