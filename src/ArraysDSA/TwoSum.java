package ArraysDSA;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int target=6;
        int[] a=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                 a[0]=i;
                 a[1]=j;
                 break;
                }
            }
        }
        for(int i:a)
        {
            System.out.println(i);
        }

    }

    }

