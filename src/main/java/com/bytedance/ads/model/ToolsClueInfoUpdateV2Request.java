/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueInfoUpdateV2RequestUpdateInfoInner;
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
 * ToolsClueInfoUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsClueInfoUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_OP_NAME = "op_name";
  @SerializedName(SERIALIZED_NAME_OP_NAME)
  private String opName = null;

  public static final String SERIALIZED_NAME_UPDATE_INFO = "update_info";
  @SerializedName(SERIALIZED_NAME_UPDATE_INFO)
  private List<ToolsClueInfoUpdateV2RequestUpdateInfoInner> updateInfo = null;

  public ToolsClueInfoUpdateV2Request() {
  }

  public ToolsClueInfoUpdateV2Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public ToolsClueInfoUpdateV2Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 修改线索所属的广告主id
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public ToolsClueInfoUpdateV2Request opName(String opName) {
    
    this.opName = opName;
    return this;
  }

   /**
   * 操作人，不能为空
   * @return opName
  **/
  @javax.annotation.Nullable
  public String getOpName() {
    return opName;
  }


  public void setOpName(String opName) {
    this.opName = opName;
  }


  public ToolsClueInfoUpdateV2Request updateInfo(List<ToolsClueInfoUpdateV2RequestUpdateInfoInner> updateInfo) {
    
    this.updateInfo = updateInfo;
    return this;
  }

  public ToolsClueInfoUpdateV2Request addUpdateInfoItem(ToolsClueInfoUpdateV2RequestUpdateInfoInner updateInfoItem) {
    if (this.updateInfo == null) {
      this.updateInfo = new ArrayList<>();
    }
    this.updateInfo.add(updateInfoItem);
    return this;
  }

   /**
   * 更新的线索信息
   * @return updateInfo
  **/
  @javax.annotation.Nonnull
  public List<ToolsClueInfoUpdateV2RequestUpdateInfoInner> getUpdateInfo() {
    return updateInfo;
  }


  public void setUpdateInfo(List<ToolsClueInfoUpdateV2RequestUpdateInfoInner> updateInfo) {
    this.updateInfo = updateInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueInfoUpdateV2Request toolsClueInfoUpdateV2Request = (ToolsClueInfoUpdateV2Request) o;
    return Objects.equals(this.advertiserIds, toolsClueInfoUpdateV2Request.advertiserIds) &&
        Objects.equals(this.opName, toolsClueInfoUpdateV2Request.opName) &&
        Objects.equals(this.updateInfo, toolsClueInfoUpdateV2Request.updateInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, opName, updateInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueInfoUpdateV2Request {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    opName: ").append(toIndentedString(opName)).append("\n");
    sb.append("    updateInfo: ").append(toIndentedString(updateInfo)).append("\n");
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
    openapiFields.add("op_name");
    openapiFields.add("update_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("update_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueInfoUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueInfoUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueInfoUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueInfoUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueInfoUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueInfoUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueInfoUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueInfoUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueInfoUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueInfoUpdateV2Request
  */
  public static ToolsClueInfoUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueInfoUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueInfoUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

