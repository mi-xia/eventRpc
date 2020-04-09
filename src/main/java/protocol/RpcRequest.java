package protocol;

import lombok.Data;

/**
 * 请求报文结构
 */
@Data
public class RpcRequest {

    //调用编号
    private String requestId;

    //类名
    private String className;

    //方法名
    private String methodName;

    //请求参数类型
    private Class<?>[]  parameterTypes;

    //请求参数
    private Object[] parameters;

}
