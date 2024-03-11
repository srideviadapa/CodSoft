import java.util.Scanner;
import java.lang.Math;
class NumberGame
{
	public static void main(String args[])
	{
		int min=0;
		int max=100;
		int score=0;
		int echo=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\tWelcome to The Number_Game\n");
		System.out.println("\tYou will be having 3 Prospects To Guess the Number\n");
		System.out.print("\tPress 1 to Start the Game - ");
		int start = sc.nextInt();
		if(start==1)
		{
			while(echo>0)
			{
				for(int i=0;i<3;i++)
				{
					System.out.print("Guess The Number - \t");
					int guess=sc.nextInt();
					System.out.print("\nThe Generated Random Number is -");
					int x=(int)(Math.random()*(max-min+1)+min);
					if(x<guess)
						{
							System.out.println("Too Low\n");
						}
					else if(x==guess)
						{
							System.out.println("Correct Guess\n");
							score+=1;
						}
					else if(x>guess)
						{
							System.out.println("Too High\n");
						}
					else{}
				}
				System.out.println("Do You Want to Play Again ??");
				System.out.print("\nIf So Press 1 - ");
				int replay = sc.nextInt();
				System.out.println();
				if(replay==1)
				{
					echo--;
				}
				else
				{
					System.out.println("Thank You!!");
					break;
				}
			}
			System.out.println("Your Score - "+score);
		}
	}
}