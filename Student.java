interface Student{
public int add(int a,int b);


public int sub(int a,int b);


}
public class Studentimp implements Student{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
public class StudentMain extends Studentimp{
    public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter 1st num");
int a=sc.nextInt();
System.out.println("enter 2nd num");
int b=sc.nextInt();

add(a,b);
sub(a,b);

    }

    

}
