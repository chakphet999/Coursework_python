package t2;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color,double length,double width){
        super(color);
        this.length = length;
        this.width =width;
        
    }
    public Rectangle(){
        super();
        this.length = 0.0;
        this.width = 0.0;
    }
    @Override 
    public double getArea(){
        return length*width;
    }
    @Override
    public String toString() {
      return "Rectangle[length="+length+", width="+width+",Shape[color="+super.getColor()+"]]";
   }

   public double getArea(double length, double width){
    this.length = length;
    this.width =width;
    return length*width;
   }
}
