public class Reversearray {
    public static void main(String[] args)
    {
        int[] a={2,4,5,6,7};
//        for(int i=a.length-1;i>=0;i--)
//        {
//            System.out.print(a[i]);
//        }

        int i=0,j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int k:a)
            System.out.print(k+" ");
    }
}
