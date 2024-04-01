/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ToolsPrivativeWordProjectAddV30ResponseData {
  public static final String SERIALIZED_NAME_ERROR_LIST = "error_list";
  @SerializedName(SERIALIZED_NAME_ERROR_LIST)
  private List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner> errorList = null;

  public static final String SERIALIZED_NAME_PROJECT_ERROR_LIST = "project_error_list";
  @SerializedName(SERIALIZED_NAME_PROJECT_ERROR_LIST)
  private List<Long> projectErrorList = null;

  public static final String SERIALIZED_NAME_PROJECT_LIST = "project_list";
  @SerializedName(SERIALIZED_NAME_PROJECT_LIST)
  private List<Object> projectList = null;

  public ToolsPrivativeWordProjectAddV30ResponseData() {
  }

  public ToolsPrivativeWordProjectAddV30ResponseData errorList(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner> errorList) {
    
    this.errorList = errorList;
    return this;
  }

  public ToolsPrivativeWordProjectAddV30ResponseData addErrorListItem(ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner errorListItem) {
    if (this.errorList == null) {
      this.errorList = new ArrayList<>();
    }
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * 
   * @return errorList
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner> getErrorList() {
    return errorList;
  }


  public void setErrorList(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner> errorList) {
    this.errorList = errorList;
  }


  public ToolsPrivativeWordProjectAddV30ResponseData projectErrorList(List<Long> projectErrorList) {
    
    this.projectErrorList = projectErrorList;
    return this;
  }

  public ToolsPrivativeWordProjectAddV30ResponseData addProjectErrorListItem(Long projectErrorListItem) {
    if (this.projectErrorList == null) {
      this.projectErrorList = new ArrayList<>();
    }
    this.projectErrorList.add(projectErrorListItem);
    return this;
  }

   /**
   * 添加失败的项目id列表
   * @return projectErrorList
  **/
  @javax.annotation.Nullable
  public List<Long> getProjectErrorList() {
    return projectErrorList;
  }


  public void setProjectErrorList(List<Long> projectErrorList) {
    this.projectErrorList = projectErrorList;
  }


  public ToolsPrivativeWordProjectAddV30ResponseData projectList(List<Object> projectList) {
    
    this.projectList = projectList;
    return this;
  }

  public ToolsPrivativeWordProjectAddV30ResponseData addProjectListItem(Object projectListItem) {
    if (this.projectList == null) {
      this.projectList = new ArrayList<>();
    }
    this.projectList.add(projectListItem);
    return this;
  }

   /**
   * 添加成功的项目列表
   * @return projectList
  **/
  @javax.annotation.Nullable
  public List<Object> getProjectList() {
    return projectList;
  }


  public void setProjectList(List<Object> projectList) {
    this.projectList = projectList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordProjectAddV30ResponseData toolsPrivativeWordProjectAddV30ResponseData = (ToolsPrivativeWordProjectAddV30ResponseData) o;
    return Objects.equals(this.errorList, toolsPrivativeWordProjectAddV30ResponseData.errorList) &&
        Objects.equals(this.projectErrorList, toolsPrivativeWordProjectAddV30ResponseData.projectErrorList) &&
        Objects.equals(this.projectList, toolsPrivativeWordProjectAddV30ResponseData.projectList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList, projectErrorList, projectList);
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
    sb.append("class ToolsPrivativeWordProjectAddV30ResponseData {\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
    sb.append("    projectErrorList: ").append(toIndentedString(projectErrorList)).append("\n");
    sb.append("    projectList: ").append(toIndentedString(projectList)).append("\n");
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
    openapiFields.add("error_list");
    openapiFields.add("project_error_list");
    openapiFields.add("project_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordProjectAddV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordProjectAddV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordProjectAddV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordProjectAddV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordProjectAddV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordProjectAddV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordProjectAddV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordProjectAddV30ResponseData
  */
  public static ToolsPrivativeWordProjectAddV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordProjectAddV30ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordProjectAddV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

