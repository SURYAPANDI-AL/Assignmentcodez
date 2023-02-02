/*
*selection sort traverse form the next element to i till the end and find the smallest element in the array and replace it with 
*the i.
**/
class SelectionSort
{
	public void selectionSort(int [] nums)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			int value=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]<nums[value])
				{
					value=j;
				}
			}
			nums[value]=nums[i]+nums[value]-(nums[i]=nums[value]);
		}
	}
