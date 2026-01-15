// Pattern : Two Pointer
// Problem : Remove Deuplicate Elements from Sorted Array 

package TwoPointer;

public class RemoveDuplicates {

    public int removeDuplicateElements(int [] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
           if (nums[j] != nums[i]){
            i++;
            nums[i] = nums[j];
           }
        }
        return i+1;
    }
}