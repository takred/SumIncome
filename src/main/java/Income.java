public class Income {
    private final String name;
    private final int sum;
    public Income(String name, int sum){
        this.name = name;
        this.sum = sum;
    }

    public String getName(){
        return name;
    }
    public int getSum(){
        return sum;
    }
//    public void plusSum(int sum){
//        this.sum = this.sum + sum;
//    }
}
