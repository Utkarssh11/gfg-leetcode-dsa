GFG
k largest elements



class Solution{
    void sink(vector<int>& h, int i, int k) {
        int left = i * 2 + 1;
        if (left >= k) return;
        if (left + 1 < k && h[left] > h[left+1]) left++;
        if (h[i] > h[left]) {
            swap(h[i], h[left]);
            sink(h, left, k);
        }
    }
public:	
	vector<int> kLargest(int arr[], int n, int k) {
	    // code here
	    vector<int> heap(arr, arr+k);
	    make_heap(heap.begin(), heap.end(), greater<int>{});
	    for(int i = k; i < n; ++i) {
	        if (arr[i] > heap[0]) {
	            heap[0] = arr[i];
	            sink(heap, 0, k);
	        }
	    }
	    sort(heap.begin(), heap.end(), greater<int>{});
	    return heap;
	}
};
