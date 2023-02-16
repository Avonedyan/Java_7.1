import ru.netology.Java7.services.SumService;

public class Main {
    public static void main(String[] args){
        SumService service = new SumService();
        long mySum = service.allSalesSum;
    System.out.println(mySum);
    }
}
