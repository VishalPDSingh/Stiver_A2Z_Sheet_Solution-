package Array.Easy;

public class LargestElement {
    static int maxElement(int a[])
    {
        // max value
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(maxValue<a[i])
                maxValue = a[i];
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 0};
        int res = maxElement(arr);
        System.out.println(res);
    }
}
