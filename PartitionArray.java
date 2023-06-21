public static<T extends Comparable<T>> void partitionArray(T[] arr, T pivot)
    {
        int j=0;
        int i=0;

        while(i<arr.length && j < arr.length)
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
    }
