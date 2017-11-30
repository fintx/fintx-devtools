package org.fintx.scheduler;


import lombok.Data;

@Data
public class JobExecution {
    private String appId;
    private String JobSn;
    private String jobNo;
    private String version;
    private String clazz;
    //作业执行时间的cron表达式
    private String jobSchedule;
    private String jobName;
    private String jobGroup;
    private String jobDesc;
    private String jobOwner;
    private String ownerContact;
    private String fireTime;
    private String dependJobNo;
    //0-同一天，1-多一天
    private Integer dependGap;
  //分秒小时
    private String dependGapUnit;
  //0-失败之后下次调度不可执行，1-失败之后下次调度可执行
    private Boolean failable;
    //0-可以重复执行，1-不可重复执行
    private Boolean recallable;
    //0-非暂停，1-暂停
    private Boolean suspended;
	//0-未重跑，1-已重跑 一条错误执行记录只能重跑一次，如果还是有错会生成新的错误记录，可以继续重跑
	private Boolean refired;
	//处理日期(账期)
    private String latestExecutionDate;
    private String latestExecutionTime;
  //作业的计划执行时间  由于fire会有延迟 所以比 实际执行时间略早差异最大值在quartz。properties中定义 
    private String latestCompletionTime;
    //记录异常信息
    private String remark;
//    private String jobData;
//    private String ctxData;
	private String config;
	 //入口batch可以,分割表示并列()表示顺序
    private String enter;
	private Boolean succeeded;
}
