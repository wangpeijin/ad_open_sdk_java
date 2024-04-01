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
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataListInner;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataPageInfo;
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
public class QianchuanAwemeOrderGetV10ResponseData {
  public static final String SERIALIZED_NAME_FAIL_LIST = "fail_list";
  @SerializedName(SERIALIZED_NAME_FAIL_LIST)
  private List<Long> failList = null;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<QianchuanAwemeOrderGetV10ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAwemeOrderGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAwemeOrderGetV10ResponseData() {
  }

  public QianchuanAwemeOrderGetV10ResponseData failList(List<Long> failList) {
    
    this.failList = failList;
    return this;
  }

  public QianchuanAwemeOrderGetV10ResponseData addFailListItem(Long failListItem) {
    if (this.failList == null) {
      this.failList = new ArrayList<>();
    }
    this.failList.add(failListItem);
    return this;
  }

   /**
   * 获取失败的订单id列表
   * @return failList
  **/
  @javax.annotation.Nullable
  public List<Long> getFailList() {
    return failList;
  }


  public void setFailList(List<Long> failList) {
    this.failList = failList;
  }


  public QianchuanAwemeOrderGetV10ResponseData _list(List<QianchuanAwemeOrderGetV10ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public QianchuanAwemeOrderGetV10ResponseData addListItem(QianchuanAwemeOrderGetV10ResponseDataListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * 
   * @return _list
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeOrderGetV10ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<QianchuanAwemeOrderGetV10ResponseDataListInner> _list) {
    this._list = _list;
  }


  public QianchuanAwemeOrderGetV10ResponseData pageInfo(QianchuanAwemeOrderGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAwemeOrderGetV10ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderGetV10ResponseData qianchuanAwemeOrderGetV10ResponseData = (QianchuanAwemeOrderGetV10ResponseData) o;
    return Objects.equals(this.failList, qianchuanAwemeOrderGetV10ResponseData.failList) &&
        Objects.equals(this._list, qianchuanAwemeOrderGetV10ResponseData._list) &&
        Objects.equals(this.pageInfo, qianchuanAwemeOrderGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failList, _list, pageInfo);
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
    sb.append("class QianchuanAwemeOrderGetV10ResponseData {\n");
    sb.append("    failList: ").append(toIndentedString(failList)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("fail_list");
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderGetV10ResponseData
  */
  public static QianchuanAwemeOrderGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

