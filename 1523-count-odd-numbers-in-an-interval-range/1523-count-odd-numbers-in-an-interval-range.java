class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        // for(int i=low;i<=high;i++){
        //     if(i%2!=0){
        //         count++;
        //     }
        // }
        // return count;
        
        // while(low<high){
        //     if(low%2!=0 ||high%2!=0 )count++;
            
        // }

        // return count;
        int n=high;
        int m=low;

        return (n+1)/2 - m/2;

    }
}