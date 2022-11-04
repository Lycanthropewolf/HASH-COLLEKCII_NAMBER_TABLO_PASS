package Passport;

import java.util.ArrayList;
import java.util.List;

public class PassportList {

    private static List<Passport> listOfPassports = new ArrayList<Passport>();



    public static void addNewPassport(Passport newPassport) {
        boolean checkNewPassport = true;
        for (Passport passport : listOfPassports) {
            if (passport.equals(newPassport)) {
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
            if (passport.equals(searchPassport)) {
                System.out.println(" Данный паспорт содержится в списке");
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

    public static List<Passport> getListOfPassports() {
        return listOfPassports;
    }

    public static void setListOfPassports(List<Passport> listOfPassports) {
        PassportList.listOfPassports = listOfPassports;
    }


}
