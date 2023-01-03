public class BinarySearch{

    public static int binarySea(int arr[],int key){
        int start=0;
        int res=0;
        int end= arr.length-1;
        // int mid=0;

        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid] > key){
                end=mid-1;
                res=mid;
            }else if(arr[mid]<key){
                start= mid+1;
                res=mid+1;
            }else{
                return mid;
            }
        }

        return res;
    }

    public static void main(String args[]){
        int arr[]={1,25,145,200};
        int key =200;

        // boolean arr[]= new bo

        System.out.println("Element is found at index :"+binarySea(arr,key));
    }
}