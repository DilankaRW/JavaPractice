public class Inheritance_Three extends Inheritance_Two{
    void camera(){

    }

    public static void main(String[] args) {
        Inheritance_Three obj3 = new Inheritance_Three();
        Inheritance_Three obj4 = new Inheritance_Three();
        obj3.call();
        obj4.browseInternet();
    }
}
