import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Cheat {
    public static void main(String[]args){
            /// OUTPUT
        String ans = "";
        int numberOfCache = 100;
        ans += numberOfCache + "\n";
        int numberOfVideo = 3;
        for (int i=0;i<numberOfCache;i++){
            ans += i + " " + i + "\n";

        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("cheat.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.write(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
