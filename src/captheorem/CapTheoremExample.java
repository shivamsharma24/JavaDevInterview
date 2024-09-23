package captheorem;

public class CapTheoremExample {
    public static void main(String[] args) {
        DistributedSystem system = new DistributedSystem(3);

        // Simulate writing data to all nodes
        system.writeToAllNodes("key1", "value1");

        // Simulate a partition (node 1 becomes unavailable)
        system.setNodeAvailability(1, false);

        // Simulate read from any available node
        System.out.println("Read from available node: " + system.readFromAnyNode("key1"));

        // Simulate consistency and partition tolerance trade-off
        system.writeToAllNodes("key1", "value2");
        System.out.println("Read after update (with partition): " + system.readFromAnyNode("key1"));

        // Restore node availability
        system.setNodeAvailability(1, true);
        System.out.println("Read after partition healed: " + system.readFromAnyNode("key1"));
    }
}
