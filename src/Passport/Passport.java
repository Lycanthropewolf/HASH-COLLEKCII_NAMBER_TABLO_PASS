package Passport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Passport {
    private final int number;
    private String surname;
    private String name;
    private String patronymic;
    private String dataOfBirth;
    private static List<Passport> listOfPassports = new ArrayList<Passport>();

    public Passport(int number, String surname, String name, String dataOfBirth) {
        this(number, surname, name, null, dataOfBirth);
    }

    public Passport(int number, String surname, String name, String patronymic, String dataOfBirth) {
        if (number <= 0) {
            throw new RuntimeException(" Номер паспорты должен быть больше ноля");
        } else {
            this.number = number;
        }
        if (surname == null || surname.isEmpty() || surname.isBlank()) {
            throw new RuntimeException(" Введите кокрректое имя!");
        } else {
            this.surname = surname;
        }
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new RuntimeException(" Ввeдите корректное имя!");
        } else {
            this.name = name;
        }
        this.patronymic = patronymic;
        if (parseDate(dataOfBirth) == null) {
            System.out.println(" Введите дату рождения в формате \"dd.mm.yyyy\"");
        } else {
            this.dataOfBirth = dataOfBirth;
        }


    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd.mm.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static void addNewPassport(Passport newPassport) {
        boolean checkNewPassport = true;
        for (Passport passport : listOfPassports) {
            if (passport.getNumber() == newPassport.getNumber()) {
                passport.setName(newPassport.getName());
                passport.setSurname(newPassport.getSurname());
                passport.setPatronymic(newPassport.getPatronymic());
                passport.setDataOfBirth(newPassport.getDataOfBirth());
                checkNewPassport = false;
                break;
            }

        }
        if (checkNewPassport) {
            listOfPassports.add(newPassport);
        }
    }


    public static Passport searchPassport(Passport searchPassport) {
        for (Passport passport : listOfPassports) {
            if (passport.getNumber() == searchPassport.getNumber()) {
                return searchPassport;
            }
        }
        System.out.println(" Данный паспорт не найден");
        return null ;
    }


    public static void printListOfPassports() {
        System.out.println(" полный перечень паспортов");
        for (Passport passport : listOfPassports) {
            System.out.println(passport);
        }
    }


    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public static List<Passport> getListOfPassports() {
        return listOfPassports;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public static void setListOfPassports(List<Passport> listOfPassports) {
        Passport.listOfPassports = listOfPassports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return number == passport.number && surname.equals(passport.surname) && name.equals(passport.name) && patronymic.equals(passport.patronymic) && dataOfBirth.equals(passport.dataOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, surname, name, patronymic, dataOfBirth);
    }

    @Override
    public String toString() {
        if (patronymic == null) {

            return "Паспорт № " + number +
                    " - " + surname + " " +
                    " " + name + " (" + dataOfBirth + ")";
        } else {
            return "Паспорт № " + number +
                    " - " + surname + " " +
                    " " + name + " " + patronymic + " (" + dataOfBirth + ")";
        }
    }
}
