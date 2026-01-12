
import java.util.*;


class MedianOfTwoSortedArrays{
    // TODO: FIND BETTER SOLUTION USING BINARY SEARCH
//    2ms - MergeSort
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int l1 = nums1.length;
    int l2 = nums2.length;

    int totalLength = l1+l2;
    int[] arr = new int[totalLength];
    int i=0;
    int j=0;
    int k=0;

    while(i<l1 && j<l2){
        if(nums1[i] < nums2[j]){
            arr[k] = nums1[i];
            i++;
        }
        else{
            arr[k] = nums2[j];
            j++;
        }
        k++;
    }
    while(i<l1){arr[k++] = nums1[i++];}
    while(j<l2){arr[k++] = nums2[j++];}

    if(totalLength %2 != 0) return arr[totalLength/2];
    else return ( arr[totalLength/2] + arr[(totalLength-1)/2] )/2.0;
}
}