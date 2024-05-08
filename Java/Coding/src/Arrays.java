public class Arrays {
    public static void main(String[] args) {

        /* Single-Dimensional Arrays: These are arrays that consist of a single row of elements. They are declared using square brackets [] after the data type. For example: */

//        int [] numbers = {2,4,6,8};
//        String[] names = {"Kamal","Nimal","Sunil"};
//        System.out.println(names[0]);
        /* Output - Kamal */

//        int [] numbers = {2,4,6,8};
//        String[] names = {"Kamal","Nimal","Sunil"};
//        names[0] = "Pawan";
//        System.out.println(names[0]);
        /* Output - Pawan */

//        String[] names = new String[5];
//        names[0] = "Kamal";
//        names[1] = "Tharaka";
//        System.out.println(names[1]);
        /* Output - Tharaka */

//        String[] names = new String[5];
//        names[0] = "Kamal";
//        names[1] = "Tharaka";
//        System.out.println(names[4]);
        /* Output - null */

//        String[] names = new String[5];
//        names[0] = "Kamal";
//        names[1] = "Tharaka";
//        names[4] = "Saman";
//        System.out.println(names[4]);
        /* Output - Saman */


        /* Multi-Dimensional Arrays: These are arrays of arrays, meaning they contain multiple rows and columns. They can be declared with multiple sets of square brackets. For example:

        int[][] twoDimensionalArray;
        double[][][] threeDimensionalArray;

        The number of dimensions you can have in an array is theoretically unlimited, but in practice, you'll mostly encounter one-dimensional and two-dimensional arrays. */

        int[][] x = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(x[1][0]);
        /* Output - 4 */
    }
}
