/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteGetV2DataListSiteType;
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
 * ToolsSiteGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsSiteGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_FUNCTION_TYPE = "function_type";
  @SerializedName(SERIALIZED_NAME_FUNCTION_TYPE)
  private String functionType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_SITE_TYPE = "siteType";
  @SerializedName(SERIALIZED_NAME_SITE_TYPE)
  private ToolsSiteGetV2DataListSiteType siteType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail = null;

  public ToolsSiteGetV2ResponseDataListInner() {
  }

  public ToolsSiteGetV2ResponseDataListInner functionType(String functionType) {
    
    this.functionType = functionType;
    return this;
  }

   /**
   * 建站类别
   * @return functionType
  **/
  @javax.annotation.Nullable
  public String getFunctionType() {
    return functionType;
  }


  public void setFunctionType(String functionType) {
    this.functionType = functionType;
  }


  public ToolsSiteGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 建站名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsSiteGetV2ResponseDataListInner siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 建站id
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public ToolsSiteGetV2ResponseDataListInner siteType(ToolsSiteGetV2DataListSiteType siteType) {
    
    this.siteType = siteType;
    return this;
  }

   /**
   * Get siteType
   * @return siteType
  **/
  @javax.annotation.Nullable
  public ToolsSiteGetV2DataListSiteType getSiteType() {
    return siteType;
  }


  public void setSiteType(ToolsSiteGetV2DataListSiteType siteType) {
    this.siteType = siteType;
  }


  public ToolsSiteGetV2ResponseDataListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 建站状态
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ToolsSiteGetV2ResponseDataListInner thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * 站点缩略图
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteGetV2ResponseDataListInner toolsSiteGetV2ResponseDataListInner = (ToolsSiteGetV2ResponseDataListInner) o;
    return Objects.equals(this.functionType, toolsSiteGetV2ResponseDataListInner.functionType) &&
        Objects.equals(this.name, toolsSiteGetV2ResponseDataListInner.name) &&
        Objects.equals(this.siteId, toolsSiteGetV2ResponseDataListInner.siteId) &&
        Objects.equals(this.siteType, toolsSiteGetV2ResponseDataListInner.siteType) &&
        Objects.equals(this.status, toolsSiteGetV2ResponseDataListInner.status) &&
        Objects.equals(this.thumbnail, toolsSiteGetV2ResponseDataListInner.thumbnail);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionType, name, siteId, siteType, status, thumbnail);
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
    sb.append("class ToolsSiteGetV2ResponseDataListInner {\n");
    sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("function_type");
    openapiFields.add("name");
    openapiFields.add("siteId");
    openapiFields.add("siteType");
    openapiFields.add("status");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsSiteGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteGetV2ResponseDataListInner
  */
  public static ToolsSiteGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsSiteGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

