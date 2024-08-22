/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanKeywordCheckV10ResponseDataFailListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanKeywordCheckV10ResponseData {
  public static final String SERIALIZED_NAME_FAIL_LIST = "fail_list";
  @SerializedName(SERIALIZED_NAME_FAIL_LIST)
  private List<QianchuanKeywordCheckV10ResponseDataFailListInner> failList = null;

  public static final String SERIALIZED_NAME_SUC_LIST = "suc_list";
  @SerializedName(SERIALIZED_NAME_SUC_LIST)
  private List<String> sucList = null;

  public QianchuanKeywordCheckV10ResponseData() {
  }

  public QianchuanKeywordCheckV10ResponseData failList(List<QianchuanKeywordCheckV10ResponseDataFailListInner> failList) {
    
    this.failList = failList;
    return this;
  }

  public QianchuanKeywordCheckV10ResponseData addFailListItem(QianchuanKeywordCheckV10ResponseDataFailListInner failListItem) {
    if (this.failList == null) {
      this.failList = new ArrayList<>();
    }
    this.failList.add(failListItem);
    return this;
  }

   /**
   * 
   * @return failList
  **/
  @javax.annotation.Nullable
  public List<QianchuanKeywordCheckV10ResponseDataFailListInner> getFailList() {
    return failList;
  }


  public void setFailList(List<QianchuanKeywordCheckV10ResponseDataFailListInner> failList) {
    this.failList = failList;
  }


  public QianchuanKeywordCheckV10ResponseData sucList(List<String> sucList) {
    
    this.sucList = sucList;
    return this;
  }

  public QianchuanKeywordCheckV10ResponseData addSucListItem(String sucListItem) {
    if (this.sucList == null) {
      this.sucList = new ArrayList<>();
    }
    this.sucList.add(sucListItem);
    return this;
  }

   /**
   * 
   * @return sucList
  **/
  @javax.annotation.Nullable
  public List<String> getSucList() {
    return sucList;
  }


  public void setSucList(List<String> sucList) {
    this.sucList = sucList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanKeywordCheckV10ResponseData qianchuanKeywordCheckV10ResponseData = (QianchuanKeywordCheckV10ResponseData) o;
    return Objects.equals(this.failList, qianchuanKeywordCheckV10ResponseData.failList) &&
        Objects.equals(this.sucList, qianchuanKeywordCheckV10ResponseData.sucList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failList, sucList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanKeywordCheckV10ResponseData {\n");
    sb.append("    failList: ").append(toIndentedString(failList)).append("\n");
    sb.append("    sucList: ").append(toIndentedString(sucList)).append("\n");
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
    openapiFields.add("suc_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fail_list");
    openapiRequiredFields.add("suc_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanKeywordCheckV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanKeywordCheckV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanKeywordCheckV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanKeywordCheckV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanKeywordCheckV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanKeywordCheckV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanKeywordCheckV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanKeywordCheckV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanKeywordCheckV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanKeywordCheckV10ResponseData
  */
  public static QianchuanKeywordCheckV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanKeywordCheckV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanKeywordCheckV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

