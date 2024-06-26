// Compile and run a Java class from the command line.
public class CompileRun {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


// You can compile it using the following command in your terminal:
// javac CompileRun.java

// To run the class, use the following command in your terminal:
// java CompileRun

// For the recent releases, the java command will also compile the program if the class file is not present. If the class is in a package, such as com.example, then it should be inside the folder com/example. The command to compile and run is:
// java com/example/CompileRun.java

// If your class requires some additional JARs to compile and run, you can use the java -cp option. For example:
// java -cp .:~/.m2/repository/log4j/log4j/1.2.17/log4j-1.2.17.jar  com/example/Test.java