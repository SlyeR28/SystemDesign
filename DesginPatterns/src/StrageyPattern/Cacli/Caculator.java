package StrageyPattern.Cacli;

public class Caculator {
    private Operations operations;

    public Caculator() {
    }

    public Caculator(Operations operations) {
        this.operations = operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public int executeOperation(int a , int b){
        return operations.buildRoute(a , b);
    }

}
