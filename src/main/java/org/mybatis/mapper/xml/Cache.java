//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.07 时间 06:36:51 PM CST 
//


package org.mybatis.mapper.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="eviction" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="flushInterval" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="blocking" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
@XmlRootElement(name = "cache")
public class Cache {

    protected List<Property> property;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "eviction")
    @XmlSchemaType(name = "anySimpleType")
    protected String eviction;
    @XmlAttribute(name = "flushInterval")
    @XmlSchemaType(name = "anySimpleType")
    protected String flushInterval;
    @XmlAttribute(name = "size")
    @XmlSchemaType(name = "anySimpleType")
    protected String size;
    @XmlAttribute(name = "readOnly")
    @XmlSchemaType(name = "anySimpleType")
    protected String readOnly;
    @XmlAttribute(name = "blocking")
    @XmlSchemaType(name = "anySimpleType")
    protected String blocking;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取eviction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEviction() {
        return eviction;
    }

    /**
     * 设置eviction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEviction(String value) {
        this.eviction = value;
    }

    /**
     * 获取flushInterval属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlushInterval() {
        return flushInterval;
    }

    /**
     * 设置flushInterval属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlushInterval(String value) {
        this.flushInterval = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * 获取readOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * 设置readOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * 获取blocking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocking() {
        return blocking;
    }

    /**
     * 设置blocking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocking(String value) {
        this.blocking = value;
    }

}
