class CompareSpeed {
    public static void main(String[] args) {
        long start, end;

        start = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<1000000;i++) sb1.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end-start));

        start = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for(int i=0;i<1000000;i++) sb2.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end-start));
    }
}
