package ThisInJava;

public class ThisInJava {
    int a;
    int b;

    public void setData(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public void showData(){
        System.out.println("Value of A ="+a);
        System.out.println("Value of B ="+b);
    }
    public static void main(String args[]){
        ThisInJava obj = new ThisInJava();
        ThisInJava whatIsThis = new ThisInJava();
        whatIsThis.setData(4,6);
        whatIsThis.showData();
        obj.setData(2,3);
        obj.showData();
    }
}
