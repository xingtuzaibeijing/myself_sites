package org.qhs.myselfSites.dome.xmlentity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "getProductRequest", propOrder = {
//        "transHead",
//        "transBody"
//})

@XmlRootElement(name="ROOT")
public class Root {
    @XmlElement(name="HEAD")
    Head Head;

    @XmlElement(name="BODY")
    Body Body;

    @XmlTransient
    public Head getHead() {
        return this.Head;
    }
    public void setHead(Head head){
        this.Head = head;
    }
    @XmlTransient
    public Body getBody() {
        return Body;
    }
    public void setBody(Body Body) {
        this.Body = Body;
    }
}