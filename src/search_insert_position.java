class search_insert_position {
    int binarySearch(int[] array, int searchNumber, int begin, int end) {
        int middleNumber = array[(begin+end)/2];
        if(middleNumber == searchNumber) return (begin+end)/2;
        if(begin >= end) {
            if(searchNumber > array[begin]) return begin + 1;
            return begin;
        }
        if (searchNumber > middleNumber) return binarySearch(array, searchNumber, (begin+end)/2 + 1, end);
        return binarySearch(array, searchNumber, begin, (begin + end) / 2 - 1);
    }

    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }
}