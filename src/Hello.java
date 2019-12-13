import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//java -jar a.jar
public class Hello {
    static public void main(String[] argv){
        //System.out.println("Hello word");
        Circle c1 = new Circle();c1.radius = 3.0;
        Circle c2 = new Circle();c2.radius = 5.0;
        Circle c3 = new Circle();c3.radius = 7.345;

        Rectangle r1 = new Rectangle(); r1.side_1 = 3.0; r1.side_2 = 4.0;
        Rectangle r2 = new Rectangle(); r2.side_1 = 7.0; r2.side_2 = 2.0;

        ArrayList <GetSq> arr = new ArrayList<>();
        arr.add(c1);arr.add(c2);arr.add(c3);
        arr.add(r1);arr.add(r2);
        //System.out.println(getSq(arr));
        getInfo(arr);

    }
    public static double getSq(ArrayList<GetSq> a){
        double ret = 0.0;
        for (GetSq ob: a){
            ret += ob.get();
        }
        return ret;
    }
    public static void getInfo(ArrayList<GetSq> a){

        HashMap<String,Integer> hmbase = new HashMap<>();
        for (GetSq ob: a){
            if (hmbase.containsKey(ob.getName()))
            {
                hmbase.put(ob.getName(),(hmbase.get(ob.getName())+1));
            }
            else {hmbase.put(ob.getName(),1);}
        }
        for (String key : hmbase.keySet()){
                 System.out.printf("%s= %s\n", key, hmbase.get(key));
             }
    }

}
