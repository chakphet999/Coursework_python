package grab;

public class FlashService extends ParcelService implements Billable{
    public FlashService(double weightInKg){
        super("FlashService", weightInKg);
    }
    @Override
    public double getRatePerKg(){
        return 35;
    }
    @Override
    public double CalculateBill(){
        return weightInKg * getRatePerKg();
    }
    
}
