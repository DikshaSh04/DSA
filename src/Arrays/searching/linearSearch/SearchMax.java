package Arrays.searching.linearSearch;

public class SearchMax {
    public static void main(String[] args) {
        int[] numbers={3,30,88,76,45};


        //System.out.println("Largest element from the array is: "+max(numbers));

        System.out.println("Second largest element from the array is: "+secondMax(numbers));

    }


//    public static int max(int[] arr){
//        int maxVal =arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]> maxVal){
//                maxVal =arr[i];
//            }
//        }
//        return maxVal;
//
//    }

    public static int secondMax(int[] arr){
        int maxVal =arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]> maxVal){
                maxVal =arr[i];

            }
        }

        int secondMaxVal=arr[0];
        if(secondMaxVal==maxVal){
            secondMaxVal=arr[1];
            for(int i=2;i<arr.length;i++){
                if(arr[i]>secondMaxVal){
                    secondMaxVal=arr[i];
                }
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==maxVal){
                    continue;
                }
                else{
                    if(arr[i]>secondMaxVal){
                        secondMaxVal=arr[i];
                    }
                }

            }
        }

        return secondMaxVal;




    }


}
