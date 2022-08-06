public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2010;
        if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 != 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();

        System.out.println("Задание 3");

        int year = 2200;
        boolean years = (year % 4 == 0 && year %100 != 0 || year % 400 == 0);
        if (years){
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
        System.out.println();

        System.out.println("Задание 4");
        int deliveryDistance = 150;
        if (deliveryDistance < 20) {
            System.out.println("Доставка для Вас займет сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка для Вас займет двое суток");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка для Вас займет трое суток");
        } else {
            System.out.println("Извините, доставка невозможна");
        }
        System.out.println();

        System.out.println("Задание 5");
        int monthNumber = 8;

       switch (monthNumber) {
           case 1:
           case 2:
           case 12:
               System.out.println("Месяц принадлежит к сезону зима");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Месяц принадлежит к сезону весна");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Месяц принадлежит к сезону лето");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Месяц принадлежит к сезону осень");
               break;
           default:
               System.out.println("Такого месяца нет.");
       }
        System.out.println();

        System.out.println("Задание 6");

        int age = 25;
        int salary = 50000;

        double limit = 1;
        if (age >= 23) {
            limit = 3;
        } else if (age < 23) {
            limit = 2;
        }
        double maxLimit = 1;
        if (salary >= 50000 && salary < 80000) {
            maxLimit = 1.2;
        } else  if (salary >= 80000) {
            maxLimit = 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * limit * maxLimit ) + " рублей");
        System.out.println();

        System.out.println("Задание 7");
        int age1 = 25;
        int salary1 = 60000;
        int wantedSum = 300000;
        double baseRate0 = 0.1;
        double baseRate;
        if (age1 < 23) {
            baseRate = 0.01;
        } else if ((age1 >= 23) && (age1 < 30)) {
            baseRate = 0.005;
        } else {
            baseRate = 0;
        }
        double baseRate2;
        if (salary1 > 80000) {
            baseRate2 = 0.007;
        } else {
            baseRate2 = 0;
        }
        double maxBase = baseRate0 + baseRate - baseRate2;
        double maxPayment = salary1 * 0.5;
        System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей.");
        double payment = (wantedSum * maxBase + wantedSum) / 12;
        System.out.println("Платеж по кредиту составит: " + payment + " руюлей.");
        if (maxPayment > payment) {
            System.out.println("Кредит одобрен");
        } else {
            System.out.println("Вам отказано в кредите");
        }
    }
}