Longest K unique characters substring
  GFG

  
class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
           HashMap<Character,Integer>map = new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length();
        int ans=-1;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);

            if(map.size()<k)j++;

             else if (map.size() == k) {
                ans = Math.max(ans, j - i + 1);
                j++;
             }
             else{
                 while(map.size()>k){
                      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                }
                i++;
                 }
                 j++;
             }
    }
    return ans;
    }
}

