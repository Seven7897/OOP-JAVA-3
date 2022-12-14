package GenealogicalTreeResearch.ResearchLib;

import GenealogicalTreeResearch.GenTree;
import GenealogicalTreeResearch.Human;
import GenealogicalTreeResearch.Node;
import GenealogicalTreeResearch.Relationship;

import java.util.ArrayList;

public class BrotherSisterResearch extends Research {
    private Human parent;

    public BrotherSisterResearch (GenTree pd, Human hum) {
        super(pd, hum);
    }

    @Override
    public ArrayList<Human> start() {
        for (Node node : tree) {
            if (super.getHum().getName().equals(node.hum1.getName())
                    && node.relation == Relationship.child) {
                parent = node.hum2;
                break;
            }
        }

        var result = new ArrayList<Human>();

        for (Node node : tree) {
            if (parent.getName().equals(node.hum1.getName())
                    && node.relation == Relationship.parent && !node.hum2.getName().equals(super.getHum().getName())) {
                result.add(node.hum2);
            }
        }

        return result;
    }
}