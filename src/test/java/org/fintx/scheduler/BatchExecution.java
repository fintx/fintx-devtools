package org.fintx.scheduler;



import lombok.Data;

@Data
public class BatchExecution {

    private String appId;
	private String batchSn;
	private String batchNo;
	//a long integer
    private String batchVersion;
    private String batchClass;
	private String JobSn;
	private String jobNo;
	private String jobVersion;
	private String jobClass;
	private String jobFireTime;
	
	//01-java 02-shell
	
	private String batchDesc;

	//00-执行失败，01-执行成功，02-运行
	private String status;
	//01 Daily 02 Weekly 03 Semimonthly 04 Monthly 05 Quarterly 06 Semiannually 07 Annually
	private String frequency;
	
	
	//private Integer batchInstanceNO;
	private Boolean abortJob;
	//0-可以重复执行，1-不可重复执行
	private Boolean recallable;
	//0-非暂停，1-暂停
	private Boolean suspended;
	//0-单实例，1-多实例
	//private Boolean isMultiInsts;
	//0-顺序，1-并行
	//private Boolean isMultiInstsParallel;
	//执行序号
	//private Integer execSerialNO;
	//0-未重跑，1-已重跑 标记是否重跑过。 一条错误执行记录只能重跑一次，如果还是有错会生成新的错误记录，可以继续重跑
	private Boolean refired;
	private String endpoint;
	private String latestExecutionDate;
	private String latestExecutionTime;
	private String latestCompletionTime;
	//记录异常信息
	private String remark;
//	private String jobData;
//	private String batchData;
//	private String ctxData;
	private String jobConfig;
	private String batchConfig;
	 //flow,分割表示并列()表示顺序
    private String next;
  //flow,分割表示并列()表示顺序
    private String workOn;
	private Boolean succeeded;

}
