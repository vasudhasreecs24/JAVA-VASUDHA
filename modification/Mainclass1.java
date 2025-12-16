import java.util.Scanner;
class modification extends Exception{
    public modification(String msg){
    super(msg);
}
}
interface Bank{
    void getdetails();
    void calculateInterest();
    void display();
}
class Canara implements Bank{
    String Name;
    int age;
    String PAN;
    double balance;
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of a person in canara bank");
        Name=sc.nextLine();
        System.out.println("Enter age for person in canarabank");
        age=sc.nextInt();
        System.out.println("Enter PAN");
        PAN=sc.nextLine();
        System.err.println("Enter balance");
        balance=sc.nextDouble();
    }
    public void calculateInterest(){
        double i=balance*0.045;
        balance+=i;
    }
    public void display() throws modification{
        System.out.println(" name of a person in canara bank "+this.Name);
        System.out.println(" age for person in canarabank "+this.age);
        System.out.println(" PAN "+this.PAN);
        System.err.println(" balance "+this.balance);
        if(balance>1000)
        {
            throw new modification("error");
        }
        
    }
}
class SBI implements Bank{
    String FirstName,lastName,Aadhar;
    int age;
    double balance;
    public void getdetails(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter fistnameand last name of a person in sbi bank");
        FirstName=sc1.nextLine();
        lastName=sc1.nextLine();
        System.out.println("Enter age for person in sbibank");
        age=sc1.nextInt();
        System.out.println("Enter Aadhar");
        Aadhar=sc1.nextLine();
        System.err.println("Enter balance");
        balance=sc1.nextDouble();
    }
    public void calculateInterest(){
        double i=balance*0.0525;
        balance+=i;
    }
    public void display() throws modification{
        System.out.println("Firstname is "+this.FirstName+"Last name of a person is "+this.lastName+" in sbi bank ");
        System.out.println("Enter age for person in sbibank "+this.age);
        System.out.println("Enter Aadhar "+this.Aadhar);
        if(balance>1000)
        {
            throw new modification("error");
        }
    }
}
public class Mainclass1{
    public static void main(String args[]) {
        
        int ch;
        Bank c=new Canara();
        Bank s=new SBI();
        Scanner sc2=new Scanner(System.in);
        while (true) { 
            
            System.out.println("1.Enter details 2.calculateInterest 3.display 4.exit");
            System.out.println("Enter your choice ");
            ch=sc2.nextInt();

            switch (ch) {
            

                case 1:System.out.println("Enter bank name either canara or sbi ");
                String n=sc2.next();
                if(n.equalsIgnoreCase("canara")){
                    c.getdetails();
                }
                else{
                    s.getdetails();
                }
                    
                    break;
                case 2:System.out.println("Enter bank name either canara or sbi ");
                String n1=sc2.next();
                if(n1.equalsIgnoreCase("canara")){
                    c.calculateInterest();
                }
                else{
                    s.calculateInterest();
                }break;
                case 3:System.out.println("Enter bank name either canara or sbi ");
                String n3=sc2.next();
                if(n3.equalsIgnoreCase("canara")){
                    c.display();
                }
                else{
                    try{
                    s.display();
                    }catch(modification e){
                        System.out.println("error "+e.getMessage());

                    }
                }
                break;
                case 4: System.exit(0);
                default:
                    System.out.println("Enter valid case");
            }
        }

    }
}
