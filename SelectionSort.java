    public static<T extends Comparable<T>> void selectionSort(T[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].compareTo(arr[smallest]) < 0)
                {
                    swap(arr, smallest, j);
                }
            }
        }
    }
