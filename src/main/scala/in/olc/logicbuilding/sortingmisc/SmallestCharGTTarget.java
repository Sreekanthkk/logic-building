package in.olc.logicbuilding.in.olc.logicbuilding.sortingmisc;
//smallest character greater than the target
public class SmallestCharGTTarget {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        System.out.println(binearySearch(arr,'j'));
    }

    static char binearySearch(char[] arr,char target){
        int start=0;
        int end=arr.length-1;
        //if(target>arr[end]) return -1;
        while(start<=end){
            int median=start+(end-start)/2;
            if(target<arr[median]) end=median-1;
            else start=median+1;
        }
        return arr[start%arr.length];
    }
}
