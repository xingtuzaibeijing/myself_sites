package org.qhs.myselfSites.dome.xmlentity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Set;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "getProductRequest", propOrder = {
//        "transHead",
//        "transBody"
//})
@XmlRootElement(name="TransData")
public class TransData {
    @XmlElement(name="TransHead")
    Set<TransType> transHead;

    @XmlElement(name="TransBody")
    Set<TransBody> transBody;

    @XmlTransient
    public Set<TransType> getTransHead() {
        return this.transHead;
    }
    public void setTransHead(Set<TransType> transType){
        this.transHead = transType;
    }
    @XmlTransient
    public Set<TransBody> getTransBody() {
        return transBody;
    }

    public void setTransBody(Set<TransBody> transBody) {
        this.transBody = transBody;
    }

}