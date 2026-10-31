package date;

public class TestSimpleDate {
    public static void main(String[] args) {

        SimpleDate a = new SimpleDate();
        SimpleDate b = new SimpleDate(29, 13, 2024);
        b.nextDay();

        System.out.println("Object a ID: " + a.getId());
        System.out.println("a: " + a);

        System.out.println("Object b ID: " + b.getId());
        System.out.println("b: " + b);

        if(SimpleDate.isLeapYear(b.getYear())) {
            System.out.println(b.getYear() + " is leap year");
        } else {
            System.out.println(b.getYear() + " is not leap year");
        }
    }
}