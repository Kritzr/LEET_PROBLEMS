class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = (nums1.length + nums2.length+1)/2;
        int right = (nums1.length + nums2.length+2)/2;

        return (getkth(nums1, nums1.length, nums2, nums2.length, left, 0,0)+ getkth(nums1, nums1.length, nums2, nums2.length, right, 0,0))/2.0;

    }

    public int getkth (int[] a, int m , int[] b, int n,int k, int aStart, int bStart){
        if(m>n){
            return getkth(b, n, a, m, k, bStart, aStart);
        }

        if(m==0){
            return b[bStart + k-1];
        }
        if(k == 1){
            return Math.min(a[aStart], b[bStart]);
        }

        int i= Math.min(m, k/2);
        int j = Math.min(n, k/2);

        if(a[aStart + i -1] > b[bStart +j -1]){
            return getkth(a,m,b,n-j, k-j, aStart, bStart+j);
        }

        else{
            return getkth(a, m-i, b, n, k-i, aStart+i, bStart);
        }


    }
}
