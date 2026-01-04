class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {25, 35, 60, 42};

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}
