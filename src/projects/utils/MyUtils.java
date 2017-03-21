package projects.utils;

import projects.impl.Foititis;
import projects.mainClasses.Askisi1;

public class MyUtils 
{
	public static int seqSearch (int[] a, int key) 
	{
		for (int i=0; i<a.length; i++) 
		{
			if (a[i] == key) 
			{
				return i;
			}
		}
		return -1; 
	}
		 
	// Seiriaki anazitisi me pedio to Eponymo (kleidi typou String). 
	public static int seqSearch (Foititis[] f, String key)  
	{
		for (int i=0; i< Askisi1.studentNo; i++)
		{
			if (f[i].getEpitheto().equals(key))
			{
				return i; 
			}
		}
		return -1;
	}
	//Seiriaki anazitisi me pedio to AM (kleidi typou int). 
	public static int seqSearch (Foititis[] f, int key) 
	{
		for (int i=0; i< Askisi1.studentNo; i++)
		{
		   	  if (f[i].getAM() == key)
		   	  {
		   		  return i; 
		   	  }
		}
		return -1;
	}
	 
	 /** Dyadiki anazitisi me pedio to Eponymo (kleidi typou String). 
	  * 
	  * @param f
	  * @param key
	  * @return
	  */
	public static int binSearch (Foititis[] f, String key) 
	{
		int left=0, right=Askisi1.studentNo-1; 
		return b_search(f, key, left, right);
	} 
	 
	private static int b_search (Foititis[] f, String key, int left, int right) 
	{
		int mid, pos=-1;
		while (pos==-1 && left<=right) 
		{
			mid = (left+right)/2;
			if (f[mid].getEpitheto().compareTo(key) > 0)
			{
			  	   right = mid-1;
			}
			else 
			{
				if (f[mid].getEpitheto().compareTo(key) < 0)
				{
					left = mid+1;
				}
				else 
				{
					pos = mid;
				}
			}
		} 
		return pos; 
	} 
	 // Dyadiki anazitisi me pedio to AM (kleidi typou int). 
	public static int binSearch (Foititis[] f, int key) 
	{
		int left=0, right=Askisi1.studentNo-1; 
		return b_search(f, key, left, right);
	} 
	
	private static int b_search (Foititis[] f, int key, int left, int right) 
	{
		int mid, pos=-1;
		while (pos==-1 && left<=right) 
		{
			mid = (left+right)/2;
			if (f[mid].getAM() > key)
			{
			  	   right = mid-1;
			}
			else
			{
				if (f[mid].getAM() < key)
				{
					left = mid+1;
				}
				else 
				{
					pos = mid;
				}
			}
		} 
		return pos; 
	}
}
