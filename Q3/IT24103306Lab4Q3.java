import java.util.Scanner;

	public class IT24103306Lab4Q3 {
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Input number");
int num=scanner.nextInt();
String message;

message = (num==0)? "This number is zero" : (num<0)? "This number is : negative" : "This number is : possitive";
System.out.println(message);
	}
}

