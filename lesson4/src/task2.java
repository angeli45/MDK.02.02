import java.util.ArrayList;
import java.util.HashMap;

public class task2 {
    public static void main(String[] args){
        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>(2);
        january.add(1);
        january.add(7);
        stateHolidays.put("Январь",january);
        ArrayList<Integer> february = new ArrayList<>(2);
        february.add(23);
        stateHolidays.put("Февраль",february);
        ArrayList<Integer> march = new ArrayList<>(2);
        march.add(8);
        stateHolidays.put("Март",march);
        ArrayList<Integer> may = new ArrayList<>(2);
        may.add(1);
        may.add(9);
        stateHolidays.put("Май",may);
        ArrayList<Integer> june = new ArrayList<>(2);
        june.add(12);
        stateHolidays.put("Июнь",june);
        ArrayList<Integer> november = new ArrayList<>(2);
        november.add(4);
        stateHolidays.put("Ноябрь",november);
        System.out.println(stateHolidays);
    }
}
