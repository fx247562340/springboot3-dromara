package com.xingod.controller;

import com.xingod.domain.ShenyuAccessLogging;
import com.xingod.mapper.ShenyuAccessLoggingMapper;
import jakarta.annotation.Resource;
import org.dromara.easyes.core.biz.EsPageInfo;
import org.dromara.easyes.core.conditions.select.LambdaEsQueryWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author：fanxin
 * @Package：com.xingod.controller
 * @Project：springboot3-dromara
 * @name：LogController
 * @Date：2023/12/22 14:28
 */
@RestController
public class LogController {

    @Resource
    private ShenyuAccessLoggingMapper loggingMapper;

    @GetMapping("/list")
    public EsPageInfo<ShenyuAccessLogging> list() {
        // 查询出所有标题为老汉的文档列表
        LambdaEsQueryWrapper<ShenyuAccessLogging> wrapper = new LambdaEsQueryWrapper<>();
        wrapper.match(ShenyuAccessLogging::getStatus, 200);
        wrapper.orderByDesc(ShenyuAccessLogging::getTimeLocal);
        EsPageInfo<ShenyuAccessLogging> pageInfo = loggingMapper.pageQuery(wrapper, 1, 10);
        return pageInfo;
    }

}
