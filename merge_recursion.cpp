#include <iostream>
using namespace std;
void merge(int [30],int, int , int );
void merge_sort(int arr[30], int low, int high)
{
    int mid;
    if (low < high)
    {
        //divide the array at mid and sort independently using merge sort
        mid=(low+high)/2;
        merge_sort(arr,low,mid);  //1st array
        merge_sort(arr,mid+1,high); //2nd  array
        //merge or conquer sorted arrays            
        merge(arr,low,mid,high);  //merge the 2 arrays 
    }
}
// Merge sort : it merge the 2 arrays 
void merge(int arr[30], int low, int mid, int high)
{
    int i, j, k, c[50];
   // i =index of 1st array ,  j: =index of 2nd array, k=index of 3rd array
    //1st list  :(low,mid)     2nd list :(mid+1,high) 
    
    i = low;   
    k = low;   
    j = mid + 1; 
    
    while (i <= mid && j <= high) //till end of 1st or 2nd array 
    {
        if (arr[i] < arr[j]) 
        {
            c[k] = arr[i];
            k++; //increment index of k
            i++;  //increment index of i
        }
        else 
         {
            c[k] = arr[j];
            k++;
            j++; //increment index of j
        }
    }//end of while
    while (i <= mid) //if end of 2nd array ,copy 1st 
    {
        c[k] = arr[i];
        k++;
        i++;
    }
    while (j <= high)  //if end of 1st array ,copy 2nd  
    {
        c[k] = arr[j];
        k++;
        j++;
    }
    for (i = low; i < k; i++) //copy C[] into Arr[]
     {
        arr[i] = c[i];
    }
    
}
// read input array and call mergesort
int main()
{
    int  array[30], num;
    
    cout<<"Enter number of elements to be sorted:";
    cin>>num;
    cout<<"Enter "<<num<<" elements to be sorted:";
     for (int i = 0; i < num; i++) 
      {  cin>>array[i];
      }
    merge_sort(array, 0, num-1); // function call 
    cout<<"\nSorted array\n";
    for (int i = 0; i < num; i++)
    {
        cout<<array[i]<<"\t";
    }
}

/*  
Explaination 

  i =index of 1st array ,  j: =index of 2nd array, k=index of 3rd array
    1st list  :(low,mid)     2nd list :(mid+1,high) 
    
//index   0    1      2    3  (index)  ( i=0  mid=1  high =3)
//arr[]   2     6      3    4   (  ist number  : 2,6  ,2nd  list number :  3 ,4)
    
    1st list  :(low,mid)   (0,1)
    2nd list :(mid+1,high) (2,3)
    
    i = low;   //  i=0
    k = low;   //k=0
    j = mid + 1; //j=2 
    
    if (arr[i] < arr[j]) 
        {
            c[k] = arr[i];
            k++; //increment index of k
            i++;  //increment index of i
        } 
        
      if arr[0]< arr[2]  :   2< 3 : True 
__________________________________________________    
   
   while (i <= mid && j <= high) //till end of 1st or 2nd array  
    i <= mid   :end of ist list 
    j <= high   :end of 2nd list 
    
     
    */
    
