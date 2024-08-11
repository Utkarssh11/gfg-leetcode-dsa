Job Sequencing Problem

  class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for(Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        boolean[] flag = new boolean[maxDeadline + 1];
        int count = 0;
        int total = 0;
        for(Job job : arr) {
            for(int j=job.deadline; j>0; j--) {
                if(flag[j] == false) {
                    flag[j] = true;
                    count++;
                    total += job.profit;
                    break;
                }
            }
        }
        return new int[]{count, total};
    }
}
