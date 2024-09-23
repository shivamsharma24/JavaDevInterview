package customfunctionalinterface;

import java.util.List;

@FunctionalInterface
interface SecondHighestFinder {
    OptionalIntWithCount findSecondHighest(List<Integer> list);
}

class OptionalIntWithCount {
    private final int number;
    private final long count;

    public OptionalIntWithCount(int number, long count) {
        this.number = number;
        this.count = count;
    }

    public int getNumber() {
        return number;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "2nd Highest Number: " + number + ", Count: " + count;
    }
}
