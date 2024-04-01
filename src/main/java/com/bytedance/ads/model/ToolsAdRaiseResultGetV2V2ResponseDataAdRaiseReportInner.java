/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner {
  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private Long click = null;

  public static final String SERIALIZED_NAME_CONVERT = "convert";
  @SerializedName(SERIALIZED_NAME_CONVERT)
  private Long convert = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_CVR = "cvr";
  @SerializedName(SERIALIZED_NAME_CVR)
  private Double cvr = null;

  public static final String SERIALIZED_NAME_SHOW = "show";
  @SerializedName(SERIALIZED_NAME_SHOW)
  private Long show = null;

  public static final String SERIALIZED_NAME_STAT_DATETIME = "stat_datetime";
  @SerializedName(SERIALIZED_NAME_STAT_DATETIME)
  private String statDatetime = null;

  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner() {
  }

  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner click(Long click) {
    
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


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner convert(Long convert) {
    
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


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner cost(Double cost) {
    
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


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner cvr(Double cvr) {
    
    this.cvr = cvr;
    return this;
  }

   /**
   * 
   * @return cvr
  **/
  @javax.annotation.Nullable
  public Double getCvr() {
    return cvr;
  }


  public void setCvr(Double cvr) {
    this.cvr = cvr;
  }


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner show(Long show) {
    
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


  public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner statDatetime(String statDatetime) {
    
    this.statDatetime = statDatetime;
    return this;
  }

   /**
   * 
   * @return statDatetime
  **/
  @javax.annotation.Nullable
  public String getStatDatetime() {
    return statDatetime;
  }


  public void setStatDatetime(String statDatetime) {
    this.statDatetime = statDatetime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner = (ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner) o;
    return Objects.equals(this.click, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.click) &&
        Objects.equals(this.convert, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.convert) &&
        Objects.equals(this.cost, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.cost) &&
        Objects.equals(this.ctr, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.ctr) &&
        Objects.equals(this.cvr, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.cvr) &&
        Objects.equals(this.show, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.show) &&
        Objects.equals(this.statDatetime, toolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.statDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(click, convert, cost, ctr, cvr, show, statDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner {\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    convert: ").append(toIndentedString(convert)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    cvr: ").append(toIndentedString(cvr)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    statDatetime: ").append(toIndentedString(statDatetime)).append("\n");
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
    openapiFields.add("ctr");
    openapiFields.add("cvr");
    openapiFields.add("show");
    openapiFields.add("stat_datetime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner>() {
           @Override
           public void write(JsonWriter out, ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner
  */
  public static ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner.class);
  }

 /**
  * Convert an instance of ToolsAdRaiseResultGetV2V2ResponseDataAdRaiseReportInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

