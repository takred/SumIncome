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
            boolean userSumContainsName = false;
            Income userDataIncome = usersData.get(i);
            for (int j = 0; j < usersSum.size(); j++) {
                Income userSumIncome = usersSum.get(j);
                if (userDataIncome.getName().equals(userSumIncome.getName())){
                    userSumContainsName = true;
                    break;
                }
            }
            if (!userSumContainsName){
                usersSum.add(new Income(userDataIncome.getName(), 0));
            }
        }
        for (int i = 0; i < usersSum.size(); i++) {
            for (int j = 0; j < usersData.size(); j++) {
                Income userSumIncome = usersSum.get(i);
                Income userDataIncome = usersData.get(j);
                if (userSumIncome.getName().equals(userDataIncome.getName())){
//                    userSumIncome.plusSum(userDataIncome.getSum());
                    usersSum.set(i, new Income(userSumIncome.getName(),userSumIncome.getSum() + userDataIncome.getSum()));
                }
            }
        }
        for (int i = 0; i < usersSum.size(); i++) {
            System.out.println(usersSum.get(i).getName() + " - " + usersSum.get(i).getSum() + "р");
        }
    }
}
