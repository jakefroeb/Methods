/**
 * Created by jakefroeb on 8/29/16.
 */
public class Painting {
    private int year;
    private boolean inMuseum;
    private String name;
    private String artist;


    public Painting(int year, boolean inMuseum, String name, String artist) {

        this.year = year;
        this.inMuseum = inMuseum;
        this.name = name;
        this.artist = artist;
    }
    public void setYear(int y){
        this.year = y;
            if(y > 2016) this.year = 2016;
    }

    public int getYear(){
        return year;
    }

    public void setInMuseum(boolean i){
        this.inMuseum = i;
    }

    public boolean getInMuseum(){
        return inMuseum;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setArtist(String a){
        this.artist = a;
    }

    public String getArtist(){
        return artist;
    }


}
