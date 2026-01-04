class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {40, 23, 56, 33, 78, 91, 12};

        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
