class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         permutationHelper( nums,0,result);
         return result;
    }
    public static void permutationHelper(int[] nums,int index,List<List<Integer>> result){
        if(nums.length==index){
            List<Integer> list =new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<nums.length; i++){
            swap(nums,i,index);
        
            permutationHelper(nums,index+1,result);
            swap(nums,i,index);

        }
         
    }
    public static void swap(int[] nums,int i,int index){
        int temp= nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
    }
}