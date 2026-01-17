class ConcatStringBuffer {
    public static void main(String[] args) {
        String[] arr = {"Java", " ", "is", " ", "Powerful"};
        StringBuffer sb = new StringBuffer();

        for(String s : arr) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
