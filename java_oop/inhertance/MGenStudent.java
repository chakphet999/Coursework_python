package inhertance;

public class MGenStudent extends MGenCard{
    public int discount = 20;

    public MGenStudent(String name){
        super(name);
     }
     public void buyTicket(Cinema c,int num){
        super.buyTicket(c,num);
        
     }
    
}
