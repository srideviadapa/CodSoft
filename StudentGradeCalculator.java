import java.util.Scanner;
class StudentGradeCalculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of subjects "+"\t");
		int sub = sc.nextInt();
		System.out.println();
		System.out.println("Enter Your Marks");
		int marks[]=new int[sub];
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		float avg_per = (sum/sub);
		if(avg_per>=90)
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade A\t\n",sum,avg_per);
		else if(avg_per>=80)
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade B\t\n",sum,avg_per);
		else if(avg_per>=70)
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade C\t\n",sum,avg_per);
		else if(avg_per>=60)
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade B\t\n",sum,avg_per);
		else if(avg_per>=50)
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade D\t\n",sum,avg_per);
		else
			System.out.printf("\nMarks - %d\tAverage - %2.1f\twith grade E\t\n",sum,avg_per);


	}
}