public class MergeTwoSortedArray {

    static void swapIfGreater(int[] nums1,int[] nums2, int ind1, int ind2){
        if(nums1[ind1] > nums2[ind2]){
            int temp = nums1[ind1];
            nums1[ind1] = nums2[ind2];
            nums2[ind2] = temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n){
                
        int len = m + n;
        int gap = (len/2) + (len%2);

        while(gap > 0){
            int left =0;
            int right = left + gap;

            while(right < len){
                if(left < m && right < m){
                    if(nums1[left] > nums1[right]){
                        
                        int temp = nums1[left];
                        nums1[left] = nums1[right];
                        nums1[right] = temp;
                    }
                }
                else if(left < m && right >= m){
                    swapIfGreater(nums1, nums2, left, right - m);
                }else{
                    if(nums2[left - m] > nums2[right - m]){

                        int temp = nums2[left - m];
                        nums2[left - m] = nums2[right - m];
                        nums2[right - m] = temp;
                    }
                }

                left ++;
                right ++;
            }
            if(gap == 1){
                break;
            }
            gap = (gap/2) + (gap%2);

        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,4,8,10};
        int[] nums2 = {2,3,9};

        MergeTwoSortedArray ab = new MergeTwoSortedArray();
        ab.merge(nums1, nums1.length, nums2, nums2.length);

        for(int x : nums1){
            System.out.print(x + "");
        }
        System.out.println();

        for(int x : nums2){
            System.out.print(x + "");
        }        
    }
}
