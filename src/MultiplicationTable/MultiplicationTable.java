package MultiplicationTable;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private static Set<String> setTasks = new HashSet<>();


    public MultiplicationTable() {

    }

    public static String generatePairNumber() {
        int x;
        int y;
        Random ran = new Random();
        x = ran.nextInt(10);
        y = ran.nextInt(10);
        String pairNumber = x + "*" + y;
        return pairNumber;
    }
    public static Set<String> getSetTasks() {
        return setTasks;
    }
}


    /*public static boolean checkTask(String pairNumber) {
        String invertedPairNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
        for (String task: setTasks){
            if (pairNumber.equals(task)||invertedPairNumber.equals(task)){
                return true;
            }
        }return false;
    }
    public static void generateTasks(){
        setTasks.add(generatePairNumber());
        while (setTasks.size()<COUNT_PUPIL){
            String pairNumber=generatePairNumber();
            while (checkTask(pairNumber)){
                pairNumber=generatePairNumber();
            }
            setTasks.add(pairNumber);
        }
    }
*/

