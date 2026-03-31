class FirstNegative {
    public static void main(String[] args) {
        int[] a = {5, 3, -2, 7, -9};

        for(int i=0;i<a.length;i++) {
            if(a[i] < 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
