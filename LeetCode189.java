class LeetCode189
{
    public static void main (String [] args )
    {
        int nums[]={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=10;
        k=k%n;
        
        for(int i=0;i<k;i++)
        {
            int last = nums[n-1];
            
            for(int j=n-1;j>0;j--)
            {
                nums[j]=nums[j-1];
            }
            
            nums[0]=last;
        }
        
        for(int a:nums)
        {
            System.out.print(a+" ");
        }
    }
}