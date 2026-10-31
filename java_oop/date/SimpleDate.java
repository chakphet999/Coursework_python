package date;

public class SimpleDate {
    private int day;
    private int month;
    private int year;
    private int id;
    private static int counter = 0;

    public SimpleDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
        counter++;
        this.id = counter;
    }

    public SimpleDate(){
        this.day = 1;
        this.month = 1;
        this.year = 2000;
        counter++;
        this.id = counter;
    }
    public void nextDay(){
        if (month ==4 || month ==6 || month ==9|| month == 11 ){
            if (day == 30){
            day = 1;
            month++;
            }
        }else if (month == 2){
            if (isLeapYear(year)){
                if (day == 29){
                    day = 1;
                    month++;
                }
            }
            else{
                if (day ==28){
                    day = 1;
                    month++;
                }
            }
        }
        else{
            if (day ==31){
                day = 1;
                month++;
            }
        }
        if (month > 12){
            month = 1;
            year++;
        }
        
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public int getId(){
        return this.id;
    }

    public void setDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public static boolean isLeapYear(int year){
        return year % 4 ==0;
    }
    
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }

}
