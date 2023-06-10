GFG
Arranging the array


Class Solution
{
    public:
       void Rearrange(int arr[], int n)
{
    // Your code goes here
    stable_partition(arr, arr+n, [](int x) { return (x < 0); });
}
};

