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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}constructor" minOccurs="0"/>
 *         &lt;element ref="{}id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}result" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}association" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}collection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}discriminator" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="extends" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="autoMapping">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "constructor",
    "id",
    "result",
    "association",
    "collection",
    "discriminator"
})
@XmlRootElement(name = "resultMap")
public class ResultMap {

    protected Constructor constructor;
    protected List<Id> id;
    protected List<Result> result;
    protected List<Association> association;
    protected List<Collection> collection;
    protected Discriminator discriminator;
    @XmlAttribute(name = "type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "extends")
    @XmlSchemaType(name = "anySimpleType")
    protected String _extends;
    @XmlAttribute(name = "autoMapping")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoMapping;

    /**
     * 获取constructor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Constructor }
     *     
     */
    public Constructor getConstructor() {
        return constructor;
    }

    /**
     * 设置constructor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Constructor }
     *     
     */
    public void setConstructor(Constructor value) {
        this.constructor = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * 
     * 
     */
    public List<Id> getId() {
        if (id == null) {
            id = new ArrayList<Id>();
        }
        return this.id;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result }
     * 
     * 
     */
    public List<Result> getResult() {
        if (result == null) {
            result = new ArrayList<Result>();
        }
        return this.result;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Association }
     * 
     * 
     */
    public List<Association> getAssociation() {
        if (association == null) {
            association = new ArrayList<Association>();
        }
        return this.association;
    }

    /**
     * Gets the value of the collection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Collection }
     * 
     * 
     */
    public List<Collection> getCollection() {
        if (collection == null) {
            collection = new ArrayList<Collection>();
        }
        return this.collection;
    }

    /**
     * 获取discriminator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Discriminator }
     *     
     */
    public Discriminator getDiscriminator() {
        return discriminator;
    }

    /**
     * 设置discriminator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Discriminator }
     *     
     */
    public void setDiscriminator(Discriminator value) {
        this.discriminator = value;
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
     * 获取extends属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtends() {
        return _extends;
    }

    /**
     * 设置extends属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtends(String value) {
        this._extends = value;
    }

    /**
     * 获取autoMapping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoMapping() {
        return autoMapping;
    }

    /**
     * 设置autoMapping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoMapping(String value) {
        this.autoMapping = value;
    }

}
