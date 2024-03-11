package core_dsa.bst;

import core_dsa.linked_list.Node;

public class Main {

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 10 };
        tree.populate(nums);
        tree.populate(new int[]{3});
        System.out.println(tree.bfs(tree.root));
//        tree.display();
    }
}
