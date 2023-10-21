class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }else{
                set.add(arr[i]);
            }
        }
        return -1;
    }
}
class Solution {
    public int findDuplicate(int[] arr) {
        int []ans = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]] +=1;
            if(ans[arr[i]]>1){
                return arr[i];
            }
        }
        return 0;
    }
}
class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int ans =  Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
}