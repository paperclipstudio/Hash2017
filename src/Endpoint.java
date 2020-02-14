import java.util.ArrayList;

public class Endpoint {
    private final int totalCache;
    private ArrayList<Cache> caches;

    public Endpoint (int newTotalCache) {
        totalCache = newTotalCache;
        caches = new ArrayList<Cache>(totalCache);
    }

    public int getTotalCache() {
        return totalCache;
    }

    private void addCacheToArray(Cache newCache) {
        caches.add(newCache);
    }
}
