/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics;
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
 * ToolsAbTestInfoGetV2ResponseDataTestReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseDataTestReportsInner {
  public static final String SERIALIZED_NAME_DAY_STATS = "day_stats";
  @SerializedName(SERIALIZED_NAME_DAY_STATS)
  private List<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner> dayStats = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics metrics = null;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId = null;

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInner() {
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInner dayStats(List<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner> dayStats) {
    
    this.dayStats = dayStats;
    return this;
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInner addDayStatsItem(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner dayStatsItem) {
    if (this.dayStats == null) {
      this.dayStats = new ArrayList<>();
    }
    this.dayStats.add(dayStatsItem);
    return this;
  }

   /**
   * 实验对象分日统计数据
   * @return dayStats
  **/
  @javax.annotation.Nullable
  public List<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner> getDayStats() {
    return dayStats;
  }


  public void setDayStats(List<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerDayStatsInner> dayStats) {
    this.dayStats = dayStats;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInner metrics(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetrics metrics) {
    this.metrics = metrics;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInner objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * 实验对象ID
   * @return objectId
  **/
  @javax.annotation.Nullable
  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataTestReportsInner toolsAbTestInfoGetV2ResponseDataTestReportsInner = (ToolsAbTestInfoGetV2ResponseDataTestReportsInner) o;
    return Objects.equals(this.dayStats, toolsAbTestInfoGetV2ResponseDataTestReportsInner.dayStats) &&
        Objects.equals(this.metrics, toolsAbTestInfoGetV2ResponseDataTestReportsInner.metrics) &&
        Objects.equals(this.objectId, toolsAbTestInfoGetV2ResponseDataTestReportsInner.objectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayStats, metrics, objectId);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataTestReportsInner {\n");
    sb.append("    dayStats: ").append(toIndentedString(dayStats)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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
    openapiFields.add("day_stats");
    openapiFields.add("metrics");
    openapiFields.add("object_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataTestReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataTestReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataTestReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInner>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataTestReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataTestReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataTestReportsInner
  */
  public static ToolsAbTestInfoGetV2ResponseDataTestReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataTestReportsInner.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

