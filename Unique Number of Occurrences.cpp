GFG
Unique Number of Occurrences


class Solution
{
    public:
    bool isFrequencyUnique(int n, int arr[])
    {
        unordered_map<int,int> mp;
        for(int i=0;i<n;i++){
            mp[arr[i]]++;
        }

        unordered_set<int> freq;
        for(pair<int,int>p : mp){
            if(freq.count(p.second)) return false;
            freq.insert(p.second);
        }

        return true;
    }
};
