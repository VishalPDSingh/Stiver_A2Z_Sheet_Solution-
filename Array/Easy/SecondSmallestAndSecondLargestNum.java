package Array.Easy;

public class SecondSmallestAndSecondLargestNum {
    static void smallNumBigNum(int a[])
    {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(maxValue<a[i])
            {
                maxValue = a[i];
            }
        }
        System.out.println("1st MaxValue: "+maxValue);

        for(int i=0; i<a.length; i++)
        {
            if(minValue>a[i])
                minValue = a[i];
        }
        System.out.println("1st minValue: "+minValue);
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};
        smallNumBigNum(arr);
    }
}
