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
import com.bytedance.ads.model.ReportBrandCampaignGetV30ResponseDataDataReportsInnerDataReport;
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
 * ReportBrandCampaignGetV30ResponseDataDataReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ReportBrandCampaignGetV30ResponseDataDataReportsInner {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_DATA_REPORT = "data_report";
  @SerializedName(SERIALIZED_NAME_DATA_REPORT)
  private ReportBrandCampaignGetV30ResponseDataDataReportsInnerDataReport dataReport = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public ReportBrandCampaignGetV30ResponseDataDataReportsInner() {
  }

  public ReportBrandCampaignGetV30ResponseDataDataReportsInner campaignId(String campaignId) {
    
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


  public ReportBrandCampaignGetV30ResponseDataDataReportsInner campaignName(String campaignName) {
    
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


  public ReportBrandCampaignGetV30ResponseDataDataReportsInner dataReport(ReportBrandCampaignGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    
    this.dataReport = dataReport;
    return this;
  }

   /**
   * Get dataReport
   * @return dataReport
  **/
  @javax.annotation.Nullable
  public ReportBrandCampaignGetV30ResponseDataDataReportsInnerDataReport getDataReport() {
    return dataReport;
  }


  public void setDataReport(ReportBrandCampaignGetV30ResponseDataDataReportsInnerDataReport dataReport) {
    this.dataReport = dataReport;
  }


  public ReportBrandCampaignGetV30ResponseDataDataReportsInner date(String date) {
    
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
    ReportBrandCampaignGetV30ResponseDataDataReportsInner reportBrandCampaignGetV30ResponseDataDataReportsInner = (ReportBrandCampaignGetV30ResponseDataDataReportsInner) o;
    return Objects.equals(this.campaignId, reportBrandCampaignGetV30ResponseDataDataReportsInner.campaignId) &&
        Objects.equals(this.campaignName, reportBrandCampaignGetV30ResponseDataDataReportsInner.campaignName) &&
        Objects.equals(this.dataReport, reportBrandCampaignGetV30ResponseDataDataReportsInner.dataReport) &&
        Objects.equals(this.date, reportBrandCampaignGetV30ResponseDataDataReportsInner.date);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, campaignName, dataReport, date);
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
    sb.append("class ReportBrandCampaignGetV30ResponseDataDataReportsInner {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("data_report");
    openapiFields.add("date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportBrandCampaignGetV30ResponseDataDataReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportBrandCampaignGetV30ResponseDataDataReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportBrandCampaignGetV30ResponseDataDataReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportBrandCampaignGetV30ResponseDataDataReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportBrandCampaignGetV30ResponseDataDataReportsInner>() {
           @Override
           public void write(JsonWriter out, ReportBrandCampaignGetV30ResponseDataDataReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportBrandCampaignGetV30ResponseDataDataReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportBrandCampaignGetV30ResponseDataDataReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportBrandCampaignGetV30ResponseDataDataReportsInner
  * @throws IOException if the JSON string is invalid with respect to ReportBrandCampaignGetV30ResponseDataDataReportsInner
  */
  public static ReportBrandCampaignGetV30ResponseDataDataReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportBrandCampaignGetV30ResponseDataDataReportsInner.class);
  }

 /**
  * Convert an instance of ReportBrandCampaignGetV30ResponseDataDataReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

