import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Parser {
    /**
     * Reads a .in file and creates an Array of Rides. It then returns this
     * Array.
     *
     * @param filename Input filename
     * @return photos List of photos read from the file.
     * @throws FileNotFoundException
     * @author Gus
     */
    public static void main(String[] args) throws FileNotFoundException { //FileNotFoundException makes Scanner work

        //Scanner scanner = new Scanner(new File("src\\Example\\kittens.in"));
        //Scanner scanner = new Scanner(new File("src\\Example\\me_at_the_zoo.in"));
        //Scanner scanner = new Scanner(new File("src\\Example\\trending_today.in"));
        Scanner scanner = new Scanner(new File("src\\Example\\videos_worth_spreading.in"));

        String currentLine[] = (scanner.nextLine().split(" "));
        Video[] videos = new Video[Integer.parseInt(currentLine[0])];
        Endpoint[] endpoints = new Endpoint[Integer.parseInt(currentLine[1])];
        Request[] requests = new Request[Integer.parseInt(currentLine[2])];
        Cache[] caches = new Cache[Integer.parseInt(currentLine[3])];
        Cache.maxSize = Integer.parseInt(currentLine[4]);

        currentLine = (scanner.nextLine().split(" "));
        for (int i = 0; i < videos.length; i++) {
            videos[i] = new Video(i, Integer.parseInt(currentLine[i]));
        }

        for(int i=0; i<caches.length; i++) {
          caches[i] = new Cache(i);
        }

        for(Video cur: videos) {
          //System.out.println(cur.iD);
        }

        for (int i = 0; i < endpoints.length; i++) {
            //currentLine = (scanner.nextLine().split(" "));
            //endpoints[i] = new Endpoint();
            //endpoints[i] = Integer.parseInt(currentLine[i]);
        }

        Stuff.stuff(caches, videos);
        Output.output(caches);


    }
}
//
//        while (scanner.hasNextLine()) { //Loops through every photo
//            String line = scanner.nextLine();
//            if(line.charAt(0) == 'V') { //checks if vertical
//                isVertical = true;
//            } else {
//                isVertical = false;
//            }
//            int numOfTags = Character.getNumericValue(line.charAt(2	)); //checks num of tags
//            String[] tempArray = line.substring(4).split(" "); //turns tags into an array of strings
//            Photo tempPhoto = new Photo(photoID, isVertical, numOfTags, tempArray); //makes temp photo Class to upload
//            photos[photoID] = tempPhoto;
//            photoID++;
//        }
//        scanner.close();
//        return photos;
//    }
//
//    //In case of error, comment it
//    public static void parseSlidesToFile(ArrayList<Slide> inputSlides, String outputFile) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
//        writer.write(inputSlides.size() + "\n");
//        for (Slide s: inputSlides) {
//            writer.write(s.toString());
//        }
//
//        writer.close();
//    }
//}
