public class PairsArray{

// fun to print all the pairs in a given arrays
    public static void printPairs(int arr[]){

        System.out.println("Pairs of the given Array : ");

        for(int i =0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+arr[i]+" "+arr[j]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[]={12,10,45,13};

        printPairs(arr);
    }
}