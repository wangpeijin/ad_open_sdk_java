/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ReportAudienceAgeV2ResponseDataMetricsDict {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_FINISH = "download_finish";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_FINISH)
  private Long downloadFinish = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public ReportAudienceAgeV2ResponseDataMetricsDict() {
  }

  public ReportAudienceAgeV2ResponseDataMetricsDict click(Long click) {
    
    this.click = click;
    return this;
  }

   /**
   * 
   * @return click
  **/
  @javax.annotation.Nullable
  public Long getClick() {
    return click;
  }


  public void setClick(Long click) {
    this.click = click;
  }


  public ReportAudienceAgeV2ResponseDataMetricsDict convert(Long convert) {
    
    this.convert = convert;
    return this;
  }

   /**
   * 
   * @return convert
  **/
  @javax.annotation.Nullable
  public Long getConvert() {
    return convert;
  }


  public void setConvert(Long convert) {
    this.convert = convert;
  }


  public ReportAudienceAgeV2ResponseDataMetricsDict cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportAudienceAgeV2ResponseDataMetricsDict downloadFinish(Long downloadFinish) {
    
    this.downloadFinish = downloadFinish;
    return this;
  }

   /**
   * 
   * @return downloadFinish
  **/
  @javax.annotation.Nullable
  public Long getDownloadFinish() {
    return downloadFinish;
  }


  public void setDownloadFinish(Long downloadFinish) {
    this.downloadFinish = downloadFinish;
  }


  public ReportAudienceAgeV2ResponseDataMetricsDict show(Long show) {
    
    this.show = show;
    return this;
  }

   /**
   * 
   * @return show
  **/
  @javax.annotation.Nullable
  public Long getShow() {
    return show;
  }


  public void setShow(Long show) {
    this.show = show;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceAgeV2ResponseDataMetricsDict reportAudienceAgeV2ResponseDataMetricsDict = (ReportAudienceAgeV2ResponseDataMetricsDict) o;
    return Objects.equals(this.click, reportAudienceAgeV2ResponseDataMetricsDict.click) &&
        Objects.equals(this.convert, reportAudienceAgeV2ResponseDataMetricsDict.convert) &&
        Objects.equals(this.cost, reportAudienceAgeV2ResponseDataMetricsDict.cost) &&
        Objects.equals(this.downloadFinish, reportAudienceAgeV2ResponseDataMetricsDict.downloadFinish) &&
        Objects.equals(this.show, reportAudienceAgeV2ResponseDataMetricsDict.show);
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, convert, cost, downloadFinish, show);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceAgeV2ResponseDataMetricsDict {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    downloadFinish: ").append(toIndentedString(downloadFinish)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
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
    openapiFields.add("click");
    openapiFields.add("convert");
    openapiFields.add("cost");
    openapiFields.add("download_finish");
    openapiFields.add("show");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceAgeV2ResponseDataMetricsDict.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceAgeV2ResponseDataMetricsDict' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceAgeV2ResponseDataMetricsDict> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceAgeV2ResponseDataMetricsDict.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceAgeV2ResponseDataMetricsDict>() {
           @Override
           public void write(JsonWriter out, ReportAudienceAgeV2ResponseDataMetricsDict value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceAgeV2ResponseDataMetricsDict read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceAgeV2ResponseDataMetricsDict given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceAgeV2ResponseDataMetricsDict
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceAgeV2ResponseDataMetricsDict
  */
  public static ReportAudienceAgeV2ResponseDataMetricsDict fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceAgeV2ResponseDataMetricsDict.class);
  }

 /**
  * Convert an instance of ReportAudienceAgeV2ResponseDataMetricsDict to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

