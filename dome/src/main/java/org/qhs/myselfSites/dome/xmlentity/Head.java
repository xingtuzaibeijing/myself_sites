package org.qhs.myselfSites.dome.xmlentity;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/15
 */
@Data
@XmlRootElement(name="HEAD")
public class Head {
    private String SEQNO;
    private String SERVICECODE;
    private String CHANNELID;
    private String SENDTIME;
    private String RSPCODE;
    private String RSPMSG;
    private String EXT;
}
