package ArraysDSA;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5, 5};
        int[] ans = Arrays.stream(a).distinct().toArray();
        int[] b=new int[a.length];
        int j=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                b[j]=a[i];
                j++;
            }
        }
        b[j]=a[a.length-1];

        for (int i : b) {
            if(i!=0)System.out.println(i);
        }
    }
}
