package com.xingod.resolver;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;

/**
 * @Author：fanxin
 * @Package：com.xingod.resolver
 * @Project：springboot3-dromara
 * @name：LazyStandardServletMultipartResolver
 * @Date：2023/12/21 10:25
 */
public class LazyStandardServletMultipartResolver implements MultipartResolver {
    @Override
    public boolean isMultipart(HttpServletRequest request) {
        return false;
    }

    @Override
    public MultipartHttpServletRequest resolveMultipart(HttpServletRequest request) throws MultipartException {
        return null;
    }

    @Override
    public void cleanupMultipart(MultipartHttpServletRequest request) {

    }
}
