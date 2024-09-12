/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class QianchuanAwemeAuthListGetV10ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Long totalNum = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "total_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Long totalPage = null;

  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo() {
  }

  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo page(Long page) {
    
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


  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo pageSize(Long pageSize) {
    
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


  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Long getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }


  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo totalPage(Long totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * 
   * @return totalPage
  **/
  @javax.annotation.Nullable
  public Long getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeAuthListGetV10ResponseDataPageInfo qianchuanAwemeAuthListGetV10ResponseDataPageInfo = (QianchuanAwemeAuthListGetV10ResponseDataPageInfo) o;
    return Objects.equals(this.page, qianchuanAwemeAuthListGetV10ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, qianchuanAwemeAuthListGetV10ResponseDataPageInfo.pageSize) &&
        Objects.equals(this.totalNum, qianchuanAwemeAuthListGetV10ResponseDataPageInfo.totalNum) &&
        Objects.equals(this.totalPage, qianchuanAwemeAuthListGetV10ResponseDataPageInfo.totalPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalNum, totalPage);
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
    sb.append("class QianchuanAwemeAuthListGetV10ResponseDataPageInfo {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
    openapiFields.add("total_num");
    openapiFields.add("total_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthListGetV10ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthListGetV10ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthListGetV10ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthListGetV10ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthListGetV10ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthListGetV10ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthListGetV10ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthListGetV10ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthListGetV10ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthListGetV10ResponseDataPageInfo
  */
  public static QianchuanAwemeAuthListGetV10ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthListGetV10ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthListGetV10ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

