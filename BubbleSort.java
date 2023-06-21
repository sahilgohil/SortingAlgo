   public static<T extends Comparable<T>> void bubbleSort(T[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j].compareTo(arr[j-1]) < 0)
                {
                    swap(arr, j, j-1);
                }
            }
        }
    }
