import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Income> usersData = List.of(
        new Income("Матвей", 342),
        new Income("Илья", 591),
        new Income("Константин", 787),
        new Income("Матвей", 399),
        new Income("Фёдор", 519),
        new Income("Фёдор", 827),
        new Income("Матвей", 111),
        new Income("Константин", 34),
        new Income("Илья", 1048),
        new Income("Фёдор", 912),
        new Income("Матвей", 783),
        new Income("Илья", 1935),
        new Income("Константин", 268));
        CalculationSum calculationSum = new CalculationSum(usersData);
        MapCalculationSum mapCalculationSum = new MapCalculationSum(usersData);
        calculationSum.printAllSum();
        mapCalculationSum.printAllSum();
    }
}
