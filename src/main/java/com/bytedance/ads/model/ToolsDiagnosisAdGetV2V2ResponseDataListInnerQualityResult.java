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
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult {
  public static final String SERIALIZED_NAME_QUALITY_CONCLUSION = "quality_conclusion";
  @SerializedName(SERIALIZED_NAME_QUALITY_CONCLUSION)
  private String qualityConclusion = null;

  public static final String SERIALIZED_NAME_QUALITY_CONCLUSION_TAG = "quality_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_QUALITY_CONCLUSION_TAG)
  private String qualityConclusionTag = null;

  public static final String SERIALIZED_NAME_QUALITY_SUGGESTION = "quality_suggestion";
  @SerializedName(SERIALIZED_NAME_QUALITY_SUGGESTION)
  private List<String> qualitySuggestion = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualityConclusion(String qualityConclusion) {
    
    this.qualityConclusion = qualityConclusion;
    return this;
  }

   /**
   * 
   * @return qualityConclusion
  **/
  @javax.annotation.Nullable
  public String getQualityConclusion() {
    return qualityConclusion;
  }


  public void setQualityConclusion(String qualityConclusion) {
    this.qualityConclusion = qualityConclusion;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualityConclusionTag(String qualityConclusionTag) {
    
    this.qualityConclusionTag = qualityConclusionTag;
    return this;
  }

   /**
   * 
   * @return qualityConclusionTag
  **/
  @javax.annotation.Nullable
  public String getQualityConclusionTag() {
    return qualityConclusionTag;
  }


  public void setQualityConclusionTag(String qualityConclusionTag) {
    this.qualityConclusionTag = qualityConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult qualitySuggestion(List<String> qualitySuggestion) {
    
    this.qualitySuggestion = qualitySuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult addQualitySuggestionItem(String qualitySuggestionItem) {
    if (this.qualitySuggestion == null) {
      this.qualitySuggestion = new ArrayList<>();
    }
    this.qualitySuggestion.add(qualitySuggestionItem);
    return this;
  }

   /**
   * 
   * @return qualitySuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getQualitySuggestion() {
    return qualitySuggestion;
  }


  public void setQualitySuggestion(List<String> qualitySuggestion) {
    this.qualitySuggestion = qualitySuggestion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult toolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult) o;
    return Objects.equals(this.qualityConclusion, toolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.qualityConclusion) &&
        Objects.equals(this.qualityConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.qualityConclusionTag) &&
        Objects.equals(this.qualitySuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.qualitySuggestion);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualityConclusion, qualityConclusionTag, qualitySuggestion);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult {\n");
    sb.append("    qualityConclusion: ").append(toIndentedString(qualityConclusion)).append("\n");
    sb.append("    qualityConclusionTag: ").append(toIndentedString(qualityConclusionTag)).append("\n");
    sb.append("    qualitySuggestion: ").append(toIndentedString(qualitySuggestion)).append("\n");
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
    openapiFields.add("quality_conclusion");
    openapiFields.add("quality_conclusion_tag");
    openapiFields.add("quality_suggestion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerQualityResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

