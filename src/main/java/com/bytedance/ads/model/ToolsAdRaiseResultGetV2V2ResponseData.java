/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2ResponseDataPageInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsAdRaiseResultGetV2V2ResponseData {
  public static final String SERIALIZED_NAME_AD_RAISE_REPORT = "ad_raise_report";
  @SerializedName(SERIALIZED_NAME_AD_RAISE_REPORT)
  private List<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner> adRaiseReport = null;

  public static final String SERIALIZED_NAME_AD_RAISE_VERSION = "ad_raise_version";
  @SerializedName(SERIALIZED_NAME_AD_RAISE_VERSION)
  private Long adRaiseVersion = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsAdRaiseResultGetV2V2ResponseDataPageInfo pageInfo = null;

  public ToolsAdRaiseResultGetV2V2ResponseData() {
  }

  public ToolsAdRaiseResultGetV2V2ResponseData adRaiseReport(List<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner> adRaiseReport) {
    
    this.adRaiseReport = adRaiseReport;
    return this;
  }

  public ToolsAdRaiseResultGetV2V2ResponseData addAdRaiseReportItem(ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner adRaiseReportItem) {
    if (this.adRaiseReport == null) {
      this.adRaiseReport = new ArrayList<>();
    }
    this.adRaiseReport.add(adRaiseReportItem);
    return this;
  }

   /**
   * 
   * @return adRaiseReport
  **/
  @javax.annotation.Nullable
  public List<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner> getAdRaiseReport() {
    return adRaiseReport;
  }


  public void setAdRaiseReport(List<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner> adRaiseReport) {
    this.adRaiseReport = adRaiseReport;
  }


  public ToolsAdRaiseResultGetV2V2ResponseData adRaiseVersion(Long adRaiseVersion) {
    
    this.adRaiseVersion = adRaiseVersion;
    return this;
  }

   /**
   * 
   * @return adRaiseVersion
  **/
  @javax.annotation.Nullable
  public Long getAdRaiseVersion() {
    return adRaiseVersion;
  }


  public void setAdRaiseVersion(Long adRaiseVersion) {
    this.adRaiseVersion = adRaiseVersion;
  }


  public ToolsAdRaiseResultGetV2V2ResponseData pageInfo(ToolsAdRaiseResultGetV2V2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsAdRaiseResultGetV2V2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsAdRaiseResultGetV2V2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdRaiseResultGetV2V2ResponseData toolsAdRaiseResultGetV2V2ResponseData = (ToolsAdRaiseResultGetV2V2ResponseData) o;
    return Objects.equals(this.adRaiseReport, toolsAdRaiseResultGetV2V2ResponseData.adRaiseReport) &&
        Objects.equals(this.adRaiseVersion, toolsAdRaiseResultGetV2V2ResponseData.adRaiseVersion) &&
        Objects.equals(this.pageInfo, toolsAdRaiseResultGetV2V2ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adRaiseReport, adRaiseVersion, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdRaiseResultGetV2V2ResponseData {\n");
    sb.append("    adRaiseReport: ").append(toIndentedString(adRaiseReport)).append("\n");
    sb.append("    adRaiseVersion: ").append(toIndentedString(adRaiseVersion)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("ad_raise_report");
    openapiFields.add("ad_raise_version");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdRaiseResultGetV2V2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdRaiseResultGetV2V2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdRaiseResultGetV2V2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdRaiseResultGetV2V2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdRaiseResultGetV2V2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAdRaiseResultGetV2V2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdRaiseResultGetV2V2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdRaiseResultGetV2V2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdRaiseResultGetV2V2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAdRaiseResultGetV2V2ResponseData
  */
  public static ToolsAdRaiseResultGetV2V2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdRaiseResultGetV2V2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAdRaiseResultGetV2V2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

