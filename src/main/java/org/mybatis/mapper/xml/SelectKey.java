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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}include"/>
 *         &lt;element ref="{}trim"/>
 *         &lt;element ref="{}where"/>
 *         &lt;element ref="{}set"/>
 *         &lt;element ref="{}foreach"/>
 *         &lt;element ref="{}choose"/>
 *         &lt;element ref="{}if"/>
 *         &lt;element ref="{}bind"/>
 *       &lt;/choice>
 *       &lt;attribute name="resultType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="statementType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="STATEMENT"/>
 *             &lt;enumeration value="PREPARED"/>
 *             &lt;enumeration value="CALLABLE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="keyProperty" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="keyColumn" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="order">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="BEFORE"/>
 *             &lt;enumeration value="AFTER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="databaseId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "selectKey")
public class SelectKey {

    @XmlElementRefs({
        @XmlElementRef(name = "foreach", type = Foreach.class, required = false),
        @XmlElementRef(name = "where", type = Where.class, required = false),
        @XmlElementRef(name = "bind", type = Bind.class, required = false),
        @XmlElementRef(name = "include", type = Include.class, required = false),
        @XmlElementRef(name = "choose", type = Choose.class, required = false),
        @XmlElementRef(name = "if", type = If.class, required = false),
        @XmlElementRef(name = "set", type = Set.class, required = false),
        @XmlElementRef(name = "trim", type = Trim.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "resultType")
    @XmlSchemaType(name = "anySimpleType")
    protected String resultType;
    @XmlAttribute(name = "statementType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statementType;
    @XmlAttribute(name = "keyProperty")
    @XmlSchemaType(name = "anySimpleType")
    protected String keyProperty;
    @XmlAttribute(name = "keyColumn")
    @XmlSchemaType(name = "anySimpleType")
    protected String keyColumn;
    @XmlAttribute(name = "order")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String order;
    @XmlAttribute(name = "databaseId")
    @XmlSchemaType(name = "anySimpleType")
    protected String databaseId;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Foreach }
     * {@link Where }
     * {@link Bind }
     * {@link Include }
     * {@link Choose }
     * {@link If }
     * {@link String }
     * {@link Set }
     * {@link Trim }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * 获取resultType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultType() {
        return resultType;
    }

    /**
     * 设置resultType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultType(String value) {
        this.resultType = value;
    }

    /**
     * 获取statementType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementType() {
        return statementType;
    }

    /**
     * 设置statementType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementType(String value) {
        this.statementType = value;
    }

    /**
     * 获取keyProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyProperty() {
        return keyProperty;
    }

    /**
     * 设置keyProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyProperty(String value) {
        this.keyProperty = value;
    }

    /**
     * 获取keyColumn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyColumn() {
        return keyColumn;
    }

    /**
     * 设置keyColumn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyColumn(String value) {
        this.keyColumn = value;
    }

    /**
     * 获取order属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * 设置order属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * 获取databaseId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * 设置databaseId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseId(String value) {
        this.databaseId = value;
    }

}
