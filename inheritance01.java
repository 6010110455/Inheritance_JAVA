class A{
    private int x;
    public A(int x){
        this.x = x;
        System.out.println("A");
    }
    public void foo(){
        System.out.println(x);
    }
}

class B extends A{
    public B(int x){
        super(x);
        System.out.println("B");
    }
}

public class inheritance01{
    public static void main(String[] args){
        new B(3).foo();
        System.out.println("6010110455");
    }
}