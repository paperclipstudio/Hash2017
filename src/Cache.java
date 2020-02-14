import java.util.ArrayList;

public class Cache {
  int ID;
  static int maxSize = 0;
  ArrayList<Integer> time;
  ArrayList<Video> videos;
  Cache(int ID) {
    this.ID = ID;
    this.videos = new ArrayList<Video>();
  };

  public int getNumberOfVideos() {
    return videos.size();
  }

  public int getID() {
    return ID;
  }

  public int currentSize() {
    int sum = 0;
    for(Video cur: videos) {
      sum += cur.size;
    }
    return sum;
  }

  public boolean canFit (Video test) {
    return (test.size + this.currentSize() <= maxSize );
  }

  /**
   * @return the videos
   */
  public ArrayList<Video> getVideos() {
  	return videos;
  }

  public void addVideo(Video input) {
    this.videos.add(input);
  }


}
