/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * QueryRebateBalanceV2ResponseDataRebatesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QueryRebateBalanceV2ResponseDataRebatesInner {
  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount = null;

  public static final String SERIALIZED_NAME_ARCHIVE_STATUS = "archive_status";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_STATUS)
  private Integer archiveStatus = null;

  public static final String SERIALIZED_NAME_ARCHIVE_STATUS_NAME = "archive_status_name";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_STATUS_NAME)
  private String archiveStatusName = null;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contract_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  private String contractName = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_CONTRACT_SUBJECT_NAME = "contract_subject_name";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SUBJECT_NAME)
  private String contractSubjectName = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CURRENT_APPROVAL_STATUS_NAME = "current_approval_status_name";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVAL_STATUS_NAME)
  private String currentApprovalStatusName = null;

  public static final String SERIALIZED_NAME_FROZEN_AMOUNT = "frozen_amount";
  @SerializedName(SERIALIZED_NAME_FROZEN_AMOUNT)
  private Double frozenAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private Double invoiceAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT_REMAIN = "invoice_amount_remain";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT_REMAIN)
  private Double invoiceAmountRemain = null;

  public static final String SERIALIZED_NAME_INVOICE_FROZEN_AMOUNT = "invoice_frozen_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_FROZEN_AMOUNT)
  private Double invoiceFrozenAmount = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoice_status";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private Integer invoiceStatus = null;

  public static final String SERIALIZED_NAME_INVOICE_STATUS_NAME = "invoice_status_name";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS_NAME)
  private String invoiceStatusName = null;

  public static final String SERIALIZED_NAME_IS_ONLINE_STAMP = "is_online_stamp";
  @SerializedName(SERIALIZED_NAME_IS_ONLINE_STAMP)
  private String isOnlineStamp = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER = "month_quarter";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER)
  private Integer monthQuarter = null;

  public static final String SERIALIZED_NAME_MONTH_QUARTER_NAME = "month_quarter_name";
  @SerializedName(SERIALIZED_NAME_MONTH_QUARTER_NAME)
  private String monthQuarterName = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Long platform = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_ID = "rebate_balance_id";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_ID)
  private Long rebateBalanceId = null;

  public static final String SERIALIZED_NAME_REBATE_BALANCE_SERIAL = "rebate_balance_serial";
  @SerializedName(SERIALIZED_NAME_REBATE_BALANCE_SERIAL)
  private String rebateBalanceSerial = null;

  public static final String SERIALIZED_NAME_STAMP_STATUS = "stamp_status";
  @SerializedName(SERIALIZED_NAME_STAMP_STATUS)
  private Integer stampStatus = null;

  public static final String SERIALIZED_NAME_STAMP_STATUS_NAME = "stamp_status_name";
  @SerializedName(SERIALIZED_NAME_STAMP_STATUS_NAME)
  private String stampStatusName = null;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  private Integer standard = null;

  public static final String SERIALIZED_NAME_STANDARD_NAME = "standard_name";
  @SerializedName(SERIALIZED_NAME_STANDARD_NAME)
  private String standardName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_STATUS_NAME = "status_name";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName = null;

  public static final String SERIALIZED_NAME_USE_TYPE_NAMES = "use_type_names";
  @SerializedName(SERIALIZED_NAME_USE_TYPE_NAMES)
  private List<String> useTypeNames = null;

  public static final String SERIALIZED_NAME_USE_TYPES = "use_types";
  @SerializedName(SERIALIZED_NAME_USE_TYPES)
  private List<Integer> useTypes = null;

  public static final String SERIALIZED_NAME_USED_AMOUNT = "used_amount";
  @SerializedName(SERIALIZED_NAME_USED_AMOUNT)
  private Double usedAmount = null;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year = null;

  public QueryRebateBalanceV2ResponseDataRebatesInner() {
  }

  public QueryRebateBalanceV2ResponseDataRebatesInner agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 代理商名称
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 返点总金额 单位 元 保留2位小数
   * @return amount
  **/
  @javax.annotation.Nullable
  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner archiveStatus(Integer archiveStatus) {
    
    this.archiveStatus = archiveStatus;
    return this;
  }

   /**
   * 回收状态
   * @return archiveStatus
  **/
  @javax.annotation.Nullable
  public Integer getArchiveStatus() {
    return archiveStatus;
  }


  public void setArchiveStatus(Integer archiveStatus) {
    this.archiveStatus = archiveStatus;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner archiveStatusName(String archiveStatusName) {
    
    this.archiveStatusName = archiveStatusName;
    return this;
  }

   /**
   * 回收状态名称
   * @return archiveStatusName
  **/
  @javax.annotation.Nullable
  public String getArchiveStatusName() {
    return archiveStatusName;
  }


  public void setArchiveStatusName(String archiveStatusName) {
    this.archiveStatusName = archiveStatusName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner contractName(String contractName) {
    
    this.contractName = contractName;
    return this;
  }

   /**
   * 合同名称
   * @return contractName
  **/
  @javax.annotation.Nullable
  public String getContractName() {
    return contractName;
  }


  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner contractSubjectName(String contractSubjectName) {
    
    this.contractSubjectName = contractSubjectName;
    return this;
  }

   /**
   * 媒体签约主体
   * @return contractSubjectName
  **/
  @javax.annotation.Nullable
  public String getContractSubjectName() {
    return contractSubjectName;
  }


  public void setContractSubjectName(String contractSubjectName) {
    this.contractSubjectName = contractSubjectName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner currentApprovalStatusName(String currentApprovalStatusName) {
    
    this.currentApprovalStatusName = currentApprovalStatusName;
    return this;
  }

   /**
   * 当前审批节点名称
   * @return currentApprovalStatusName
  **/
  @javax.annotation.Nullable
  public String getCurrentApprovalStatusName() {
    return currentApprovalStatusName;
  }


  public void setCurrentApprovalStatusName(String currentApprovalStatusName) {
    this.currentApprovalStatusName = currentApprovalStatusName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner frozenAmount(Double frozenAmount) {
    
    this.frozenAmount = frozenAmount;
    return this;
  }

   /**
   * 冻结金额 单位 元 保留2位小数
   * @return frozenAmount
  **/
  @javax.annotation.Nullable
  public Double getFrozenAmount() {
    return frozenAmount;
  }


  public void setFrozenAmount(Double frozenAmount) {
    this.frozenAmount = frozenAmount;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner invoiceAmount(Double invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 实际开票金额 单位 元 保留2位小数
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(Double invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner invoiceAmountRemain(Double invoiceAmountRemain) {
    
    this.invoiceAmountRemain = invoiceAmountRemain;
    return this;
  }

   /**
   * 可开票金额 单位 元 保留2位小数
   * @return invoiceAmountRemain
  **/
  @javax.annotation.Nullable
  public Double getInvoiceAmountRemain() {
    return invoiceAmountRemain;
  }


  public void setInvoiceAmountRemain(Double invoiceAmountRemain) {
    this.invoiceAmountRemain = invoiceAmountRemain;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner invoiceFrozenAmount(Double invoiceFrozenAmount) {
    
    this.invoiceFrozenAmount = invoiceFrozenAmount;
    return this;
  }

   /**
   * 已申请开票金额 单位 元 保留2位小数
   * @return invoiceFrozenAmount
  **/
  @javax.annotation.Nullable
  public Double getInvoiceFrozenAmount() {
    return invoiceFrozenAmount;
  }


  public void setInvoiceFrozenAmount(Double invoiceFrozenAmount) {
    this.invoiceFrozenAmount = invoiceFrozenAmount;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner invoiceStatus(Integer invoiceStatus) {
    
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * 开票状态
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  public Integer getInvoiceStatus() {
    return invoiceStatus;
  }


  public void setInvoiceStatus(Integer invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner invoiceStatusName(String invoiceStatusName) {
    
    this.invoiceStatusName = invoiceStatusName;
    return this;
  }

   /**
   * 开票状态名称
   * @return invoiceStatusName
  **/
  @javax.annotation.Nullable
  public String getInvoiceStatusName() {
    return invoiceStatusName;
  }


  public void setInvoiceStatusName(String invoiceStatusName) {
    this.invoiceStatusName = invoiceStatusName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner isOnlineStamp(String isOnlineStamp) {
    
    this.isOnlineStamp = isOnlineStamp;
    return this;
  }

   /**
   * 签章类型名称
   * @return isOnlineStamp
  **/
  @javax.annotation.Nullable
  public String getIsOnlineStamp() {
    return isOnlineStamp;
  }


  public void setIsOnlineStamp(String isOnlineStamp) {
    this.isOnlineStamp = isOnlineStamp;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner monthQuarter(Integer monthQuarter) {
    
    this.monthQuarter = monthQuarter;
    return this;
  }

   /**
   * 所属季度／月
   * @return monthQuarter
  **/
  @javax.annotation.Nullable
  public Integer getMonthQuarter() {
    return monthQuarter;
  }


  public void setMonthQuarter(Integer monthQuarter) {
    this.monthQuarter = monthQuarter;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner monthQuarterName(String monthQuarterName) {
    
    this.monthQuarterName = monthQuarterName;
    return this;
  }

   /**
   * 所属季度／月名称
   * @return monthQuarterName
  **/
  @javax.annotation.Nullable
  public String getMonthQuarterName() {
    return monthQuarterName;
  }


  public void setMonthQuarterName(String monthQuarterName) {
    this.monthQuarterName = monthQuarterName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner platform(Long platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 平台/业务线
   * @return platform
  **/
  @javax.annotation.Nullable
  public Long getPlatform() {
    return platform;
  }


  public void setPlatform(Long platform) {
    this.platform = platform;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 平台/业务线名称
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner rebateBalanceId(Long rebateBalanceId) {
    
    this.rebateBalanceId = rebateBalanceId;
    return this;
  }

   /**
   * 返点流水ID
   * @return rebateBalanceId
  **/
  @javax.annotation.Nullable
  public Long getRebateBalanceId() {
    return rebateBalanceId;
  }


  public void setRebateBalanceId(Long rebateBalanceId) {
    this.rebateBalanceId = rebateBalanceId;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner rebateBalanceSerial(String rebateBalanceSerial) {
    
    this.rebateBalanceSerial = rebateBalanceSerial;
    return this;
  }

   /**
   * 返点流水编号 （与平台披露编号一致，建议使用）
   * @return rebateBalanceSerial
  **/
  @javax.annotation.Nullable
  public String getRebateBalanceSerial() {
    return rebateBalanceSerial;
  }


  public void setRebateBalanceSerial(String rebateBalanceSerial) {
    this.rebateBalanceSerial = rebateBalanceSerial;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner stampStatus(Integer stampStatus) {
    
    this.stampStatus = stampStatus;
    return this;
  }

   /**
   * 盖章状态
   * @return stampStatus
  **/
  @javax.annotation.Nullable
  public Integer getStampStatus() {
    return stampStatus;
  }


  public void setStampStatus(Integer stampStatus) {
    this.stampStatus = stampStatus;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner stampStatusName(String stampStatusName) {
    
    this.stampStatusName = stampStatusName;
    return this;
  }

   /**
   * 盖章状态名称
   * @return stampStatusName
  **/
  @javax.annotation.Nullable
  public String getStampStatusName() {
    return stampStatusName;
  }


  public void setStampStatusName(String stampStatusName) {
    this.stampStatusName = stampStatusName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner standard(Integer standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * 是否标准
   * @return standard
  **/
  @javax.annotation.Nullable
  public Integer getStandard() {
    return standard;
  }


  public void setStandard(Integer standard) {
    this.standard = standard;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner standardName(String standardName) {
    
    this.standardName = standardName;
    return this;
  }

   /**
   * 是否标准名称
   * @return standardName
  **/
  @javax.annotation.Nullable
  public String getStandardName() {
    return standardName;
  }


  public void setStandardName(String standardName) {
    this.standardName = standardName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 返点状态
   * @return status
  **/
  @javax.annotation.Nullable
  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * 返点状态名称
   * @return statusName
  **/
  @javax.annotation.Nullable
  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner useTypeNames(List<String> useTypeNames) {
    
    this.useTypeNames = useTypeNames;
    return this;
  }

  public QueryRebateBalanceV2ResponseDataRebatesInner addUseTypeNamesItem(String useTypeNamesItem) {
    if (this.useTypeNames == null) {
      this.useTypeNames = new ArrayList<>();
    }
    this.useTypeNames.add(useTypeNamesItem);
    return this;
  }

   /**
   * 使用类型名称
   * @return useTypeNames
  **/
  @javax.annotation.Nullable
  public List<String> getUseTypeNames() {
    return useTypeNames;
  }


  public void setUseTypeNames(List<String> useTypeNames) {
    this.useTypeNames = useTypeNames;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner useTypes(List<Integer> useTypes) {
    
    this.useTypes = useTypes;
    return this;
  }

  public QueryRebateBalanceV2ResponseDataRebatesInner addUseTypesItem(Integer useTypesItem) {
    if (this.useTypes == null) {
      this.useTypes = new ArrayList<>();
    }
    this.useTypes.add(useTypesItem);
    return this;
  }

   /**
   * 使用类型
   * @return useTypes
  **/
  @javax.annotation.Nullable
  public List<Integer> getUseTypes() {
    return useTypes;
  }


  public void setUseTypes(List<Integer> useTypes) {
    this.useTypes = useTypes;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner usedAmount(Double usedAmount) {
    
    this.usedAmount = usedAmount;
    return this;
  }

   /**
   * 已使用金额 单位 元 保留2位小数
   * @return usedAmount
  **/
  @javax.annotation.Nullable
  public Double getUsedAmount() {
    return usedAmount;
  }


  public void setUsedAmount(Double usedAmount) {
    this.usedAmount = usedAmount;
  }


  public QueryRebateBalanceV2ResponseDataRebatesInner year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * 结算周期年
   * @return year
  **/
  @javax.annotation.Nullable
  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRebateBalanceV2ResponseDataRebatesInner queryRebateBalanceV2ResponseDataRebatesInner = (QueryRebateBalanceV2ResponseDataRebatesInner) o;
    return Objects.equals(this.agentId, queryRebateBalanceV2ResponseDataRebatesInner.agentId) &&
        Objects.equals(this.agentName, queryRebateBalanceV2ResponseDataRebatesInner.agentName) &&
        Objects.equals(this.amount, queryRebateBalanceV2ResponseDataRebatesInner.amount) &&
        Objects.equals(this.archiveStatus, queryRebateBalanceV2ResponseDataRebatesInner.archiveStatus) &&
        Objects.equals(this.archiveStatusName, queryRebateBalanceV2ResponseDataRebatesInner.archiveStatusName) &&
        Objects.equals(this.contractName, queryRebateBalanceV2ResponseDataRebatesInner.contractName) &&
        Objects.equals(this.contractSerial, queryRebateBalanceV2ResponseDataRebatesInner.contractSerial) &&
        Objects.equals(this.contractSubjectName, queryRebateBalanceV2ResponseDataRebatesInner.contractSubjectName) &&
        Objects.equals(this.createTime, queryRebateBalanceV2ResponseDataRebatesInner.createTime) &&
        Objects.equals(this.currentApprovalStatusName, queryRebateBalanceV2ResponseDataRebatesInner.currentApprovalStatusName) &&
        Objects.equals(this.frozenAmount, queryRebateBalanceV2ResponseDataRebatesInner.frozenAmount) &&
        Objects.equals(this.invoiceAmount, queryRebateBalanceV2ResponseDataRebatesInner.invoiceAmount) &&
        Objects.equals(this.invoiceAmountRemain, queryRebateBalanceV2ResponseDataRebatesInner.invoiceAmountRemain) &&
        Objects.equals(this.invoiceFrozenAmount, queryRebateBalanceV2ResponseDataRebatesInner.invoiceFrozenAmount) &&
        Objects.equals(this.invoiceStatus, queryRebateBalanceV2ResponseDataRebatesInner.invoiceStatus) &&
        Objects.equals(this.invoiceStatusName, queryRebateBalanceV2ResponseDataRebatesInner.invoiceStatusName) &&
        Objects.equals(this.isOnlineStamp, queryRebateBalanceV2ResponseDataRebatesInner.isOnlineStamp) &&
        Objects.equals(this.monthQuarter, queryRebateBalanceV2ResponseDataRebatesInner.monthQuarter) &&
        Objects.equals(this.monthQuarterName, queryRebateBalanceV2ResponseDataRebatesInner.monthQuarterName) &&
        Objects.equals(this.platform, queryRebateBalanceV2ResponseDataRebatesInner.platform) &&
        Objects.equals(this.platformName, queryRebateBalanceV2ResponseDataRebatesInner.platformName) &&
        Objects.equals(this.rebateBalanceId, queryRebateBalanceV2ResponseDataRebatesInner.rebateBalanceId) &&
        Objects.equals(this.rebateBalanceSerial, queryRebateBalanceV2ResponseDataRebatesInner.rebateBalanceSerial) &&
        Objects.equals(this.stampStatus, queryRebateBalanceV2ResponseDataRebatesInner.stampStatus) &&
        Objects.equals(this.stampStatusName, queryRebateBalanceV2ResponseDataRebatesInner.stampStatusName) &&
        Objects.equals(this.standard, queryRebateBalanceV2ResponseDataRebatesInner.standard) &&
        Objects.equals(this.standardName, queryRebateBalanceV2ResponseDataRebatesInner.standardName) &&
        Objects.equals(this.status, queryRebateBalanceV2ResponseDataRebatesInner.status) &&
        Objects.equals(this.statusName, queryRebateBalanceV2ResponseDataRebatesInner.statusName) &&
        Objects.equals(this.useTypeNames, queryRebateBalanceV2ResponseDataRebatesInner.useTypeNames) &&
        Objects.equals(this.useTypes, queryRebateBalanceV2ResponseDataRebatesInner.useTypes) &&
        Objects.equals(this.usedAmount, queryRebateBalanceV2ResponseDataRebatesInner.usedAmount) &&
        Objects.equals(this.year, queryRebateBalanceV2ResponseDataRebatesInner.year);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, amount, archiveStatus, archiveStatusName, contractName, contractSerial, contractSubjectName, createTime, currentApprovalStatusName, frozenAmount, invoiceAmount, invoiceAmountRemain, invoiceFrozenAmount, invoiceStatus, invoiceStatusName, isOnlineStamp, monthQuarter, monthQuarterName, platform, platformName, rebateBalanceId, rebateBalanceSerial, stampStatus, stampStatusName, standard, standardName, status, statusName, useTypeNames, useTypes, usedAmount, year);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRebateBalanceV2ResponseDataRebatesInner {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    archiveStatus: ").append(toIndentedString(archiveStatus)).append("\n");
    sb.append("    archiveStatusName: ").append(toIndentedString(archiveStatusName)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    contractSubjectName: ").append(toIndentedString(contractSubjectName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    currentApprovalStatusName: ").append(toIndentedString(currentApprovalStatusName)).append("\n");
    sb.append("    frozenAmount: ").append(toIndentedString(frozenAmount)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    invoiceAmountRemain: ").append(toIndentedString(invoiceAmountRemain)).append("\n");
    sb.append("    invoiceFrozenAmount: ").append(toIndentedString(invoiceFrozenAmount)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceStatusName: ").append(toIndentedString(invoiceStatusName)).append("\n");
    sb.append("    isOnlineStamp: ").append(toIndentedString(isOnlineStamp)).append("\n");
    sb.append("    monthQuarter: ").append(toIndentedString(monthQuarter)).append("\n");
    sb.append("    monthQuarterName: ").append(toIndentedString(monthQuarterName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    rebateBalanceId: ").append(toIndentedString(rebateBalanceId)).append("\n");
    sb.append("    rebateBalanceSerial: ").append(toIndentedString(rebateBalanceSerial)).append("\n");
    sb.append("    stampStatus: ").append(toIndentedString(stampStatus)).append("\n");
    sb.append("    stampStatusName: ").append(toIndentedString(stampStatusName)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    standardName: ").append(toIndentedString(standardName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    useTypeNames: ").append(toIndentedString(useTypeNames)).append("\n");
    sb.append("    useTypes: ").append(toIndentedString(useTypes)).append("\n");
    sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("amount");
    openapiFields.add("archive_status");
    openapiFields.add("archive_status_name");
    openapiFields.add("contract_name");
    openapiFields.add("contract_serial");
    openapiFields.add("contract_subject_name");
    openapiFields.add("create_time");
    openapiFields.add("current_approval_status_name");
    openapiFields.add("frozen_amount");
    openapiFields.add("invoice_amount");
    openapiFields.add("invoice_amount_remain");
    openapiFields.add("invoice_frozen_amount");
    openapiFields.add("invoice_status");
    openapiFields.add("invoice_status_name");
    openapiFields.add("is_online_stamp");
    openapiFields.add("month_quarter");
    openapiFields.add("month_quarter_name");
    openapiFields.add("platform");
    openapiFields.add("platform_name");
    openapiFields.add("rebate_balance_id");
    openapiFields.add("rebate_balance_serial");
    openapiFields.add("stamp_status");
    openapiFields.add("stamp_status_name");
    openapiFields.add("standard");
    openapiFields.add("standard_name");
    openapiFields.add("status");
    openapiFields.add("status_name");
    openapiFields.add("use_type_names");
    openapiFields.add("use_types");
    openapiFields.add("used_amount");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRebateBalanceV2ResponseDataRebatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRebateBalanceV2ResponseDataRebatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRebateBalanceV2ResponseDataRebatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRebateBalanceV2ResponseDataRebatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRebateBalanceV2ResponseDataRebatesInner>() {
           @Override
           public void write(JsonWriter out, QueryRebateBalanceV2ResponseDataRebatesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRebateBalanceV2ResponseDataRebatesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryRebateBalanceV2ResponseDataRebatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryRebateBalanceV2ResponseDataRebatesInner
  * @throws IOException if the JSON string is invalid with respect to QueryRebateBalanceV2ResponseDataRebatesInner
  */
  public static QueryRebateBalanceV2ResponseDataRebatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRebateBalanceV2ResponseDataRebatesInner.class);
  }

 /**
  * Convert an instance of QueryRebateBalanceV2ResponseDataRebatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

