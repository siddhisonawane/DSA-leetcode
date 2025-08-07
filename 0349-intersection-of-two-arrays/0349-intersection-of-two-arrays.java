import java.util.Arrays;

class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (idx == 0 || temp[idx - 1] != nums1[i]) {
                    temp[idx++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(temp, 0, idx);
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int result[] = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result)); 
    }
}
