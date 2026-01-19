class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    public static void backtrack(int[] nums, int start, List<Integer> current,  List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);                 
            backtrack(nums, i + 1, current, result); 
            current.remove(current.size() - 1);   
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,2};
        List<List<Integer>> subsets = subsetsWithDup(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}