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
@XmlRootElement
public class CommitQueryBody extends Body{

    @XmlElementWrapper(name = "msgss")
    @XmlElements(value = { @XmlElement(name = "msg", type = person.class) })
    Set<person> persons;
    private String applyNo;
    private String operator;
    private String isForceQuery;
    private guaranteeCompany guaranteeCompany;

    @XmlTransient
    public Set<person> getPerson() {
        return this.persons;
    }
    public void setMsgss(Set<person> persons) {
        this.persons = persons;
    }

    @Data
    @XmlRootElement(name="person")
    public static class person{
        private String applyType;
        private String name;
        private String idNo;
        private String idType;

        private String reason;
        private String mobile;
        private String workUnit;
        private String residenceAddress;

        private String workUnitAddress;
        private String homeTel;
        private String workUnitPhone;
        private String weixin;

        private String qq;
        private String email;
        private String bankCardNo;
    }

    @Data
    @XmlRootElement(name="guaranteeCompany")
    public static class guaranteeCompany{
        private String companyName;
        private String businessLicenceNo;
        private String lawPersonName;
        private String lawPersonIdNo;
        private String workUnitPhone;
        private String workUnitAddress;
    }
}
