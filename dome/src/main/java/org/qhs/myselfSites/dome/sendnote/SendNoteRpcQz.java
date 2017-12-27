package org.qhs.myselfSites.dome.sendnote;

import feign.Headers;
import feign.RequestLine;
import org.qhs.myselfSites.dome.xmlentity.Root;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qiaohao on 2017/11/3.
 */
@FeignClient(name="a",url="http://172.16.10.224:9000/")
public interface SendNoteRpcQz {
    /**
     *@Description:获取短信验证码
     *@Author:QianHuaSheng
     *@Param:
     *@Date: 2017/11/15 15:48
     *@Return:
     */
    @Headers("Content-Type: application/xml;charset=UTF-8")
    @RequestLine("POST /bankportal/WbService/reqCheck")
    @RequestMapping(method = RequestMethod.POST,consumes= "application/xml;charset=UTF-8")
    Root sendNote(Root root);

}
