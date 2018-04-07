//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.07 时间 06:36:51 PM CST 
//


package org.mybatis.mapper.xml;

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
 *       &lt;attribute name="property" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="jdbcType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="IN"/>
 *             &lt;enumeration value="OUT"/>
 *             &lt;enumeration value="INOUT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="resultMap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="typeHandler" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "parameter")
public class Parameter {

    @XmlAttribute(name = "property", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String property;
    @XmlAttribute(name = "javaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String javaType;
    @XmlAttribute(name = "jdbcType")
    @XmlSchemaType(name = "anySimpleType")
    protected String jdbcType;
    @XmlAttribute(name = "mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mode;
    @XmlAttribute(name = "resultMap")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultMap;
    @XmlAttribute(name = "scale")
    @XmlSchemaType(name = "anySimpleType")
    protected String scale;
    @XmlAttribute(name = "typeHandler")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeHandler;

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
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
     * 获取scale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        return scale;
    }

    /**
     * 设置scale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
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

}
