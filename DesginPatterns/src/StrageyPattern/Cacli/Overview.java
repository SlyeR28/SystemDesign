package StrageyPattern.Cacli;

public class Overview {
    public static void main(String[] args) {
          Caculator caculator = new Caculator();

          caculator.setOperations(new Add());
        System.out.println(caculator.executeOperation(5 ,10));

        caculator.setOperations(new Substract());
        System.out.println(caculator.executeOperation(20 ,14));

        caculator.setOperations(new Multiply());
        System.out.println(caculator.executeOperation(12, 12));
    }
}
