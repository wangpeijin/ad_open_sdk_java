/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2DataDataBusinessType;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2DataDataFinalOperatorTag;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2DataDataPromotionStatus;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner;
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
 * AgentQueryRiskPromotionListV2ResponseDataDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AgentQueryRiskPromotionListV2ResponseDataDataInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_AGENT_COMPANY_ID = "agent_company_id";
  @SerializedName(SERIALIZED_NAME_AGENT_COMPANY_ID)
  private Long agentCompanyId = null;

  public static final String SERIALIZED_NAME_AGENT_COMPANY_NAME = "agent_company_name";
  @SerializedName(SERIALIZED_NAME_AGENT_COMPANY_NAME)
  private String agentCompanyName = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName = null;

  public static final String SERIALIZED_NAME_BUSINESS_TYPE = "business_type";
  @SerializedName(SERIALIZED_NAME_BUSINESS_TYPE)
  private AgentQueryRiskPromotionListV2DataDataBusinessType businessType = null;

  public static final String SERIALIZED_NAME_COLLABORATOR_IDS = "collaborator_ids";
  @SerializedName(SERIALIZED_NAME_COLLABORATOR_IDS)
  private List<Long> collaboratorIds = null;

  public static final String SERIALIZED_NAME_COLLABORATOR_NAMES = "collaborator_names";
  @SerializedName(SERIALIZED_NAME_COLLABORATOR_NAMES)
  private List<String> collaboratorNames = null;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Long companyId = null;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName = null;

  public static final String SERIALIZED_NAME_FINAL_OPERATOR_TAG = "final_operator_tag";
  @SerializedName(SERIALIZED_NAME_FINAL_OPERATOR_TAG)
  private AgentQueryRiskPromotionListV2DataDataFinalOperatorTag finalOperatorTag = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_COMPANY_ID = "first_agent_company_id";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_COMPANY_ID)
  private Long firstAgentCompanyId = null;

  public static final String SERIALIZED_NAME_FIRST_AGENT_COMPANY_NAME = "first_agent_company_name";
  @SerializedName(SERIALIZED_NAME_FIRST_AGENT_COMPANY_NAME)
  private String firstAgentCompanyName = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MATERIAL_LIST = "material_list";
  @SerializedName(SERIALIZED_NAME_MATERIAL_LIST)
  private List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner> materialList = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_ID = "optimizer_id";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_ID)
  private Long optimizerId = null;

  public static final String SERIALIZED_NAME_OPTIMIZER_NAME = "optimizer_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZER_NAME)
  private String optimizerName = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS = "promotion_status";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS)
  private AgentQueryRiskPromotionListV2DataDataPromotionStatus promotionStatus = null;

  public static final String SERIALIZED_NAME_SEND_TIME = "send_time";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private String sendTime = null;

  public AgentQueryRiskPromotionListV2ResponseDataDataInner() {
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInner advertiserId(Long advertiserId) {
    
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


  public AgentQueryRiskPromotionListV2ResponseDataDataInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主账户名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner agentCompanyId(Long agentCompanyId) {
    
    this.agentCompanyId = agentCompanyId;
    return this;
  }

   /**
   * 代理商公司ID
   * @return agentCompanyId
  **/
  @javax.annotation.Nullable
  public Long getAgentCompanyId() {
    return agentCompanyId;
  }


  public void setAgentCompanyId(Long agentCompanyId) {
    this.agentCompanyId = agentCompanyId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner agentCompanyName(String agentCompanyName) {
    
    this.agentCompanyName = agentCompanyName;
    return this;
  }

   /**
   * 代理商公司名称
   * @return agentCompanyName
  **/
  @javax.annotation.Nullable
  public String getAgentCompanyName() {
    return agentCompanyName;
  }


  public void setAgentCompanyName(String agentCompanyName) {
    this.agentCompanyName = agentCompanyName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nullable
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 代理商账户名称
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner businessType(AgentQueryRiskPromotionListV2DataDataBusinessType businessType) {
    
    this.businessType = businessType;
    return this;
  }

   /**
   * Get businessType
   * @return businessType
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2DataDataBusinessType getBusinessType() {
    return businessType;
  }


  public void setBusinessType(AgentQueryRiskPromotionListV2DataDataBusinessType businessType) {
    this.businessType = businessType;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner collaboratorIds(List<Long> collaboratorIds) {
    
    this.collaboratorIds = collaboratorIds;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInner addCollaboratorIdsItem(Long collaboratorIdsItem) {
    if (this.collaboratorIds == null) {
      this.collaboratorIds = new ArrayList<>();
    }
    this.collaboratorIds.add(collaboratorIdsItem);
    return this;
  }

   /**
   * 协作者ID
   * @return collaboratorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCollaboratorIds() {
    return collaboratorIds;
  }


  public void setCollaboratorIds(List<Long> collaboratorIds) {
    this.collaboratorIds = collaboratorIds;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner collaboratorNames(List<String> collaboratorNames) {
    
    this.collaboratorNames = collaboratorNames;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInner addCollaboratorNamesItem(String collaboratorNamesItem) {
    if (this.collaboratorNames == null) {
      this.collaboratorNames = new ArrayList<>();
    }
    this.collaboratorNames.add(collaboratorNamesItem);
    return this;
  }

   /**
   * 协作者姓名
   * @return collaboratorNames
  **/
  @javax.annotation.Nullable
  public List<String> getCollaboratorNames() {
    return collaboratorNames;
  }


  public void setCollaboratorNames(List<String> collaboratorNames) {
    this.collaboratorNames = collaboratorNames;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner companyId(Long companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 广告主公司ID
   * @return companyId
  **/
  @javax.annotation.Nullable
  public Long getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * 广告主公司名称
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner finalOperatorTag(AgentQueryRiskPromotionListV2DataDataFinalOperatorTag finalOperatorTag) {
    
    this.finalOperatorTag = finalOperatorTag;
    return this;
  }

   /**
   * Get finalOperatorTag
   * @return finalOperatorTag
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2DataDataFinalOperatorTag getFinalOperatorTag() {
    return finalOperatorTag;
  }


  public void setFinalOperatorTag(AgentQueryRiskPromotionListV2DataDataFinalOperatorTag finalOperatorTag) {
    this.finalOperatorTag = finalOperatorTag;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner firstAgentCompanyId(Long firstAgentCompanyId) {
    
    this.firstAgentCompanyId = firstAgentCompanyId;
    return this;
  }

   /**
   * 一代代理商公司ID
   * @return firstAgentCompanyId
  **/
  @javax.annotation.Nullable
  public Long getFirstAgentCompanyId() {
    return firstAgentCompanyId;
  }


  public void setFirstAgentCompanyId(Long firstAgentCompanyId) {
    this.firstAgentCompanyId = firstAgentCompanyId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner firstAgentCompanyName(String firstAgentCompanyName) {
    
    this.firstAgentCompanyName = firstAgentCompanyName;
    return this;
  }

   /**
   * 一代代理商公司名称
   * @return firstAgentCompanyName
  **/
  @javax.annotation.Nullable
  public String getFirstAgentCompanyName() {
    return firstAgentCompanyName;
  }


  public void setFirstAgentCompanyName(String firstAgentCompanyName) {
    this.firstAgentCompanyName = firstAgentCompanyName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 记录的唯一ID
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner materialList(List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner> materialList) {
    
    this.materialList = materialList;
    return this;
  }

  public AgentQueryRiskPromotionListV2ResponseDataDataInner addMaterialListItem(AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner materialListItem) {
    if (this.materialList == null) {
      this.materialList = new ArrayList<>();
    }
    this.materialList.add(materialListItem);
    return this;
  }

   /**
   * 违规素材列表，包含广告下投前+投中拒审的素材信息
   * @return materialList
  **/
  @javax.annotation.Nullable
  public List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner> getMaterialList() {
    return materialList;
  }


  public void setMaterialList(List<AgentQueryRiskPromotionListV2ResponseDataDataInnerMaterialListInner> materialList) {
    this.materialList = materialList;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner optimizerId(Long optimizerId) {
    
    this.optimizerId = optimizerId;
    return this;
  }

   /**
   * 优化师ID
   * @return optimizerId
  **/
  @javax.annotation.Nullable
  public Long getOptimizerId() {
    return optimizerId;
  }


  public void setOptimizerId(Long optimizerId) {
    this.optimizerId = optimizerId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner optimizerName(String optimizerName) {
    
    this.optimizerName = optimizerName;
    return this;
  }

   /**
   * 优化师姓名
   * @return optimizerName
  **/
  @javax.annotation.Nullable
  public String getOptimizerName() {
    return optimizerName;
  }


  public void setOptimizerName(String optimizerName) {
    this.optimizerName = optimizerName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 广告名称
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner promotionStatus(AgentQueryRiskPromotionListV2DataDataPromotionStatus promotionStatus) {
    
    this.promotionStatus = promotionStatus;
    return this;
  }

   /**
   * Get promotionStatus
   * @return promotionStatus
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2DataDataPromotionStatus getPromotionStatus() {
    return promotionStatus;
  }


  public void setPromotionStatus(AgentQueryRiskPromotionListV2DataDataPromotionStatus promotionStatus) {
    this.promotionStatus = promotionStatus;
  }


  public AgentQueryRiskPromotionListV2ResponseDataDataInner sendTime(String sendTime) {
    
    this.sendTime = sendTime;
    return this;
  }

   /**
   * 推送时间，比如：
   * @return sendTime
  **/
  @javax.annotation.Nullable
  public String getSendTime() {
    return sendTime;
  }


  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2ResponseDataDataInner agentQueryRiskPromotionListV2ResponseDataDataInner = (AgentQueryRiskPromotionListV2ResponseDataDataInner) o;
    return Objects.equals(this.advertiserId, agentQueryRiskPromotionListV2ResponseDataDataInner.advertiserId) &&
        Objects.equals(this.advertiserName, agentQueryRiskPromotionListV2ResponseDataDataInner.advertiserName) &&
        Objects.equals(this.agentCompanyId, agentQueryRiskPromotionListV2ResponseDataDataInner.agentCompanyId) &&
        Objects.equals(this.agentCompanyName, agentQueryRiskPromotionListV2ResponseDataDataInner.agentCompanyName) &&
        Objects.equals(this.agentId, agentQueryRiskPromotionListV2ResponseDataDataInner.agentId) &&
        Objects.equals(this.agentName, agentQueryRiskPromotionListV2ResponseDataDataInner.agentName) &&
        Objects.equals(this.businessType, agentQueryRiskPromotionListV2ResponseDataDataInner.businessType) &&
        Objects.equals(this.collaboratorIds, agentQueryRiskPromotionListV2ResponseDataDataInner.collaboratorIds) &&
        Objects.equals(this.collaboratorNames, agentQueryRiskPromotionListV2ResponseDataDataInner.collaboratorNames) &&
        Objects.equals(this.companyId, agentQueryRiskPromotionListV2ResponseDataDataInner.companyId) &&
        Objects.equals(this.companyName, agentQueryRiskPromotionListV2ResponseDataDataInner.companyName) &&
        Objects.equals(this.finalOperatorTag, agentQueryRiskPromotionListV2ResponseDataDataInner.finalOperatorTag) &&
        Objects.equals(this.firstAgentCompanyId, agentQueryRiskPromotionListV2ResponseDataDataInner.firstAgentCompanyId) &&
        Objects.equals(this.firstAgentCompanyName, agentQueryRiskPromotionListV2ResponseDataDataInner.firstAgentCompanyName) &&
        Objects.equals(this.id, agentQueryRiskPromotionListV2ResponseDataDataInner.id) &&
        Objects.equals(this.materialList, agentQueryRiskPromotionListV2ResponseDataDataInner.materialList) &&
        Objects.equals(this.optimizerId, agentQueryRiskPromotionListV2ResponseDataDataInner.optimizerId) &&
        Objects.equals(this.optimizerName, agentQueryRiskPromotionListV2ResponseDataDataInner.optimizerName) &&
        Objects.equals(this.promotionId, agentQueryRiskPromotionListV2ResponseDataDataInner.promotionId) &&
        Objects.equals(this.promotionName, agentQueryRiskPromotionListV2ResponseDataDataInner.promotionName) &&
        Objects.equals(this.promotionStatus, agentQueryRiskPromotionListV2ResponseDataDataInner.promotionStatus) &&
        Objects.equals(this.sendTime, agentQueryRiskPromotionListV2ResponseDataDataInner.sendTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, advertiserName, agentCompanyId, agentCompanyName, agentId, agentName, businessType, collaboratorIds, collaboratorNames, companyId, companyName, finalOperatorTag, firstAgentCompanyId, firstAgentCompanyName, id, materialList, optimizerId, optimizerName, promotionId, promotionName, promotionStatus, sendTime);
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
    sb.append("class AgentQueryRiskPromotionListV2ResponseDataDataInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    agentCompanyId: ").append(toIndentedString(agentCompanyId)).append("\n");
    sb.append("    agentCompanyName: ").append(toIndentedString(agentCompanyName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    collaboratorIds: ").append(toIndentedString(collaboratorIds)).append("\n");
    sb.append("    collaboratorNames: ").append(toIndentedString(collaboratorNames)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    finalOperatorTag: ").append(toIndentedString(finalOperatorTag)).append("\n");
    sb.append("    firstAgentCompanyId: ").append(toIndentedString(firstAgentCompanyId)).append("\n");
    sb.append("    firstAgentCompanyName: ").append(toIndentedString(firstAgentCompanyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    materialList: ").append(toIndentedString(materialList)).append("\n");
    sb.append("    optimizerId: ").append(toIndentedString(optimizerId)).append("\n");
    sb.append("    optimizerName: ").append(toIndentedString(optimizerName)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionStatus: ").append(toIndentedString(promotionStatus)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
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
    openapiFields.add("advertiser_name");
    openapiFields.add("agent_company_id");
    openapiFields.add("agent_company_name");
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("business_type");
    openapiFields.add("collaborator_ids");
    openapiFields.add("collaborator_names");
    openapiFields.add("company_id");
    openapiFields.add("company_name");
    openapiFields.add("final_operator_tag");
    openapiFields.add("first_agent_company_id");
    openapiFields.add("first_agent_company_name");
    openapiFields.add("id");
    openapiFields.add("material_list");
    openapiFields.add("optimizer_id");
    openapiFields.add("optimizer_name");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_name");
    openapiFields.add("promotion_status");
    openapiFields.add("send_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2ResponseDataDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2ResponseDataDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2ResponseDataDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2ResponseDataDataInner>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2ResponseDataDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2ResponseDataDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2ResponseDataDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2ResponseDataDataInner
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2ResponseDataDataInner
  */
  public static AgentQueryRiskPromotionListV2ResponseDataDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2ResponseDataDataInner.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2ResponseDataDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

