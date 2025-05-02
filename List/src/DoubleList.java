public abstract class DoubleList {
    protected DoubleNode first;
    protected DoubleNode last;

    abstract void addStack(int theData);

    abstract void addQueue(int theData);

    abstract void traversalRight();

    abstract void traversalLeft();

    abstract DoubleNode search(int theData);

    abstract void delete(int theData);

}
