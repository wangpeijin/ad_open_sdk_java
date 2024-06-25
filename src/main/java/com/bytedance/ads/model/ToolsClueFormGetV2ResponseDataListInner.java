/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueFormGetV2DataListContainPhone;
import com.bytedance.ads.model.ToolsClueFormGetV2DataListFormType;
import com.bytedance.ads.model.ToolsClueFormGetV2DataListSubType;
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
 * ToolsClueFormGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsClueFormGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CONTAIN_PHONE = "contain_phone";
  @SerializedName(SERIALIZED_NAME_CONTAIN_PHONE)
  private ToolsClueFormGetV2DataListContainPhone containPhone = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ENABLE_LAYER = "enable_layer";
  @SerializedName(SERIALIZED_NAME_ENABLE_LAYER)
  private Boolean enableLayer = null;

  public static final String SERIALIZED_NAME_FORM_TYPE = "form_type";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private ToolsClueFormGetV2DataListFormType formType = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IS_DEL = "is_del";
  @SerializedName(SERIALIZED_NAME_IS_DEL)
  private Long isDel = null;

  public static final String SERIALIZED_NAME_LIGHTING_PAGE_URL = "lighting_page_url";
  @SerializedName(SERIALIZED_NAME_LIGHTING_PAGE_URL)
  private String lightingPageUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SUB_TYPE = "sub_type";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private ToolsClueFormGetV2DataListSubType subType = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Long version = null;

  public ToolsClueFormGetV2ResponseDataListInner() {
  }

  public ToolsClueFormGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueFormGetV2ResponseDataListInner containPhone(ToolsClueFormGetV2DataListContainPhone containPhone) {
    
    this.containPhone = containPhone;
    return this;
  }

   /**
   * Get containPhone
   * @return containPhone
  **/
  @javax.annotation.Nullable
  public ToolsClueFormGetV2DataListContainPhone getContainPhone() {
    return containPhone;
  }


  public void setContainPhone(ToolsClueFormGetV2DataListContainPhone containPhone) {
    this.containPhone = containPhone;
  }


  public ToolsClueFormGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ToolsClueFormGetV2ResponseDataListInner enableLayer(Boolean enableLayer) {
    
    this.enableLayer = enableLayer;
    return this;
  }

   /**
   * 
   * @return enableLayer
  **/
  @javax.annotation.Nullable
  public Boolean getEnableLayer() {
    return enableLayer;
  }


  public void setEnableLayer(Boolean enableLayer) {
    this.enableLayer = enableLayer;
  }


  public ToolsClueFormGetV2ResponseDataListInner formType(ToolsClueFormGetV2DataListFormType formType) {
    
    this.formType = formType;
    return this;
  }

   /**
   * Get formType
   * @return formType
  **/
  @javax.annotation.Nullable
  public ToolsClueFormGetV2DataListFormType getFormType() {
    return formType;
  }


  public void setFormType(ToolsClueFormGetV2DataListFormType formType) {
    this.formType = formType;
  }


  public ToolsClueFormGetV2ResponseDataListInner instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsClueFormGetV2ResponseDataListInner isDel(Long isDel) {
    
    this.isDel = isDel;
    return this;
  }

   /**
   * 
   * @return isDel
  **/
  @javax.annotation.Nullable
  public Long getIsDel() {
    return isDel;
  }


  public void setIsDel(Long isDel) {
    this.isDel = isDel;
  }


  public ToolsClueFormGetV2ResponseDataListInner lightingPageUrl(String lightingPageUrl) {
    
    this.lightingPageUrl = lightingPageUrl;
    return this;
  }

   /**
   * 
   * @return lightingPageUrl
  **/
  @javax.annotation.Nullable
  public String getLightingPageUrl() {
    return lightingPageUrl;
  }


  public void setLightingPageUrl(String lightingPageUrl) {
    this.lightingPageUrl = lightingPageUrl;
  }


  public ToolsClueFormGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsClueFormGetV2ResponseDataListInner subType(ToolsClueFormGetV2DataListSubType subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable
  public ToolsClueFormGetV2DataListSubType getSubType() {
    return subType;
  }


  public void setSubType(ToolsClueFormGetV2DataListSubType subType) {
    this.subType = subType;
  }


  public ToolsClueFormGetV2ResponseDataListInner version(Long version) {
    
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @javax.annotation.Nullable
  public Long getVersion() {
    return version;
  }


  public void setVersion(Long version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueFormGetV2ResponseDataListInner toolsClueFormGetV2ResponseDataListInner = (ToolsClueFormGetV2ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, toolsClueFormGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.containPhone, toolsClueFormGetV2ResponseDataListInner.containPhone) &&
        Objects.equals(this.createTime, toolsClueFormGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.enableLayer, toolsClueFormGetV2ResponseDataListInner.enableLayer) &&
        Objects.equals(this.formType, toolsClueFormGetV2ResponseDataListInner.formType) &&
        Objects.equals(this.instanceId, toolsClueFormGetV2ResponseDataListInner.instanceId) &&
        Objects.equals(this.isDel, toolsClueFormGetV2ResponseDataListInner.isDel) &&
        Objects.equals(this.lightingPageUrl, toolsClueFormGetV2ResponseDataListInner.lightingPageUrl) &&
        Objects.equals(this.name, toolsClueFormGetV2ResponseDataListInner.name) &&
        Objects.equals(this.subType, toolsClueFormGetV2ResponseDataListInner.subType) &&
        Objects.equals(this.version, toolsClueFormGetV2ResponseDataListInner.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, containPhone, createTime, enableLayer, formType, instanceId, isDel, lightingPageUrl, name, subType, version);
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
    sb.append("class ToolsClueFormGetV2ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    containPhone: ").append(toIndentedString(containPhone)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    enableLayer: ").append(toIndentedString(enableLayer)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isDel: ").append(toIndentedString(isDel)).append("\n");
    sb.append("    lightingPageUrl: ").append(toIndentedString(lightingPageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("contain_phone");
    openapiFields.add("create_time");
    openapiFields.add("enable_layer");
    openapiFields.add("form_type");
    openapiFields.add("instance_id");
    openapiFields.add("is_del");
    openapiFields.add("lighting_page_url");
    openapiFields.add("name");
    openapiFields.add("sub_type");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueFormGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueFormGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueFormGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueFormGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueFormGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueFormGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueFormGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueFormGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueFormGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueFormGetV2ResponseDataListInner
  */
  public static ToolsClueFormGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueFormGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsClueFormGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

