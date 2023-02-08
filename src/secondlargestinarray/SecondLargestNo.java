package secondlargestinarray;

public class SecondLargestNo
{

	public static void main(String[] args)
	{
	
				int a[]={1,5,8,9,42,12,62};
				int temp;
				for(int i=0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]<a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}	
				
					}
				}
				System.out.println("Second largest Number :"+a[1]);
					
		}
			
}
