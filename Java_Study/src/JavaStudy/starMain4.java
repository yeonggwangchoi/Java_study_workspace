package JavaStudy;

public class starMain4 {
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for(int j=0;j<4;j++)
			{
				if(j+i>3)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
