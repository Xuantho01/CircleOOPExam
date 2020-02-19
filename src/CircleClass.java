public class CircleClass {
   private String color;
   private double radius;

   public CircleClass(){}
   public CircleClass(double radius, String color){
      this.radius = radius;
      this.color = color;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea(){
      return Math.PI*Math.pow(radius,2);
   }

   @Override
   public String toString(){
      return "Circle with color "+getColor()
              + " and Area = " +getArea();
   }
}
