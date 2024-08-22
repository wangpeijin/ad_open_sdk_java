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
 * QueryProjectV30ResponseDataProjectInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QueryProjectV30ResponseDataProjectInfoListInner {
  public static final String SERIALIZED_NAME_ADC_ID = "adc_id";
  @SerializedName(SERIALIZED_NAME_ADC_ID)
  private Long adcId = null;

  public static final String SERIALIZED_NAME_ADC_SERIAL = "adc_serial";
  @SerializedName(SERIALIZED_NAME_ADC_SERIAL)
  private String adcSerial = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount = null;

  public static final String SERIALIZED_NAME_CONFIRM_STATUS = "confirm_status";
  @SerializedName(SERIALIZED_NAME_CONFIRM_STATUS)
  private Long confirmStatus = null;

  public static final String SERIALIZED_NAME_CONFIRM_STATUS_NAME = "confirm_status_name";
  @SerializedName(SERIALIZED_NAME_CONFIRM_STATUS_NAME)
  private String confirmStatusName = null;

  public static final String SERIALIZED_NAME_CONTRACT_SERIAL = "contract_serial";
  @SerializedName(SERIALIZED_NAME_CONTRACT_SERIAL)
  private String contractSerial = null;

  public static final String SERIALIZED_NAME_COST_CUSTOMER_ID = "cost_customer_id";
  @SerializedName(SERIALIZED_NAME_COST_CUSTOMER_ID)
  private Long costCustomerId = null;

  public static final String SERIALIZED_NAME_COST_CUSTOMER_NAME = "cost_customer_name";
  @SerializedName(SERIALIZED_NAME_COST_CUSTOMER_NAME)
  private String costCustomerName = null;

  public static final String SERIALIZED_NAME_CREDIT_COST = "credit_cost";
  @SerializedName(SERIALIZED_NAME_CREDIT_COST)
  private String creditCost = null;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private String deadline = null;

  public static final String SERIALIZED_NAME_GRANT_COST = "grant_cost";
  @SerializedName(SERIALIZED_NAME_GRANT_COST)
  private String grantCost = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private String invoiceAmount = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_PAY_METHOD_NAME = "pay_method_name";
  @SerializedName(SERIALIZED_NAME_PAY_METHOD_NAME)
  private String payMethodName = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Long platform = null;

  public static final String SERIALIZED_NAME_PLATFORM_NAME = "platform_name";
  @SerializedName(SERIALIZED_NAME_PLATFORM_NAME)
  private String platformName = null;

  public static final String SERIALIZED_NAME_PREPAY_COST = "prepay_cost";
  @SerializedName(SERIALIZED_NAME_PREPAY_COST)
  private String prepayCost = null;

  public static final String SERIALIZED_NAME_PROJECT_END_DATE = "project_end_date";
  @SerializedName(SERIALIZED_NAME_PROJECT_END_DATE)
  private String projectEndDate = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_TYPE = "project_group_type";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_TYPE)
  private Long projectGroupType = null;

  public static final String SERIALIZED_NAME_PROJECT_GROUP_TYPE_NAME = "project_group_type_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_GROUP_TYPE_NAME)
  private String projectGroupTypeName = null;

  public static final String SERIALIZED_NAME_PROJECT_START_DATE = "project_start_date";
  @SerializedName(SERIALIZED_NAME_PROJECT_START_DATE)
  private String projectStartDate = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS = "project_status";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS)
  private Long projectStatus = null;

  public static final String SERIALIZED_NAME_PROJECT_STATUS_NAME = "project_status_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_STATUS_NAME)
  private String projectStatusName = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS = "receipt_status";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS)
  private Long receiptStatus = null;

  public static final String SERIALIZED_NAME_RECEIPT_STATUS_NAME = "receipt_status_name";
  @SerializedName(SERIALIZED_NAME_RECEIPT_STATUS_NAME)
  private String receiptStatusName = null;

  public static final String SERIALIZED_NAME_RECEIPT_SUBJECT_NAME = "receipt_subject_name";
  @SerializedName(SERIALIZED_NAME_RECEIPT_SUBJECT_NAME)
  private String receiptSubjectName = null;

  public static final String SERIALIZED_NAME_RECHARGE_COST = "recharge_cost";
  @SerializedName(SERIALIZED_NAME_RECHARGE_COST)
  private String rechargeCost = null;

  public static final String SERIALIZED_NAME_REMAIN_VERIFICATION_AMOUNT = "remain_verification_amount";
  @SerializedName(SERIALIZED_NAME_REMAIN_VERIFICATION_AMOUNT)
  private String remainVerificationAmount = null;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE = "serving_type";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE)
  private Long servingType = null;

  public static final String SERIALIZED_NAME_SERVING_TYPE_NAME = "serving_type_name";
  @SerializedName(SERIALIZED_NAME_SERVING_TYPE_NAME)
  private String servingTypeName = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_CUSTOMER_ID = "settlement_customer_id";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CUSTOMER_ID)
  private Long settlementCustomerId = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_CUSTOMER_NAME = "settlement_customer_name";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CUSTOMER_NAME)
  private String settlementCustomerName = null;

  public QueryProjectV30ResponseDataProjectInfoListInner() {
  }

  public QueryProjectV30ResponseDataProjectInfoListInner adcId(Long adcId) {
    
    this.adcId = adcId;
    return this;
  }

   /**
   * 广告发布协议ID
   * @return adcId
  **/
  @javax.annotation.Nullable
  public Long getAdcId() {
    return adcId;
  }


  public void setAdcId(Long adcId) {
    this.adcId = adcId;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner adcSerial(String adcSerial) {
    
    this.adcSerial = adcSerial;
    return this;
  }

   /**
   * 广告发布协议编号
   * @return adcSerial
  **/
  @javax.annotation.Nullable
  public String getAdcSerial() {
    return adcSerial;
  }


  public void setAdcSerial(String adcSerial) {
    this.adcSerial = adcSerial;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 项目金额（元）
   * @return amount
  **/
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner confirmStatus(Long confirmStatus) {
    
    this.confirmStatus = confirmStatus;
    return this;
  }

   /**
   * 确认状态
   * @return confirmStatus
  **/
  @javax.annotation.Nullable
  public Long getConfirmStatus() {
    return confirmStatus;
  }


  public void setConfirmStatus(Long confirmStatus) {
    this.confirmStatus = confirmStatus;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner confirmStatusName(String confirmStatusName) {
    
    this.confirmStatusName = confirmStatusName;
    return this;
  }

   /**
   * 确认状态名称
   * @return confirmStatusName
  **/
  @javax.annotation.Nullable
  public String getConfirmStatusName() {
    return confirmStatusName;
  }


  public void setConfirmStatusName(String confirmStatusName) {
    this.confirmStatusName = confirmStatusName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner contractSerial(String contractSerial) {
    
    this.contractSerial = contractSerial;
    return this;
  }

   /**
   * 主合同编号
   * @return contractSerial
  **/
  @javax.annotation.Nullable
  public String getContractSerial() {
    return contractSerial;
  }


  public void setContractSerial(String contractSerial) {
    this.contractSerial = contractSerial;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner costCustomerId(Long costCustomerId) {
    
    this.costCustomerId = costCustomerId;
    return this;
  }

   /**
   * 客户ID
   * @return costCustomerId
  **/
  @javax.annotation.Nullable
  public Long getCostCustomerId() {
    return costCustomerId;
  }


  public void setCostCustomerId(Long costCustomerId) {
    this.costCustomerId = costCustomerId;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner costCustomerName(String costCustomerName) {
    
    this.costCustomerName = costCustomerName;
    return this;
  }

   /**
   * 客户名称
   * @return costCustomerName
  **/
  @javax.annotation.Nullable
  public String getCostCustomerName() {
    return costCustomerName;
  }


  public void setCostCustomerName(String costCustomerName) {
    this.costCustomerName = costCustomerName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner creditCost(String creditCost) {
    
    this.creditCost = creditCost;
    return this;
  }

   /**
   * 授信消耗
   * @return creditCost
  **/
  @javax.annotation.Nullable
  public String getCreditCost() {
    return creditCost;
  }


  public void setCreditCost(String creditCost) {
    this.creditCost = creditCost;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner deadline(String deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * 应回款时间
   * @return deadline
  **/
  @javax.annotation.Nullable
  public String getDeadline() {
    return deadline;
  }


  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner grantCost(String grantCost) {
    
    this.grantCost = grantCost;
    return this;
  }

   /**
   * 赠款消耗
   * @return grantCost
  **/
  @javax.annotation.Nullable
  public String getGrantCost() {
    return grantCost;
  }


  public void setGrantCost(String grantCost) {
    this.grantCost = grantCost;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 项目ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner invoiceAmount(String invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 已开票金额
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  public String getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(String invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public QueryProjectV30ResponseDataProjectInfoListInner addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 主订单编号
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner payMethodName(String payMethodName) {
    
    this.payMethodName = payMethodName;
    return this;
  }

   /**
   * 付款方式
   * @return payMethodName
  **/
  @javax.annotation.Nullable
  public String getPayMethodName() {
    return payMethodName;
  }


  public void setPayMethodName(String payMethodName) {
    this.payMethodName = payMethodName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner platform(Long platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 平台
   * @return platform
  **/
  @javax.annotation.Nullable
  public Long getPlatform() {
    return platform;
  }


  public void setPlatform(Long platform) {
    this.platform = platform;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner platformName(String platformName) {
    
    this.platformName = platformName;
    return this;
  }

   /**
   * 平台名称
   * @return platformName
  **/
  @javax.annotation.Nullable
  public String getPlatformName() {
    return platformName;
  }


  public void setPlatformName(String platformName) {
    this.platformName = platformName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner prepayCost(String prepayCost) {
    
    this.prepayCost = prepayCost;
    return this;
  }

   /**
   * 预付消耗
   * @return prepayCost
  **/
  @javax.annotation.Nullable
  public String getPrepayCost() {
    return prepayCost;
  }


  public void setPrepayCost(String prepayCost) {
    this.prepayCost = prepayCost;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectEndDate(String projectEndDate) {
    
    this.projectEndDate = projectEndDate;
    return this;
  }

   /**
   * 项目结束时间 例如 2023-07-06
   * @return projectEndDate
  **/
  @javax.annotation.Nullable
  public String getProjectEndDate() {
    return projectEndDate;
  }


  public void setProjectEndDate(String projectEndDate) {
    this.projectEndDate = projectEndDate;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectGroupType(Long projectGroupType) {
    
    this.projectGroupType = projectGroupType;
    return this;
  }

   /**
   * 项目类型分组
   * @return projectGroupType
  **/
  @javax.annotation.Nullable
  public Long getProjectGroupType() {
    return projectGroupType;
  }


  public void setProjectGroupType(Long projectGroupType) {
    this.projectGroupType = projectGroupType;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectGroupTypeName(String projectGroupTypeName) {
    
    this.projectGroupTypeName = projectGroupTypeName;
    return this;
  }

   /**
   * 项目类型分组名称
   * @return projectGroupTypeName
  **/
  @javax.annotation.Nullable
  public String getProjectGroupTypeName() {
    return projectGroupTypeName;
  }


  public void setProjectGroupTypeName(String projectGroupTypeName) {
    this.projectGroupTypeName = projectGroupTypeName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectStartDate(String projectStartDate) {
    
    this.projectStartDate = projectStartDate;
    return this;
  }

   /**
   * 项目开始时间 例如 2023-07-06
   * @return projectStartDate
  **/
  @javax.annotation.Nullable
  public String getProjectStartDate() {
    return projectStartDate;
  }


  public void setProjectStartDate(String projectStartDate) {
    this.projectStartDate = projectStartDate;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectStatus(Long projectStatus) {
    
    this.projectStatus = projectStatus;
    return this;
  }

   /**
   * 项目状态
   * @return projectStatus
  **/
  @javax.annotation.Nullable
  public Long getProjectStatus() {
    return projectStatus;
  }


  public void setProjectStatus(Long projectStatus) {
    this.projectStatus = projectStatus;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner projectStatusName(String projectStatusName) {
    
    this.projectStatusName = projectStatusName;
    return this;
  }

   /**
   * 项目状态名称
   * @return projectStatusName
  **/
  @javax.annotation.Nullable
  public String getProjectStatusName() {
    return projectStatusName;
  }


  public void setProjectStatusName(String projectStatusName) {
    this.projectStatusName = projectStatusName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner receiptStatus(Long receiptStatus) {
    
    this.receiptStatus = receiptStatus;
    return this;
  }

   /**
   * 回款状态
   * @return receiptStatus
  **/
  @javax.annotation.Nullable
  public Long getReceiptStatus() {
    return receiptStatus;
  }


  public void setReceiptStatus(Long receiptStatus) {
    this.receiptStatus = receiptStatus;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner receiptStatusName(String receiptStatusName) {
    
    this.receiptStatusName = receiptStatusName;
    return this;
  }

   /**
   * 回款状态名称
   * @return receiptStatusName
  **/
  @javax.annotation.Nullable
  public String getReceiptStatusName() {
    return receiptStatusName;
  }


  public void setReceiptStatusName(String receiptStatusName) {
    this.receiptStatusName = receiptStatusName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner receiptSubjectName(String receiptSubjectName) {
    
    this.receiptSubjectName = receiptSubjectName;
    return this;
  }

   /**
   * 我方主体名称
   * @return receiptSubjectName
  **/
  @javax.annotation.Nullable
  public String getReceiptSubjectName() {
    return receiptSubjectName;
  }


  public void setReceiptSubjectName(String receiptSubjectName) {
    this.receiptSubjectName = receiptSubjectName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner rechargeCost(String rechargeCost) {
    
    this.rechargeCost = rechargeCost;
    return this;
  }

   /**
   * 现金消耗
   * @return rechargeCost
  **/
  @javax.annotation.Nullable
  public String getRechargeCost() {
    return rechargeCost;
  }


  public void setRechargeCost(String rechargeCost) {
    this.rechargeCost = rechargeCost;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner remainVerificationAmount(String remainVerificationAmount) {
    
    this.remainVerificationAmount = remainVerificationAmount;
    return this;
  }

   /**
   * 待回款金额（元）
   * @return remainVerificationAmount
  **/
  @javax.annotation.Nullable
  public String getRemainVerificationAmount() {
    return remainVerificationAmount;
  }


  public void setRemainVerificationAmount(String remainVerificationAmount) {
    this.remainVerificationAmount = remainVerificationAmount;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner serial(String serial) {
    
    this.serial = serial;
    return this;
  }

   /**
   * 项目编号
   * @return serial
  **/
  @javax.annotation.Nullable
  public String getSerial() {
    return serial;
  }


  public void setSerial(String serial) {
    this.serial = serial;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner servingType(Long servingType) {
    
    this.servingType = servingType;
    return this;
  }

   /**
   * 投放方式
   * @return servingType
  **/
  @javax.annotation.Nullable
  public Long getServingType() {
    return servingType;
  }


  public void setServingType(Long servingType) {
    this.servingType = servingType;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner servingTypeName(String servingTypeName) {
    
    this.servingTypeName = servingTypeName;
    return this;
  }

   /**
   * 投放方式名称
   * @return servingTypeName
  **/
  @javax.annotation.Nullable
  public String getServingTypeName() {
    return servingTypeName;
  }


  public void setServingTypeName(String servingTypeName) {
    this.servingTypeName = servingTypeName;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner settlementCustomerId(Long settlementCustomerId) {
    
    this.settlementCustomerId = settlementCustomerId;
    return this;
  }

   /**
   * 代理商ID
   * @return settlementCustomerId
  **/
  @javax.annotation.Nullable
  public Long getSettlementCustomerId() {
    return settlementCustomerId;
  }


  public void setSettlementCustomerId(Long settlementCustomerId) {
    this.settlementCustomerId = settlementCustomerId;
  }


  public QueryProjectV30ResponseDataProjectInfoListInner settlementCustomerName(String settlementCustomerName) {
    
    this.settlementCustomerName = settlementCustomerName;
    return this;
  }

   /**
   * 代理商名称
   * @return settlementCustomerName
  **/
  @javax.annotation.Nullable
  public String getSettlementCustomerName() {
    return settlementCustomerName;
  }


  public void setSettlementCustomerName(String settlementCustomerName) {
    this.settlementCustomerName = settlementCustomerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProjectV30ResponseDataProjectInfoListInner queryProjectV30ResponseDataProjectInfoListInner = (QueryProjectV30ResponseDataProjectInfoListInner) o;
    return Objects.equals(this.adcId, queryProjectV30ResponseDataProjectInfoListInner.adcId) &&
        Objects.equals(this.adcSerial, queryProjectV30ResponseDataProjectInfoListInner.adcSerial) &&
        Objects.equals(this.advertiserId, queryProjectV30ResponseDataProjectInfoListInner.advertiserId) &&
        Objects.equals(this.advertiserName, queryProjectV30ResponseDataProjectInfoListInner.advertiserName) &&
        Objects.equals(this.amount, queryProjectV30ResponseDataProjectInfoListInner.amount) &&
        Objects.equals(this.confirmStatus, queryProjectV30ResponseDataProjectInfoListInner.confirmStatus) &&
        Objects.equals(this.confirmStatusName, queryProjectV30ResponseDataProjectInfoListInner.confirmStatusName) &&
        Objects.equals(this.contractSerial, queryProjectV30ResponseDataProjectInfoListInner.contractSerial) &&
        Objects.equals(this.costCustomerId, queryProjectV30ResponseDataProjectInfoListInner.costCustomerId) &&
        Objects.equals(this.costCustomerName, queryProjectV30ResponseDataProjectInfoListInner.costCustomerName) &&
        Objects.equals(this.creditCost, queryProjectV30ResponseDataProjectInfoListInner.creditCost) &&
        Objects.equals(this.deadline, queryProjectV30ResponseDataProjectInfoListInner.deadline) &&
        Objects.equals(this.grantCost, queryProjectV30ResponseDataProjectInfoListInner.grantCost) &&
        Objects.equals(this.id, queryProjectV30ResponseDataProjectInfoListInner.id) &&
        Objects.equals(this.invoiceAmount, queryProjectV30ResponseDataProjectInfoListInner.invoiceAmount) &&
        Objects.equals(this.name, queryProjectV30ResponseDataProjectInfoListInner.name) &&
        Objects.equals(this.orderIds, queryProjectV30ResponseDataProjectInfoListInner.orderIds) &&
        Objects.equals(this.payMethodName, queryProjectV30ResponseDataProjectInfoListInner.payMethodName) &&
        Objects.equals(this.platform, queryProjectV30ResponseDataProjectInfoListInner.platform) &&
        Objects.equals(this.platformName, queryProjectV30ResponseDataProjectInfoListInner.platformName) &&
        Objects.equals(this.prepayCost, queryProjectV30ResponseDataProjectInfoListInner.prepayCost) &&
        Objects.equals(this.projectEndDate, queryProjectV30ResponseDataProjectInfoListInner.projectEndDate) &&
        Objects.equals(this.projectGroupType, queryProjectV30ResponseDataProjectInfoListInner.projectGroupType) &&
        Objects.equals(this.projectGroupTypeName, queryProjectV30ResponseDataProjectInfoListInner.projectGroupTypeName) &&
        Objects.equals(this.projectStartDate, queryProjectV30ResponseDataProjectInfoListInner.projectStartDate) &&
        Objects.equals(this.projectStatus, queryProjectV30ResponseDataProjectInfoListInner.projectStatus) &&
        Objects.equals(this.projectStatusName, queryProjectV30ResponseDataProjectInfoListInner.projectStatusName) &&
        Objects.equals(this.receiptStatus, queryProjectV30ResponseDataProjectInfoListInner.receiptStatus) &&
        Objects.equals(this.receiptStatusName, queryProjectV30ResponseDataProjectInfoListInner.receiptStatusName) &&
        Objects.equals(this.receiptSubjectName, queryProjectV30ResponseDataProjectInfoListInner.receiptSubjectName) &&
        Objects.equals(this.rechargeCost, queryProjectV30ResponseDataProjectInfoListInner.rechargeCost) &&
        Objects.equals(this.remainVerificationAmount, queryProjectV30ResponseDataProjectInfoListInner.remainVerificationAmount) &&
        Objects.equals(this.serial, queryProjectV30ResponseDataProjectInfoListInner.serial) &&
        Objects.equals(this.servingType, queryProjectV30ResponseDataProjectInfoListInner.servingType) &&
        Objects.equals(this.servingTypeName, queryProjectV30ResponseDataProjectInfoListInner.servingTypeName) &&
        Objects.equals(this.settlementCustomerId, queryProjectV30ResponseDataProjectInfoListInner.settlementCustomerId) &&
        Objects.equals(this.settlementCustomerName, queryProjectV30ResponseDataProjectInfoListInner.settlementCustomerName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adcId, adcSerial, advertiserId, advertiserName, amount, confirmStatus, confirmStatusName, contractSerial, costCustomerId, costCustomerName, creditCost, deadline, grantCost, id, invoiceAmount, name, orderIds, payMethodName, platform, platformName, prepayCost, projectEndDate, projectGroupType, projectGroupTypeName, projectStartDate, projectStatus, projectStatusName, receiptStatus, receiptStatusName, receiptSubjectName, rechargeCost, remainVerificationAmount, serial, servingType, servingTypeName, settlementCustomerId, settlementCustomerName);
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
    sb.append("class QueryProjectV30ResponseDataProjectInfoListInner {\n");
    sb.append("    adcId: ").append(toIndentedString(adcId)).append("\n");
    sb.append("    adcSerial: ").append(toIndentedString(adcSerial)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    confirmStatus: ").append(toIndentedString(confirmStatus)).append("\n");
    sb.append("    confirmStatusName: ").append(toIndentedString(confirmStatusName)).append("\n");
    sb.append("    contractSerial: ").append(toIndentedString(contractSerial)).append("\n");
    sb.append("    costCustomerId: ").append(toIndentedString(costCustomerId)).append("\n");
    sb.append("    costCustomerName: ").append(toIndentedString(costCustomerName)).append("\n");
    sb.append("    creditCost: ").append(toIndentedString(creditCost)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    grantCost: ").append(toIndentedString(grantCost)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    payMethodName: ").append(toIndentedString(payMethodName)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformName: ").append(toIndentedString(platformName)).append("\n");
    sb.append("    prepayCost: ").append(toIndentedString(prepayCost)).append("\n");
    sb.append("    projectEndDate: ").append(toIndentedString(projectEndDate)).append("\n");
    sb.append("    projectGroupType: ").append(toIndentedString(projectGroupType)).append("\n");
    sb.append("    projectGroupTypeName: ").append(toIndentedString(projectGroupTypeName)).append("\n");
    sb.append("    projectStartDate: ").append(toIndentedString(projectStartDate)).append("\n");
    sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
    sb.append("    projectStatusName: ").append(toIndentedString(projectStatusName)).append("\n");
    sb.append("    receiptStatus: ").append(toIndentedString(receiptStatus)).append("\n");
    sb.append("    receiptStatusName: ").append(toIndentedString(receiptStatusName)).append("\n");
    sb.append("    receiptSubjectName: ").append(toIndentedString(receiptSubjectName)).append("\n");
    sb.append("    rechargeCost: ").append(toIndentedString(rechargeCost)).append("\n");
    sb.append("    remainVerificationAmount: ").append(toIndentedString(remainVerificationAmount)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    servingType: ").append(toIndentedString(servingType)).append("\n");
    sb.append("    servingTypeName: ").append(toIndentedString(servingTypeName)).append("\n");
    sb.append("    settlementCustomerId: ").append(toIndentedString(settlementCustomerId)).append("\n");
    sb.append("    settlementCustomerName: ").append(toIndentedString(settlementCustomerName)).append("\n");
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
    openapiFields.add("adc_id");
    openapiFields.add("adc_serial");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("amount");
    openapiFields.add("confirm_status");
    openapiFields.add("confirm_status_name");
    openapiFields.add("contract_serial");
    openapiFields.add("cost_customer_id");
    openapiFields.add("cost_customer_name");
    openapiFields.add("credit_cost");
    openapiFields.add("deadline");
    openapiFields.add("grant_cost");
    openapiFields.add("id");
    openapiFields.add("invoice_amount");
    openapiFields.add("name");
    openapiFields.add("order_ids");
    openapiFields.add("pay_method_name");
    openapiFields.add("platform");
    openapiFields.add("platform_name");
    openapiFields.add("prepay_cost");
    openapiFields.add("project_end_date");
    openapiFields.add("project_group_type");
    openapiFields.add("project_group_type_name");
    openapiFields.add("project_start_date");
    openapiFields.add("project_status");
    openapiFields.add("project_status_name");
    openapiFields.add("receipt_status");
    openapiFields.add("receipt_status_name");
    openapiFields.add("receipt_subject_name");
    openapiFields.add("recharge_cost");
    openapiFields.add("remain_verification_amount");
    openapiFields.add("serial");
    openapiFields.add("serving_type");
    openapiFields.add("serving_type_name");
    openapiFields.add("settlement_customer_id");
    openapiFields.add("settlement_customer_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryProjectV30ResponseDataProjectInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryProjectV30ResponseDataProjectInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryProjectV30ResponseDataProjectInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryProjectV30ResponseDataProjectInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryProjectV30ResponseDataProjectInfoListInner>() {
           @Override
           public void write(JsonWriter out, QueryProjectV30ResponseDataProjectInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryProjectV30ResponseDataProjectInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryProjectV30ResponseDataProjectInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryProjectV30ResponseDataProjectInfoListInner
  * @throws IOException if the JSON string is invalid with respect to QueryProjectV30ResponseDataProjectInfoListInner
  */
  public static QueryProjectV30ResponseDataProjectInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryProjectV30ResponseDataProjectInfoListInner.class);
  }

 /**
  * Convert an instance of QueryProjectV30ResponseDataProjectInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

