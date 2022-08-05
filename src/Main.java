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
        boolean years = ((year % 4 == 0) && (year %100 != 0) || (year % 400 == 0));
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
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Доставка для Вас займет двое суток");
        } else if ((deliveryDistance >= 60) && (deliveryDistance <= 100)) {
            System.out.println("Доставка для Вас займет трое суток");
        } else {
            System.out.println("Извините, доставка невозможна");
        }
        System.out.println();

        System.out.println("Задание 5");
        int monthNumber = 3;

       switch (monthNumber) {
           case 1:
               System.out.println("Январь. Месяц принадлежит к сезону зима");
               break;
           case 2:
               System.out.println("Феврвль. Месяц принадлежит к сезону зима");
               break;
           case 3:
               System.out.println("Март. Месяц принадлежит к сезону весна");
               break;
           case 4:
               System.out.println("Апрель. Месяц принадлежит к сезону весна");
               break;
           case 5:
               System.out.println("Май. Месяц принадлежит к сезону весна");
               break;
           case 6:
               System.out.println("Июнь. Месяц принадлежит к сезону лето");
               break;
           case 7:
               System.out.println("Июль. Месяц принадлежит к сезону лето");
               break;
           case 8:
               System.out.println("Август. Месяц принадлежит к сезону лето");
               break;
           case 9:
               System.out.println("Сентябрь. Месяц принадлежит к сезону осень");
               break;
           case 10:
               System.out.println("Октябрь. Месяц принадлежит к сезону осень");
               break;
           case 11:
               System.out.println("Ноябрь. Месяц принадлежит к сезону осень");
               break;
           case 12:
               System.out.println("Декабрь. Месяц принадлежит к сезону зима");
           default:
               System.out.println("Такого месяца нет");
       }




    }
}