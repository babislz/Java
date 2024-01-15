package Others;
import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue<E>
{
    LinkedList<E> queue;
    Comparator<E> cmp;

    public PriorityQueue(Comparator<E> comparator)
    {
        this.queue = new LinkedList<E>();
        this.cmp = comparator;
    }
    //peek e pool retornam

    public void add(E value)
    {
        
    }

    public int sizeQueue()
    {
        return queue.size();
    }

    public E pool()
    {

    }

    public E peek()
    {
        return queue.getLast();
    }
}
