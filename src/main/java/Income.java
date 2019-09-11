public class Income {
    private String name;
    private int sum;
    public Income(String name, int sum){
        this.name = name;
        this.sum = sum;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSum(){
        return sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
    public void plusSum(int sum){
        this.sum = this.sum + sum;
    }
}
