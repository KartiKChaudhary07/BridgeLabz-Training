class OTP {

    static int generate() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static void main(String[] args) {
        int[] otp = new int[10];
        for (int i = 0; i < 10; i++)
            otp[i] = generate();

        for (int x : otp) System.out.println(x);
    }
}
