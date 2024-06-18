// Remove leading spaces from a string
package PracticeFile1;

public interface P20 {
    public static void main(String[] args) {
        String S = "            DilankaRW";
        String TS = S.replaceAll("^\\s+","");
        System.out.println(TS); // DilankaRW
    }
}
