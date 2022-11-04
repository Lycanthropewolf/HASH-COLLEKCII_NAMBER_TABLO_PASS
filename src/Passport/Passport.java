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
        if (dataOfBirth == null||dataOfBirth.isEmpty()||dataOfBirth.isBlank()) {
            System.out.println(" Введите дату рождения в формате \"dd.mm.yyyy\"");
        } else {
            this.dataOfBirth = new SimpleDateFormat("dd.mm.yyyy").toString();
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
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
