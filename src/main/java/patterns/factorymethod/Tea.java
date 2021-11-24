package patterns.factorymethod;

public class Tea {
    public static void main(String[] args) {
        Coffee coffe;
        if(type == "Decaf") {
            coffe = new Decaf();
        } else if (type == "ColdBrew") {
            coffe = new ColdBrew();
        }
        ...
        ...
    }
}
