package duplicatevalueinarray;

import java.util.LinkedHashSet;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={111, 333, 555, 777, 333, 444, 555};
		
		
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		for(Integer int1:set)
		{
			System.out.println(int1);
			count++;
		}
		System.out.println("count : " +count);

	}

}
