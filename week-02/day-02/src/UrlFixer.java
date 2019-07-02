public class UrlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.replace("https", "https:");
        System.out.println(url);

        System.out.println();

        String solve = "https:";
        url = solve + url.substring(6, url.length());
        System.out.println(url);


    }
}
