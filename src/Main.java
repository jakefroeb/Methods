public class Main {

    public static void main(String[] args) {

            String[] m = new String[2];
                m[0]= "Flea medicine";
                m[1] = "Arthritis medicine";
        Dog dog= new Dog(14, "Chopper", m);

        NFL nfl = new NFL("Tennessee", "Titans", 0, false);

        Painting painting = new Painting(1889, true, "Starry Night", "Van Gogh");

        Shoe shoe = new Shoe(10.5, "Nike", "Dunks", true);

        Food food = new Food(14.76, 9, "Vedgatable", "Peas", true);

        double[][] c= new double[2][2];
            int longitude=0;
            int lattitude=1;
            int store1=0;
            int store2=1;
                c[store1][longitude]=(26.6);
                c[store1][lattitude]=(132.6);
                c[store2][longitude]=(46.8);
                c[store2][lattitude]=(146.7);
            String[] s = new String[6];
                s[0]="Butter Beans";
                s[1]="Black eyed peas";
                s[2]="Mashed potatoes";
                s[3]="Fries";
                s[4]="Sweet Potatoes";
                s[5]="Collard Greens";
        HotChicken chicken = new HotChicken(c, "Princes", s, 2, true);


        painting.changeName("Morning");
    }
}
