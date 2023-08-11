class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet=new HashSet(); //creating a hashset to save our array elements so we can compare them later on

        for (int i=0; i < nums.length;i++){

            if(intSet.contains(nums[i])){ //checking if their is any duplication

                return true;  
            }
            intSet.add(nums[i]); //adding elements to the set
            
        }
        return false;
    }
         
}
