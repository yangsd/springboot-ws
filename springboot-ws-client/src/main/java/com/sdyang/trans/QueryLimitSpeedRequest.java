
package com.sdyang.trans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kkbh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fxlx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cllx" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "kkbh",
    "fxlx",
    "cdh",
    "cllx"
})
@XmlRootElement(name = "QueryLimitSpeedRequest", namespace = "http://webservice.tfc.tmri.com")
public class QueryLimitSpeedRequest {

    @XmlElement(namespace = "http://webservice.tfc.tmri.com", required = true)
    protected String kkbh;
    @XmlElement(namespace = "http://webservice.tfc.tmri.com", required = true)
    protected String fxlx;
    @XmlElement(namespace = "http://webservice.tfc.tmri.com")
    protected long cdh;
    @XmlElement(namespace = "http://webservice.tfc.tmri.com", required = true)
    protected String cllx;

    /**
     * ��ȡkkbh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKkbh() {
        return kkbh;
    }

    /**
     * ����kkbh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKkbh(String value) {
        this.kkbh = value;
    }

    /**
     * ��ȡfxlx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxlx() {
        return fxlx;
    }

    /**
     * ����fxlx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxlx(String value) {
        this.fxlx = value;
    }

    /**
     * ��ȡcdh���Ե�ֵ��
     * 
     */
    public long getCdh() {
        return cdh;
    }

    /**
     * ����cdh���Ե�ֵ��
     * 
     */
    public void setCdh(long value) {
        this.cdh = value;
    }

    /**
     * ��ȡcllx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCllx() {
        return cllx;
    }

    /**
     * ����cllx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCllx(String value) {
        this.cllx = value;
    }

}
