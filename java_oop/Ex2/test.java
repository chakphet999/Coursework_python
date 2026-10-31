package Ex2;
import java.util.Scanner;
public class test {
    static Student[] heestudent;
    static teacher[] heeteacher;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        
        heestudent=new Student[x]; 
        heeteacher=new teacher[x];

        for(int n=0;x>n;n++){
            String c = sc.nextLine();
            String na=sc.nextLine();
            int age=sc.nextInt();
            if (c.equals("t")||c.equals("T")){
                int salaly=sc.nextInt();
                heeteacher[n]=new teacher(na, age, salaly);
            }
            else{
                int level=sc.nextInt();
                heestudent[n]=new Student(na, age, level);
            }
            sc.nextLine();
        }
        calAndPrintAvgAge();

    }


    static public void printAllStudents(){
        for (Student s :heestudent){
            System.out.println(s.name+" "+s.age+" "+s.level);
        }
    }
    static public void printAllTeacher(){
        for (teacher s :heeteacher){
            System.out.println(s.name+" "+s.age+" "+s.salaly);
        }
    }
    static double AgeS = 0;
    static double TS;
    static double TT;
    static double AgeT = 0;
     public static void calAndPrintAvgAge(){
        for (Student s :heestudent){
            if(s != null){
            TT += s.age;
            AgeS++;}
        }
         for (teacher t :heeteacher){
             if(t != null){
            TS += t.age;
            AgeT++;}
         }
        System.out.println("อายุเด็ก : "+TS/AgeS);
        System.out.println("อายุครู : "+TS/AgeT);
    }
    
}
