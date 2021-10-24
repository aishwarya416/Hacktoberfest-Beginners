class dynamic_array
{
	private int arr[];
	private int length;
	dynamic_array(int ele)
	{
		arr=new int[1];
		arr[0]=ele;
		length=1;
	}
	dynamic_array(int ele[])
	{
		arr=ele;
		length=arr.length;
	}
	int length()
	{
		return length;
	}
	private void increase()
	{
		int x[]=new int[length*2];
		for(int i=0;i<length;i++)
			x[i]=arr[i];
		arr=x;
	}
	void add(int ele)
	{
		if(arr.length==length)
			increase();
		arr[length++]=ele;
	}
	int get(int ind)
	{
		if(ind<0||ind>=length)
			throw new ArrayIndexOutOfBoundsException();
		return arr[ind];
	}
	void replace(int ind,int ele)
	{
		if(ind<0||ind>=length)
			throw new ArrayIndexOutOfBoundsException();
		arr[ind]=ele;
	}
	void insert(int ind, int ele)
	{
		if(ind<0||ind>length)
			throw new ArrayIndexOutOfBoundsException();
		if(arr.length==length)
			increase();
		int temp=arr[ind];
		arr[ind]=ele;
		length++;
		for(int i=ind+1;i<length;i++)
		{
			int t=arr[i];
			arr[i]=temp;
			temp=t;
		}
	}
	void delete_by_ind(int ind)
	{
		if(ind<0||ind>=length)
			throw new ArrayIndexOutOfBoundsException();
		for(int i=ind;i<length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[length-- - 1]=0;
	}
	void delete_by_ele(int ele)
	{
		boolean flag=false;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==ele)
			{
				delete_by_ind(i);
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Element not found");
	}
	void delete_all_ele(int ele)
	{
		boolean flag=false;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==ele)
			{
				delete_by_ind(i);
				flag=true;
			}
		}
		if(!flag)
			System.out.println("Element not found");
	}
	void clear()
	{
		arr=null;
		length=0;
	}
	boolean isEmpty()
	{
		return length==0;
	}
	public String toString()
	{
		String s="[";
		for(int i=0;i<length-1;i++)
			s+=arr[i]+", ";
		s+=arr[length-1]+"]";
		return s;
	}
}
