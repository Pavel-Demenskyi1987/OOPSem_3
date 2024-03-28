


public class Stream implements Comparable<Stream> {

    private int streamId;
    private String number;

    public Stream(int streamId, String number){
        this.streamId = streamId;
        this.number = number;
    }

    public int getStreamId(){
        return streamId;
    }


    public String getNumber(){
        return number;
    }


    @Override
    public String toString(){
       return "Stream{" +
                " streamId = " + streamId +
                " number = " + number +
                "}"; 
    }

    @Override
    public int compareTo(Stream o){
        if(streamId > o.getStreamId())
            return 1;
        else if(streamId < o.getStreamId())
            return -1;
        return 0;
    }

}   