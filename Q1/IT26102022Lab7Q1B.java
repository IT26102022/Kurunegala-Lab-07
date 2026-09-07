import java.util.Scanner;
public class IT26102022Lab7Q1B
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in);
		int mark1,mark2,mark3,mark4,sum,StCount;
		StCount=1;
		double avg;
		
	while (StCount<=3)
		{
		
			System.out.println("Student "+StCount );

			System.out.print("Enter subject marks: ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			sum=(mark1+mark2+mark3+mark4);
			avg=(sum/4.0);
			System.out.println("average is :" + avg);
			
			if (avg>=75)
			{
				System.out.println("Overall grade is : Distinction");
			}
			else if (avg>=50)
			{
				System.out.println("Overall grade is : credit");
			}
			else
			{
				System.out.println("Overall grade is : fail");
			}
				StCount++;
		}
		
	}
}