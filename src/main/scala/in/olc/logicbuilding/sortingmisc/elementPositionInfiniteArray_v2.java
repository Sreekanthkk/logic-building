package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;

public class elementPositionInfiniteArray_v2 {

    static int findPosOfAnElem(int[] arr,int target){
        int start=0;
        int end=2;
        int result=-1;
        while(target>arr[end])
        {
            int temp=end+1;
            //end=previousend+sizeofpreviousbox*2, sizeofpreviousbox=end-start+1
            end=end+(end-start+1)*2;
            start=temp;
        }
        result =binearySearch(arr,target,start,end);
        return result;
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
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println("Position: "+findPosOfAnElem(arr,target));
    }
}
