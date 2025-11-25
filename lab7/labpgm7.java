import java.util.Scanner;
class WrongAge extends Exception{
    public WrongAge(){
        super("Age Error:");
    }
    public WrongAge(String message){
        super(message);
    }
}
class Inputscanner{
    protected static final Scanner s=new Scanner(System.in);
}
class Father extends Inputscanner{
    protected int fatherAge;
    public Father() throws WrongAge{
        System.out.println("Enter father's age:");
        fatherAge=s.nextInt();
        if(fatherAge <0){
            throw new WrongAge("Age cannot be negative");
        }
    }
    public void display(){
        System.out.println("Fathers age: "+fatherAge);
    }
}
class son extends Father{
    private int sonAge;
    public son() throws WrongAge{
        super();
        System.out.println("Enters son's age: ");
        sonAge=Inputscanner.s.nextInt();
        if(sonAge<0){
            throw new WrongAge("Age cannot be negative");
        }else if(sonAge>= fatherAge){
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        }
    }
    public void display(){
        super.display();
        System.out.println("Son's age: "+sonAge);
    }
}
public class labpgm7 {
    public static void main(String args[]){
        try{
            son Son=new son();
            Son.display();
        }
        catch(WrongAge e){
            System.out.println("Error : "+e.getMessage());
        } catch(Exception e){
            System.out.println("Unexcepted error: "+ e.getMessage());
        }
    }
}
