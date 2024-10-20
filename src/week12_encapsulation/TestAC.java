package week12_encapsulation;

public class TestAC {
    public static void main(String[] args) {
        AC ac = new AC(72,"On");
        System.out.println("ac = " + ac);
        
        AC ac2 = new AC(65,"On");
        System.out.println("ac2 = " + ac2.getTemp());
        System.out.println("ac2.getPower() = " + ac2.getPower());

    }
}
