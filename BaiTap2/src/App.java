public class App {
    public static void main(String[] args) throws Exception {
        MyStringBuilder str = new MyStringBuilder("Nhà em ")
        .addBool(true)
        .addString(" có ")
        .addFloat(1f)
        .addString(" ");
        str.addString("em trai");

        System.out.println(str.toString());
        System.out.println(str);
    }
}
