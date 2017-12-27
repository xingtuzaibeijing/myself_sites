package org.qhs.myselfSites.dome.feign;

import feign.Headers;
import feign.RequestLine;
import org.qhs.myselfSites.dome.xmlentity.TransData;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/10
 */
@FeignClient(name="json",url="http://172.16.10.238:8081/")
public interface JsonClient {

        @Headers("Content-Type: application/json;charset=UTF-8")
        @RequestMapping(value = "/bankportal/WbService/reqCheck", method = RequestMethod.POST,consumes= "application/json;charset=UTF-8")
        @RequestLine("POST /bankportal/WbService/reqCheck")
        String reqCheck(TransData transData);
//  result reqCheck(TransData transData);
//    @Data
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(name = "getProductRequest", propOrder = {
//            "transHead",
//            "transBody",
//    })
//    @XmlRootElement(name="TransData")
//    class TransDatain{
//        @XmlElement(name="TransHead",required = true)
//        Set<TransType> transHead;
//
//        @XmlElement(name="TransBody",required = true)
//        Set<TransBody> transBody;
//
//        @XmlTransient
//        public Set<TransType> getTransHead() {
//            return this.transHead;
//        }
//
//        public void setTransHead(Set<TransType> transType){
//            this.transHead = transType;
//        }
//
//        @XmlTransient
//        public Set<TransBody> getTransBody() {
//            return transBody;
//        }
//
//        public void setTransBody(Set<TransBody> transBody) {
//            this.transBody = transBody;
//        }
//    }
//
//    @Data
//    @XmlRootElement
//    class result {
//        @XmlElement(required = true)
//        String ;
//        public void setMessage(String message){
//            this.message = message;
//        }
//        @XmlTransient
//        public String getMessage() {
//            return message;
//        }
//    }
}
