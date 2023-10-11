package popular_problems.LRUCache;

import java.util.Optional;

public class TestLRUCache {

    public static void main(String[] args) {
//        ["LRUCache","put","put","get","put","get","put","get","get","get"]

//        [[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]

        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        System.out.println(Optional.ofNullable(null));
        cache.put(2,2);
        System.out.println(Optional.ofNullable(null));

        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(Optional.ofNullable(null));

        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(Optional.ofNullable(null));

        System.out.println(cache.get(1));


        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

    }
}
