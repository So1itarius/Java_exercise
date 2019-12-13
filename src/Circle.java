public class Circle implements GetSq{
      String name = "circle";
      Double radius;

      public Double get() {
            return this.radius*this.radius*3.14;
      }
      public String getName(){
            return this.name;
      }
}
