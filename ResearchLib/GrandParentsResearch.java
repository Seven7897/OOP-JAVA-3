package GenealogicalTreeResearch.ResearchLib;

import GenealogicalTreeResearch.GenTree;
import GenealogicalTreeResearch.Human;
import GenealogicalTreeResearch.Node;
import GenealogicalTreeResearch.Relationship;

import java.util.ArrayList;

public class GrandParentsResearch extends Research{

    public GrandParentsResearch(GenTree pd, Human hum) {
        super(pd, hum);
    }

    @Override
    public ArrayList<Human> start() {
        var parentsList = new ArrayList<Human>();

        for (Node node : tree) {
            if (super.getHum().getName().equals(node.hum2.getName())
                    && node.relation == Relationship.parent) {
                parentsList.add(node.hum1);
            }
        }

        var result = new ArrayList<Human>();

        for (Human parent : parentsList) {
            for (Node node : tree) {
                if (parent.getName().equals(node.hum2.getName())
                        && node.relation == Relationship.parent) {
                    result.add(node.hum1);
                }
            }
        }

        return result;
    }
}