// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!

package com.dyuproject.protostuff.benchmark;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.IOUtil;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class Media implements Serializable, Message<Media>, Schema<Media>
{
    public enum Player implements com.dyuproject.protostuff.EnumLite<Player>
    {
        JAVA(0),
        FLASH(0);
        
        public final int number;
        
        private Player (int number)
        {
            this.number = number;
        }
        
        public int getNumber()
        {
            return number;
        }
        
        public static Player valueOf(int number)
        {
            switch(number) 
            {
                default: return null;
            }
        }
    }

    public static Schema<Media> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static Media getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Media DEFAULT_INSTANCE = new Media();

    
    private String uri;
    private String title;
    private Integer width;
    private Integer height;
    private String format;
    private Long duration;
    private Long size;
    private Integer bitrate;
    private List<String> person;
    private Player player;
    private String copyright;

    public Media()
    {
    }

    public Media(
        String uri,
        String title,
        Integer width,
        Integer height,
        String format,
        Long duration,
        Long size,
        Integer bitrate,
        List<String> person,
        Player player,
        String copyright
    )
    {
        super();
        this.uri = uri;
        this.title = title;
        this.width = width;
        this.height = height;
        this.format = format;
        this.duration = duration;
        this.size = size;
        this.bitrate = bitrate;
        this.person = person;
        this.player = player;
        this.copyright = copyright;
    }

    // getters and setters

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Integer getWidth()
    {
        return width;
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Integer getHeight()
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public String getFormat()
    {
        return format;
    }

    public void setFormat(String format)
    {
        this.format = format;
    }

    public Long getDuration()
    {
        return duration;
    }

    public void setDuration(Long duration)
    {
        this.duration = duration;
    }

    public Long getSize()
    {
        return size;
    }

    public void setSize(Long size)
    {
        this.size = size;
    }

    public Integer getBitrate()
    {
        return bitrate;
    }

    public void setBitrate(Integer bitrate)
    {
        this.bitrate = bitrate;
    }

    public List<String> getPerson()
    {
        return person;
    }

    public void setPerson(List<String> person)
    {
        this.person = person;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright)
    {
        this.copyright = copyright;
    }

    // java serialization

    private void readObject(ObjectInputStream in) throws IOException
    {
        int length = in.readInt();
        byte[] data = new byte[length];
        for(int offset = 0; length > 0; length -= offset)
            offset = in.read(data, offset, length);
        IOUtil.mergeFrom(data, this);
    }

    private void writeObject(ObjectOutputStream out) throws IOException
    {
        byte[] data = IOUtil.toByteArray(this);
        out.writeInt(data.length);
        out.write(data);
    }

    // message method

    public Schema<Media> cachedSchema()
    {
        return this;
    }

    // schema methods

    public Media newMessage()
    {
        return new Media();
    }

    public Class<Media> typeClass()
    {
        return Media.class;
    }

    public boolean isInitialized(Media message)
    {
        return 
            message.uri != null;
    }

    public void mergeFrom(Input input, Media message) throws IOException
    {
        while(true)
        {
            int number = input.readFieldNumber(this);
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.uri = input.readString();
                    break;
                case 2:
                    message.title = input.readString();
                    break;
                case 3:
                    message.width = input.readInt32();
                    break;
                case 4:
                    message.height = input.readInt32();
                    break;
                case 5:
                    message.format = input.readString();
                    break;
                case 6:
                    message.duration = input.readInt64();
                    break;
                case 7:
                    message.size = input.readInt64();
                    break;
                case 8:
                    message.bitrate = input.readInt32();
                    break;
                case 9:
                    if(message.person == null)
                        message.person = new ArrayList<String>();
                    message.person.add(input.readString());
                    break;
                case 10:
                    message.player = Player.valueOf(input.readEnum());
                    break;
                case 11:
                    message.copyright = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, Media message) throws IOException
    {
        if(message.uri == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.uri, false);

        if(message.title != null)
            output.writeString(2, message.title, false);

        if(message.width != null)
            output.writeInt32(3, message.width, false);

        if(message.height != null)
            output.writeInt32(4, message.height, false);

        if(message.format != null)
            output.writeString(5, message.format, false);

        if(message.duration != null)
            output.writeInt64(6, message.duration, false);

        if(message.size != null)
            output.writeInt64(7, message.size, false);

        if(message.bitrate != null)
            output.writeInt32(8, message.bitrate, false);

        if(message.person != null)
        {
            for(String person : message.person)
            {
                if(person != null)
                    output.writeString(9, person, true);
            }
        }

        if(message.player != null)
             output.writeEnum(10, message.player.number, false);

        if(message.copyright != null)
            output.writeString(11, message.copyright, false);
    }

    public String getFieldName(int number)
    {
        switch(number)
        {
            case 1: return "uri";
            case 2: return "title";
            case 3: return "width";
            case 4: return "height";
            case 5: return "format";
            case 6: return "duration";
            case 7: return "size";
            case 8: return "bitrate";
            case 9: return "person";
            case 10: return "player";
            case 11: return "copyright";
            default: return null;
        }
    }

    public int getFieldNumber(String name)
    {
        Integer number = __fieldMap.get(name);
        return number == null ? 0 : number.intValue();
    }

    private static final java.util.HashMap<String,Integer> __fieldMap = new java.util.HashMap<String,Integer>();
    static
    {
        __fieldMap.put("uri", 1);
        __fieldMap.put("title", 2);
        __fieldMap.put("width", 3);
        __fieldMap.put("height", 4);
        __fieldMap.put("format", 5);
        __fieldMap.put("duration", 6);
        __fieldMap.put("size", 7);
        __fieldMap.put("bitrate", 8);
        __fieldMap.put("person", 9);
        __fieldMap.put("player", 10);
        __fieldMap.put("copyright", 11);
    }
}