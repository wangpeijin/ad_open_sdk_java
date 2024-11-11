/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarTaskListByProjectV2ResponseDataPageInfo;
import com.bytedance.ads.model.StarTaskListByProjectV2ResponseDataProjectTasksInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class StarTaskListByProjectV2ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private StarTaskListByProjectV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_PROJECT_TASKS = "project_tasks";
  @SerializedName(SERIALIZED_NAME_PROJECT_TASKS)
  private List<StarTaskListByProjectV2ResponseDataProjectTasksInner> projectTasks = null;

  public StarTaskListByProjectV2ResponseData() {
  }

  public StarTaskListByProjectV2ResponseData pageInfo(StarTaskListByProjectV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public StarTaskListByProjectV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(StarTaskListByProjectV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public StarTaskListByProjectV2ResponseData projectTasks(List<StarTaskListByProjectV2ResponseDataProjectTasksInner> projectTasks) {
    
    this.projectTasks = projectTasks;
    return this;
  }

  public StarTaskListByProjectV2ResponseData addProjectTasksItem(StarTaskListByProjectV2ResponseDataProjectTasksInner projectTasksItem) {
    if (this.projectTasks == null) {
      this.projectTasks = new ArrayList<>();
    }
    this.projectTasks.add(projectTasksItem);
    return this;
  }

   /**
   * 
   * @return projectTasks
  **/
  @javax.annotation.Nullable
  public List<StarTaskListByProjectV2ResponseDataProjectTasksInner> getProjectTasks() {
    return projectTasks;
  }


  public void setProjectTasks(List<StarTaskListByProjectV2ResponseDataProjectTasksInner> projectTasks) {
    this.projectTasks = projectTasks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarTaskListByProjectV2ResponseData starTaskListByProjectV2ResponseData = (StarTaskListByProjectV2ResponseData) o;
    return Objects.equals(this.pageInfo, starTaskListByProjectV2ResponseData.pageInfo) &&
        Objects.equals(this.projectTasks, starTaskListByProjectV2ResponseData.projectTasks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, projectTasks);
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
    sb.append("class StarTaskListByProjectV2ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    projectTasks: ").append(toIndentedString(projectTasks)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("project_tasks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarTaskListByProjectV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarTaskListByProjectV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarTaskListByProjectV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarTaskListByProjectV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarTaskListByProjectV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarTaskListByProjectV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarTaskListByProjectV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarTaskListByProjectV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarTaskListByProjectV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarTaskListByProjectV2ResponseData
  */
  public static StarTaskListByProjectV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarTaskListByProjectV2ResponseData.class);
  }

 /**
  * Convert an instance of StarTaskListByProjectV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

