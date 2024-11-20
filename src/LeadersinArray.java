import java.util.ArrayList;

public class LeadersinArray {
    public static void main(String[] args)
    {
        int[] a={16,17,4,3,5,2};
//        int max=a[a.length-1];
//        ArrayList<Integer> b=new ArrayList<>();
//        b.add(max);
//        for(int i=a.length-2;i>=0;i--)
//        {
//            if(a[i]>max) {
//                max = a[i];
//                b.add(a[i]);
//            }
//        }
//        System.out.println(b);

        ArrayList<Integer> b=new ArrayList<>();
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                    flag=0;
                else {
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                b.add(a[i]);
        }
        System.out.println(b);
    }
}
