import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Income> usersData = new ArrayList<Income>();
        usersData.add(new Income("Матвей", 342));
        usersData.add(new Income("Илья", 591));
        usersData.add(new Income("Константин", 787));
        usersData.add(new Income("Матвей", 399));
        usersData.add(new Income("Фёдор", 519));
        usersData.add(new Income("Фёдор", 827));
        usersData.add(new Income("Матвей", 111));
        usersData.add(new Income("Константин", 34));
        usersData.add(new Income("Илья", 1048));
        usersData.add(new Income("Фёдор", 912));
        usersData.add(new Income("Матвей", 783));
        usersData.add(new Income("Илья", 1935));
        usersData.add(new Income("Константин", 268));
        CalculationSum calculationSum = new CalculationSum(usersData);
        calculationSum.printAllSum();
    }
}
