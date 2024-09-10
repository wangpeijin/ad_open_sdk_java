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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 分页
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class StarComponentQueryLinkV2ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount = null;

  public StarComponentQueryLinkV2ResponseDataPageInfo() {
  }

  public StarComponentQueryLinkV2ResponseDataPageInfo limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * 数量
   * @return limit
  **/
  @javax.annotation.Nullable
  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public StarComponentQueryLinkV2ResponseDataPageInfo page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页码
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public StarComponentQueryLinkV2ResponseDataPageInfo totalCount(Long totalCount) {
    
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
    StarComponentQueryLinkV2ResponseDataPageInfo starComponentQueryLinkV2ResponseDataPageInfo = (StarComponentQueryLinkV2ResponseDataPageInfo) o;
    return Objects.equals(this.limit, starComponentQueryLinkV2ResponseDataPageInfo.limit) &&
        Objects.equals(this.page, starComponentQueryLinkV2ResponseDataPageInfo.page) &&
        Objects.equals(this.totalCount, starComponentQueryLinkV2ResponseDataPageInfo.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, page, totalCount);
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
    sb.append("class StarComponentQueryLinkV2ResponseDataPageInfo {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("page");
    openapiFields.add("total_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentQueryLinkV2ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentQueryLinkV2ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentQueryLinkV2ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentQueryLinkV2ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentQueryLinkV2ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, StarComponentQueryLinkV2ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentQueryLinkV2ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentQueryLinkV2ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentQueryLinkV2ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to StarComponentQueryLinkV2ResponseDataPageInfo
  */
  public static StarComponentQueryLinkV2ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentQueryLinkV2ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of StarComponentQueryLinkV2ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

