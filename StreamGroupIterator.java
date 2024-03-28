import java.util.Iterator;
import java.util.List;

public class StreamGroupIterator implements Iterator<Stream>{
    private List<Stream> streamList;

    private int count = 0;



    public StreamGroupIterator(StreamGroup streamGroup){
        this.streamList = streamGroup.getStreamList();
    }



    @Override
    public boolean hasNext(){
        return count < streamList.size();
    }

    @Override
    public Stream next(){
        if(!hasNext())
            return null;
        return streamList.get(count++);
    }

    @Override
    public void remove(){
        streamList.remove(count);
    }
}
