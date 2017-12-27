package org.qhs.myselfSites.dome.xmlentity;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/15
 */
@Data
@XmlRootElement(name = "BODY")
public class GetVehicleTypeByVINBody extends Body{
        //申请单号
        private String applyNo;
        //操作人编码
        private String operator;
        //车架号
        private String currentNo;
}
