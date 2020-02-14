public class Request {
    private final int videoID;
    private final int endpoint;
    private final int request;

    public Request (int newVideoID, int newEndpoint, int newRequest) {
        videoID = newVideoID;
        endpoint = newEndpoint;
        request = newRequest;
    }

    public int getVideoID() {
        return videoID;
    }

    public int getEndpoint() {
        return endpoint;
    }

    public int getRequest() {
        return request;
    }
}
