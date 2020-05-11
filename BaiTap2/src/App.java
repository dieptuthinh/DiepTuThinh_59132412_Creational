public class App {
    public static void main(String[] args) throws Exception {
        MyStringBuilder str = new MyStringBuilder("Nhà em")
        .addString(" có ")
        .addFloat(1f)
        .addString(" em trai ")
        .addBool(true);

        System.out.println(str.toString());

    }
}
