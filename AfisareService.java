
public class AfisareService {


    public void afisare(String... values) {// 1 ;  1,2,3 ; new String[]{1,2,3}
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
