package threadsafeclassdifferentWays;

public final class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public ImmutableCounter increment() {
        return new ImmutableCounter(count + 1);
    }

    public int getCount() {
        return count;
    }
}
