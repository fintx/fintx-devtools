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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
@XmlRootElement(name = "otherwise")
public class Otherwise {

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

}
