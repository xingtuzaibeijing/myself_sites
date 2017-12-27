package org.qhs.myselfSites.dome.xmlentity;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @description:
 * @author:qianh .
 * @since:2017/11/10
 */
@Data
@XmlRootElement
public class Item {
    private String name;
    private String value;
}
