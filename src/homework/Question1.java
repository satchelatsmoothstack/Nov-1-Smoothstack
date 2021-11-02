package homework;

public class Question1 
	{
	
	public static void loop1() 
		{
		String star="*";
		for (int i=0; i<6; i++)
			{
			if (i==0)
				{
			System.out.println("1)");
				}	
			else if (i==5) 
				{
			System.out.println(".........");	
				}
			else 
				{
			System.out.println(star);
			star=star+'*';
				}
			}
		}
	
	public static void loop2()	
		{
		String star="*";
		for (int i=0; i<6; i++)
			{
			if (i==0)
				{
			System.out.print("2)");
				}	
			else if (i==1) 
				{
			System.out.print("..........");	
				}
			else 
				{
				for(int j=0; j<6-i; j++)
					{
					System.out.print(star);
					}
			
				}	
			System.out.println();
			}
			
		}
	
	public static void loop3() 
		{
		String star="*";
		for (int i=0; i<6; i++)
        	{
			if (i==0)
				{
				System.out.println("3)");
				}
			else if(i==5) 
				{
				System.out.println("...........");
				}
			else
				{
				for (int j=7-i; j>1; j--)
					{
					System.out.print(" ");
					}
				System.out.println(star);
                star=star+"**";
				}
        	}
		}
	public static void loop4() 
		{
		int k=-2;
        for (int i = 0; i <= 7; i++)
        	{
            if (i==0)
            	{
            	System.out.print("4)");
            	}
        	else if (i==1)
        		{
        		System.out.print("............");
        		}
        	else 
        		{
        		for (int j = 0; j < i; j++)
            		{
        			System.out.print(" ");
            		}
        		for (int j = 0; j < 9-i-k; j++)
            		{
        			System.out.print("*");
            		}  
        		}
        	System.out.println();
        	k++;
        	}
		}
        
 
        
        
	public static void main(String[] args) 
		{
		loop1();
		loop2();
		loop3();
		loop4();
		}
	}
				
			

			
	

