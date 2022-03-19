class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
          int SumA = sum(aliceSizes);
        int SumB = sum(bobSizes);
        
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        
        int delta = ( SumB- SumA ) / 2;
        
        for(int i=0; i<aliceSizes.length; i++){
            if( binarySearch(bobSizes, aliceSizes[i] + delta) ){
                return new int[]{ aliceSizes[i], aliceSizes[i] + delta};
            }
        }
        throw null;  
    }
       int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    
    boolean binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
    
}