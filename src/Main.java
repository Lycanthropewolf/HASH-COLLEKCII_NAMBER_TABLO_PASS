import Passport.Passport;

import static MultiplicationTable.MultiplicationTable.generatePairNumber;
import static MultiplicationTable.MultiplicationTable.getSetTasks;

public class Main {
    public static void main(String[] args) {
        //ДЗ про числа


        //ДЗ про таблицу умножения
        int count = 0;
        while (count < 15) {
            String pairNumber = generatePairNumber();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!getSetTasks().contains(pairNumber) && !getSetTasks().contains(inverseNumber)) {
                getSetTasks().add(pairNumber);
                count++;
            }
        }
        System.out.println(getSetTasks());

// ДЗ про пасспорт
        Passport.addNewPassport(new Passport(44554, " Иванов", "Иван", "Иванович", "14.05.1956"));
        Passport.addNewPassport(new Passport(5363, "Смирнов", "Дмитрий", "Евгеньевич", "30.06.1976"));
        Passport.addNewPassport(new Passport(44554, "Сидоров", "Армэн", "Семеныч", "18.01.1967"));
        Passport.addNewPassport(new Passport(44554, " Какахин", "Валера", "Янович", "10.10.1998"));
        Passport.addNewPassport(new Passport(44554, " Цеханович", "Валерий", "Иванович", "01.07.1999"));


        Passport.printListOfPassports();

        System.out.println(Passport.searchPassport(new Passport(5363,"Смирнов","Дмитрий","Евгеньевич","30.06.1976")));
        System.out.println(Passport.searchPassport(new Passport(5342,"Смирнов","Дмитрий","Евгеньевич","30.06.1976")));
    }
}