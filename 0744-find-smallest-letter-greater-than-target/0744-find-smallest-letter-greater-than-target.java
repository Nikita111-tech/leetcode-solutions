class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int ans=n;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        if(ans==letters.length){
            return letters[0];
        }else
        return letters[ans];
    }
}