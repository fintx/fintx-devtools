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


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="column" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="jdbcType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="typeHandler" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="select" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="resultMap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "idArg")
public class IdArg {

    @XmlAttribute(name = "javaType")
    @XmlSchemaType(name = "anySimpleType")
    protected String javaType;
    @XmlAttribute(name = "column")
    @XmlSchemaType(name = "anySimpleType")
    protected String column;
    @XmlAttribute(name = "jdbcType")
    @XmlSchemaType(name = "anySimpleType")
    protected String jdbcType;
    @XmlAttribute(name = "typeHandler")
    @XmlSchemaType(name = "anySimpleType")
    protected String typeHandler;
    @XmlAttribute(name = "select")
    @XmlSchemaType(name = "anySimpleType")
    protected String select;
    @XmlAttribute(name = "resultMap")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultMap;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
