package protocol;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonSerialization implements Serialization {

    private ObjectMapper objectMapper;

    private JsonSerialization(){
        this.objectMapper = new ObjectMapper();
    }


    //序列化
    public <T> byte[] serialize(T object) {
        try {
            return objectMapper.writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    //反序列化
    public <T> T deSerialize(byte[] data, Class<T> clz) {
        try {
            return objectMapper.readValue(data,clz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
