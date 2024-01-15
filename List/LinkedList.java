package Others;


import java.util.NoSuchElementException;

public class LinkedList<E>
{
    private LinkedListItem<E> first;
    private LinkedListItem<E> last;
    private int size;

    public LinkedList()
    {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public E getFirst()
    {
        if(first != null)
        {
            return first.getValue();
        }
        else
        {
            return null;
        }
    }

    public E getLast()
    {
        if(first != null)
        {
            return last.getValue();
        }
        else
        {
            return null;
        }
    }

    public E get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        LinkedListItem<E> current = first;

        for(int i = 0; i < index; i++)
        {
            current = current.getNext();
        }

        return current.getValue();
    }

    public void add(int index, E value)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        LinkedListItem<E> newItem = new LinkedListItem<>(value);

        if(index == 0)
        {
            newItem.setNext(first);
            first = newItem;
            if( size == 0)
            {
                last = newItem;
            }
        }
        else if(index == size)
        {
            last.setNext(newItem);
            last = newItem;
        }
        else
        {
            LinkedListItem<E> prev = getNodeByIndex(index - 1);
            newItem.setNext(prev.getNext());
            prev.setNext(newItem);
        }
        size++;
    }
    
    public void addFirst(E value)
    {
        LinkedListItem<E> newFisrtItem = new LinkedListItem<>(value);

        if(first == null)
        {
            first = newFisrtItem;
            last = newFisrtItem;
        }
        else
        {
            newFisrtItem.setNext(first);
            first = newFisrtItem;
        }

        size++;
    }

    public void addLast(E value)
    {
        LinkedListItem<E> newLastItem = new LinkedListItem(value);

        if(last == null)
        {
            first = newLastItem;
            last = newLastItem;
        }
        else
        {
            last.setNext(newLastItem);
            last = newLastItem;
        }

        size++;
    }

    public void remove(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    
        LinkedListItem<E> removedItem;
    
        if(index == 0)
        {
            removedItem = first;
            first = first.getNext();
            if(size == 1)
            {
                last = null;
            }
        }
        else 
        {
            LinkedListItem<E> prev = getNodeByIndex(index - 1);
            prev.setNext(prev.getNext().getNext());
            if(index == size - 1)
            {
                last = prev;
            }
        }
    }

    public E removeFirst()
    {
        if (first == null) 
        {
        throw new NoSuchElementException("The list is empty");
        }

        E removedValue = first.getValue();
        
        if(first.getNext() == null) 
        {
            first = null;
            last = null;
        } 
        else 
        {
            first = first.getNext();
        }

        size--;

        return removedValue;
    }

    public E removeLast()
    {
        if(first == null)
        {
            throw new NoSuchElementException("The list is empty");
        }

        E removedValue;

        if(first.getNext() == null)
        {
            removedValue = first.getValue();
            first = null;
            last = null;
        }
        else
        {
            LinkedListItem<E> penul = penultimate();
            removedValue = last.getValue();
            last = penul;
            last.setNext(null);
        }

        size--;

        return removedValue;
    }

    private LinkedListItem<E> penultimate()
    {
        LinkedListItem<E> current = first;

        while(current.getNext() != last)
        {
            current = current.getNext();
        }

        return current;
    }

    private LinkedListItem<E> getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        LinkedListItem<E> current = first;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    public int getIndex(E value) 
    {
        LinkedListItem<E> current = first;
        int index = 0;

        while (current != null) 
        {
            if (current.getValue().equals(value)) 
            {
                return index;
            }

            current = current.getNext();
            index++;
        }
        return -1;
    }

    public void printFirst()
    {
        System.out.println(first.getValue());
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(10);
        lista.addLast(20);
        lista.add(1, 15);
        lista.printFirst();
    }
}
