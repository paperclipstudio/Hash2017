public class Stuff {
  public static void stuff(Cache[] caches, Video[] videos) {
    int currentVideo = 0;
    for (Cache cur: caches) {

       System.out.println(currentVideo + " " + cur.getID());
      while ( currentVideo < videos.length && cur.canFit(videos[currentVideo]) ) {
      //System.out.println("!" + currentVideo + " " + cur.currentSize());
        cur.addVideo(videos[currentVideo]);
        currentVideo++;
      }
      currentVideo++;

    }
  }
}
