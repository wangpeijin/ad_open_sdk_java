/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsDeepExternalAction;
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
 * EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner {
  public static final String SERIALIZED_NAME_ASSET_TYPES = "asset_types";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPES)
  private List<EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes> assetTypes = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_HISTORY_BACK = "history_back";
  @SerializedName(SERIALIZED_NAME_HISTORY_BACK)
  private Boolean historyBack = null;

  public static final String SERIALIZED_NAME_OPTIMIZATION_NAME = "optimization_name";
  @SerializedName(SERIALIZED_NAME_OPTIMIZATION_NAME)
  private String optimizationName = null;

  public static final String SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK = "twenty_four_hour_back";
  @SerializedName(SERIALIZED_NAME_TWENTY_FOUR_HOUR_BACK)
  private Boolean twentyFourHourBack = null;

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner() {
  }

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner assetTypes(List<EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes> assetTypes) {
    
    this.assetTypes = assetTypes;
    return this;
  }

  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner addAssetTypesItem(EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes assetTypesItem) {
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
  public List<EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes> getAssetTypes() {
    return assetTypes;
  }


  public void setAssetTypes(List<EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes> assetTypes) {
    this.assetTypes = assetTypes;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner deepExternalAction(EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner historyBack(Boolean historyBack) {
    
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


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner optimizationName(String optimizationName) {
    
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


  public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner twentyFourHourBack(Boolean twentyFourHourBack) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner = (EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner) o;
    return Objects.equals(this.assetTypes, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.assetTypes) &&
        Objects.equals(this.deepExternalAction, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.deepExternalAction) &&
        Objects.equals(this.historyBack, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.historyBack) &&
        Objects.equals(this.optimizationName, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.optimizationName) &&
        Objects.equals(this.twentyFourHourBack, eventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.twentyFourHourBack);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetTypes, deepExternalAction, historyBack, optimizationName, twentyFourHourBack);
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
    sb.append("class EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner {\n");
    sb.append("    assetTypes: ").append(toIndentedString(assetTypes)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    historyBack: ").append(toIndentedString(historyBack)).append("\n");
    sb.append("    optimizationName: ").append(toIndentedString(optimizationName)).append("\n");
    sb.append("    twentyFourHourBack: ").append(toIndentedString(twentyFourHourBack)).append("\n");
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
    openapiFields.add("deep_external_action");
    openapiFields.add("history_back");
    openapiFields.add("optimization_name");
    openapiFields.add("twenty_four_hour_back");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner
  */
  public static EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner.class);
  }

 /**
  * Convert an instance of EventManagerOptimizedGoalGetV2V30ResponseDataGoalsInnerDeepGoalsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

