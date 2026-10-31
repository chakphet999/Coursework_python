package t2;

public class Triangle extends Shape{
    double base;
    double height;
    public Triangle(String color,double base,double height){
        super(color);
        this.base = base;
        this.height = height;
    }
    public Triangle(){
        super();
        this.base = 0.0;
        this.height = 0.0;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    @Override
    public String toString(){
        return "Triangle[base="+base+",height="+height+",Shape[color="+super.getColor()+"]]";
    }

    public double getArea(double base, double height){
        this.base = base;
        this.height = height;
        return 0.5*base*height;
    }
}
