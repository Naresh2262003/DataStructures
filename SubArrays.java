// IMPORTANT CONCEPT
// to fill array with a value;

// import java.util.Arrays;
// int num[]=new int [25];
//         for(int i=0;i<num.length;i++){
//             System.out.println(num[i]+" ");
//         }

//         Arrays.fill(num,25);
//         for(int i=0;i<num.length;i++){
//             System.out.println(num[i]+" ");
//         }


// IMPORTANT CONCEPT
// to sort Array (pre-defined function)

//   import java.util.Arrays;
//   int arr[]={-11,-10,-12,-42,-150,-51,-36};

//         Arrays.sort(arr);

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

public class SubArrays{

// Time Complexity= O(n^3)
    public static void printSubArrays(int arr[]){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){

            for(int j =i;j<arr.length;j++){
                
                int currSum=0;

                System.out.print("(");
                for(int k=i; k<=j;k++){
                    currSum+=arr[k];
                    System.out.print(" "+arr[k]+" ");
                }
                System.out.print(")");

                if(currSum>max){
                    max=currSum;
                }
                if(currSum<min){
                    min=currSum;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max Sum of Subarrays = "+max);
        System.out.println("Min Sum of Subarrays = "+min);
    }

// Time Complexity = O(n^2)

    public static void maxSubArray(int arr[]){
        int max=Integer.MIN_VALUE;
        int currSum=0;

        int prefix[]= new int[arr.length];

        // cal prefix array

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                // if-else statement using Ternary operator
                currSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

                if(currSum>max){
                    max=currSum;
                }

                // if-else statement using Ternary operator
                // max = max<currSum? currSum:max;
            }
        }
        System.out.println("Max Sum of Subarrays = "+max);
    }


// Time Complexity - O(n)
// Kadane's Algorithms

    public static void KadaneAlgo(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for (int i=0;i<arr.length;i++){
            cs+=arr[i];

            cs= cs<0 ? 0:cs;

            ms= cs>ms? cs:ms;
        }

        // tackling if arr has all the negative ele
        if(ms==0){
            ms=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                ms=ms<arr[i]? arr[i]:ms;
            }
        }
        System.out.println("Max Sum of Subarrays = "+ms);
    }

    
    public static void main(String args[]){
        int arr[]={-11,-10,-12,-42,-150,-51,-36};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // O(n^3)
        // printSubArrays(arr);

        // O(n^2)
        // maxSubArray(arr);

        // O(n)
        // KadaneAlgo(arr);
    }
}