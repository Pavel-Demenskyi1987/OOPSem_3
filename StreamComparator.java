import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream o1, Stream o2) {
        // TODO Auto-generated method stub


        return o1.getNumber().compareTo(o2.getNumber());
    }

    
}
