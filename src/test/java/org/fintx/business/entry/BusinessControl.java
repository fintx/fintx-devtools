package org.fintx.business.entry;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
// TODO 失败的从表中移除
public class BusinessControl {

    /**
     * 接入应用ID
     */
    private String appId;

    /**
     * 业务码
     */
    private String bizCode = null;

    /**
     * 业务发生日期 检查是否和系统账期相同 相同则直接add 不同则查询在bizDate 当天的表中是否有 相同的bizid有则返回业务重复 没有则add
     */
    private String bizDate = null;

    /**
     * 业务ID每笔业务唯一
     */
    private String bizId = null;

}
