/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ToolsBidSuggestV2ResponseData {
  public static final String SERIALIZED_NAME_BID_HIGH50 = "bid_high_50";
  @SerializedName(SERIALIZED_NAME_BID_HIGH50)
  private Double bidHigh50 = null;

  public static final String SERIALIZED_NAME_BID_HIGH90 = "bid_high_90";
  @SerializedName(SERIALIZED_NAME_BID_HIGH90)
  private Double bidHigh90 = null;

  public static final String SERIALIZED_NAME_SMART_BID_RANGE = "smart_bid_range";
  @SerializedName(SERIALIZED_NAME_SMART_BID_RANGE)
  private List<Double> smartBidRange = null;

  public static final String SERIALIZED_NAME_SMART_BID_SUGGEST_BUDGET = "smart_bid_suggest_budget";
  @SerializedName(SERIALIZED_NAME_SMART_BID_SUGGEST_BUDGET)
  private Long smartBidSuggestBudget = null;

  public static final String SERIALIZED_NAME_SMART_BUDGET_RANGE = "smart_budget_range";
  @SerializedName(SERIALIZED_NAME_SMART_BUDGET_RANGE)
  private List<Long> smartBudgetRange = null;

  public static final String SERIALIZED_NAME_SUGGESTED_BID = "suggested_bid";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_BID)
  private Double suggestedBid = null;

  public ToolsBidSuggestV2ResponseData() {
  }

  public ToolsBidSuggestV2ResponseData bidHigh50(Double bidHigh50) {
    
    this.bidHigh50 = bidHigh50;
    return this;
  }

   /**
   * 
   * @return bidHigh50
  **/
  @javax.annotation.Nullable
  public Double getBidHigh50() {
    return bidHigh50;
  }


  public void setBidHigh50(Double bidHigh50) {
    this.bidHigh50 = bidHigh50;
  }


  public ToolsBidSuggestV2ResponseData bidHigh90(Double bidHigh90) {
    
    this.bidHigh90 = bidHigh90;
    return this;
  }

   /**
   * 
   * @return bidHigh90
  **/
  @javax.annotation.Nullable
  public Double getBidHigh90() {
    return bidHigh90;
  }


  public void setBidHigh90(Double bidHigh90) {
    this.bidHigh90 = bidHigh90;
  }


  public ToolsBidSuggestV2ResponseData smartBidRange(List<Double> smartBidRange) {
    
    this.smartBidRange = smartBidRange;
    return this;
  }

  public ToolsBidSuggestV2ResponseData addSmartBidRangeItem(Double smartBidRangeItem) {
    if (this.smartBidRange == null) {
      this.smartBidRange = new ArrayList<>();
    }
    this.smartBidRange.add(smartBidRangeItem);
    return this;
  }

   /**
   * 
   * @return smartBidRange
  **/
  @javax.annotation.Nullable
  public List<Double> getSmartBidRange() {
    return smartBidRange;
  }


  public void setSmartBidRange(List<Double> smartBidRange) {
    this.smartBidRange = smartBidRange;
  }


  public ToolsBidSuggestV2ResponseData smartBidSuggestBudget(Long smartBidSuggestBudget) {
    
    this.smartBidSuggestBudget = smartBidSuggestBudget;
    return this;
  }

   /**
   * 
   * @return smartBidSuggestBudget
  **/
  @javax.annotation.Nullable
  public Long getSmartBidSuggestBudget() {
    return smartBidSuggestBudget;
  }


  public void setSmartBidSuggestBudget(Long smartBidSuggestBudget) {
    this.smartBidSuggestBudget = smartBidSuggestBudget;
  }


  public ToolsBidSuggestV2ResponseData smartBudgetRange(List<Long> smartBudgetRange) {
    
    this.smartBudgetRange = smartBudgetRange;
    return this;
  }

  public ToolsBidSuggestV2ResponseData addSmartBudgetRangeItem(Long smartBudgetRangeItem) {
    if (this.smartBudgetRange == null) {
      this.smartBudgetRange = new ArrayList<>();
    }
    this.smartBudgetRange.add(smartBudgetRangeItem);
    return this;
  }

   /**
   * 
   * @return smartBudgetRange
  **/
  @javax.annotation.Nullable
  public List<Long> getSmartBudgetRange() {
    return smartBudgetRange;
  }


  public void setSmartBudgetRange(List<Long> smartBudgetRange) {
    this.smartBudgetRange = smartBudgetRange;
  }


  public ToolsBidSuggestV2ResponseData suggestedBid(Double suggestedBid) {
    
    this.suggestedBid = suggestedBid;
    return this;
  }

   /**
   * 
   * @return suggestedBid
  **/
  @javax.annotation.Nullable
  public Double getSuggestedBid() {
    return suggestedBid;
  }


  public void setSuggestedBid(Double suggestedBid) {
    this.suggestedBid = suggestedBid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBidSuggestV2ResponseData toolsBidSuggestV2ResponseData = (ToolsBidSuggestV2ResponseData) o;
    return Objects.equals(this.bidHigh50, toolsBidSuggestV2ResponseData.bidHigh50) &&
        Objects.equals(this.bidHigh90, toolsBidSuggestV2ResponseData.bidHigh90) &&
        Objects.equals(this.smartBidRange, toolsBidSuggestV2ResponseData.smartBidRange) &&
        Objects.equals(this.smartBidSuggestBudget, toolsBidSuggestV2ResponseData.smartBidSuggestBudget) &&
        Objects.equals(this.smartBudgetRange, toolsBidSuggestV2ResponseData.smartBudgetRange) &&
        Objects.equals(this.suggestedBid, toolsBidSuggestV2ResponseData.suggestedBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidHigh50, bidHigh90, smartBidRange, smartBidSuggestBudget, smartBudgetRange, suggestedBid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBidSuggestV2ResponseData {\n");
    sb.append("    bidHigh50: ").append(toIndentedString(bidHigh50)).append("\n");
    sb.append("    bidHigh90: ").append(toIndentedString(bidHigh90)).append("\n");
    sb.append("    smartBidRange: ").append(toIndentedString(smartBidRange)).append("\n");
    sb.append("    smartBidSuggestBudget: ").append(toIndentedString(smartBidSuggestBudget)).append("\n");
    sb.append("    smartBudgetRange: ").append(toIndentedString(smartBudgetRange)).append("\n");
    sb.append("    suggestedBid: ").append(toIndentedString(suggestedBid)).append("\n");
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
    openapiFields.add("bid_high_50");
    openapiFields.add("bid_high_90");
    openapiFields.add("smart_bid_range");
    openapiFields.add("smart_bid_suggest_budget");
    openapiFields.add("smart_budget_range");
    openapiFields.add("suggested_bid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBidSuggestV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBidSuggestV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBidSuggestV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBidSuggestV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBidSuggestV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsBidSuggestV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBidSuggestV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBidSuggestV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBidSuggestV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsBidSuggestV2ResponseData
  */
  public static ToolsBidSuggestV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBidSuggestV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsBidSuggestV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
