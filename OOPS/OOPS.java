

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAccn = new BankAccount();
        myAccn.username = "Arul";
      
    }
}
 
class BankAccount {
    public String username;
    private String password;

    public void setPsw(String psw) {
        password = psw;
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
}
