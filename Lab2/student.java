import java.util.Scanner;
public class student{
     public static void main(String  args[]) {
     String name;
     int roll;
     
    double mark;
    char grade;

    Scanner reader=new Scanner(System.in);
    System.out.print("Enter Name:");
    name=reader.nextLine();
    System.out.print("Enter Roll number:");
    roll=reader.nextInt();
    
    System.out.print("Enter mark:");
    mark=reader.nextDouble();
    System.out.print("Enter grade:");
    grade=reader.next().charAt(0);
    System.out.print("Enter branch:");
    branch=reader.next().toCharArray();
    
     System.out.println("\n Student Details");
     System.out.print("Name:"+name+"\nRoll number:"+roll+"\nStudentmark:"+mark+"\nGrade:"+grade+"\nBranch:");
	for(int i=0;i<branch.length;i++)
	{
		System.out.print(branch[i]);
	}
}
}