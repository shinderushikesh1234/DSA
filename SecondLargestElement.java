class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
