class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[x];
                x++;
            }else{
                arr[i]=nums[n];
                n++;//already given pointer
            }
        }
        return arr;
    }
}