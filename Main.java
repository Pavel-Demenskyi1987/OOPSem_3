import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Stream stream1 = new Stream(1,"AAA23");
        Stream stream2 = new Stream(2,"BBB24");
        Stream stream3 = new Stream(3,"aaa37");
        Stream stream4 = new Stream(4,"BBB100");

        StreamGroup streamGroup = new StreamGroup();
        streamGroup.addStream(stream3);
        streamGroup.addStream(stream4);
        streamGroup.addStream(stream1);
        streamGroup.addStream(stream2);

        // StreamGroupIterator iterator = new StreamGroupIterator(streamGroup);
        // while(iterator.hasNext()){
        //     System.out.println(iterator.next());
        // }

        for (Stream stream : streamGroup) {
            System.out.println(stream);
            
        }

        System.out.println();

        for (Stream stream : getSortedStreamGroup(streamGroup)) {
            System.out.println(stream);
            
        }


        System.out.println();

        for (Stream stream : getSotredStreamGroupByName(streamGroup)) {
            System.out.println(stream);
            
        }


    }

    
    public static List<Stream> getSortedStreamGroup(StreamGroup s){
        List<Stream> streamList = new ArrayList<>(s.getStreamList());
        Collections.sort(streamList);
        return streamList;
    }

    public static List<Stream> getSotredStreamGroupByName(StreamGroup streamGroup){
        List<Stream> streamList = new ArrayList<>(streamGroup.getStreamList());
        streamList.sort(new StreamComparator());
        return streamList;
    }
        
    
}