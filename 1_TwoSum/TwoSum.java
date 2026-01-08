class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force Approach - 45ms
        // int [] indices = new int[2];
        // for(int i=0; i < nums.length-1; i++)
        // {
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             indices[0]=i;
        //             indices[1]=j;
        //             return indices;
        //         }
        //     }
        // }
        // return indices;

        //Maps<value,index> - 2ms
        Map<Integer, Integer> mapIndexValue = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(mapIndexValue.containsKey(target-nums[i])){
                return new int[]{i, mapIndexValue.get(target-nums[i])};
            }
            mapIndexValue.put(nums[i],i);
        }
        return new int[]{};
    }
}