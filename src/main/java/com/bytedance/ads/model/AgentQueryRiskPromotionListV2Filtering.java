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
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2FilteringFinalOperatorTag;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2FilteringPromotionStatus;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AgentQueryRiskPromotionListV2Filtering {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_FINAL_OPERATOR_TAG = "final_operator_tag";
  @SerializedName(SERIALIZED_NAME_FINAL_OPERATOR_TAG)
  private AgentQueryRiskPromotionListV2FilteringFinalOperatorTag finalOperatorTag = null;

  public static final String SERIALIZED_NAME_ILLEGAL_MATERIAL_IDS = "illegal_material_ids";
  @SerializedName(SERIALIZED_NAME_ILLEGAL_MATERIAL_IDS)
  private List<Long> illegalMaterialIds = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS = "promotion_status";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS)
  private AgentQueryRiskPromotionListV2FilteringPromotionStatus promotionStatus = null;

  public AgentQueryRiskPromotionListV2Filtering() {
  }

  public AgentQueryRiskPromotionListV2Filtering advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AgentQueryRiskPromotionListV2Filtering addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告主账户ID，最多支持100个
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AgentQueryRiskPromotionListV2Filtering advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主账户名称，模糊搜索，长度不能超过30
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public AgentQueryRiskPromotionListV2Filtering finalOperatorTag(AgentQueryRiskPromotionListV2FilteringFinalOperatorTag finalOperatorTag) {
    
    this.finalOperatorTag = finalOperatorTag;
    return this;
  }

   /**
   * Get finalOperatorTag
   * @return finalOperatorTag
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2FilteringFinalOperatorTag getFinalOperatorTag() {
    return finalOperatorTag;
  }


  public void setFinalOperatorTag(AgentQueryRiskPromotionListV2FilteringFinalOperatorTag finalOperatorTag) {
    this.finalOperatorTag = finalOperatorTag;
  }


  public AgentQueryRiskPromotionListV2Filtering illegalMaterialIds(List<Long> illegalMaterialIds) {
    
    this.illegalMaterialIds = illegalMaterialIds;
    return this;
  }

  public AgentQueryRiskPromotionListV2Filtering addIllegalMaterialIdsItem(Long illegalMaterialIdsItem) {
    if (this.illegalMaterialIds == null) {
      this.illegalMaterialIds = new ArrayList<>();
    }
    this.illegalMaterialIds.add(illegalMaterialIdsItem);
    return this;
  }

   /**
   * 违规素材ids，最多支持100个
   * @return illegalMaterialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getIllegalMaterialIds() {
    return illegalMaterialIds;
  }


  public void setIllegalMaterialIds(List<Long> illegalMaterialIds) {
    this.illegalMaterialIds = illegalMaterialIds;
  }


  public AgentQueryRiskPromotionListV2Filtering promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public AgentQueryRiskPromotionListV2Filtering addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 广告ID，最多支持100个
   * @return promotionIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }


  public AgentQueryRiskPromotionListV2Filtering promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 广告名称，模糊搜索，长度不能超过30
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public AgentQueryRiskPromotionListV2Filtering promotionStatus(AgentQueryRiskPromotionListV2FilteringPromotionStatus promotionStatus) {
    
    this.promotionStatus = promotionStatus;
    return this;
  }

   /**
   * Get promotionStatus
   * @return promotionStatus
  **/
  @javax.annotation.Nullable
  public AgentQueryRiskPromotionListV2FilteringPromotionStatus getPromotionStatus() {
    return promotionStatus;
  }


  public void setPromotionStatus(AgentQueryRiskPromotionListV2FilteringPromotionStatus promotionStatus) {
    this.promotionStatus = promotionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentQueryRiskPromotionListV2Filtering agentQueryRiskPromotionListV2Filtering = (AgentQueryRiskPromotionListV2Filtering) o;
    return Objects.equals(this.advertiserIds, agentQueryRiskPromotionListV2Filtering.advertiserIds) &&
        Objects.equals(this.advertiserName, agentQueryRiskPromotionListV2Filtering.advertiserName) &&
        Objects.equals(this.finalOperatorTag, agentQueryRiskPromotionListV2Filtering.finalOperatorTag) &&
        Objects.equals(this.illegalMaterialIds, agentQueryRiskPromotionListV2Filtering.illegalMaterialIds) &&
        Objects.equals(this.promotionIds, agentQueryRiskPromotionListV2Filtering.promotionIds) &&
        Objects.equals(this.promotionName, agentQueryRiskPromotionListV2Filtering.promotionName) &&
        Objects.equals(this.promotionStatus, agentQueryRiskPromotionListV2Filtering.promotionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, advertiserName, finalOperatorTag, illegalMaterialIds, promotionIds, promotionName, promotionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentQueryRiskPromotionListV2Filtering {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    finalOperatorTag: ").append(toIndentedString(finalOperatorTag)).append("\n");
    sb.append("    illegalMaterialIds: ").append(toIndentedString(illegalMaterialIds)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionStatus: ").append(toIndentedString(promotionStatus)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("advertiser_name");
    openapiFields.add("final_operator_tag");
    openapiFields.add("illegal_material_ids");
    openapiFields.add("promotion_ids");
    openapiFields.add("promotion_name");
    openapiFields.add("promotion_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentQueryRiskPromotionListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentQueryRiskPromotionListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentQueryRiskPromotionListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentQueryRiskPromotionListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentQueryRiskPromotionListV2Filtering>() {
           @Override
           public void write(JsonWriter out, AgentQueryRiskPromotionListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentQueryRiskPromotionListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentQueryRiskPromotionListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentQueryRiskPromotionListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AgentQueryRiskPromotionListV2Filtering
  */
  public static AgentQueryRiskPromotionListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentQueryRiskPromotionListV2Filtering.class);
  }

 /**
  * Convert an instance of AgentQueryRiskPromotionListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

