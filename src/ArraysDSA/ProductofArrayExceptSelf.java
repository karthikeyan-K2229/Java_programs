package ArraysDSA;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
//        int answer[] = new int[nums.length];
//        int temp = 1;
//        for (int i = 0; i < nums.length; i++) {
//            answer[i] = temp;
//            temp *= nums[i];
//        }
//        temp = 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            answer[i] = answer[i] * temp;
//            temp *= nums[i];
//        }
//
//        for (int i : answer)
//        {
//            System.out.println(i);
//        }{1, 2, 3, 4};

        int answer[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int ans=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    ans=ans*nums[j];
                }
            }
            answer[i]=ans;
        }

        for (int i : answer)
        {
            System.out.println(i);
        }


    }

}
