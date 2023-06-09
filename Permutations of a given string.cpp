GFG
Permutations of a given string



class Solution
{
	public:
		vector<string>find_permutation(string S)
		{
		    sort(S.begin(),S.end());
		    vector<string> ans; 

		    do{
		        ans.push_back(S);
		    }while(next_permutation(S.begin(),S.end()));

		    return ans;
		}
};
