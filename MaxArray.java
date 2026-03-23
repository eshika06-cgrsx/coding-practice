class MaxArray
{
    public static void main(String[] args)
    {
        int arr[] = {1,34,56,90,23};

        int max = arr[0];   

        for(int i=1;i<arr.length;i++) 
        {
            if(arr[i]>max) 
            {
                max = arr[i];
            }
        }

        System.out.println(max);     }
}
