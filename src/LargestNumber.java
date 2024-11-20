public class LargestNumber {
    public static void main(String[] args)
    {
        //largest number
        int[] a={3,4,5,8,9,4};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.print(max);
    }
}
