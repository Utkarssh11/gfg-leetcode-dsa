
Problem Of The Day
2 June
Construct list using given q XOR queries


JAVA SOL. 

class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> list  = new ArrayList<>();
        
        int xortillnow = 0;
        
        for(int i = q -1 ; i>=0; i--) {
            if(queries[i][0] == 1) {
                xortillnow ^=queries[i][1];
            }else {
                list.add(queries[i][1] ^xortillnow);
            }
        }
        
        list.add(xortillnow);
        Collections.sort(list);
        return list;
    }
}
