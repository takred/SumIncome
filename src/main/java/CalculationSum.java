import java.util.ArrayList;
import java.util.List;

public class CalculationSum {
    private List<Income> usersData;
    public CalculationSum(List<Income> usersData){
        this.usersData = usersData;
    }
    public List<Income> getUsersData(){
        return usersData;
    }
    public void setUsersData(List<Income> usersData){
        this.usersData = usersData;
    }
    public void printAllSum(){
        List<Income> usersSum = new ArrayList<Income>();
        usersSum.add(new Income(usersData.get(0).getName(), 0));
        for (int i = 0; i < usersData.size(); i++) {
            int counter = 0;
            for (int j = 0; j < usersSum.size(); j++) {
                if (usersData.get(i).getName().equals(usersSum.get(j).getName())){
                    counter++;
                }
                if (j == usersSum.size() - 1 && counter == 0){
                    usersSum.add(new Income(usersData.get(i).getName(), 0));
                }
            }
        }
        for (int i = 0; i < usersSum.size(); i++) {
            for (int j = 0; j < usersData.size(); j++) {
                if (usersSum.get(i).getName().equals(usersData.get(j).getName())){
                    usersSum.get(i).plusSum(usersData.get(j).getSum());
                }
            }
        }
        for (int i = 0; i < usersSum.size(); i++) {
            System.out.println(usersSum.get(i).getName() + " - " + usersSum.get(i).getSum() + "р");
        }
    }
}
