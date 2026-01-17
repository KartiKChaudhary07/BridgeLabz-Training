class SearchSentence {
    public static void main(String[] args) {
        String[] arr = {"I love Java", "Python is easy", "Java is powerful"};
        String word = "Java";

        for(String s : arr) {
            if(s.contains(word)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
