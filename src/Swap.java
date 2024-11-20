public class Swap {
    public static void swap(int[] a)
    {
        int i=0,j=1;
        int n=a.length;
        while(i<n && j<n)
        {
            int temp;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i=i+2;
            j=j+2;
        }
        for(int k:a)
            System.out.print(k+" ");
    }
}
