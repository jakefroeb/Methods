/**
 * Created by jakefroeb on 8/29/16.
 */
public class HotChicken {

    private double coordinates[][];//trying to inpust coordinates of different stores in 2 dimensional array
        int longitude=0;
        int lattitude=1;
        int store1=0;
        int store2=1;
    private String name;
    private String sides[];
    private int stores;
    private boolean isHot;



    HotChicken(double[][] coordinates, String name, String[] sides, int stores, boolean isHot){
        this.coordinates = coordinates;
        this.name = name;
        this.sides = sides;
        this.stores = stores;
        this.isHot = isHot;

    }

    public void setCoordinates(double[][] c){
        this.coordinates = c;
    }

    public double[][] getCoordinates(){
        return coordinates;
    }

    public void setName(String n){
        this.name = n;
            if(isHot = false) {
                this.name = "Hattie B's";
            }
    }

    public String getName(){
        return name;
    }

    public void setSides(String[] s){
        this.sides = s;
    }

    public String[] getSides(){
        return sides;
    }

    public void setStores(int st){
        this.stores = st;
    }

    public int getStores(){
        return stores;
    }

    public void setIsHot(boolean h){
        this.isHot = h;
    }

    public boolean getIsHot(){
        return isHot;
    }
}
