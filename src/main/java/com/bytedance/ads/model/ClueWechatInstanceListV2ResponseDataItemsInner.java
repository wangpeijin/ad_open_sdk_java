/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueWechatInstanceListV2DataItemsSubType;
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
 * ClueWechatInstanceListV2ResponseDataItemsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ClueWechatInstanceListV2ResponseDataItemsInner {
  public static final String SERIALIZED_NAME_CLUE_COUNT = "clue_count";
  @SerializedName(SERIALIZED_NAME_CLUE_COUNT)
  private Long clueCount = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_MOD_TIME = "mod_time";
  @SerializedName(SERIALIZED_NAME_MOD_TIME)
  private String modTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_TYPE = "sub_type";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private ClueWechatInstanceListV2DataItemsSubType subType = null;

  public ClueWechatInstanceListV2ResponseDataItemsInner() {
  }

  public ClueWechatInstanceListV2ResponseDataItemsInner clueCount(Long clueCount) {
    
    this.clueCount = clueCount;
    return this;
  }

   /**
   * 复制次数
   * @return clueCount
  **/
  @javax.annotation.Nullable
  public Long getClueCount() {
    return clueCount;
  }


  public void setClueCount(Long clueCount) {
    this.clueCount = clueCount;
  }


  public ClueWechatInstanceListV2ResponseDataItemsInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间，格式：2022-07-21 15:36:09
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ClueWechatInstanceListV2ResponseDataItemsInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信号码包ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ClueWechatInstanceListV2ResponseDataItemsInner modTime(String modTime) {
    
    this.modTime = modTime;
    return this;
  }

   /**
   * 更新时间，格式：2022-07-21 15:36:09
   * @return modTime
  **/
  @javax.annotation.Nullable
  public String getModTime() {
    return modTime;
  }


  public void setModTime(String modTime) {
    this.modTime = modTime;
  }


  public ClueWechatInstanceListV2ResponseDataItemsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 微信号码包名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClueWechatInstanceListV2ResponseDataItemsInner subType(ClueWechatInstanceListV2DataItemsSubType subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable
  public ClueWechatInstanceListV2DataItemsSubType getSubType() {
    return subType;
  }


  public void setSubType(ClueWechatInstanceListV2DataItemsSubType subType) {
    this.subType = subType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueWechatInstanceListV2ResponseDataItemsInner clueWechatInstanceListV2ResponseDataItemsInner = (ClueWechatInstanceListV2ResponseDataItemsInner) o;
    return Objects.equals(this.clueCount, clueWechatInstanceListV2ResponseDataItemsInner.clueCount) &&
        Objects.equals(this.createTime, clueWechatInstanceListV2ResponseDataItemsInner.createTime) &&
        Objects.equals(this.instanceId, clueWechatInstanceListV2ResponseDataItemsInner.instanceId) &&
        Objects.equals(this.modTime, clueWechatInstanceListV2ResponseDataItemsInner.modTime) &&
        Objects.equals(this.name, clueWechatInstanceListV2ResponseDataItemsInner.name) &&
        Objects.equals(this.subType, clueWechatInstanceListV2ResponseDataItemsInner.subType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clueCount, createTime, instanceId, modTime, name, subType);
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
    sb.append("class ClueWechatInstanceListV2ResponseDataItemsInner {\n");
    sb.append("    clueCount: ").append(toIndentedString(clueCount)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    modTime: ").append(toIndentedString(modTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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
    openapiFields.add("clue_count");
    openapiFields.add("create_time");
    openapiFields.add("instance_id");
    openapiFields.add("mod_time");
    openapiFields.add("name");
    openapiFields.add("sub_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueWechatInstanceListV2ResponseDataItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueWechatInstanceListV2ResponseDataItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueWechatInstanceListV2ResponseDataItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueWechatInstanceListV2ResponseDataItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueWechatInstanceListV2ResponseDataItemsInner>() {
           @Override
           public void write(JsonWriter out, ClueWechatInstanceListV2ResponseDataItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueWechatInstanceListV2ResponseDataItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueWechatInstanceListV2ResponseDataItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueWechatInstanceListV2ResponseDataItemsInner
  * @throws IOException if the JSON string is invalid with respect to ClueWechatInstanceListV2ResponseDataItemsInner
  */
  public static ClueWechatInstanceListV2ResponseDataItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueWechatInstanceListV2ResponseDataItemsInner.class);
  }

 /**
  * Convert an instance of ClueWechatInstanceListV2ResponseDataItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

