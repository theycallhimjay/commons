package com.hamster.wheel.coding;

import org.junit.Test;

import static com.hamster.wheel.coding.BinaryTree.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by jason on 4/24/2016.
 */
public class BinaryTreeTest {

    private BinaryTree bt = new BinaryTree();

    @Test
    public void test(){
        Tree a = new Tree();
        a.x = 4;
        a.label = 'a';

        Tree b = new Tree();
        b.x = 5;
        b.label = 'b';

        Tree c = new Tree();
        c.x = 6;
        c.label = 'c';

        Tree d = new Tree();
        d.x = 4;
        d.label = 'd';

        Tree e = new Tree();
        e.x = 1;
        e.label = 'e';

        Tree f = new Tree();
        f.x = 6;
        f.label = 'f';

        Tree g = new Tree();
        g.x = 5;
        g.label = 'g';

        a.l=b;
        a.r=c;
        b.l=d;
        d.l=g;
        c.l=e;
        c.r=f;

        assertEquals(bt.solution(a), 3);
    }

    @Test
    public void test1(){
        Tree a = new Tree();
        a.x = 4;
        a.label = 'a';

        Tree b = new Tree();
        b.x = 5;
        b.label = 'b';

        Tree c = new Tree();
        c.x = 6;
        c.label = 'c';

        Tree d = new Tree();
        d.x = 4;
        d.label = 'd';

        Tree e = new Tree();
        e.x = 1;
        e.label = 'e';

        Tree f = new Tree();
        f.x = 1;
        f.label = 'f';

        Tree g = new Tree();
        g.x = 5;
        g.label = 'g';

        a.l=b;
        a.r=c;
        b.l=d;
        d.l=g;
        c.l=e;
        c.r=f;

        assertEquals(bt.solution(a),2);
    }
}
