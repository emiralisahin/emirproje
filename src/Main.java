import java.io.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws FileNotFoundException , IOException {
        File file = new File("C:/Users/as034167/IdeaProjects/untitled/src/input.txt");
        FileWriter fw = new FileWriter("C:\\Users\\as034167\\IdeaProjects\\untitled\\src\\output.txt");
        BufferedWriter out = new BufferedWriter(fw);

        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            int number = Integer.parseInt(data);


            out.write(isPrime(number));
            out.newLine();
        }
        out.close();

    }
    public static String isPrime(int number){
        boolean result = false;
        for(int i = 2;i <=((number)/2)+1;i++){
            if (number%i==0){
                return "Prime";
            }
        }
        return "NOT";

    }

}