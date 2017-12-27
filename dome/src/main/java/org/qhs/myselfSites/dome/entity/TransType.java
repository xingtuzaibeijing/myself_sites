package org.qhs.myselfSites.dome.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/10
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TransType {
    @XmlElement(name="OutServiceCode")
    private String OutServiceCode;
    @XmlElement(name="TransType")
    private String TransType;
    @XmlElement(name="TransSerialNo")
    private String TransSerialNo;
    @XmlElement(name="TransExeDate")
    private String TransExeDate;
    private Return   Return;
    @Data
    @XmlRootElement
    public static class Return{
        @XmlElement(name="DEalDate")
        String DEalDate;
        @XmlElement(name="ResponseCode")
        String ResponseCode;
        @XmlElement(name="ErrorCode")
        String ErrorCode;
        @XmlElement(name="ErrorMsg")
        String ErrorMsg;
        @XmlElement(name="ErrorCenter")
        String ErrorCenter;

        @XmlTransient
        public String getDEalDate() {
            return DEalDate;
        }

        public void setDEalDate(String DEalDate){
            this.DEalDate = DEalDate;
        }

        @XmlTransient
        public String getResponseCode() {
            return ResponseCode;
        }

        public void setResponseCode(String ResponseCode){
            this.ResponseCode = ResponseCode;
        }

        @XmlTransient
        public String getErrorCode() {
            return ErrorCode;
        }

        public void setErrorCode(String ErrorCode){
            this.ErrorCode = ErrorCode;
        }

        @XmlTransient
        public String getErrorMsg() {
            return ErrorMsg;
        }

        public void setErrorMsg(String ErrorMsg){
            this.ErrorMsg = ErrorMsg;
        }

        @XmlTransient
        public String getErrorCenter() {
            return ErrorCenter;
        }

        public void setErrorCenter(String ErrorCenter){
            this.ErrorCenter = ErrorCenter;
        }
    }
}
