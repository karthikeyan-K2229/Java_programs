import java.util.ArrayList;
import java.util.Arrays;
// without using extra space
public class removeduplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 4, 5,5};
        int n=a.length;
        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;

            }

        }
        a[j++]=a[n-1];
        for(int k=0;k<j;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
