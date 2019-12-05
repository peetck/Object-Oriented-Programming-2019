public class Pigeon extends Bird{
    private static int numberOfPigeon;

    public Pigeon(){
        this(0.0, 0.0, 0.0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon++;
    }
    public void eat(String food){
        if (food.equals("worm")){
            setWeight(getWeight() + 0.5);
        }
        else if (food.equals("seed")){
            setWeight(getWeight() + 0.2);
        }
        else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public String toString(){
        return "Pigeon " + getWeight() + " kg and " + getHeight() + " cm. There are " + Pigeon.numberOfPigeon + " pigeons.";
    }

    public void fly(){
        System.out.println("Fly Fly");
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.25);
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    public void takeOff(){
        System.out.println("Take Off");
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.5);
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
    public void landing(){
        System.out.println("Landing");
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.5);
        }
        else{
            System.out.println("I'm hungry.");
        }
    }
}