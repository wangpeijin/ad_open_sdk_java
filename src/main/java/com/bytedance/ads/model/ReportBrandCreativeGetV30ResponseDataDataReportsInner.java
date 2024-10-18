/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportBrandCreativeGetV30ResponseDataDataReportsInnerDataReport;
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
 * ReportBrandCreativeGetV30ResponseDataDataReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ReportBrandCreativeGetV30ResponseDataDataReportsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private String adId = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private String creativeId = null;

  public static final String SERIALIZED_NAME_DATA_REPORT = "data_report";
  @SerializedName(SERIALIZED_NAME_DATA_REPORT)
  private ReportBrandCreativeGetV30ResponseDataDataReportsInnerDataReport dataReport = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public ReportBrandCreativeGetV30ResponseDataDataReportsInner() {
  }

  public ReportBrandCreativeGetV30ResponseDataDataReportsInner adId(String adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * @return adId
  **/
  @javax.annotation.Nullable
  public String getAdId() {
    return adId;
  }


  public void setAdId(String adId) {
    this.adId = adId;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 计划名称
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 广告组名称
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner creativeId(String creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 创意ID
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public String getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(String creativeId) {
    this.creativeId = creativeId;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner dataReport(ReportBrandCreativeGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    
    this.dataReport = dataReport;
    return this;
  }

   /**
   * Get dataReport
   * @return dataReport
  **/
  @javax.annotation.Nullable
  public ReportBrandCreativeGetV30ResponseDataDataReportsInnerDataReport getDataReport() {
    return dataReport;
  }


  public void setDataReport(ReportBrandCreativeGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    this.dataReport = dataReport;
  }


  public ReportBrandCreativeGetV30ResponseDataDataReportsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBrandCreativeGetV30ResponseDataDataReportsInner reportBrandCreativeGetV30ResponseDataDataReportsInner = (ReportBrandCreativeGetV30ResponseDataDataReportsInner) o;
    return Objects.equals(this.adId, reportBrandCreativeGetV30ResponseDataDataReportsInner.adId) &&
        Objects.equals(this.adName, reportBrandCreativeGetV30ResponseDataDataReportsInner.adName) &&
        Objects.equals(this.campaignId, reportBrandCreativeGetV30ResponseDataDataReportsInner.campaignId) &&
        Objects.equals(this.campaignName, reportBrandCreativeGetV30ResponseDataDataReportsInner.campaignName) &&
        Objects.equals(this.creativeId, reportBrandCreativeGetV30ResponseDataDataReportsInner.creativeId) &&
        Objects.equals(this.dataReport, reportBrandCreativeGetV30ResponseDataDataReportsInner.dataReport) &&
        Objects.equals(this.date, reportBrandCreativeGetV30ResponseDataDataReportsInner.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adName, campaignId, campaignName, creativeId, dataReport, date);
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
    sb.append("class ReportBrandCreativeGetV30ResponseDataDataReportsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    dataReport: ").append(toIndentedString(dataReport)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("ad_name");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("creative_id");
    openapiFields.add("data_report");
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandCreativeGetV30ResponseDataDataReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandCreativeGetV30ResponseDataDataReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandCreativeGetV30ResponseDataDataReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandCreativeGetV30ResponseDataDataReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandCreativeGetV30ResponseDataDataReportsInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandCreativeGetV30ResponseDataDataReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandCreativeGetV30ResponseDataDataReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandCreativeGetV30ResponseDataDataReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandCreativeGetV30ResponseDataDataReportsInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandCreativeGetV30ResponseDataDataReportsInner
  */
  public static ReportBrandCreativeGetV30ResponseDataDataReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandCreativeGetV30ResponseDataDataReportsInner.class);
  }

 /**
  * Convert an instance of ReportBrandCreativeGetV30ResponseDataDataReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

