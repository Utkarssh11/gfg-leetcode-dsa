GFG JAVA SOLUTION

  
Count Pairs whose sum is equal to X

  class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
         for (Integer value : head1) 
            set1.add(value);
         for (Integer value : head2) 
            set2.add(value);
        int a=set1.size();
        int b=set2.size();
        int c=0;
        if (a>b){
            for (Integer element:set1){
                if (set2.contains(x-element)){
                    c++;
                }
            }
        }
        else{
            for (Integer element:set2){
                if (set1.contains(x-element)){
                    c++;
                }
            }
        }
        return c;
        // add your code here
    }
}
