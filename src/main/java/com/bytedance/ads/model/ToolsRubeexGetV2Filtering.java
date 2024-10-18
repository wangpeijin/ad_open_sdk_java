/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsRubeexGetV2FilteringIsOwner;
import com.bytedance.ads.model.ToolsRubeexGetV2FilteringOrder;
import com.bytedance.ads.model.ToolsRubeexGetV2FilteringProjectLifecycle;
import com.bytedance.ads.model.ToolsRubeexGetV2FilteringProjectVersionLifecycle;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ToolsRubeexGetV2Filtering {
  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_IS_OWNER = "is_owner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private ToolsRubeexGetV2FilteringIsOwner isOwner = null;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private ToolsRubeexGetV2FilteringOrder order = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_LIFECYCLE = "project_lifecycle";
  @SerializedName(SERIALIZED_NAME_PROJECT_LIFECYCLE)
  private List<ToolsRubeexGetV2FilteringProjectLifecycle> projectLifecycle = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public static final String SERIALIZED_NAME_PROJECT_VERSION_LIFECYCLE = "project_version_lifecycle";
  @SerializedName(SERIALIZED_NAME_PROJECT_VERSION_LIFECYCLE)
  private List<ToolsRubeexGetV2FilteringProjectVersionLifecycle> projectVersionLifecycle = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ToolsRubeexGetV2Filtering() {
  }

  public ToolsRubeexGetV2Filtering authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public ToolsRubeexGetV2Filtering addAuthorIdsItem(Long authorIdsItem) {
    if (this.authorIds == null) {
      this.authorIds = new ArrayList<>();
    }
    this.authorIds.add(authorIdsItem);
    return this;
  }

   /**
   * 
   * @return authorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorIds() {
    return authorIds;
  }


  public void setAuthorIds(List<Long> authorIds) {
    this.authorIds = authorIds;
  }


  public ToolsRubeexGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsRubeexGetV2Filtering isOwner(ToolsRubeexGetV2FilteringIsOwner isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  public ToolsRubeexGetV2FilteringIsOwner getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(ToolsRubeexGetV2FilteringIsOwner isOwner) {
    this.isOwner = isOwner;
  }


  public ToolsRubeexGetV2Filtering order(ToolsRubeexGetV2FilteringOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public ToolsRubeexGetV2FilteringOrder getOrder() {
    return order;
  }


  public void setOrder(ToolsRubeexGetV2FilteringOrder order) {
    this.order = order;
  }


  public ToolsRubeexGetV2Filtering projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 2147483647
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ToolsRubeexGetV2Filtering projectLifecycle(List<ToolsRubeexGetV2FilteringProjectLifecycle> projectLifecycle) {
    
    this.projectLifecycle = projectLifecycle;
    return this;
  }

  public ToolsRubeexGetV2Filtering addProjectLifecycleItem(ToolsRubeexGetV2FilteringProjectLifecycle projectLifecycleItem) {
    if (this.projectLifecycle == null) {
      this.projectLifecycle = new ArrayList<>();
    }
    this.projectLifecycle.add(projectLifecycleItem);
    return this;
  }

   /**
   * 
   * @return projectLifecycle
  **/
  @javax.annotation.Nullable
  public List<ToolsRubeexGetV2FilteringProjectLifecycle> getProjectLifecycle() {
    return projectLifecycle;
  }


  public void setProjectLifecycle(List<ToolsRubeexGetV2FilteringProjectLifecycle> projectLifecycle) {
    this.projectLifecycle = projectLifecycle;
  }


  public ToolsRubeexGetV2Filtering projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public ToolsRubeexGetV2Filtering projectVersionLifecycle(List<ToolsRubeexGetV2FilteringProjectVersionLifecycle> projectVersionLifecycle) {
    
    this.projectVersionLifecycle = projectVersionLifecycle;
    return this;
  }

  public ToolsRubeexGetV2Filtering addProjectVersionLifecycleItem(ToolsRubeexGetV2FilteringProjectVersionLifecycle projectVersionLifecycleItem) {
    if (this.projectVersionLifecycle == null) {
      this.projectVersionLifecycle = new ArrayList<>();
    }
    this.projectVersionLifecycle.add(projectVersionLifecycleItem);
    return this;
  }

   /**
   * 
   * @return projectVersionLifecycle
  **/
  @javax.annotation.Nullable
  public List<ToolsRubeexGetV2FilteringProjectVersionLifecycle> getProjectVersionLifecycle() {
    return projectVersionLifecycle;
  }


  public void setProjectVersionLifecycle(List<ToolsRubeexGetV2FilteringProjectVersionLifecycle> projectVersionLifecycle) {
    this.projectVersionLifecycle = projectVersionLifecycle;
  }


  public ToolsRubeexGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsRubeexGetV2Filtering toolsRubeexGetV2Filtering = (ToolsRubeexGetV2Filtering) o;
    return Objects.equals(this.authorIds, toolsRubeexGetV2Filtering.authorIds) &&
        Objects.equals(this.endTime, toolsRubeexGetV2Filtering.endTime) &&
        Objects.equals(this.isOwner, toolsRubeexGetV2Filtering.isOwner) &&
        Objects.equals(this.order, toolsRubeexGetV2Filtering.order) &&
        Objects.equals(this.projectId, toolsRubeexGetV2Filtering.projectId) &&
        Objects.equals(this.projectLifecycle, toolsRubeexGetV2Filtering.projectLifecycle) &&
        Objects.equals(this.projectName, toolsRubeexGetV2Filtering.projectName) &&
        Objects.equals(this.projectVersionLifecycle, toolsRubeexGetV2Filtering.projectVersionLifecycle) &&
        Objects.equals(this.startTime, toolsRubeexGetV2Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorIds, endTime, isOwner, order, projectId, projectLifecycle, projectName, projectVersionLifecycle, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsRubeexGetV2Filtering {\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectLifecycle: ").append(toIndentedString(projectLifecycle)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectVersionLifecycle: ").append(toIndentedString(projectVersionLifecycle)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("author_ids");
    openapiFields.add("end_time");
    openapiFields.add("is_owner");
    openapiFields.add("order");
    openapiFields.add("project_id");
    openapiFields.add("project_lifecycle");
    openapiFields.add("project_name");
    openapiFields.add("project_version_lifecycle");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsRubeexGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsRubeexGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsRubeexGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsRubeexGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsRubeexGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsRubeexGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsRubeexGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsRubeexGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsRubeexGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsRubeexGetV2Filtering
  */
  public static ToolsRubeexGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsRubeexGetV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsRubeexGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

