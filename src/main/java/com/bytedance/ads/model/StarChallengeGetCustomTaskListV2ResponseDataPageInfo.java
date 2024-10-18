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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarChallengeGetCustomTaskListV2ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public StarChallengeGetCustomTaskListV2ResponseDataPageInfo() {
  }

  public StarChallengeGetCustomTaskListV2ResponseDataPageInfo page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public StarChallengeGetCustomTaskListV2ResponseDataPageInfo pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public StarChallengeGetCustomTaskListV2ResponseDataPageInfo totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 总量
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeGetCustomTaskListV2ResponseDataPageInfo starChallengeGetCustomTaskListV2ResponseDataPageInfo = (StarChallengeGetCustomTaskListV2ResponseDataPageInfo) o;
    return Objects.equals(this.page, starChallengeGetCustomTaskListV2ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, starChallengeGetCustomTaskListV2ResponseDataPageInfo.pageSize) &&
        Objects.equals(this.totalCount, starChallengeGetCustomTaskListV2ResponseDataPageInfo.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeGetCustomTaskListV2ResponseDataPageInfo {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
    openapiRequiredFields.add("total_count");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeGetCustomTaskListV2ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeGetCustomTaskListV2ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeGetCustomTaskListV2ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeGetCustomTaskListV2ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeGetCustomTaskListV2ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeGetCustomTaskListV2ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeGetCustomTaskListV2ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeGetCustomTaskListV2ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeGetCustomTaskListV2ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeGetCustomTaskListV2ResponseDataPageInfo
  */
  public static StarChallengeGetCustomTaskListV2ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeGetCustomTaskListV2ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of StarChallengeGetCustomTaskListV2ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

