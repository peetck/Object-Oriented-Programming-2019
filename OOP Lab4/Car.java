public class Car extends Vehicle{
    private String typeEngine;

    public void setTypeEngine(String t){
        this.typeEngine = t;
    }
    public String getTypeEngine(){
        return this.typeEngine;
    }
    public void showCarInfo(){
        System.out.print("Car engine is " + getTypeEngine() + ".");
        System.out.println("Fuel is " + getFuel() + " litre and Top Speed is " + getTopSpeed() + " m/s.");
    }
    public void setCarInfo(int s, String t, String y){
        setFuel(s);
        setTopSpeed(t);
        setTypeEngine(y);
    }
    public void move(){
        int fuel = getFuel();
        if (fuel >= 50){
            System.out.println("Move.");
            setFuel(fuel - 50);
        }
        else{
            System.out.println("Please add fuel.");
        }
    }
}