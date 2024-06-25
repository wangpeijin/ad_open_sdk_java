/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ReportStardeliveryTaskDataGetV30Filtering {
  public static final String SERIALIZED_NAME_STAR_TASK_IDS = "star_task_ids";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_IDS)
  private List<Long> starTaskIds = null;

  public static final String SERIALIZED_NAME_STAR_TASK_STATUS = "star_task_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_STATUS)
  private ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus starTaskStatus = null;

  public ReportStardeliveryTaskDataGetV30Filtering() {
  }

  public ReportStardeliveryTaskDataGetV30Filtering starTaskIds(List<Long> starTaskIds) {
    
    this.starTaskIds = starTaskIds;
    return this;
  }

  public ReportStardeliveryTaskDataGetV30Filtering addStarTaskIdsItem(Long starTaskIdsItem) {
    if (this.starTaskIds == null) {
      this.starTaskIds = new ArrayList<>();
    }
    this.starTaskIds.add(starTaskIdsItem);
    return this;
  }

   /**
   * 
   * @return starTaskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getStarTaskIds() {
    return starTaskIds;
  }


  public void setStarTaskIds(List<Long> starTaskIds) {
    this.starTaskIds = starTaskIds;
  }


  public ReportStardeliveryTaskDataGetV30Filtering starTaskStatus(ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus starTaskStatus) {
    
    this.starTaskStatus = starTaskStatus;
    return this;
  }

   /**
   * Get starTaskStatus
   * @return starTaskStatus
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus getStarTaskStatus() {
    return starTaskStatus;
  }


  public void setStarTaskStatus(ReportStardeliveryTaskDataGetV30FilteringStarTaskStatus starTaskStatus) {
    this.starTaskStatus = starTaskStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportStardeliveryTaskDataGetV30Filtering reportStardeliveryTaskDataGetV30Filtering = (ReportStardeliveryTaskDataGetV30Filtering) o;
    return Objects.equals(this.starTaskIds, reportStardeliveryTaskDataGetV30Filtering.starTaskIds) &&
        Objects.equals(this.starTaskStatus, reportStardeliveryTaskDataGetV30Filtering.starTaskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(starTaskIds, starTaskStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportStardeliveryTaskDataGetV30Filtering {\n");
    sb.append("    starTaskIds: ").append(toIndentedString(starTaskIds)).append("\n");
    sb.append("    starTaskStatus: ").append(toIndentedString(starTaskStatus)).append("\n");
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
    openapiFields.add("star_task_ids");
    openapiFields.add("star_task_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportStardeliveryTaskDataGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportStardeliveryTaskDataGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportStardeliveryTaskDataGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportStardeliveryTaskDataGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportStardeliveryTaskDataGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ReportStardeliveryTaskDataGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportStardeliveryTaskDataGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportStardeliveryTaskDataGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportStardeliveryTaskDataGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportStardeliveryTaskDataGetV30Filtering
  */
  public static ReportStardeliveryTaskDataGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportStardeliveryTaskDataGetV30Filtering.class);
  }

 /**
  * Convert an instance of ReportStardeliveryTaskDataGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

