import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        FileWriter fileWriter = new FileWriter("alfawit.txt");
        fileWriter.write("\n" +
                "A a\tNn \n" +
                "B b\tOo \n" +
                "C c \tPp \n" +
                "D d \tQq \n" +
                "E e \tRr \n" +
                "F f \tSs \n" +
                "G g \tTt \n" +
                "H h \tUu \n" +
                "I i \tVv \n" +
                "J j \tWw \n" +
                "K k \tXx \n" +
                "L l \tYy \n" +
                "M m \tZz \n");
        fileWriter.write("1 2 3 4 5 6 7 8 9");
        fileWriter.close();
        FileReader fileReader = new FileReader("alfawit.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}