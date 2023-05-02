interface motor{
    int capacity=0;
    void run();
    void consume();

}
class WashingMachine implements motor {
    private int capacity;

    public WashingMachine(int capacity) {
        this.capacity = capacity;
    }

    public void run() {
        
    }

    public void consume() {
        
    }

    public int getCapacity() {
        return capacity;
    }
}
public class WashingMachine1{
public static void main(String[] args) {
    WashingMachine myWashingMachine = new WashingMachine(8);
    myWashingMachine.run();
    myWashingMachine.consume();
    int capacity = myWashingMachine.getCapacity();
    System.out.println("The washing machine has a capacity of " + capacity + " kg.");
}
}



