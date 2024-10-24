/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "total_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Integer totalPage = null;

  public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo() {
  }

  public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @javax.annotation.Nullable
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo totalNum(Integer totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 
   * @return totalNum
  **/
  @javax.annotation.Nullable
  public Integer getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }


  public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo totalPage(Integer totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * 
   * @return totalPage
  **/
  @javax.annotation.Nullable
  public Integer getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Integer totalPage) {
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
    QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo qianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo = (QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo) o;
    return Objects.equals(this.page, qianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, qianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.pageSize) &&
        Objects.equals(this.totalNum, qianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.totalNum) &&
        Objects.equals(this.totalPage, qianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.totalPage);
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
    sb.append("class QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo {\n");
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
       if (!QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo
  */
  public static QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of QianchuanTodayLiveRoomProductListGetV10ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

