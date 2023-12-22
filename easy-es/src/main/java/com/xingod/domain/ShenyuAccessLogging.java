package com.xingod.domain;

import lombok.Data;
import org.dromara.easyes.annotation.IndexField;
import org.dromara.easyes.annotation.IndexName;


/**
 * @Program:  ES实体
 * ES库名：shenyu-access-logging
 * @Description: ES数据库文件类型
 * @Author: fanxin
 * @Create: 2023-12-22
 */
@Data
@IndexName("shenyu-access-logging")
public class ShenyuAccessLogging {

    private String id;
    /**
     * 客户端IP
     */
    private String clientIp;

    /**
     * 请求路径
     */
    private String path;

    private String pathName;

    /**
     * 接口编码
     */
    private String apiCode;

    /**
     * 应用ID
     */
    private String appId;

    private String appName;


    /**
     * 请求时间
     */
    private Long  upstreamResponseTime;

    /**
     * 请求时间
     */
    @IndexField(value = "timeLocal.keyword")
    private String timeLocal;


    /**
     * 请求状态码
     */
    private Integer status;

    private boolean successStatus = false;


    /**
     * 请求头信息
     */
    private String requestHeader;


    /**
     * 请求体信息
     */
    private String requestBody;

    /**
     * 返回体信息
     */
    private String responseBody;

}
