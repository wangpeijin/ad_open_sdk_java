/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsExternalAction;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner;
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
 * ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner {
  public static final String SERIALIZED_NAME_ASSET_TYPES = "asset_types";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPES)
  private List<ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes> assetTypes = null;

  public static final String SERIALIZED_NAME_ASSETS_ID = "assets_id";
  @SerializedName(SERIALIZED_NAME_ASSETS_ID)
  private Long assetsId = null;

  public static final String SERIALIZED_NAME_DEEP_GOALS = "deepGoals";
  @SerializedName(SERIALIZED_NAME_DEEP_GOALS)
  private List<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner> deepGoals = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private ToolsEventConvertOptimizedGoalGetV30DataGoalsExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_HISTORY_BACK = "history_back";
  @SerializedName(SERIALIZED_NAME_HISTORY_BACK)
  private Boolean historyBack = null;

  public static final String SERIALIZED_NAME_OPTIMIZATION_NAME = "optimization_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_NAME)
  private String optimizationName = null;

  public static final String SERIALIZED_NAME_SPARE_ASSETS_ID = "spare_assets_id";
  @SerializedName(SERIALIZED_NAME_SPARE_ASSETS_ID)
  private Long spareAssetsId = null;

  public static final String SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK = "twenty_four_hour_back";
  @SerializedName(SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK)
  private Boolean twentyFourHourBack = null;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "value_type";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType valueType = null;

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner() {
  }

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner assetTypes(List<ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes> assetTypes) {
    
    this.assetTypes = assetTypes;
    return this;
  }

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner addAssetTypesItem(ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes assetTypesItem) {
    if (this.assetTypes == null) {
      this.assetTypes = new ArrayList<>();
    }
    this.assetTypes.add(assetTypesItem);
    return this;
  }

   /**
   * 
   * @return assetTypes
  **/
  @javax.annotation.Nullable
  public List<ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes> getAssetTypes() {
    return assetTypes;
  }


  public void setAssetTypes(List<ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes> assetTypes) {
    this.assetTypes = assetTypes;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner assetsId(Long assetsId) {
    
    this.assetsId = assetsId;
    return this;
  }

   /**
   * 
   * @return assetsId
  **/
  @javax.annotation.Nullable
  public Long getAssetsId() {
    return assetsId;
  }


  public void setAssetsId(Long assetsId) {
    this.assetsId = assetsId;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner deepGoals(List<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner> deepGoals) {
    
    this.deepGoals = deepGoals;
    return this;
  }

  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner addDeepGoalsItem(ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner deepGoalsItem) {
    if (this.deepGoals == null) {
      this.deepGoals = new ArrayList<>();
    }
    this.deepGoals.add(deepGoalsItem);
    return this;
  }

   /**
   * 
   * @return deepGoals
  **/
  @javax.annotation.Nullable
  public List<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner> getDeepGoals() {
    return deepGoals;
  }


  public void setDeepGoals(List<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInnerDeepGoalsInner> deepGoals) {
    this.deepGoals = deepGoals;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner externalAction(ToolsEventConvertOptimizedGoalGetV30DataGoalsExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public ToolsEventConvertOptimizedGoalGetV30DataGoalsExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(ToolsEventConvertOptimizedGoalGetV30DataGoalsExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner historyBack(Boolean historyBack) {
    
    this.historyBack = historyBack;
    return this;
  }

   /**
   * 
   * @return historyBack
  **/
  @javax.annotation.Nullable
  public Boolean getHistoryBack() {
    return historyBack;
  }


  public void setHistoryBack(Boolean historyBack) {
    this.historyBack = historyBack;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner optimizationName(String optimizationName) {
    
    this.optimizationName = optimizationName;
    return this;
  }

   /**
   * 
   * @return optimizationName
  **/
  @javax.annotation.Nullable
  public String getOptimizationName() {
    return optimizationName;
  }


  public void setOptimizationName(String optimizationName) {
    this.optimizationName = optimizationName;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner spareAssetsId(Long spareAssetsId) {
    
    this.spareAssetsId = spareAssetsId;
    return this;
  }

   /**
   * 
   * @return spareAssetsId
  **/
  @javax.annotation.Nullable
  public Long getSpareAssetsId() {
    return spareAssetsId;
  }


  public void setSpareAssetsId(Long spareAssetsId) {
    this.spareAssetsId = spareAssetsId;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner twentyFourHourBack(Boolean twentyFourHourBack) {
    
    this.twentyFourHourBack = twentyFourHourBack;
    return this;
  }

   /**
   * 
   * @return twentyFourHourBack
  **/
  @javax.annotation.Nullable
  public Boolean getTwentyFourHourBack() {
    return twentyFourHourBack;
  }


  public void setTwentyFourHourBack(Boolean twentyFourHourBack) {
    this.twentyFourHourBack = twentyFourHourBack;
  }


  public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner valueType(ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  public ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType getValueType() {
    return valueType;
  }


  public void setValueType(ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType valueType) {
    this.valueType = valueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner = (ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner) o;
    return Objects.equals(this.assetTypes, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.assetTypes) &&
        Objects.equals(this.assetsId, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.assetsId) &&
        Objects.equals(this.deepGoals, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.deepGoals) &&
        Objects.equals(this.externalAction, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.externalAction) &&
        Objects.equals(this.historyBack, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.historyBack) &&
        Objects.equals(this.optimizationName, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.optimizationName) &&
        Objects.equals(this.spareAssetsId, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.spareAssetsId) &&
        Objects.equals(this.twentyFourHourBack, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.twentyFourHourBack) &&
        Objects.equals(this.valueType, toolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.valueType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypes, assetsId, deepGoals, externalAction, historyBack, optimizationName, spareAssetsId, twentyFourHourBack, valueType);
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
    sb.append("class ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner {\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    assetsId: ").append(toIndentedString(assetsId)).append("\n");
    sb.append("    deepGoals: ").append(toIndentedString(deepGoals)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    historyBack: ").append(toIndentedString(historyBack)).append("\n");
    sb.append("    optimizationName: ").append(toIndentedString(optimizationName)).append("\n");
    sb.append("    spareAssetsId: ").append(toIndentedString(spareAssetsId)).append("\n");
    sb.append("    twentyFourHourBack: ").append(toIndentedString(twentyFourHourBack)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
    openapiFields.add("asset_types");
    openapiFields.add("assets_id");
    openapiFields.add("deepGoals");
    openapiFields.add("external_action");
    openapiFields.add("history_back");
    openapiFields.add("optimization_name");
    openapiFields.add("spare_assets_id");
    openapiFields.add("twenty_four_hour_back");
    openapiFields.add("value_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner>() {
           @Override
           public void write(JsonWriter out, ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner
  */
  public static ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner.class);
  }

 /**
  * Convert an instance of ToolsEventConvertOptimizedGoalGetV30ResponseDataGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

