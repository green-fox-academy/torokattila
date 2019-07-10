package DataStructure;

public class PostIt {
    String backgroundColor;
    String textColor;
    String text;


    public PostIt() {

    }

    public void print() {
        System.out.print(this.backgroundColor + " ");
        System.out.print(this.textColor + " ");
        System.out.print(this.text);
        System.out.println();
    }
}
