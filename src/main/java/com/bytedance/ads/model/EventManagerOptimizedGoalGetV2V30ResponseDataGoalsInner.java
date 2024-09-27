/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DataGoalsExternalAction;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DataGoalsValueType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner;
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
 * EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner {
  public static final String SERIALIZED_NAME_ASSET_TYPES = "asset_types";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPES)
  private List<EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes> assetTypes = null;

  public static final String SERIALIZED_NAME_DEEP_GOALS = "deep_goals";
  @SerializedName(SERIALIZED_NAME_DEEP_GOALS)
  private List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner> deepGoals = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private EventManagerOptimizedGoalGetV2V30DataGoalsExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_HISTORY_BACK = "history_back";
  @SerializedName(SERIALIZED_NAME_HISTORY_BACK)
  private Boolean historyBack = null;

  public static final String SERIALIZED_NAME_OPTIMIZATION_NAME = "optimization_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_NAME)
  private String optimizationName = null;

  public static final String SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK = "twenty_four_hour_back";
  @SerializedName(SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK)
  private Boolean twentyFourHourBack = null;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "value_type";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private EventManagerOptimizedGoalGetV2V30DataGoalsValueType valueType = null;

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner() {
  }

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner assetTypes(List<EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes> assetTypes) {
    
    this.assetTypes = assetTypes;
    return this;
  }

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner addAssetTypesItem(EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes assetTypesItem) {
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
  public List<EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes> getAssetTypes() {
    return assetTypes;
  }


  public void setAssetTypes(List<EventManagerOptimizedGoalGetV2V30DataGoalsAssetTypes> assetTypes) {
    this.assetTypes = assetTypes;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner deepGoals(List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner> deepGoals) {
    
    this.deepGoals = deepGoals;
    return this;
  }

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner addDeepGoalsItem(EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner deepGoalsItem) {
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
  public List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner> getDeepGoals() {
    return deepGoals;
  }


  public void setDeepGoals(List<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner> deepGoals) {
    this.deepGoals = deepGoals;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner externalAction(EventManagerOptimizedGoalGetV2V30DataGoalsExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public EventManagerOptimizedGoalGetV2V30DataGoalsExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(EventManagerOptimizedGoalGetV2V30DataGoalsExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner historyBack(Boolean historyBack) {
    
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


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner optimizationName(String optimizationName) {
    
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


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner twentyFourHourBack(Boolean twentyFourHourBack) {
    
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


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner valueType(EventManagerOptimizedGoalGetV2V30DataGoalsValueType valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  public EventManagerOptimizedGoalGetV2V30DataGoalsValueType getValueType() {
    return valueType;
  }


  public void setValueType(EventManagerOptimizedGoalGetV2V30DataGoalsValueType valueType) {
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
    EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner = (EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner) o;
    return Objects.equals(this.assetTypes, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.assetTypes) &&
        Objects.equals(this.deepGoals, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.deepGoals) &&
        Objects.equals(this.externalAction, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.externalAction) &&
        Objects.equals(this.historyBack, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.historyBack) &&
        Objects.equals(this.optimizationName, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.optimizationName) &&
        Objects.equals(this.twentyFourHourBack, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.twentyFourHourBack) &&
        Objects.equals(this.valueType, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.valueType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypes, deepGoals, externalAction, historyBack, optimizationName, twentyFourHourBack, valueType);
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
    sb.append("class EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner {\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    deepGoals: ").append(toIndentedString(deepGoals)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    historyBack: ").append(toIndentedString(historyBack)).append("\n");
    sb.append("    optimizationName: ").append(toIndentedString(optimizationName)).append("\n");
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
    openapiFields.add("deep_goals");
    openapiFields.add("external_action");
    openapiFields.add("history_back");
    openapiFields.add("optimization_name");
    openapiFields.add("twenty_four_hour_back");
    openapiFields.add("value_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("history_back");
    openapiRequiredFields.add("optimization_name");
    openapiRequiredFields.add("twenty_four_hour_back");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner
  */
  public static EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner.class);
  }

 /**
  * Convert an instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

