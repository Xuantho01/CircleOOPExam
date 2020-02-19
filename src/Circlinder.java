public class Circlinder extends CircleClass {
     private double height;
     public Circlinder(){}
     public Circlinder(double radius,String color, double height ){
          setColor(color);
          setRadius(radius);
          this.height = height;
     }
     public void setHeight(double height){
         this.height = height;
     }
     public double getHeight(){
         return height;
     }
     public double getAreaOfCirclinder(){
         return getArea()*height;
     }
     @Override
    public String toString(){
         return "dien tich hai mawt day la: "
                 +super.toString()
                 + "\narea:  "
                 +getAreaOfCirclinder();
     }
}
