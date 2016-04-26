package com.hamster.wheel.coding;

import org.junit.Test;

import static com.hamster.wheel.coding.BinaryTree.*;

/**
 * Created by jason on 4/24/2016.
 */
public class BinaryTreeTest {

    private BinaryTree bt = new BinaryTree();

    @Test
    public void test(){
        Tree a = new Tree();
        a.x = 4;

        Tree b = new Tree();
        b.x = 5;

        Tree c = new Tree();
        c.x = 6;

        Tree d = new Tree();
        d.x = 4;

        Tree e = new Tree();
        e.x = 1;

        Tree f = new Tree();
        f.x = 6;


        Tree g = new Tree();
        g.x = 5;

        a.l=b;
        a.r=c;
        b.l=d;
        d.l=g;
        c.l=e;
        c.r=f;

        bt.solution(a);
    }
}
