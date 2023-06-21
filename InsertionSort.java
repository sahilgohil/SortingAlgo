public static<T extends Comparable<T>> void insertionSort(T[] arr) {

        // 1 5 3 2 4
        // 
        // 

        for(int i=1;i<arr.length;i++)
        {
            
            int insertIdx = i;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[insertIdx].compareTo(arr[j]) < 0)
                {    
                    swap(arr, insertIdx, j);
                    insertIdx = j;
                }
            }
        }
        
    }
