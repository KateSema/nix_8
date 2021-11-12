package ua.com.alevel.level_1.treenode;

import ua.com.alevel.level_1.countuniquevalue.CountUniqueValue;
import ua.com.alevel.level_1.knightmove.KnightMove;

import java.io.BufferedReader;
import java.io.IOException;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    int maxDepth() {
        return depth(this);
    }

    int depth(TreeNode temp) {
        if (temp == null)
            return 0;
        else {
            int lchild = depth(temp.left);
            int rchild = depth(temp.right);
            if (lchild <= rchild)
                return rchild + 1;
            else
                return lchild + 1;
        }
    }
}

