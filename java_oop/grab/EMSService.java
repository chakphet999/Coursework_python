package grab;

public class EMSService extends ParcelService implements Billable{
    public EMSService(double weightInKg){
        super("EMSService", weightInKg);
    }
    @Override
    public double getRatePerKg(){
        return 50;
    }
    @Override 
    public double CalculateBill(){
        return weightInKg * getRatePerKg();
    }
}
