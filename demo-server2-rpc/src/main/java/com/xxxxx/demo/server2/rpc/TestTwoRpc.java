package com.xxxxx.demo.server2.rpc;

import com.xxxxx.demo.server2.pojo.po.TestTwoVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author jinshiqiang
 */
@FeignClient(name = "demo-server2")
public interface TestTwoRpc {

    /**
     * 测试
     *
     * @param testTwoVO testTwoVO
     * @return
     */
    @PostMapping("send")
    TestTwoVO sendTestTwo(@RequestBody TestTwoVO testTwoVO);
}
