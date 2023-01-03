public class EXTRA{

    // public static int pow(int n,int x){
    //     if(x==0){
    //         return 1;
    //     }else if(x==1){
    //         return n;
    //     }else if(x>1){
    //       for(int i=1;i<x;i++){
    //         n*=n;
    //       }
    //       return n;
    //     }
        
    //     return -1;
    // }

    public static void main(String args[]){
        // public boolean isPalindrome(int x) {
        // int x=121;
        // int reversed=0;
        // // int arr[]=new int[20];
        // int i=0;

        // while(x!=0){
        //     System.out.println(x +" "+reversed);
        //     reversed= reversed*10+x%10;
        //     // int put=x%10;
        //     // arr[i]=put;
        //     // i++;
        //     x=x/10;
        // }
        //     System.out.println(x +" "+reversed);
        //     System.out.println(x);

        // for(int j=0;j<arr.length;j++){
        //     System.out.print(arr[j]+" ");
        // }
    // }


    // int x=121;
    // System.out.println();

    int arr[]={1,3,5,8,62};
    int n=arr.length;

        int last=arr[n-1];
        int next=0;
        
        for(int i=0;i<arr.length-1;i++){
            next=arr[i+1];
            arr[i+1]= i==0? arr[0]:next;
        }
        arr[0]=next;


        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}