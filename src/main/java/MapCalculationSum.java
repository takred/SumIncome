import java.util.*;

public class MapCalculationSum {
    private Map<String, Integer> totalIncomes;
    public MapCalculationSum(List<Income> incomes){
        this.totalIncomes = new LinkedHashMap<>();
        for (int i = 0; i < incomes.size(); i++) {
            Income income = incomes.get(i);
            if (!this.totalIncomes.containsKey(incomes.get(i).getName())) {
                this.totalIncomes.put(income.getName(), 0);
            } else {
                this.totalIncomes.put(income.getName(), this.totalIncomes.get(income.getName()) + income.getSum());
            }
        }
    }
    public void printAllSum(){
        for (Iterator<Map.Entry<String, Integer>> iterator = totalIncomes.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue() + "р");
        }
    }
}
