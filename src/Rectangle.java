public class Rectangle implements GetSq{
    String name = "rectangle";
    Double side_1;
    Double side_2;


    public Double get() {
        return this.side_1*this.side_2;
    }
    public String getName(){
        return this.name;
    }
}
