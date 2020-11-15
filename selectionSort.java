// selectionSort



class selectionSort
{

    void selectionSort(int arr[])
    {
        int n = arr.length; 

        for (int i = 0; i < n-1; i++)
        {
            int min_index = i;
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] < arr[min_index])
                    min_index = j; 
            }
        }

        int temp = arr[min_index]; 
        arr[min_index] = arr[i];   // This is the swap 
        arr[i] = temp; 
    }






void BubbleSort(int arr[])
{

    int arr.length; 

    for(int i = 0; i < n-1; i++)
    {
        for(int j = 1; j < n; j++)
    }



}

}

//Bubble Sort

64 25 12 22 11 

25 64 12 22 11

25 12 64 22 11 

25 12 22 64 11 

25 12 22 11 64 

12 25 22 11 64 

12 22 25 11 64

12 22 11 25 64

12 11 22 25 64

11 12 22 25 64 


