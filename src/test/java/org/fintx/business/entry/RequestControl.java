package org.fintx.business.entry;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class RequestControl {
	/**
	 * 主键id
	 */
	private String id;
    /**
     * 接入应用ID
     */
    private String appId;

    /**
     * 调用方应用日期，按此日期出对账文件
     */
    private String appDate = null;

    /**
     * 请求流水号（每次请求唯一）
     */
    private String reqId = null;

}
