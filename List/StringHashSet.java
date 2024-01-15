package Others;
import java.util.ArrayList;

public class StringHashSet
{
    private ArrayList<String>[] data;
    private int sizeArray;

    public StringHashSet(int size)
    {
        sizeArray = size;
        data = new ArrayList[size];

        for(int i = 0; i < size; i++)//Isso faz com que as posições do array sejam vazias e não nulas.
        {
            data[i] = new ArrayList<>();
        }
    }

    public void add(String args)
    {
        int index = Math.abs(args.hashCode()%data.length);
        data[index].add(args);
    }

    public boolean contains(String str)
    {
        int index = Math.abs(str.hashCode()%data.length);
        return data[index].contains(str);
    }
}
