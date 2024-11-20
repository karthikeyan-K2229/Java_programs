import java.util.Arrays;

public class Mergetwosortedarray {
    public static void main(String[] args)
    {
        int[] a={2,4,9};
        int[] b={3,6,8,10};
        int n1=a.length,n2=b.length;
        int[] ans=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1)
        {
            ans[k]=a[i];
            i++;k++;
        }
        while(j<n2)
        {
            ans[k]=b[j];
            k++;j++;
        }
        Arrays.sort(ans);
        for(int e:ans)
        {
            System.out.print(e+" ");
        }

    }
}
