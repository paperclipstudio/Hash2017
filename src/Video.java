public class Video {
    public final int iD;
    public final int size;

    public Video (int newID, int newSize) {
        iD = newID;
        size = newSize;
    }

    public int getID() {
        return iD;
    }

    public int getSize() {
        return size;
    }
}
