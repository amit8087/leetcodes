class Solution { 
     
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        int nums1Pointer = m - 1, nums2Pointer = n - 1, mainPointer = m + n; 
 
        while (--mainPointer >= 0 && nums1Pointer >= 0 && nums2Pointer >= 0) { 
            if (nums1[nums1Pointer] < nums2[nums2Pointer]) { 
                nums1[mainPointer] = nums2[nums2Pointer]; 
                nums2Pointer--; 
            } else { 
                nums1[mainPointer] = nums1[nums1Pointer]; 
                nums1Pointer--; 
            } 
        } 
         
        while (nums2Pointer >= 0) { 
            nums1[mainPointer] = nums2[nums2Pointer]; 
            nums2Pointer--; 
            mainPointer--; 
        } 
    } 
}