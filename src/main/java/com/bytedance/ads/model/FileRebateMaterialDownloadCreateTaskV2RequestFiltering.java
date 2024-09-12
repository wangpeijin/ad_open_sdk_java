/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringIsAccumulation;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringIsLiveRebateType;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringMaterialIsEffective;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringOperatorTag;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType;
import com.bytedance.ads.model.FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcSettlementStatsType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * 过滤条件 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class FileRebateMaterialDownloadCreateTaskV2RequestFiltering {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName = null;

  public static final String SERIALIZED_NAME_FIRST_EFFECTIVE_PERIOD = "first_effective_period";
  @SerializedName(SERIALIZED_NAME_FIRST_EFFECTIVE_PERIOD)
  private String firstEffectivePeriod = null;

  public static final String SERIALIZED_NAME_IS_ACCUMULATION = "is_accumulation";
  @SerializedName(SERIALIZED_NAME_IS_ACCUMULATION)
  private FileRebateMaterialDownloadCreateTaskV2FilteringIsAccumulation isAccumulation = null;

  public static final String SERIALIZED_NAME_IS_LIVE_REBATE_TYPE = "is_live_rebate_type";
  @SerializedName(SERIALIZED_NAME_IS_LIVE_REBATE_TYPE)
  private FileRebateMaterialDownloadCreateTaskV2FilteringIsLiveRebateType isLiveRebateType = null;

  public static final String SERIALIZED_NAME_IS_VALID_MATERIAL = "is_valid_material";
  @SerializedName(SERIALIZED_NAME_IS_VALID_MATERIAL)
  private FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial isValidMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_FIRST_EFFECTIVE_END_DATE = "material_first_effective_end_date";
  @SerializedName(SERIALIZED_NAME_MATERIAL_FIRST_EFFECTIVE_END_DATE)
  private String materialFirstEffectiveEndDate = null;

  public static final String SERIALIZED_NAME_MATERIAL_FIRST_EFFECTIVE_START_DATE = "material_first_effective_start_date";
  @SerializedName(SERIALIZED_NAME_MATERIAL_FIRST_EFFECTIVE_START_DATE)
  private String materialFirstEffectiveStartDate = null;

  public static final String SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE = "material_is_effective";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IS_EFFECTIVE)
  private FileRebateMaterialDownloadCreateTaskV2FilteringMaterialIsEffective materialIsEffective = null;

  public static final String SERIALIZED_NAME_MATERIAL_TAG = "material_tag";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TAG)
  private List<FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag> materialTag = null;

  public static final String SERIALIZED_NAME_OPERATOR_TAG = "operator_tag";
  @SerializedName(SERIALIZED_NAME_OPERATOR_TAG)
  private FileRebateMaterialDownloadCreateTaskV2FilteringOperatorTag operatorTag = null;

  public static final String SERIALIZED_NAME_POLICY_COST_MAX = "policy_cost_max";
  @SerializedName(SERIALIZED_NAME_POLICY_COST_MAX)
  private Long policyCostMax = null;

  public static final String SERIALIZED_NAME_POLICY_COST_MIN = "policy_cost_min";
  @SerializedName(SERIALIZED_NAME_POLICY_COST_MIN)
  private Long policyCostMin = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME = "rebate_calc_first_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_FIRST_INDUSTRY_NAME)
  private String rebateCalcFirstIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE = "rebate_calc_policy_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_POLICY_TYPE)
  private FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType rebateCalcPolicyType = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME = "rebate_calc_second_industry_name";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SECOND_INDUSTRY_NAME)
  private String rebateCalcSecondIndustryName = null;

  public static final String SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE = "rebate_calc_settlement_stats_type";
  @SerializedName(SERIALIZED_NAME_REBATE_CALC_SETTLEMENT_STATS_TYPE)
  private FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcSettlementStatsType rebateCalcSettlementStatsType = null;

  public static final String SERIALIZED_NAME_THIS_PERIOD_CUM_DAY_NUM = "this_period_cum_day_num";
  @SerializedName(SERIALIZED_NAME_THIS_PERIOD_CUM_DAY_NUM)
  private Long thisPeriodCumDayNum = null;

  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering() {
  }

  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering customerName(String customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * 客户名称
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }


  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering firstEffectivePeriod(String firstEffectivePeriod) {
    
    this.firstEffectivePeriod = firstEffectivePeriod;
    return this;
  }

   /**
   * 素材首投所在月 格式：yyyy-MM
   * @return firstEffectivePeriod
  **/
  @javax.annotation.Nullable
  public String getFirstEffectivePeriod() {
    return firstEffectivePeriod;
  }


  public void setFirstEffectivePeriod(String firstEffectivePeriod) {
    this.firstEffectivePeriod = firstEffectivePeriod;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering isAccumulation(FileRebateMaterialDownloadCreateTaskV2FilteringIsAccumulation isAccumulation) {
    
    this.isAccumulation = isAccumulation;
    return this;
  }

   /**
   * Get isAccumulation
   * @return isAccumulation
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringIsAccumulation getIsAccumulation() {
    return isAccumulation;
  }


  public void setIsAccumulation(FileRebateMaterialDownloadCreateTaskV2FilteringIsAccumulation isAccumulation) {
    this.isAccumulation = isAccumulation;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering isLiveRebateType(FileRebateMaterialDownloadCreateTaskV2FilteringIsLiveRebateType isLiveRebateType) {
    
    this.isLiveRebateType = isLiveRebateType;
    return this;
  }

   /**
   * Get isLiveRebateType
   * @return isLiveRebateType
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringIsLiveRebateType getIsLiveRebateType() {
    return isLiveRebateType;
  }


  public void setIsLiveRebateType(FileRebateMaterialDownloadCreateTaskV2FilteringIsLiveRebateType isLiveRebateType) {
    this.isLiveRebateType = isLiveRebateType;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering isValidMaterial(FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial isValidMaterial) {
    
    this.isValidMaterial = isValidMaterial;
    return this;
  }

   /**
   * Get isValidMaterial
   * @return isValidMaterial
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial getIsValidMaterial() {
    return isValidMaterial;
  }


  public void setIsValidMaterial(FileRebateMaterialDownloadCreateTaskV2FilteringIsValidMaterial isValidMaterial) {
    this.isValidMaterial = isValidMaterial;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering materialFirstEffectiveEndDate(String materialFirstEffectiveEndDate) {
    
    this.materialFirstEffectiveEndDate = materialFirstEffectiveEndDate;
    return this;
  }

   /**
   * 素材首投日期范围结束日期 格式：yyyy-MM-dd
   * @return materialFirstEffectiveEndDate
  **/
  @javax.annotation.Nullable
  public String getMaterialFirstEffectiveEndDate() {
    return materialFirstEffectiveEndDate;
  }


  public void setMaterialFirstEffectiveEndDate(String materialFirstEffectiveEndDate) {
    this.materialFirstEffectiveEndDate = materialFirstEffectiveEndDate;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering materialFirstEffectiveStartDate(String materialFirstEffectiveStartDate) {
    
    this.materialFirstEffectiveStartDate = materialFirstEffectiveStartDate;
    return this;
  }

   /**
   * 素材首投日期范围开始日期 格式：yyyy-MM-dd
   * @return materialFirstEffectiveStartDate
  **/
  @javax.annotation.Nullable
  public String getMaterialFirstEffectiveStartDate() {
    return materialFirstEffectiveStartDate;
  }


  public void setMaterialFirstEffectiveStartDate(String materialFirstEffectiveStartDate) {
    this.materialFirstEffectiveStartDate = materialFirstEffectiveStartDate;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering materialIsEffective(FileRebateMaterialDownloadCreateTaskV2FilteringMaterialIsEffective materialIsEffective) {
    
    this.materialIsEffective = materialIsEffective;
    return this;
  }

   /**
   * Get materialIsEffective
   * @return materialIsEffective
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringMaterialIsEffective getMaterialIsEffective() {
    return materialIsEffective;
  }


  public void setMaterialIsEffective(FileRebateMaterialDownloadCreateTaskV2FilteringMaterialIsEffective materialIsEffective) {
    this.materialIsEffective = materialIsEffective;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering materialTag(List<FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag> materialTag) {
    
    this.materialTag = materialTag;
    return this;
  }

  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering addMaterialTagItem(FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag materialTagItem) {
    if (this.materialTag == null) {
      this.materialTag = new ArrayList<>();
    }
    this.materialTag.add(materialTagItem);
    return this;
  }

   /**
   * 素材标签筛选项（如传入多个标签，取交集）
   * @return materialTag
  **/
  @javax.annotation.Nullable
  public List<FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag> getMaterialTag() {
    return materialTag;
  }


  public void setMaterialTag(List<FileRebateMaterialDownloadCreateTaskV2FilteringMaterialTag> materialTag) {
    this.materialTag = materialTag;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering operatorTag(FileRebateMaterialDownloadCreateTaskV2FilteringOperatorTag operatorTag) {
    
    this.operatorTag = operatorTag;
    return this;
  }

   /**
   * Get operatorTag
   * @return operatorTag
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringOperatorTag getOperatorTag() {
    return operatorTag;
  }


  public void setOperatorTag(FileRebateMaterialDownloadCreateTaskV2FilteringOperatorTag operatorTag) {
    this.operatorTag = operatorTag;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering policyCostMax(Long policyCostMax) {
    
    this.policyCostMax = policyCostMax;
    return this;
  }

   /**
   * 【政策粒度】累量消耗范围区间上限 - 仅支持录入整数,单位：元
   * @return policyCostMax
  **/
  @javax.annotation.Nullable
  public Long getPolicyCostMax() {
    return policyCostMax;
  }


  public void setPolicyCostMax(Long policyCostMax) {
    this.policyCostMax = policyCostMax;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering policyCostMin(Long policyCostMin) {
    
    this.policyCostMin = policyCostMin;
    return this;
  }

   /**
   * 【政策粒度】累量消耗范围区间下限 - 仅支持录入整数,单位：元
   * @return policyCostMin
  **/
  @javax.annotation.Nullable
  public Long getPolicyCostMin() {
    return policyCostMin;
  }


  public void setPolicyCostMin(Long policyCostMin) {
    this.policyCostMin = policyCostMin;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering rebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
    return this;
  }

   /**
   * 一级结算行业
   * @return rebateCalcFirstIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcFirstIndustryName() {
    return rebateCalcFirstIndustryName;
  }


  public void setRebateCalcFirstIndustryName(String rebateCalcFirstIndustryName) {
    this.rebateCalcFirstIndustryName = rebateCalcFirstIndustryName;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering rebateCalcPolicyType(FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType rebateCalcPolicyType) {
    
    this.rebateCalcPolicyType = rebateCalcPolicyType;
    return this;
  }

   /**
   * Get rebateCalcPolicyType
   * @return rebateCalcPolicyType
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType getRebateCalcPolicyType() {
    return rebateCalcPolicyType;
  }


  public void setRebateCalcPolicyType(FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcPolicyType rebateCalcPolicyType) {
    this.rebateCalcPolicyType = rebateCalcPolicyType;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering rebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
    return this;
  }

   /**
   * 二级结算行业
   * @return rebateCalcSecondIndustryName
  **/
  @javax.annotation.Nullable
  public String getRebateCalcSecondIndustryName() {
    return rebateCalcSecondIndustryName;
  }


  public void setRebateCalcSecondIndustryName(String rebateCalcSecondIndustryName) {
    this.rebateCalcSecondIndustryName = rebateCalcSecondIndustryName;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering rebateCalcSettlementStatsType(FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcSettlementStatsType rebateCalcSettlementStatsType) {
    
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
    return this;
  }

   /**
   * Get rebateCalcSettlementStatsType
   * @return rebateCalcSettlementStatsType
  **/
  @javax.annotation.Nullable
  public FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcSettlementStatsType getRebateCalcSettlementStatsType() {
    return rebateCalcSettlementStatsType;
  }


  public void setRebateCalcSettlementStatsType(FileRebateMaterialDownloadCreateTaskV2FilteringRebateCalcSettlementStatsType rebateCalcSettlementStatsType) {
    this.rebateCalcSettlementStatsType = rebateCalcSettlementStatsType;
  }


  public FileRebateMaterialDownloadCreateTaskV2RequestFiltering thisPeriodCumDayNum(Long thisPeriodCumDayNum) {
    
    this.thisPeriodCumDayNum = thisPeriodCumDayNum;
    return this;
  }

   /**
   * 本期已累量天数
   * @return thisPeriodCumDayNum
  **/
  @javax.annotation.Nullable
  public Long getThisPeriodCumDayNum() {
    return thisPeriodCumDayNum;
  }


  public void setThisPeriodCumDayNum(Long thisPeriodCumDayNum) {
    this.thisPeriodCumDayNum = thisPeriodCumDayNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileRebateMaterialDownloadCreateTaskV2RequestFiltering fileRebateMaterialDownloadCreateTaskV2RequestFiltering = (FileRebateMaterialDownloadCreateTaskV2RequestFiltering) o;
    return Objects.equals(this.advertiserId, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.advertiserId) &&
        Objects.equals(this.customerName, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.customerName) &&
        Objects.equals(this.firstEffectivePeriod, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.firstEffectivePeriod) &&
        Objects.equals(this.isAccumulation, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.isAccumulation) &&
        Objects.equals(this.isLiveRebateType, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.isLiveRebateType) &&
        Objects.equals(this.isValidMaterial, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.isValidMaterial) &&
        Objects.equals(this.materialFirstEffectiveEndDate, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.materialFirstEffectiveEndDate) &&
        Objects.equals(this.materialFirstEffectiveStartDate, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.materialFirstEffectiveStartDate) &&
        Objects.equals(this.materialIsEffective, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.materialIsEffective) &&
        Objects.equals(this.materialTag, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.materialTag) &&
        Objects.equals(this.operatorTag, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.operatorTag) &&
        Objects.equals(this.policyCostMax, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.policyCostMax) &&
        Objects.equals(this.policyCostMin, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.policyCostMin) &&
        Objects.equals(this.rebateCalcFirstIndustryName, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.rebateCalcFirstIndustryName) &&
        Objects.equals(this.rebateCalcPolicyType, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.rebateCalcPolicyType) &&
        Objects.equals(this.rebateCalcSecondIndustryName, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.rebateCalcSecondIndustryName) &&
        Objects.equals(this.rebateCalcSettlementStatsType, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.rebateCalcSettlementStatsType) &&
        Objects.equals(this.thisPeriodCumDayNum, fileRebateMaterialDownloadCreateTaskV2RequestFiltering.thisPeriodCumDayNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, customerName, firstEffectivePeriod, isAccumulation, isLiveRebateType, isValidMaterial, materialFirstEffectiveEndDate, materialFirstEffectiveStartDate, materialIsEffective, materialTag, operatorTag, policyCostMax, policyCostMin, rebateCalcFirstIndustryName, rebateCalcPolicyType, rebateCalcSecondIndustryName, rebateCalcSettlementStatsType, thisPeriodCumDayNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileRebateMaterialDownloadCreateTaskV2RequestFiltering {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    firstEffectivePeriod: ").append(toIndentedString(firstEffectivePeriod)).append("\n");
    sb.append("    isAccumulation: ").append(toIndentedString(isAccumulation)).append("\n");
    sb.append("    isLiveRebateType: ").append(toIndentedString(isLiveRebateType)).append("\n");
    sb.append("    isValidMaterial: ").append(toIndentedString(isValidMaterial)).append("\n");
    sb.append("    materialFirstEffectiveEndDate: ").append(toIndentedString(materialFirstEffectiveEndDate)).append("\n");
    sb.append("    materialFirstEffectiveStartDate: ").append(toIndentedString(materialFirstEffectiveStartDate)).append("\n");
    sb.append("    materialIsEffective: ").append(toIndentedString(materialIsEffective)).append("\n");
    sb.append("    materialTag: ").append(toIndentedString(materialTag)).append("\n");
    sb.append("    operatorTag: ").append(toIndentedString(operatorTag)).append("\n");
    sb.append("    policyCostMax: ").append(toIndentedString(policyCostMax)).append("\n");
    sb.append("    policyCostMin: ").append(toIndentedString(policyCostMin)).append("\n");
    sb.append("    rebateCalcFirstIndustryName: ").append(toIndentedString(rebateCalcFirstIndustryName)).append("\n");
    sb.append("    rebateCalcPolicyType: ").append(toIndentedString(rebateCalcPolicyType)).append("\n");
    sb.append("    rebateCalcSecondIndustryName: ").append(toIndentedString(rebateCalcSecondIndustryName)).append("\n");
    sb.append("    rebateCalcSettlementStatsType: ").append(toIndentedString(rebateCalcSettlementStatsType)).append("\n");
    sb.append("    thisPeriodCumDayNum: ").append(toIndentedString(thisPeriodCumDayNum)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("customer_name");
    openapiFields.add("first_effective_period");
    openapiFields.add("is_accumulation");
    openapiFields.add("is_live_rebate_type");
    openapiFields.add("is_valid_material");
    openapiFields.add("material_first_effective_end_date");
    openapiFields.add("material_first_effective_start_date");
    openapiFields.add("material_is_effective");
    openapiFields.add("material_tag");
    openapiFields.add("operator_tag");
    openapiFields.add("policy_cost_max");
    openapiFields.add("policy_cost_min");
    openapiFields.add("rebate_calc_first_industry_name");
    openapiFields.add("rebate_calc_policy_type");
    openapiFields.add("rebate_calc_second_industry_name");
    openapiFields.add("rebate_calc_settlement_stats_type");
    openapiFields.add("this_period_cum_day_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileRebateMaterialDownloadCreateTaskV2RequestFiltering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileRebateMaterialDownloadCreateTaskV2RequestFiltering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileRebateMaterialDownloadCreateTaskV2RequestFiltering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileRebateMaterialDownloadCreateTaskV2RequestFiltering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileRebateMaterialDownloadCreateTaskV2RequestFiltering>() {
           @Override
           public void write(JsonWriter out, FileRebateMaterialDownloadCreateTaskV2RequestFiltering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileRebateMaterialDownloadCreateTaskV2RequestFiltering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileRebateMaterialDownloadCreateTaskV2RequestFiltering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileRebateMaterialDownloadCreateTaskV2RequestFiltering
  * @throws IOException if the JSON string is invalid with respect to FileRebateMaterialDownloadCreateTaskV2RequestFiltering
  */
  public static FileRebateMaterialDownloadCreateTaskV2RequestFiltering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileRebateMaterialDownloadCreateTaskV2RequestFiltering.class);
  }

 /**
  * Convert an instance of FileRebateMaterialDownloadCreateTaskV2RequestFiltering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

