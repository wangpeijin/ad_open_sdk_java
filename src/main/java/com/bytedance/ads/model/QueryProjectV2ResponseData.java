/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QueryProjectV2ResponseDataProjectInfoListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QueryProjectV2ResponseData {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private Long cursor = null;

  public static final String SERIALIZED_NAME_PROJECT_INFO_LIST = "project_info_list";
  @SerializedName(SERIALIZED_NAME_PROJECT_INFO_LIST)
  private List<QueryProjectV2ResponseDataProjectInfoListInner> projectInfoList = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total = null;

  public QueryProjectV2ResponseData() {
  }

  public QueryProjectV2ResponseData cursor(Long cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * 页码游标值
   * @return cursor
  **/
  @javax.annotation.Nullable
  public Long getCursor() {
    return cursor;
  }


  public void setCursor(Long cursor) {
    this.cursor = cursor;
  }


  public QueryProjectV2ResponseData projectInfoList(List<QueryProjectV2ResponseDataProjectInfoListInner> projectInfoList) {
    
    this.projectInfoList = projectInfoList;
    return this;
  }

  public QueryProjectV2ResponseData addProjectInfoListItem(QueryProjectV2ResponseDataProjectInfoListInner projectInfoListItem) {
    if (this.projectInfoList == null) {
      this.projectInfoList = new ArrayList<>();
    }
    this.projectInfoList.add(projectInfoListItem);
    return this;
  }

   /**
   * 
   * @return projectInfoList
  **/
  @javax.annotation.Nullable
  public List<QueryProjectV2ResponseDataProjectInfoListInner> getProjectInfoList() {
    return projectInfoList;
  }


  public void setProjectInfoList(List<QueryProjectV2ResponseDataProjectInfoListInner> projectInfoList) {
    this.projectInfoList = projectInfoList;
  }


  public QueryProjectV2ResponseData total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * 总量
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProjectV2ResponseData queryProjectV2ResponseData = (QueryProjectV2ResponseData) o;
    return Objects.equals(this.cursor, queryProjectV2ResponseData.cursor) &&
        Objects.equals(this.projectInfoList, queryProjectV2ResponseData.projectInfoList) &&
        Objects.equals(this.total, queryProjectV2ResponseData.total);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, projectInfoList, total);
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
    sb.append("class QueryProjectV2ResponseData {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    projectInfoList: ").append(toIndentedString(projectInfoList)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("cursor");
    openapiFields.add("project_info_list");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryProjectV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryProjectV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryProjectV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryProjectV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryProjectV2ResponseData>() {
           @Override
           public void write(JsonWriter out, QueryProjectV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryProjectV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryProjectV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryProjectV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to QueryProjectV2ResponseData
  */
  public static QueryProjectV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryProjectV2ResponseData.class);
  }

 /**
  * Convert an instance of QueryProjectV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

