package br.com.acbueno.learning.desing.patterns.structural.flyweight.tree;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.JFrame;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();


    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint(Graphics graphics) {
        for(Tree tree: trees) {
            tree.draw(graphics);
        }
    }

}
