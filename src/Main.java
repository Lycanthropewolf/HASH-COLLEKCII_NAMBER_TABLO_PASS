import Passport.Passport;

import java.util.*;

import static MultiplicationTable.MultiplicationTable.generatePairNumber;
import static MultiplicationTable.MultiplicationTable.getSetTasks;
import static Passport.PassportList.*;

public class Main {
    public static void main(String[] args) {
        //ДЗ про числа
        Set<Integer> numbers = new HashSet<>();
        int a = 1000;
        while (numbers.size() < 20) {
            int random = (int) (Math.random() * a);
            numbers.add(random);

        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            var integer = iterator.next();
            if (integer % 2 != 0) {
                iterator.remove();

            }
        }
        System.out.println(numbers + " ");

        //ДЗ про таблицу умножения
        int count = 0;
        while (count < 15) {
            String pairNumber = generatePairNumber();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!getSetTasks().contains(pairNumber) && !getSetTasks().contains(inverseNumber)) {
                getSetTasks().add(pairNumber);
                System.out.println();
                count++;
            }

        }
        System.out.println(getSetTasks());

// ДЗ про пасспорт
        Passport passport1 = new Passport(44554, " Иванов", "Иван", "Иванович", "14.12.1956");
        Passport passport2 = new Passport(5363, "Смирнов", "Дмитрий", "Евгеньевич", "30.06.1976");
        Passport passport3 = new Passport(445231, "Сидоров", "Армэн", "Семеныч", "18.01.1967");
        Passport passport4 = new Passport(44554, " Какахин", "Валера", "Янович", "10.10.1998");
        Passport passport5 = new Passport(444, " Цеханович", "Валерий", "Иванович", "01.07.1999");
        addNewPassport(passport1);
        addNewPassport(passport2);
        ;
        addNewPassport(passport5);
        printListOfPassports();
        searchPassport(passport1);


    }

}