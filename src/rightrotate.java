public class rightrotate {
    public static void main(String[] args)
    {
        int[] a={1, 2, 3, 4, 5};
   //    int last=a[a.length-1];
//        System.out.println(last);
//        for(int i=a.length-1;i>0;i--)
//        {
//            a[i]=a[i-1];
//        }
//        a[0]=last;
//        for(int i:a)
//            System.out.print(i+" ");
        int n=3;
        for(int i=0;i<n;i++)
        {
            int j;
            int last=a[a.length-1];
            for(j=a.length-1;j>0;j--)
            {
                a[j]=a[j-1];
            }
            a[0]=last;

        }
        for(int i:a)
           System.out.print(i+" ");



    }
}
