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
 * StarCampaignListV2ResponseDataCampaignsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarCampaignListV2ResponseDataCampaignsInner {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public StarCampaignListV2ResponseDataCampaignsInner() {
  }

  public StarCampaignListV2ResponseDataCampaignsInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 需求ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public StarCampaignListV2ResponseDataCampaignsInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间 unix timestamp
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarCampaignListV2ResponseDataCampaignsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 需求名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarCampaignListV2ResponseDataCampaignsInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 需求状态 (1): 进行中 (2): 已完成 (3): 已取消
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarCampaignListV2ResponseDataCampaignsInner starCampaignListV2ResponseDataCampaignsInner = (StarCampaignListV2ResponseDataCampaignsInner) o;
    return Objects.equals(this.campaignId, starCampaignListV2ResponseDataCampaignsInner.campaignId) &&
        Objects.equals(this.createTime, starCampaignListV2ResponseDataCampaignsInner.createTime) &&
        Objects.equals(this.name, starCampaignListV2ResponseDataCampaignsInner.name) &&
        Objects.equals(this.status, starCampaignListV2ResponseDataCampaignsInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, createTime, name, status);
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
    sb.append("class StarCampaignListV2ResponseDataCampaignsInner {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("create_time");
    openapiFields.add("name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarCampaignListV2ResponseDataCampaignsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarCampaignListV2ResponseDataCampaignsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarCampaignListV2ResponseDataCampaignsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarCampaignListV2ResponseDataCampaignsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarCampaignListV2ResponseDataCampaignsInner>() {
           @Override
           public void write(JsonWriter out, StarCampaignListV2ResponseDataCampaignsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarCampaignListV2ResponseDataCampaignsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarCampaignListV2ResponseDataCampaignsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarCampaignListV2ResponseDataCampaignsInner
  * @throws IOException if the JSON string is invalid with respect to StarCampaignListV2ResponseDataCampaignsInner
  */
  public static StarCampaignListV2ResponseDataCampaignsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarCampaignListV2ResponseDataCampaignsInner.class);
  }

 /**
  * Convert an instance of StarCampaignListV2ResponseDataCampaignsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

