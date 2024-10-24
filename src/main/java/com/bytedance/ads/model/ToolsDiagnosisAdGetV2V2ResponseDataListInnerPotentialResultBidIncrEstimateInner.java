/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner {
  public static final String SERIALIZED_NAME_AIM_BID = "aim_bid";
  @SerializedName(SERIALIZED_NAME_AIM_BID)
  private Double aimBid = null;

  public static final String SERIALIZED_NAME_BID_INCR_RATIO = "bid_incr_ratio";
  @SerializedName(SERIALIZED_NAME_BID_INCR_RATIO)
  private Double bidIncrRatio = null;

  public static final String SERIALIZED_NAME_SEND_INCR_RATIO = "send_incr_ratio";
  @SerializedName(SERIALIZED_NAME_SEND_INCR_RATIO)
  private Double sendIncrRatio = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner aimBid(Double aimBid) {
    
    this.aimBid = aimBid;
    return this;
  }

   /**
   * 
   * @return aimBid
  **/
  @javax.annotation.Nullable
  public Double getAimBid() {
    return aimBid;
  }


  public void setAimBid(Double aimBid) {
    this.aimBid = aimBid;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner bidIncrRatio(Double bidIncrRatio) {
    
    this.bidIncrRatio = bidIncrRatio;
    return this;
  }

   /**
   * 
   * @return bidIncrRatio
  **/
  @javax.annotation.Nullable
  public Double getBidIncrRatio() {
    return bidIncrRatio;
  }


  public void setBidIncrRatio(Double bidIncrRatio) {
    this.bidIncrRatio = bidIncrRatio;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner sendIncrRatio(Double sendIncrRatio) {
    
    this.sendIncrRatio = sendIncrRatio;
    return this;
  }

   /**
   * 
   * @return sendIncrRatio
  **/
  @javax.annotation.Nullable
  public Double getSendIncrRatio() {
    return sendIncrRatio;
  }


  public void setSendIncrRatio(Double sendIncrRatio) {
    this.sendIncrRatio = sendIncrRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner) o;
    return Objects.equals(this.aimBid, toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.aimBid) &&
        Objects.equals(this.bidIncrRatio, toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.bidIncrRatio) &&
        Objects.equals(this.sendIncrRatio, toolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.sendIncrRatio);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aimBid, bidIncrRatio, sendIncrRatio);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner {\n");
    sb.append("    aimBid: ").append(toIndentedString(aimBid)).append("\n");
    sb.append("    bidIncrRatio: ").append(toIndentedString(bidIncrRatio)).append("\n");
    sb.append("    sendIncrRatio: ").append(toIndentedString(sendIncrRatio)).append("\n");
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
    openapiFields.add("aim_bid");
    openapiFields.add("bid_incr_ratio");
    openapiFields.add("send_incr_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerPotentialResultBidIncrEstimateInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

