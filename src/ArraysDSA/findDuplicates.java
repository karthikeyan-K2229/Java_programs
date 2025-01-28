package ArraysDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1};
        List<Integer> a=new ArrayList<>();
        Arrays.sort(arr);
        //12233478
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                a.add(arr[i-1]);
            }
        }
        for (int i:a
             ) {
            System.out.println(i);
        }
    }
}
