/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class QianchuanAwemeAuthListGetV10ResponseData {
  public static final String SERIALIZED_NAME_AUTHORIZATION_INFOS = "authorization_infos";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_INFOS)
  private List<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner> authorizationInfos = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAwemeAuthListGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAwemeAuthListGetV10ResponseData() {
  }

  public QianchuanAwemeAuthListGetV10ResponseData authorizationInfos(List<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner> authorizationInfos) {
    
    this.authorizationInfos = authorizationInfos;
    return this;
  }

  public QianchuanAwemeAuthListGetV10ResponseData addAuthorizationInfosItem(QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner authorizationInfosItem) {
    if (this.authorizationInfos == null) {
      this.authorizationInfos = new ArrayList<>();
    }
    this.authorizationInfos.add(authorizationInfosItem);
    return this;
  }

   /**
   * 
   * @return authorizationInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner> getAuthorizationInfos() {
    return authorizationInfos;
  }


  public void setAuthorizationInfos(List<QianchuanAwemeAuthListGetV10ResponseDataAuthorizationInfosInner> authorizationInfos) {
    this.authorizationInfos = authorizationInfos;
  }


  public QianchuanAwemeAuthListGetV10ResponseData pageInfo(QianchuanAwemeAuthListGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAwemeAuthListGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanAwemeAuthListGetV10ResponseData qianchuanAwemeAuthListGetV10ResponseData = (QianchuanAwemeAuthListGetV10ResponseData) o;
    return Objects.equals(this.authorizationInfos, qianchuanAwemeAuthListGetV10ResponseData.authorizationInfos) &&
        Objects.equals(this.pageInfo, qianchuanAwemeAuthListGetV10ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationInfos, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeAuthListGetV10ResponseData {\n");
    sb.append("    authorizationInfos: ").append(toIndentedString(authorizationInfos)).append("\n");
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
    openapiFields.add("authorization_infos");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authorization_infos");
    openapiRequiredFields.add("page_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthListGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthListGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthListGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthListGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthListGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthListGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthListGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthListGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthListGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthListGetV10ResponseData
  */
  public static QianchuanAwemeAuthListGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthListGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthListGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

