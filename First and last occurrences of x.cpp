
First and last occurrences of x

GFG

class Solution {
public:
    vector<int> find(int arr[], int n, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        // Binary search for the first occurrence
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                firstOccurrence = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Binary search for the last occurrence
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                lastOccurrence = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        vector<int> result = {firstOccurrence, lastOccurrence};
        return result;
    }
};
