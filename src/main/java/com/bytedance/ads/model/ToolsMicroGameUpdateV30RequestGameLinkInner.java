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
import com.bytedance.ads.model.ToolsMicroGameUpdateV30GameLinkOperateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * ToolsMicroGameUpdateV30RequestGameLinkInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsMicroGameUpdateV30RequestGameLinkInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_OPERATE_TYPE = "operate_type";
  @SerializedName(SERIALIZED_NAME_OPERATE_TYPE)
  private ToolsMicroGameUpdateV30GameLinkOperateType operateType = null;

  public static final String SERIALIZED_NAME_REMARK = "remark";
  @SerializedName(SERIALIZED_NAME_REMARK)
  private String remark = null;

  public static final String SERIALIZED_NAME_START_PARAM = "start_param";
  @SerializedName(SERIALIZED_NAME_START_PARAM)
  private String startParam = null;

  public ToolsMicroGameUpdateV30RequestGameLinkInner() {
  }

  public ToolsMicroGameUpdateV30RequestGameLinkInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ToolsMicroGameUpdateV30RequestGameLinkInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nonnull
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public ToolsMicroGameUpdateV30RequestGameLinkInner operateType(ToolsMicroGameUpdateV30GameLinkOperateType operateType) {
    
    this.operateType = operateType;
    return this;
  }

   /**
   * Get operateType
   * @return operateType
  **/
  @javax.annotation.Nonnull
  public ToolsMicroGameUpdateV30GameLinkOperateType getOperateType() {
    return operateType;
  }


  public void setOperateType(ToolsMicroGameUpdateV30GameLinkOperateType operateType) {
    this.operateType = operateType;
  }


  public ToolsMicroGameUpdateV30RequestGameLinkInner remark(String remark) {
    
    this.remark = remark;
    return this;
  }

   /**
   * 
   * @return remark
  **/
  @javax.annotation.Nonnull
  public String getRemark() {
    return remark;
  }


  public void setRemark(String remark) {
    this.remark = remark;
  }


  public ToolsMicroGameUpdateV30RequestGameLinkInner startParam(String startParam) {
    
    this.startParam = startParam;
    return this;
  }

   /**
   * 
   * @return startParam
  **/
  @javax.annotation.Nullable
  public String getStartParam() {
    return startParam;
  }


  public void setStartParam(String startParam) {
    this.startParam = startParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsMicroGameUpdateV30RequestGameLinkInner toolsMicroGameUpdateV30RequestGameLinkInner = (ToolsMicroGameUpdateV30RequestGameLinkInner) o;
    return Objects.equals(this.id, toolsMicroGameUpdateV30RequestGameLinkInner.id) &&
        Objects.equals(this.link, toolsMicroGameUpdateV30RequestGameLinkInner.link) &&
        Objects.equals(this.operateType, toolsMicroGameUpdateV30RequestGameLinkInner.operateType) &&
        Objects.equals(this.remark, toolsMicroGameUpdateV30RequestGameLinkInner.remark) &&
        Objects.equals(this.startParam, toolsMicroGameUpdateV30RequestGameLinkInner.startParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, operateType, remark, startParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsMicroGameUpdateV30RequestGameLinkInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
    sb.append("    startParam: ").append(toIndentedString(startParam)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("operate_type");
    openapiFields.add("remark");
    openapiFields.add("start_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link");
    openapiRequiredFields.add("operate_type");
    openapiRequiredFields.add("remark");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsMicroGameUpdateV30RequestGameLinkInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsMicroGameUpdateV30RequestGameLinkInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsMicroGameUpdateV30RequestGameLinkInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsMicroGameUpdateV30RequestGameLinkInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsMicroGameUpdateV30RequestGameLinkInner>() {
           @Override
           public void write(JsonWriter out, ToolsMicroGameUpdateV30RequestGameLinkInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsMicroGameUpdateV30RequestGameLinkInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsMicroGameUpdateV30RequestGameLinkInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsMicroGameUpdateV30RequestGameLinkInner
  * @throws IOException if the JSON string is invalid with respect to ToolsMicroGameUpdateV30RequestGameLinkInner
  */
  public static ToolsMicroGameUpdateV30RequestGameLinkInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsMicroGameUpdateV30RequestGameLinkInner.class);
  }

 /**
  * Convert an instance of ToolsMicroGameUpdateV30RequestGameLinkInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

