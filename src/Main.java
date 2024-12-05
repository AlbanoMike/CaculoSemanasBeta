import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <ArrayListArrayList> void main(String[] args) {
        String[] daysWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        List<String> DaysWeekList = Arrays.asList(daysWeek);
        List<String> ListFinal = new ArrayList<>();
        String n = null;
        int s= 0;
        int k =3;

        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < daysWeek.length; j++) {
                ListFinal.add(DaysWeekList.get(j));
            }
        }
        for (int i = 0; i <= (k+s) ; i++) {
            n = ListFinal.get(i);
        }
        System.out.println(n);
    }
}