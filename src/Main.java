import static MultiplicationTable.MultiplicationTable.generatePairNumber;
import static MultiplicationTable.MultiplicationTable.getSetTasks;

public class Main {
    public static void main(String[] args) {
        int count=0;
        while (count<15){
            String pairNumber=generatePairNumber();
            String inverseNumber= pairNumber.charAt(2)+"*"+pairNumber.charAt(0);
            if (!getSetTasks().contains(pairNumber)&& !getSetTasks().contains(inverseNumber)){
                getSetTasks().add(pairNumber);
                count++;
            }
        }
        System.out.println(getSetTasks());


    }
}