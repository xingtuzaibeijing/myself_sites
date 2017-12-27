package org.qhs.myselfSites.dome.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/10
 */
@Data
@XmlRootElement
public class TransBody {
    @XmlElement(name="CODE")
    String CODE;
    @XmlElement(name="DESC")
    String DESC;
    @XmlElement(name="APP_NO")
    String APP_NO;
    @XmlElement(name="TXN_ID")
    String TXN_ID;
    @XmlElement(name="MERCHANT_ID")
    String MERCHANT_ID;
    @XmlElement(name="MER_ORDER_NO")
    String MER_ORDER_NO;
    @XmlElement(name="NBS_ORDER_NO")
    String NBS_ORDER_NO;
    @XmlElement(name="ERR_CODES")
    String ERR_CODES;
    @XmlElement(name="BASQBH")
    String BASQBH;
    private Condition condition;

    @XmlTransient
    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE){
        this.CODE = CODE;
    }

    @XmlTransient
    public String getDESC() {
        return DESC;
    }

    public void setDESC(String DESC){
        this.DESC = DESC;
    }

    @XmlTransient
    public String getAPP_NO() {
        return APP_NO;
    }

    public void setAPP_NO(String APP_NO){
        this.APP_NO = APP_NO;
    }

    @XmlTransient
    public String getTXN_ID() {
        return TXN_ID;
    }

    public void setTXN_ID(String TXN_ID){
        this.TXN_ID = TXN_ID;
    }

    @XmlTransient
    public String getMERCHANT_ID() {
        return MERCHANT_ID;
    }

    public void setMERCHANT_ID(String MERCHANT_ID){
        this.MERCHANT_ID = MERCHANT_ID;
    }

    public void setTransHead(String MER_ORDER_NO){
        this.MER_ORDER_NO = MER_ORDER_NO;
    }

    @XmlTransient
    public String getMER_ORDER_NO() {
        return MER_ORDER_NO;
    }

    @XmlTransient
    public String getNBS_ORDER_NO() {
        return NBS_ORDER_NO;
    }

    public void setNBS_ORDER_NO(String NBS_ORDER_NO){
        this.NBS_ORDER_NO = NBS_ORDER_NO;
    }

    @XmlTransient
    public String getERR_CODES() {
        return ERR_CODES;
    }

    public void setERR_CODES(String ERR_CODES){
        this.ERR_CODES = ERR_CODES;
    }

    @XmlTransient
    public String getBASQBH() {
        return BASQBH;
    }

    public void setBASQBH(String BASQBH){
        this.BASQBH = BASQBH;
    }
}
