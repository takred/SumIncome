import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCalculationSum {
    private Map<String, Integer> usersData;
    public MapCalculationSum(List<Income> usersData){
        this.usersData = new HashMap<>();
        for (int i = 0; i < usersData.size(); i++) {
            this.usersData.put(usersData.get(i).getName(), 0);
        }
        for (int i = 0; i < usersData.size(); i++) {
            Income income = usersData.get(i);
            this.usersData.put(income.getName(), this.usersData.get(income.getName()) + income.getSum());
        }
    }
    public Map<String, Integer> getUsersData(){
        return usersData;
    }
    public void setUsersData(Map<String, Integer> usersData){
        this.usersData = usersData;
    }
    public void printAllSum(){
        for (Map.Entry<String, Integer> entry : usersData.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue() + "р");
        }
    }
}
