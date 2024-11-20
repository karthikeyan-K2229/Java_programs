public class secondlargest {
    public static void main(String[] args)
    {
        int[] a={2,3,4,7,9,8};
        int first=a[0];
        int second=a[0];

        for(int i=1;i<a.length;i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            }
            if(a[i]>second)
            {
                if(a[i]!=first)
                    second=a[i];
            }
        }
        System.out.println(first+" "+second);
    }

}
