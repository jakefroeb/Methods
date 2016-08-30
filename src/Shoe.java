/**
 * Created by jakefroeb on 8/29/16.
 */
public class Shoe {

    private double size;
    private String brand;
    private String style;
    private boolean isMale;



    public Shoe(double size, String brand, String style, boolean isMale) {

        this.size = size;
        this.brand = brand;
        this.style = style;
        this.isMale = isMale;

    }
    public void setSize(double s){
        this.size = s;
    }

    public double getSize(){
        return size;
    }

    public void setBrand(String b){
        this.brand = b;
    }

    public String getBrand(){
        return brand;
    }

    public void setStyle(String s){
        this.style = s;
    }

    public String getStyle(){
        return style;
    }

    public boolean checkSize(){
        return size < 7;
    }

    public void setIsMale(boolean i){
        this.isMale = i;
            if(checkSize()) {
                this.isMale = false;
            }
    }

    public boolean getIsMale(){
        return isMale;
    }
}


