class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int mid = start+((end-start)/2);
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, end, mid);
    }

    public void merge(int[] arr, int start, int end, int mid) {
        int[] temp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        int y = 0;
        for (int x = start; x <= end; x++) {
            arr[x] = temp[y];
            y++;
        }
    }
}