package popular_problems.LRUCache;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private int capacity;
    private Map<Integer, Node> cache;

    Node left;
    Node right;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        this.left = new Node(0,0);
        this.right = new Node(0,0);

        this.left.next = this.right;
        this.right.prev = this.left;

        this.cache = new HashMap();
    }

    public int get(int key) {
        /**
         i get from the map and return the val if the key exists otherwise return -1
         I update my LRU Node Node and MRU Node
         */

        if(cache.containsKey(key)){
            remove(cache.get(key));
            insert(cache.get(key));

            return cache.get(key).key;
        }else {
            return -1;
        }

    }



    public void put(int key, int value) {

        /**
         check if the key exists, then update the value
         If it's a new key add a new value
         if the cache is full remove the LRU Node
         */


        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        cache.put(key, new Node(key, value));
        insert(cache.get(key));

        if (cache.size() > capacity) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }


    }

    private void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node){
        Node prev = this.right.prev;
        Node next = this.right;

        prev.next = node;
        next.prev = node;

        node.next = next;
        node.prev = prev;

    }

    class Node {
        private int key;
        private int val;
        Node next;
        Node prev;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */