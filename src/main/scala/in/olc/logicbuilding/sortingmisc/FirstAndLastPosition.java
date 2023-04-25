package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

public class FirstAndLastPosition {
    static int[] getStartEndPos(int[] arr,int target){
        int start=doBinarySearch(arr,target,true);
        int end=doBinarySearch(arr,target,false);
        int[] ans={start,end};
        return ans;
    }

    static int doBinarySearch(int[] arr,int target,boolean findStartIndex){
            int ans=-1;
            int start=0;
            int end=arr.length;
            while(start<=end)
            {
                int median=start+(end-start)/2;
                if(arr[median]==target){
                    ans=median;
                        if(findStartIndex){
                            end=median-1;
                        }
                        else{
                            start=median+1;
                        }
                }
                else if(arr[median]<target){
                    start=median+1;
                }
                else{
                    end=median-1;
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=8;
        int[] ans=getStartEndPos(arr,target);
        System.out.println("ans: "+ans[0]+", "+ans[1]);

    }
}
