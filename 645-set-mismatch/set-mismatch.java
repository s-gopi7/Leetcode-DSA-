class Solution {
    public int[] findErrorNums(int[] nums) {
        int a=nums.length;
        int sum=(a*(a+1))/2;
        int duplicate=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a;i++){
            int val=nums[i];
            if(!set.contains(val)){
                set.add(val);
            }
            else{
                duplicate=val;

            }
        }
        int sum1=0;
        for (int num:set) {
            sum1+=num;
        }
        int g=sum-sum1;
        return new int[]{duplicate, g};

        
    }
}