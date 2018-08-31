package structurial.Composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/13/2018.
 */
public class Node extends TreeItem {

    List<TreeItem> treeItems = new ArrayList<>();

    void add(TreeItem treeItem){
        treeItems.add(treeItem);
    }

    void remove(TreeItem treeItem){
        treeItems.remove(treeItem);
    }

    @Override
    int getCount() {
        int tempCount = count;
        for(TreeItem item : treeItems){
            tempCount +=item.getCount();
        }
        return tempCount;
    }

    @Override
    void increment() {
       for(TreeItem item : treeItems){
           item.increment();
       }
       count++;
    }
}
