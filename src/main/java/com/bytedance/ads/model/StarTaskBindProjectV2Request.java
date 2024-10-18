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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * StarTaskBindProjectV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarTaskBindProjectV2Request {
  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public StarTaskBindProjectV2Request() {
  }

  public StarTaskBindProjectV2Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public StarTaskBindProjectV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarTaskBindProjectV2Request taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @javax.annotation.Nonnull
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarTaskBindProjectV2Request starTaskBindProjectV2Request = (StarTaskBindProjectV2Request) o;
    return Objects.equals(this.projectId, starTaskBindProjectV2Request.projectId) &&
        Objects.equals(this.starId, starTaskBindProjectV2Request.starId) &&
        Objects.equals(this.taskId, starTaskBindProjectV2Request.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, starId, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarTaskBindProjectV2Request {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
    openapiFields.add("project_id");
    openapiFields.add("star_id");
    openapiFields.add("task_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("star_id");
    openapiRequiredFields.add("task_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarTaskBindProjectV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarTaskBindProjectV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarTaskBindProjectV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarTaskBindProjectV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarTaskBindProjectV2Request>() {
           @Override
           public void write(JsonWriter out, StarTaskBindProjectV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarTaskBindProjectV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarTaskBindProjectV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarTaskBindProjectV2Request
  * @throws IOException if the JSON string is invalid with respect to StarTaskBindProjectV2Request
  */
  public static StarTaskBindProjectV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarTaskBindProjectV2Request.class);
  }

 /**
  * Convert an instance of StarTaskBindProjectV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

