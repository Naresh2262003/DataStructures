public class ReverseArray{
    

    // Mine 
    public static void revArr(int arr[]){
        for(int i=0; i<arr.length/2;i++){
            int ele=arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=ele;

        }
    }

    // Video
    public static void reverse(int arr[]){
        int first = 0, last = arr.length-1;

        while(first<=last){
            int temp= arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }

    }

    public static void main(String args[]){
        int arr[]={2,14,45,10,212,142,140,1};

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // Mine
        revArr(arr);

        // video
        reverse(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}