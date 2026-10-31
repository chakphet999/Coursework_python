package tem;

public class Thermometer {
    double celsius;
    public void checkTemperature(double celsius){
        
        if (this.celsius<0 || this.celsius>50){
            throw new IllegalArgumentException("Temperature out of safe range: " + celsius);
    
        }
        else{
            System.out.println("Temperature is OK: " + celsius);
        }
    }
}

