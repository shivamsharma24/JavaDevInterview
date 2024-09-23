package threads;

class Friend {
    private final String name;
    private boolean tryingToMove = true;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void pass(Friend friend) {
        while (tryingToMove) {
            System.out.println(name + ": " + friend.getName() + " you go first.");
            friend.letPass(this);
        }
    }

    public synchronized void letPass(Friend friend) {
        tryingToMove = false;
        System.out.println(name + ": Okay, I'll move.");
    }
}

public class LivelockExample {
    public static void main(String[] args) {
        Friend alice = new Friend("Alice");
        Friend bob = new Friend("Bob");

        new Thread(() -> alice.pass(bob)).start();
        new Thread(() -> bob.pass(alice)).start();
    }
}
