/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AgentAdvertiserCopyV2ReportType;
import com.bytedance.ads.model.AgentAdvertiserCopyV2RequestItemInner;
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
 * AgentAdvertiserCopyV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class AgentAdvertiserCopyV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private Long agentId = null;

  public static final String SERIALIZED_NAME_COPY_TAG = "copy_tag";
  @SerializedName(SERIALIZED_NAME_COPY_TAG)
  private Boolean copyTag = null;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private List<AgentAdvertiserCopyV2RequestItemInner> item = null;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "report_type";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private AgentAdvertiserCopyV2ReportType reportType = null;

  public AgentAdvertiserCopyV2Request() {
  }

  public AgentAdvertiserCopyV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 被复制广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AgentAdvertiserCopyV2Request agentId(Long agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 代理商账户ID
   * @return agentId
  **/
  @javax.annotation.Nonnull
  public Long getAgentId() {
    return agentId;
  }


  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }


  public AgentAdvertiserCopyV2Request copyTag(Boolean copyTag) {
    
    this.copyTag = copyTag;
    return this;
  }

   /**
   * 是否复制原广告主账户的账户标签
   * @return copyTag
  **/
  @javax.annotation.Nullable
  public Boolean getCopyTag() {
    return copyTag;
  }


  public void setCopyTag(Boolean copyTag) {
    this.copyTag = copyTag;
  }


  public AgentAdvertiserCopyV2Request item(List<AgentAdvertiserCopyV2RequestItemInner> item) {
    
    this.item = item;
    return this;
  }

  public AgentAdvertiserCopyV2Request addItemItem(AgentAdvertiserCopyV2RequestItemInner itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<>();
    }
    this.item.add(itemItem);
    return this;
  }

   /**
   * 复制账户信息
   * @return item
  **/
  @javax.annotation.Nonnull
  public List<AgentAdvertiserCopyV2RequestItemInner> getItem() {
    return item;
  }


  public void setItem(List<AgentAdvertiserCopyV2RequestItemInner> item) {
    this.item = item;
  }


  public AgentAdvertiserCopyV2Request reportType(AgentAdvertiserCopyV2ReportType reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  public AgentAdvertiserCopyV2ReportType getReportType() {
    return reportType;
  }


  public void setReportType(AgentAdvertiserCopyV2ReportType reportType) {
    this.reportType = reportType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentAdvertiserCopyV2Request agentAdvertiserCopyV2Request = (AgentAdvertiserCopyV2Request) o;
    return Objects.equals(this.advertiserId, agentAdvertiserCopyV2Request.advertiserId) &&
        Objects.equals(this.agentId, agentAdvertiserCopyV2Request.agentId) &&
        Objects.equals(this.copyTag, agentAdvertiserCopyV2Request.copyTag) &&
        Objects.equals(this.item, agentAdvertiserCopyV2Request.item) &&
        Objects.equals(this.reportType, agentAdvertiserCopyV2Request.reportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, agentId, copyTag, item, reportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAdvertiserCopyV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    copyTag: ").append(toIndentedString(copyTag)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("copy_tag");
    openapiFields.add("item");
    openapiFields.add("report_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("agent_id");
    openapiRequiredFields.add("item");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentAdvertiserCopyV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentAdvertiserCopyV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentAdvertiserCopyV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentAdvertiserCopyV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentAdvertiserCopyV2Request>() {
           @Override
           public void write(JsonWriter out, AgentAdvertiserCopyV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentAdvertiserCopyV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentAdvertiserCopyV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentAdvertiserCopyV2Request
  * @throws IOException if the JSON string is invalid with respect to AgentAdvertiserCopyV2Request
  */
  public static AgentAdvertiserCopyV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentAdvertiserCopyV2Request.class);
  }

 /**
  * Convert an instance of AgentAdvertiserCopyV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

