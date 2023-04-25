package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

public class SearchInMountain {

    static int doSearchInMountain(int[] arr,int target){
        int peak =findPeakOfTheMountain(arr);
        int firstTry=binearySearch(arr,target,0,peak);
        int secondTry=binearySearch(arr,target,peak+1,arr.length-1);
        if(firstTry!=-1 && secondTry!=-1){
            return Math.min(firstTry,secondTry);
        }
        else{
            if(firstTry!=-1)
                return secondTry;
            else
                return firstTry;
        }
    }

    static int binearySearch(int[] arr,int target,int start,int end){
        /*int start=start;
        int end=end;*/
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
        int target=3;
        System.out.println(doSearchInMountain(arr,target));
    }
}
