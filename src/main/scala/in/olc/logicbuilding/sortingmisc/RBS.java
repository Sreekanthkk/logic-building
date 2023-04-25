package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

public class RBS {

    static int doRBS(int[] arr,int target){
        int pivot=findPivot(arr);
        int index=-1;
        if (pivot==-1)
            binearySearch(arr,target,0,arr.length-1);
        else{
            if(target==arr[pivot])
                return pivot;
            if(target> arr[0])
                index=binearySearch(arr,target,0,pivot-1);
            else
                index=binearySearch(arr,target,pivot+1,arr.length-1);
        }
        return index;
    }

    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int median=start+(end-start)/2;
            if(median<end && arr[median]>arr[median+1])
                return median;
            if(median>start && arr[median]<arr[median-1])
                return median-1;
            if(arr[median]<=arr[start])
                end=median-1;
            else
                start=median+1;
        }
        return -1;
    }

    static int binearySearch(int[] arr,int target,int start,int end){
        while(start<=end){
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

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println("Pivot: "+findPivot(arr));
        System.out.println("Search Index: "+doRBS(arr,0));
    }
}
