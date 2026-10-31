package grab;


    public class Main {
    public static void main(String[] args) {

        Billable[] services = new Billable[3];

        try {
            services[0] = new EMSService(2.0);
            services[1] = new FlashService(2.0);
            services[2] = new EMSService(-3.0); // จะ error
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // loop แสดงผล
        for (Billable b : services) {
            if (b != null) {
                System.out.println(b.getClass().getSimpleName()
                        + ": " + ((ParcelService) b).weightInKg + " kg → "
                        + b.CalculateBill() + " Baht");
            }
        }
    }
}
