import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Output {
    public static void output(Cache[] input){
            /// OUTPUT
            String ans = "";
            int numberOfCache = input.length;
        ans += numberOfCache + "\n";
        int numberOfVideo = 3;
        for (int i=0;i<numberOfCache;i++){
            ans += input[i].getID() + " ";
            for(Video cur:input[i].getVideos()){
              ans += cur.getID() + " ";
            }
            ans += "\n";

        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("Win.txt"));
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
