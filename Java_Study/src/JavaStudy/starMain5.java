package JavaStudy;

public class starMain5 {
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i!=0)
			{
				for(int j=0;j<5;j++)
				{
					if(i>j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
