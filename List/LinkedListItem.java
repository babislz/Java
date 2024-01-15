package Others;


public class LinkedListItem<E>
{   
    private E value;
    private LinkedListItem<E> next;

    public LinkedListItem(E value)
    {
        this.value = value;
        this.next = null;
    }

    public E getValue()
    {
        return value;
    }

    public void setValue(E value)
    {
        this.value = value;
    }

    public LinkedListItem<E> getNext()
    {
        return next;
    }

    public void setNext(LinkedListItem<E> next)
    {
        this.next = next;
    }

    public static void main(String[] args)
    {
        LinkedListItem<Integer> nodeOne = new LinkedListItem<>(1);
        LinkedListItem<Integer> nodeTwo = new LinkedListItem<>(2);

        nodeOne.setNext(nodeTwo);

        LinkedListItem<Integer> nextNode = nodeOne.getNext();
        System.out.println(nextNode.getValue());
    }
}