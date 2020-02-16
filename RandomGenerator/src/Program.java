/**
 * Created by melle_000 on 2015-11-17.
 */
public class Program {
    public static void main(String args[]) {

        int z,i,min=100,max=0;

        for(int j = 0;j < 1000;j++) {
            z = 0;
            for(i = 0;z <= 100;i++) {
                z = z + (int)(Math.random() * 10 + 1);
            }
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);

        stront poep = new stront();
    }
}
