

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<n-1;i++){
          for (int j=i+1;j<n;j++){
              if(arr[i]>arr[j]){
                  int temp =arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
  }
}
