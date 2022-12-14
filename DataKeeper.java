package GenealogicalTreeResearch;

import java.util.ArrayList;

public interface DataKeeper {
    ArrayList<Node> getData();
    void addData(Human hum1, Human hum2);
}
