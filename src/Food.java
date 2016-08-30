/**
 * Created by jakefroeb on 8/29/16.
 */
public class Food {
    private double temperature;
    private int amount;
    private String type;
    private String name;
    private boolean isHealthy;


    Food(double temperature, int amount, String type, String name, boolean isHealthy){
        this.temperature = temperature;
        this.amount = amount;
        this.type = type;
        this.name = name;
        this.isHealthy = isHealthy;
    }

    public void setTemperature(double t){
        this.temperature = t;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setAmount(int a){
        this.amount = a;
    }

    public int getAmount(){
        return amount;
    }

    public void setType(String t){
        this.type = t;
    }

    public String getType(){
        return type;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setHealthy(boolean h){
        this.isHealthy = h;
            if(type == "junk food") {
                this.isHealthy = false;
            }
    }

    public boolean getHealthy(){
        return isHealthy;
    }
}
