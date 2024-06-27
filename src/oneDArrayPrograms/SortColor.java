import java.util.Arrays;
public class SortColor {
      public static void main(String[] args) {
            int arr[]={2,0,2,1,1,0};
            SortColor.sortColors(arr);
      }
    public static void sortColors(int[] nums) {
        int l=nums.length;
        int pointer=0;
        int n=0;
        int temp[]=new int[2];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]+=temp[nums[i]];
        }
        while(n<temp.length){
            if(temp[n]==0){
                n++;
            }
            for(pointer=0;pointer<l;pointer++){
                nums[pointer]=n;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}