class CountPNZ {
    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 5, -3};
        int pos = 0, neg = 0, zero = 0;

        for (int x : arr) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }

        System.out.println("Positive=" + pos + " Negative=" + neg + " Zero=" + zero);
    }
}
