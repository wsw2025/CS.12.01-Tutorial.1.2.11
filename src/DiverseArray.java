public class DiverseArray {
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr){
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            sum[i] = arraySum(arr[i]);
        }
        return sum;
    }

    public static boolean isDiverse(int[][] arr){
        int[] sum = rowSums(arr);
        for (int i = 0; i < arr[0].length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if(sum[i]==sum[j]) return false;
            }
        }
        return true;
    }
}
