package homeWork.HW2;

public class Hw2_3 {
    public static void main(String[] args) {

       double summPiastras =12345;
       double numberOfShipCrew = 10;

       double shipOwner = summPiastras/2;
       double shipCaptain = (summPiastras-shipOwner)/2;
       double dolePerPirate = (summPiastras-shipOwner-shipCaptain)/numberOfShipCrew;

       System.out.println("Владелец корабля получит: " + shipOwner);
       System.out.println("Капитан корабля получит: " + shipCaptain);
       System.out.println("Каждый член команды получит: " + dolePerPirate);


        double totalDistributedLoot = shipOwner + shipCaptain + dolePerPirate*numberOfShipCrew;

        if (totalDistributedLoot == summPiastras) {
            System.out.println("\nПроверка прошла успешно! Дележ правильный.");
        } else {
            System.out.println("\nОшибка! Сумма дележа не соответствует общей добыче.");
        }
    }
}

/*Задача №3

Создать программу дележа добычи на пиратском корабле.
По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
остальное делится поровну между всеми членами команды, включая капитана.

Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.

Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

Дополнительное задание со звездочкой
Попробовать придумать как программа может проверить правильность дележа.
*/