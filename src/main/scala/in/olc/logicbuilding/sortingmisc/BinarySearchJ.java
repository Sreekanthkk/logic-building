package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

import java.sql.Array;

public class BinarySearchJ {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,14,16,17,19,23,25,36};
        System.out.println(binearySearch(arr,15));
    }

    static int binearySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int median=(start+end)/2;
            if(arr[median]==target) return median;
            else if(arr[median]>target) {
                end=median-1;
            }
            else
                start=median+1;
        }
        return -1;
    }
}