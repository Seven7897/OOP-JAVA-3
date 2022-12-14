package GenealogicalTreeResearch.ResearchLib;

import GenealogicalTreeResearch.GenTree;
import GenealogicalTreeResearch.Human;
import GenealogicalTreeResearch.Node;

import java.util.ArrayList;

public abstract class Research {
    ArrayList<Node> tree;
    private Human hum;

    public Research(GenTree pd, Human hum) {
        tree = pd.getData();
        this.hum = hum;
    }

    public ArrayList<Human> start() {
        return null;
    }

    public Human getHum() {
        return hum;
    }
}