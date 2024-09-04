/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult {
  public static final String SERIALIZED_NAME_BID_CONCLUSION_DETAIL = "bid_conclusion_detail";
  @SerializedName(SERIALIZED_NAME_BID_CONCLUSION_DETAIL)
  private String bidConclusionDetail = null;

  public static final String SERIALIZED_NAME_BID_CONCLUSION_TAG = "bid_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_BID_CONCLUSION_TAG)
  private String bidConclusionTag = null;

  public static final String SERIALIZED_NAME_BID_SUGGESTION = "bid_suggestion";
  @SerializedName(SERIALIZED_NAME_BID_SUGGESTION)
  private List<String> bidSuggestion = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidConclusionDetail(String bidConclusionDetail) {
    
    this.bidConclusionDetail = bidConclusionDetail;
    return this;
  }

   /**
   * 
   * @return bidConclusionDetail
  **/
  @javax.annotation.Nullable
  public String getBidConclusionDetail() {
    return bidConclusionDetail;
  }


  public void setBidConclusionDetail(String bidConclusionDetail) {
    this.bidConclusionDetail = bidConclusionDetail;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidConclusionTag(String bidConclusionTag) {
    
    this.bidConclusionTag = bidConclusionTag;
    return this;
  }

   /**
   * 
   * @return bidConclusionTag
  **/
  @javax.annotation.Nullable
  public String getBidConclusionTag() {
    return bidConclusionTag;
  }


  public void setBidConclusionTag(String bidConclusionTag) {
    this.bidConclusionTag = bidConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult bidSuggestion(List<String> bidSuggestion) {
    
    this.bidSuggestion = bidSuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult addBidSuggestionItem(String bidSuggestionItem) {
    if (this.bidSuggestion == null) {
      this.bidSuggestion = new ArrayList<>();
    }
    this.bidSuggestion.add(bidSuggestionItem);
    return this;
  }

   /**
   * 
   * @return bidSuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getBidSuggestion() {
    return bidSuggestion;
  }


  public void setBidSuggestion(List<String> bidSuggestion) {
    this.bidSuggestion = bidSuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult toolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult) o;
    return Objects.equals(this.bidConclusionDetail, toolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.bidConclusionDetail) &&
        Objects.equals(this.bidConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.bidConclusionTag) &&
        Objects.equals(this.bidSuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.bidSuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidConclusionDetail, bidConclusionTag, bidSuggestion);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult {\n");
    sb.append("    bidConclusionDetail: ").append(toIndentedString(bidConclusionDetail)).append("\n");
    sb.append("    bidConclusionTag: ").append(toIndentedString(bidConclusionTag)).append("\n");
    sb.append("    bidSuggestion: ").append(toIndentedString(bidSuggestion)).append("\n");
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
    openapiFields.add("bid_conclusion_detail");
    openapiFields.add("bid_conclusion_tag");
    openapiFields.add("bid_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBidResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

