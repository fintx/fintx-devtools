package org.fintx.scheduler;


import lombok.Data;

@Data
public class BatchInfo {
    private String appId;
    private String batchNo;
    private String version;
    private String clazz;
    private String batchDesc;
    private String jobNo;
    
    //00-执行失败，01-执行成功，02-运行
    private String batchStatus;
    //01 Daily 02 Weekly 03 Semimonthly 04 Monthly 05 Quarterly 06 Semiannually 07 Annually
    private String frequency;
    //失败时是否中断后续batch
    private Boolean abort;
    //0-可以重复执行，1-不可重复执行
    private Boolean recallable;
    //0-非暂停，1-暂停
    private Boolean suspended;
    private String endpoint;
    private String latestExecutionDate;
    private String latestExecutionTime;
    private String latestCompletionTime;
    //记录异常信息
    private String remark;
    //bpmn work flow xml
    private String config;
    //flow,分割表示并列()表示顺序
    private String next;
    private String workOn;
  
}
