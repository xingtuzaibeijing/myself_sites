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
public class QueryPriceBody extends Body{
        //车型编号
        private String TRIMID;
        //使用性质
        private String TYPE;
        //车辆状况
        private String  CONDITION;
        //行驶里程,单位为万公里
        private String MILE;
        //所在地区
        private String CITY;
}
