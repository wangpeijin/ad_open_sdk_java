/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanImageGetV10ResponseDataListInner;
import com.bytedance.ads.model.QianchuanImageGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class QianchuanImageGetV10ResponseData {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private List<QianchuanImageGetV10ResponseDataListInner> _list = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanImageGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanImageGetV10ResponseData() {
  }

  public QianchuanImageGetV10ResponseData _list(List<QianchuanImageGetV10ResponseDataListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public QianchuanImageGetV10ResponseData addListItem(QianchuanImageGetV10ResponseDataListInner _listItem) {
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
  public List<QianchuanImageGetV10ResponseDataListInner> getList() {
    return _list;
  }


  public void setList(List<QianchuanImageGetV10ResponseDataListInner> _list) {
    this._list = _list;
  }


  public QianchuanImageGetV10ResponseData pageInfo(QianchuanImageGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanImageGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanImageGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanImageGetV10ResponseData qianchuanImageGetV10ResponseData = (QianchuanImageGetV10ResponseData) o;
    return Objects.equals(this._list, qianchuanImageGetV10ResponseData._list) &&
        Objects.equals(this.pageInfo, qianchuanImageGetV10ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanImageGetV10ResponseData {\n");
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
    openapiFields.add("list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("list");
    openapiRequiredFields.add("page_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanImageGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanImageGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanImageGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanImageGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanImageGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanImageGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanImageGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanImageGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanImageGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanImageGetV10ResponseData
  */
  public static QianchuanImageGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanImageGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanImageGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

