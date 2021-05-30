package Stack;

public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan.Title();
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.show();
        tumpukan.push(100);
        tumpukan.show();
        tumpukan.pop();
        tumpukan.show();
        tumpukan.push(60);
        tumpukan.show();
        tumpukan.push(80);
        tumpukan.show();
        tumpukan.pop();
        tumpukan.show();
        long bacaTop = tumpukan.peek();
        System.out.println("nilai top = "+bacaTop);
    }
}
