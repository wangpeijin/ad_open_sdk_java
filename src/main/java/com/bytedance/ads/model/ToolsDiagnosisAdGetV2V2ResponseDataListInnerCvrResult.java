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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult {
  public static final String SERIALIZED_NAME_CVR_CONCLUSION_DETAIL = "cvr_conclusion_detail";
  @SerializedName(SERIALIZED_NAME_CVR_CONCLUSION_DETAIL)
  private String cvrConclusionDetail = null;

  public static final String SERIALIZED_NAME_CVR_CONCLUSION_TAG = "cvr_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_CVR_CONCLUSION_TAG)
  private String cvrConclusionTag = null;

  public static final String SERIALIZED_NAME_CVR_SUGGESTION = "cvr_suggestion";
  @SerializedName(SERIALIZED_NAME_CVR_SUGGESTION)
  private List<String> cvrSuggestion = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrConclusionDetail(String cvrConclusionDetail) {
    
    this.cvrConclusionDetail = cvrConclusionDetail;
    return this;
  }

   /**
   * 
   * @return cvrConclusionDetail
  **/
  @javax.annotation.Nullable
  public String getCvrConclusionDetail() {
    return cvrConclusionDetail;
  }


  public void setCvrConclusionDetail(String cvrConclusionDetail) {
    this.cvrConclusionDetail = cvrConclusionDetail;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrConclusionTag(String cvrConclusionTag) {
    
    this.cvrConclusionTag = cvrConclusionTag;
    return this;
  }

   /**
   * 
   * @return cvrConclusionTag
  **/
  @javax.annotation.Nullable
  public String getCvrConclusionTag() {
    return cvrConclusionTag;
  }


  public void setCvrConclusionTag(String cvrConclusionTag) {
    this.cvrConclusionTag = cvrConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult cvrSuggestion(List<String> cvrSuggestion) {
    
    this.cvrSuggestion = cvrSuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult addCvrSuggestionItem(String cvrSuggestionItem) {
    if (this.cvrSuggestion == null) {
      this.cvrSuggestion = new ArrayList<>();
    }
    this.cvrSuggestion.add(cvrSuggestionItem);
    return this;
  }

   /**
   * 
   * @return cvrSuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getCvrSuggestion() {
    return cvrSuggestion;
  }


  public void setCvrSuggestion(List<String> cvrSuggestion) {
    this.cvrSuggestion = cvrSuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult toolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult) o;
    return Objects.equals(this.cvrConclusionDetail, toolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.cvrConclusionDetail) &&
        Objects.equals(this.cvrConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.cvrConclusionTag) &&
        Objects.equals(this.cvrSuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.cvrSuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvrConclusionDetail, cvrConclusionTag, cvrSuggestion);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult {\n");
    sb.append("    cvrConclusionDetail: ").append(toIndentedString(cvrConclusionDetail)).append("\n");
    sb.append("    cvrConclusionTag: ").append(toIndentedString(cvrConclusionTag)).append("\n");
    sb.append("    cvrSuggestion: ").append(toIndentedString(cvrSuggestion)).append("\n");
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
    openapiFields.add("cvr_conclusion_detail");
    openapiFields.add("cvr_conclusion_tag");
    openapiFields.add("cvr_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerCvrResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

