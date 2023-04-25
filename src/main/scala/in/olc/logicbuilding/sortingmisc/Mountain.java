package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

public class Mountain {
    static int findPeakOfTheMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int m=start+(end-start)/2;
            if(arr[m]<arr[m+1]){
                start=m+1;
            }
            else{
                end=m;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int peak=findPeakOfTheMountain(arr);
        System.out.println(peak);
    }
}
