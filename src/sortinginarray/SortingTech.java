package sortinginarray;

public class SortingTech {

	public static void main(String[] args) {
		int[] a = {0,1,1,0,1,1,1,0,0,1,1,0,1,4,6,88,9};
		
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i] + ",");
		}
			
	}

}
