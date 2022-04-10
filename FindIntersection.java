package day6;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
	
	public void getIntersection(int[] a, int[] b)
	{
		getIntersectionUsingSet(a,b);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println("Intersection of 2 array is: " +a[i]);
				}
			}
		}
	}
	
	
	public static void getIntersectionUsingSet(int[] a, int[] b)
	{
		
		Set<Integer> intSet = new HashSet<Integer>();
		
		Set<Integer> intSet2 = new HashSet<Integer>();
	
		Set<Integer> resSet = new HashSet<Integer>();
	
		for(int n : a)
			intSet.add(n);
	
		for(int n : b)
			intSet2.add(n);
	
		for(int n : b)
		{
			if(intSet.contains(n))
			resSet.add(n);
		}
		System.out.println(resSet);
		
	}
	
	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		getIntersectionUsingSet(a,b);
	}


}
