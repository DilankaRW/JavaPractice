// Static keyword

package PracticeFile3;

public class P19 {
    String name;
    void call(){
        System.out.println("take a call from " + name);
    }

    public static void main(String[] args) {
        P19 phone1 = new P19();
        P19 phone2 = new P19();
        P19 phone3 = new P19();
        phone1.name = "nokia";
        phone2.name = "samsung";
        phone3.name = "huawei";
        phone3.call();
        phone1.call();

//        Output
//        take a call from huawei
//        take a call from nokia
    }
}
