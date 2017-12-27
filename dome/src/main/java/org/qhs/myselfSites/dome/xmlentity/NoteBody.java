package org.qhs.myselfSites.dome.xmlentity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.Set;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/15
 */
@Data
@XmlRootElement(name = "BODY")
public class NoteBody extends Body{

    @XmlElementWrapper(name = "msgss")
    @XmlElements(value = { @XmlElement(name = "msg", type = msg.class) })
    Set<msg> msgss;
    private String operator;

    @XmlTransient
    public Set<msg> getMsgss() {
        return this.msgss;
    }
    public void setMsgss(Set<msg> msgss) {
        this.msgss = msgss;
    }

    @Data
    @XmlRootElement(name="msg")
    public static class msg{
        private String msgNo;
        private String templetId;
        private String phone;
        private String content;
    }
}
