public class returnArray{
    // public static int[] returnArr(){
    //     int arr[]={1,2,3,4,5,6,7};
    //     return arr;
    // }
    // public static void main(String args[]){
    //     int R[]= returnArr();

    //     for(int i=0; i<R.length;i++){
    //         System.out.print(R[i]+" ");
    //     }

    // }


    // class Solution {
    public static int removeElement(int[] nums, int val) {
        int k=0;

        for(int i=0 ; i<nums.length;i++){
            if(nums[i]==val){
                k++;
                for(int j=i ; j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=0;
            }
        }

        return k;
    }

    public static void main(String args[]){
        int nums[]={0,1,2,2,3,0,4,2};
        int value =2;
        System.out.println(removeElement(nums,value));
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
// }
}