import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<Stream>{
    private List<Stream> streamList;


    public StreamGroup(List<Stream> streamList){
        this.streamList = streamList;
    }

    public StreamGroup(){
        streamList = new ArrayList<>();
    }

    public void addStream(Stream stream){
        streamList.add(stream);
    }

    public List<Stream> getStreamList(){
        return streamList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new StreamGroupIterator(this);
    }

}
