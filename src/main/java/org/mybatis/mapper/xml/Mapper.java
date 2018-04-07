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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{}cache-ref"/>
 *         &lt;element ref="{}cache"/>
 *         &lt;element ref="{}resultMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}parameterMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}sql" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}insert" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}update" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}delete" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}select" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cacheRefOrCacheOrResultMap"
})
@XmlRootElement(name = "mapper")
public class Mapper {

    @XmlElements({
        @XmlElement(name = "cache-ref", type = CacheRef.class),
        @XmlElement(name = "cache", type = Cache.class),
        @XmlElement(name = "resultMap", type = ResultMap.class),
        @XmlElement(name = "parameterMap", type = ParameterMap.class),
        @XmlElement(name = "sql", type = Sql.class),
        @XmlElement(name = "insert", type = Insert.class),
        @XmlElement(name = "update", type = Update.class),
        @XmlElement(name = "delete", type = Delete.class),
        @XmlElement(name = "select", type = Select.class)
    })
    protected List<Object> cacheRefOrCacheOrResultMap;
    @XmlAttribute(name = "namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String namespace;

    /**
     * Gets the value of the cacheRefOrCacheOrResultMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheRefOrCacheOrResultMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCacheRefOrCacheOrResultMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheRef }
     * {@link Cache }
     * {@link ResultMap }
     * {@link ParameterMap }
     * {@link Sql }
     * {@link Insert }
     * {@link Update }
     * {@link Delete }
     * {@link Select }
     * 
     * 
     */
    public List<Object> getCacheRefOrCacheOrResultMap() {
        if (cacheRefOrCacheOrResultMap == null) {
            cacheRefOrCacheOrResultMap = new ArrayList<Object>();
        }
        return this.cacheRefOrCacheOrResultMap;
    }

    /**
     * 获取namespace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * 设置namespace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

}
