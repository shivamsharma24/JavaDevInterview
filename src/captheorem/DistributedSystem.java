package captheorem;

import java.util.ArrayList;
import java.util.List;

public class DistributedSystem {
    private final List<Node> nodes;

    public DistributedSystem(int numberOfNodes) {
        nodes = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            nodes.add(new Node());
        }
    }

    public String readFromAnyNode(String key) {
        for (Node node : nodes) {
            if (node.isAvailable()) {
                return node.read(key);
            }
        }
        return "Unavailable";
    }

    public void writeToAllNodes(String key, String value) {
        for (Node node : nodes) {
            if (node.isAvailable()) {
                node.write(key, value);
            }
        }
    }

    public void setNodeAvailability(int index, boolean available) {
        if (index >= 0 && index < nodes.size()) {
            nodes.get(index).setAvailable(available);
        }
    }
}
