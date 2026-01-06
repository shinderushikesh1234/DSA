class MinElement {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 9, 1};
        int[] arr = arr1;
        int min = arr1[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Min = " + min);
    }
}
