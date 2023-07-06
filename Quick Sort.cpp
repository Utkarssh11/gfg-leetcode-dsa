GFG

Quick Sort


class Soluttin
{
    public:
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int partn = partition(arr,low,high);
            quickSort(arr,low,partn - 1);
            quickSort(arr,partn + 1,high);
        }
    }

    public:
    int partition (int arr[], int low, int high)
    {
       int pivot = arr[high];
       int i = low - 1;

       for(int j = low;j<high;j++){
           if(arr[j] < pivot){
               i++;
               swap(arr[i],arr[j]);
           }
       }

       swap(arr[high],arr[i+1]);

       return i+1;
    }
};



