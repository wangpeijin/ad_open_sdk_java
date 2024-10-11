/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ReportSitePageV2ResponseData {
  public static final String SERIALIZED_NAME_SITE_ID = "site_id";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId = null;

  public static final String SERIALIZED_NAME_SITE_RECORD = "site_record";
  @SerializedName(SERIALIZED_NAME_SITE_RECORD)
  private Object siteRecord = null;

  public ReportSitePageV2ResponseData() {
  }

  public ReportSitePageV2ResponseData siteId(String siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * 
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }


  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public ReportSitePageV2ResponseData siteRecord(Object siteRecord) {
    
    this.siteRecord = siteRecord;
    return this;
  }

   /**
   * 
   * @return siteRecord
  **/
  @javax.annotation.Nullable
  public Object getSiteRecord() {
    return siteRecord;
  }


  public void setSiteRecord(Object siteRecord) {
    this.siteRecord = siteRecord;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSitePageV2ResponseData reportSitePageV2ResponseData = (ReportSitePageV2ResponseData) o;
    return Objects.equals(this.siteId, reportSitePageV2ResponseData.siteId) &&
        Objects.equals(this.siteRecord, reportSitePageV2ResponseData.siteRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, siteRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSitePageV2ResponseData {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteRecord: ").append(toIndentedString(siteRecord)).append("\n");
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
    openapiFields.add("site_id");
    openapiFields.add("site_record");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportSitePageV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportSitePageV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportSitePageV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportSitePageV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportSitePageV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ReportSitePageV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportSitePageV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportSitePageV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportSitePageV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ReportSitePageV2ResponseData
  */
  public static ReportSitePageV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportSitePageV2ResponseData.class);
  }

 /**
  * Convert an instance of ReportSitePageV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

