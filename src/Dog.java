/**
 * Created by jakefroeb on 8/29/16.
 */
public class Dog {
    private int age;
    private String name;
    private String medicines[];


    public Dog(int age, String name, String[] medicines){
        this.age = age;
        this.name = name;
        this.medicines = medicines;
    }


    public void setAge(int a){
        this.age = a;
            if(age < 0) {
                this.age = 0;
            }
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setMedicines(String[] m){
        this.medicines = m;
    }

    public String[] getMedicines(){
        return medicines;
    }
}
