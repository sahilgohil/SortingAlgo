public static<T extends Comparable<T>> int partitionArray(T[] arr, T pivot, int low, int hi)
    {
        int j=low;
        int i=low;

        while(i<=hi)
        {
            /*
             * this will increase the numbers which are greater than pivot
             */
            if(arr[i].compareTo(pivot)>0)
            {
                i++;
            }
            /*
             * this will increase the numbers that are less or equal to pivor
             */
            else{
                // swap the elemets at the i and j index
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return j-1;
    }

    public static<T extends Comparable> void QuickSort(T[]arr, int low, int hi) {
        if(low > hi)
        {
            return;
        }

        T pivot = arr[hi];
        int pivotIdex = partitionArray(arr, pivot, low, hi);
        QuickSort(arr, low, pivotIdex-1);
        QuickSort(arr, pivotIdex+1, hi);
        
    }
