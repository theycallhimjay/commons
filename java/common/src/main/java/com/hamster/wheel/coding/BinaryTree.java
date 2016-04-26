package com.hamster.wheel.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jason on 4/24/2016.
 */
public class BinaryTree {

    public int solution(Tree t){
        Set<List<Integer>> paths = traverseTree(t);
        return paths.size();
    }

    private Set<List<Integer>> traverseTree(Tree t){
        Set<List<Integer>> paths = new HashSet<List<Integer>>();
        traverse(t, paths, new ArrayList<Integer>());
        return(paths);
    }

    private void traverse(Tree t, Set<List<Integer>> paths,List<Integer> path) {
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
