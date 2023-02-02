//bubble sort.
/*
*the last element get sorted accordingly while 
*swaping the adjacent elements in the array.
*/
class BubbleSort
{
    public void bubbleSort(int [] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    nums[j]=nums[j+1]+nums[j]-(nums[j+1]=nums[j]);
                }
            }
        }
    }
}
