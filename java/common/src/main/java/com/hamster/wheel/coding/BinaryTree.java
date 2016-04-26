package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 4/24/2016.
 */
public class BinaryTree {

    public int solution(Tree t){
        List<List<Integer>> paths = traverseTree(t);
        for(List<Integer> path: paths){
            System.out.println(path);
        }
        System.out.println(paths);
        return 1;
    }

    private List<List<Integer>> traverseTree(Tree t){
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        traverse(t, paths, new ArrayList<Integer>());
        return(paths);
    }

    private void traverse(Tree t, List<List<Integer>> paths,List<Integer> path) {

        if(t==null){
            return;
        }
        path.add(new Integer(t.x));
        if(t.l==null && t.r==null){
            paths.add(new ArrayList<>(path));
        }else{
            traverse(t.l, paths, path);
            traverse(t.r, paths, path);
        }
        path.remove(new Integer(t.x));
    }

}
