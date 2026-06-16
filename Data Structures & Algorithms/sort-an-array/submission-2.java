class Solution {
    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length-1);
        return nums;        
    }

    public void quickSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);

        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    public int partition(int[] arr, int start, int end) {
        int idx = start-1;
        int pivot = end;

        for (int j = start; j < end; j++) {
            if (arr[j] <= arr[pivot]) {
                idx++;
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }

        int swap = arr[pivot];
        arr[pivot] = arr[idx+1];
        arr[idx+1] = swap;

        return idx+1;
        
    }


}