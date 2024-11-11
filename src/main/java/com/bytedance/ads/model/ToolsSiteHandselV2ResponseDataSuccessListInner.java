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
 * ToolsSiteHandselV2ResponseDataSuccessListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsSiteHandselV2ResponseDataSuccessListInner {
  public static final String SERIALIZED_NAME_ORIGIN_SITE_ID = "origin_site_id";
  @SerializedName(SERIALIZED_NAME_ORIGIN_SITE_ID)
  private String originSiteId = null;

  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_ID = "target_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_ID)
  private String targetAdvertiserId = null;

  public ToolsSiteHandselV2ResponseDataSuccessListInner() {
  }

  public ToolsSiteHandselV2ResponseDataSuccessListInner originSiteId(String originSiteId) {
    
    this.originSiteId = originSiteId;
    return this;
  }

   /**
   * 返回转赠成功的原site_ids
   * @return originSiteId
  **/
  @javax.annotation.Nullable
  public String getOriginSiteId() {
    return originSiteId;
  }


  public void setOriginSiteId(String originSiteId) {
    this.originSiteId = originSiteId;
  }


  public ToolsSiteHandselV2ResponseDataSuccessListInner siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 转赠成功后的生成的新站点id，失败的数据无此参数返回
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public ToolsSiteHandselV2ResponseDataSuccessListInner targetAdvertiserId(String targetAdvertiserId) {
    
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

   /**
   * 返回转赠成功的目标广告主id
   * @return targetAdvertiserId
  **/
  @javax.annotation.Nullable
  public String getTargetAdvertiserId() {
    return targetAdvertiserId;
  }


  public void setTargetAdvertiserId(String targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteHandselV2ResponseDataSuccessListInner toolsSiteHandselV2ResponseDataSuccessListInner = (ToolsSiteHandselV2ResponseDataSuccessListInner) o;
    return Objects.equals(this.originSiteId, toolsSiteHandselV2ResponseDataSuccessListInner.originSiteId) &&
        Objects.equals(this.siteId, toolsSiteHandselV2ResponseDataSuccessListInner.siteId) &&
        Objects.equals(this.targetAdvertiserId, toolsSiteHandselV2ResponseDataSuccessListInner.targetAdvertiserId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(originSiteId, siteId, targetAdvertiserId);
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
    sb.append("class ToolsSiteHandselV2ResponseDataSuccessListInner {\n");
    sb.append("    originSiteId: ").append(toIndentedString(originSiteId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    targetAdvertiserId: ").append(toIndentedString(targetAdvertiserId)).append("\n");
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
    openapiFields.add("origin_site_id");
    openapiFields.add("site_id");
    openapiFields.add("target_advertiser_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteHandselV2ResponseDataSuccessListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteHandselV2ResponseDataSuccessListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteHandselV2ResponseDataSuccessListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteHandselV2ResponseDataSuccessListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteHandselV2ResponseDataSuccessListInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteHandselV2ResponseDataSuccessListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteHandselV2ResponseDataSuccessListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteHandselV2ResponseDataSuccessListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteHandselV2ResponseDataSuccessListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteHandselV2ResponseDataSuccessListInner
  */
  public static ToolsSiteHandselV2ResponseDataSuccessListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteHandselV2ResponseDataSuccessListInner.class);
  }

 /**
  * Convert an instance of ToolsSiteHandselV2ResponseDataSuccessListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

