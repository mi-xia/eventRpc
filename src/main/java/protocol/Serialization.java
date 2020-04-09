package protocol;

/**
 *
 */
public interface Serialization {

    //序列化
    <T> byte[] serialize(T object);

    //反序列化
    <T> T deSerialize(byte[] data,Class<T> clz);

}
