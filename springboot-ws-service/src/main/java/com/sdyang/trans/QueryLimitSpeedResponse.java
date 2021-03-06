
package com.sdyang.trans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryLimitSpeedReturn" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryLimitSpeedReturn"
})
@XmlRootElement(name = "QueryLimitSpeedResponse", namespace = "http://webservice.tfc.tmri.com")
public class QueryLimitSpeedResponse {

    @XmlElement(name = "QueryLimitSpeedReturn", namespace = "http://webservice.tfc.tmri.com")
    protected long queryLimitSpeedReturn;

    /**
     * 获取queryLimitSpeedReturn属性的值。
     * 
     */
    public long getQueryLimitSpeedReturn() {
        return queryLimitSpeedReturn;
    }

    /**
     * 设置queryLimitSpeedReturn属性的值。
     * 
     */
    public void setQueryLimitSpeedReturn(long value) {
        this.queryLimitSpeedReturn = value;
    }

}
