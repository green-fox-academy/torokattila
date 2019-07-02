public class TodoPrint {

    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        todoText = "My todo: \n".concat(todoText);
        todoText = todoText.concat(" - Download games \n");
        todoText = todoText.concat("\t - Diablo");

        System.out.println(todoText);
    }
}
