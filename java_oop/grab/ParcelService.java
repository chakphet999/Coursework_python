package grab;

public abstract class ParcelService {
    String serviceName;
    double weightInKg;

    public ParcelService(String serviceName,double weightInKg){
        if (weightInKg<=0){
            throw new IllegalArgumentException("Invalid weight: " + weightInKg);
        }
        this.serviceName = serviceName;
        this.weightInKg = weightInKg;
    }
    public abstract double getRatePerKg();
    
}