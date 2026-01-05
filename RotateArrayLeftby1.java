class RotateLeftByOne {
    public static void main(String[] args) {
        int[] arr = {10, 25, 35, 44, 59};

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
