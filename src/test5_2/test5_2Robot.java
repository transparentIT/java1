package test5_2;

import test5_2.*;

public class test5_2Robot {
    public static void main(String[] args) {
        // создаем объекты
        Table table = new Table();

        // стулья
        table.chair1 = new Chair(1);
        table.chair2 = new Chair(2);
        table.chair3 = new Chair(3);

        // тарелки
        table.chair1.plate = new Plate(1);
        table.chair2.plate = new Plate(2);
        table.chair3.plate = new Plate(3);

        // баки с едой
        Eat soup = new Eat(Eat.EatType.SOUP, 1100);
        Eat entree = new Eat(Eat.EatType.ENTREE, 1100);
        Eat dessert = new Eat(Eat.EatType.DESSERT, 550);
        Eat dinner_is_over = new Eat(Eat.EatType.DINNER_IS_OVER, 1);

        // ждем пока все сядут на стулья
        while (true) {
            if (!table.chair1.isEmpty() && !table.chair2.isEmpty() && !table.chair3.isEmpty()) {
                break;
            }
        }

        // определяем кто где сидит (свойство person класса Chair)
        table.chair1.detectPerson();
        table.chair2.detectPerson();
        table.chair3.detectPerson();

        while (true) {
            if (table.chair1.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, dinner_is_over, table, table.chair1);
            }
            if (table.chair2.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, dinner_is_over, table, table.chair2);
            }
            if (table.chair3.plate.isEmpty()) {
                getEatAndFillPlate(soup, entree, dessert, dinner_is_over, table, table.chair3);
            }

            // условие окончания обеда
            if (table.chair1.isEmpty() && table.chair2.isEmpty()) {
                //обед закончен
                break;
            }
        }
    }

    public static void getEatAndFillPlate (Eat soup, Eat entree, Eat dessert, Eat dinner_is_over, Table table, Chair chair) {
        // определяем следующее блюдо
        Eat.EatType eatType = chair.person.nextEatType();
        Eat eat = Eat.selectEatByType(eatType, soup, entree, dessert, dinner_is_over);
        // получаем количество еды
        double quantity = eat.getEat(chair.person.eatQuantity(eatType));
        if (chair.plate.volume < quantity) {
            quantity = chair.plate.volume;
        }
        // даём команды роботу
        Command.getEat(eatType, quantity);
        Command.fillPlate(chair.plate, table, chair);
        // устанавливаем переменную: что ел только что человек
        chair.person.lastEatType = eatType;
    }
}
