/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * YuntuAudienceLabelDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class YuntuAudienceLabelDeleteV30Request {
  public static final String SERIALIZED_NAME_LABEL_ID = "label_id";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private Long labelId = null;

  public static final String SERIALIZED_NAME_SERVICE_PROVIDER_ID = "service_provider_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROVIDER_ID)
  private Long serviceProviderId = null;

  public static final String SERIALIZED_NAME_YUNTU_BRAND_ID = "yuntu_brand_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_BRAND_ID)
  private Long yuntuBrandId = null;

  public YuntuAudienceLabelDeleteV30Request() {
  }

  public YuntuAudienceLabelDeleteV30Request labelId(Long labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * 人群标签ID，需传入当前用户通过 API 渠道创建的标签ID（创建成功后会返回），否则会校验失败。
   * minimum: 1
   * @return labelId
  **/
  @javax.annotation.Nonnull
  public Long getLabelId() {
    return labelId;
  }


  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  public YuntuAudienceLabelDeleteV30Request serviceProviderId(Long serviceProviderId) {
    
    this.serviceProviderId = serviceProviderId;
    return this;
  }

   /**
   * 服务商ID
   * minimum: 1
   * @return serviceProviderId
  **/
  @javax.annotation.Nonnull
  public Long getServiceProviderId() {
    return serviceProviderId;
  }


  public void setServiceProviderId(Long serviceProviderId) {
    this.serviceProviderId = serviceProviderId;
  }


  public YuntuAudienceLabelDeleteV30Request yuntuBrandId(Long yuntuBrandId) {
    
    this.yuntuBrandId = yuntuBrandId;
    return this;
  }

   /**
   * 品牌ID
   * @return yuntuBrandId
  **/
  @javax.annotation.Nonnull
  public Long getYuntuBrandId() {
    return yuntuBrandId;
  }


  public void setYuntuBrandId(Long yuntuBrandId) {
    this.yuntuBrandId = yuntuBrandId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuAudienceLabelDeleteV30Request yuntuAudienceLabelDeleteV30Request = (YuntuAudienceLabelDeleteV30Request) o;
    return Objects.equals(this.labelId, yuntuAudienceLabelDeleteV30Request.labelId) &&
        Objects.equals(this.serviceProviderId, yuntuAudienceLabelDeleteV30Request.serviceProviderId) &&
        Objects.equals(this.yuntuBrandId, yuntuAudienceLabelDeleteV30Request.yuntuBrandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, serviceProviderId, yuntuBrandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YuntuAudienceLabelDeleteV30Request {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    serviceProviderId: ").append(toIndentedString(serviceProviderId)).append("\n");
    sb.append("    yuntuBrandId: ").append(toIndentedString(yuntuBrandId)).append("\n");
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
    openapiFields.add("label_id");
    openapiFields.add("service_provider_id");
    openapiFields.add("yuntu_brand_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("label_id");
    openapiRequiredFields.add("service_provider_id");
    openapiRequiredFields.add("yuntu_brand_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuAudienceLabelDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuAudienceLabelDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuAudienceLabelDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuAudienceLabelDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuAudienceLabelDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, YuntuAudienceLabelDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuAudienceLabelDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuAudienceLabelDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuAudienceLabelDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to YuntuAudienceLabelDeleteV30Request
  */
  public static YuntuAudienceLabelDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuAudienceLabelDeleteV30Request.class);
  }

 /**
  * Convert an instance of YuntuAudienceLabelDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

