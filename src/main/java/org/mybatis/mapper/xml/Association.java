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
 *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="jdbcType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="select" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="resultMap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="typeHandler" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="notNullColumn" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="columnPrefix" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="resultSet" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="foreignColumn" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="autoMapping">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fetchType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="lazy"/>
 *             &lt;enumeration value="eager"/>
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
@XmlRootElement(name = "association")
public class Association {

    protected Constructor constructor;
    protected List<Id> id;
    protected List<Result> result;
    protected List<Association> association;
    protected List<Collection> collection;
    protected Discriminator discriminator;
    @XmlAttribute(name = "property", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String property;
    @XmlAttribute(name = "column")
    @XmlSchemaType(name = "anySimpleType")
    protected String column;
    @XmlAttribute(name = "javaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String javaType;
    @XmlAttribute(name = "jdbcType")
    @XmlSchemaType(name = "anySimpleType")
    protected String jdbcType;
    @XmlAttribute(name = "select")
    @XmlSchemaType(name = "anySimpleType")
    protected String select;
    @XmlAttribute(name = "resultMap")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultMap;
    @XmlAttribute(name = "typeHandler")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeHandler;
    @XmlAttribute(name = "notNullColumn")
    @XmlSchemaType(name = "anySimpleType")
    protected String notNullColumn;
    @XmlAttribute(name = "columnPrefix")
    @XmlSchemaType(name = "anySimpleType")
    protected String columnPrefix;
    @XmlAttribute(name = "resultSet")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultSet;
    @XmlAttribute(name = "foreignColumn")
    @XmlSchemaType(name = "anySimpleType")
    protected String foreignColumn;
    @XmlAttribute(name = "autoMapping")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String autoMapping;
    @XmlAttribute(name = "fetchType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fetchType;

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
     * 获取property属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * 获取column属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * 设置column属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * 获取javaType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * 设置javaType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaType(String value) {
        this.javaType = value;
    }

    /**
     * 获取jdbcType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * 设置jdbcType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdbcType(String value) {
        this.jdbcType = value;
    }

    /**
     * 获取select属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelect() {
        return select;
    }

    /**
     * 设置select属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelect(String value) {
        this.select = value;
    }

    /**
     * 获取resultMap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMap() {
        return resultMap;
    }

    /**
     * 设置resultMap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMap(String value) {
        this.resultMap = value;
    }

    /**
     * 获取typeHandler属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeHandler() {
        return typeHandler;
    }

    /**
     * 设置typeHandler属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeHandler(String value) {
        this.typeHandler = value;
    }

    /**
     * 获取notNullColumn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotNullColumn() {
        return notNullColumn;
    }

    /**
     * 设置notNullColumn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotNullColumn(String value) {
        this.notNullColumn = value;
    }

    /**
     * 获取columnPrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnPrefix() {
        return columnPrefix;
    }

    /**
     * 设置columnPrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnPrefix(String value) {
        this.columnPrefix = value;
    }

    /**
     * 获取resultSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultSet() {
        return resultSet;
    }

    /**
     * 设置resultSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultSet(String value) {
        this.resultSet = value;
    }

    /**
     * 获取foreignColumn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignColumn() {
        return foreignColumn;
    }

    /**
     * 设置foreignColumn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignColumn(String value) {
        this.foreignColumn = value;
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

    /**
     * 获取fetchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetchType() {
        return fetchType;
    }

    /**
     * 设置fetchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetchType(String value) {
        this.fetchType = value;
    }

}
