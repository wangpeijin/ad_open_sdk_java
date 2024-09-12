/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult {
  public static final String SERIALIZED_NAME_AD_DIM_BUDGET = "ad_dim_budget";
  @SerializedName(SERIALIZED_NAME_AD_DIM_BUDGET)
  private Double adDimBudget = null;

  public static final String SERIALIZED_NAME_BUDGET_CONCLUSION_TAG = "budget_conclusion_tag";
  @SerializedName(SERIALIZED_NAME_BUDGET_CONCLUSION_TAG)
  private String budgetConclusionTag = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private Long budgetMode = null;

  public static final String SERIALIZED_NAME_BUDGET_SUGGESTION = "budget_suggestion";
  @SerializedName(SERIALIZED_NAME_BUDGET_SUGGESTION)
  private List<String> budgetSuggestion = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult() {
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult adDimBudget(Double adDimBudget) {
    
    this.adDimBudget = adDimBudget;
    return this;
  }

   /**
   * 
   * @return adDimBudget
  **/
  @javax.annotation.Nullable
  public Double getAdDimBudget() {
    return adDimBudget;
  }


  public void setAdDimBudget(Double adDimBudget) {
    this.adDimBudget = adDimBudget;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetConclusionTag(String budgetConclusionTag) {
    
    this.budgetConclusionTag = budgetConclusionTag;
    return this;
  }

   /**
   * 
   * @return budgetConclusionTag
  **/
  @javax.annotation.Nullable
  public String getBudgetConclusionTag() {
    return budgetConclusionTag;
  }


  public void setBudgetConclusionTag(String budgetConclusionTag) {
    this.budgetConclusionTag = budgetConclusionTag;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetMode(Long budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * 
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public Long getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(Long budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult budgetSuggestion(List<String> budgetSuggestion) {
    
    this.budgetSuggestion = budgetSuggestion;
    return this;
  }

  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult addBudgetSuggestionItem(String budgetSuggestionItem) {
    if (this.budgetSuggestion == null) {
      this.budgetSuggestion = new ArrayList<>();
    }
    this.budgetSuggestion.add(budgetSuggestionItem);
    return this;
  }

   /**
   * 
   * @return budgetSuggestion
  **/
  @javax.annotation.Nullable
  public List<String> getBudgetSuggestion() {
    return budgetSuggestion;
  }


  public void setBudgetSuggestion(List<String> budgetSuggestion) {
    this.budgetSuggestion = budgetSuggestion;
  }


  public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult = (ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult) o;
    return Objects.equals(this.adDimBudget, toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.adDimBudget) &&
        Objects.equals(this.budgetConclusionTag, toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.budgetConclusionTag) &&
        Objects.equals(this.budgetMode, toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.budgetMode) &&
        Objects.equals(this.budgetSuggestion, toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.budgetSuggestion) &&
        Objects.equals(this.statCost, toolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adDimBudget, budgetConclusionTag, budgetMode, budgetSuggestion, statCost);
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
    sb.append("class ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult {\n");
    sb.append("    adDimBudget: ").append(toIndentedString(adDimBudget)).append("\n");
    sb.append("    budgetConclusionTag: ").append(toIndentedString(budgetConclusionTag)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetSuggestion: ").append(toIndentedString(budgetSuggestion)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("ad_dim_budget");
    openapiFields.add("budget_conclusion_tag");
    openapiFields.add("budget_mode");
    openapiFields.add("budget_suggestion");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult>() {
           @Override
           public void write(JsonWriter out, ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult
  * @throws IOException if the JSON string is invalid with respect to ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult
  */
  public static ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult.class);
  }

 /**
  * Convert an instance of ToolsDiagnosisAdGetV2V2ResponseDataListInnerBudgetResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

