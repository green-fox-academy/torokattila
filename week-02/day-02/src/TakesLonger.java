public class TakesLonger {

    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        quote = quote.substring(0, quote.indexOf("y")) + "always takes longer than" + quote.substring(quote.indexOf("y") -1, quote.length());
        System.out.println(quote);
    }
}
