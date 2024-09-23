package threads;

class FriendBreakingLiveLock {
    private final String name;
    private boolean tryingToMove = true;

    public FriendBreakingLiveLock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void pass(FriendBreakingLiveLock friend) {
        while (tryingToMove) {
            System.out.println(name + ": " + friend.getName() + " you go first.");
            friend.letPass(this);
            // Adding a small delay to avoid livelock
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void letPass(FriendBreakingLiveLock friend) {
        tryingToMove = false;
        System.out.println(name + ": Okay, I'll move.");
    }
}