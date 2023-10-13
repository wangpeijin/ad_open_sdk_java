/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner;
import com.bytedance.ads.model.QianchuanUniAwemeAuthorizedGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class QianchuanUniAwemeAuthorizedGetV10ResponseData {
  public static final String SERIALIZED_NAME_AWEME_ID_LIST = "aweme_id_list";
  @SerializedName(SERIALIZED_NAME_AWEME_ID_LIST)
  private List<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanUniAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanUniAwemeAuthorizedGetV10ResponseData() {
  }

  public QianchuanUniAwemeAuthorizedGetV10ResponseData awemeIdList(List<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList) {
    
    this.awemeIdList = awemeIdList;
    return this;
  }

  public QianchuanUniAwemeAuthorizedGetV10ResponseData addAwemeIdListItem(QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeIdListItem) {
    if (this.awemeIdList == null) {
      this.awemeIdList = new ArrayList<>();
    }
    this.awemeIdList.add(awemeIdListItem);
    return this;
  }

   /**
   * 
   * @return awemeIdList
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> getAwemeIdList() {
    return awemeIdList;
  }


  public void setAwemeIdList(List<QianchuanUniAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList) {
    this.awemeIdList = awemeIdList;
  }


  public QianchuanUniAwemeAuthorizedGetV10ResponseData pageInfo(QianchuanUniAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAuthorizedGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanUniAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanUniAwemeAuthorizedGetV10ResponseData qianchuanUniAwemeAuthorizedGetV10ResponseData = (QianchuanUniAwemeAuthorizedGetV10ResponseData) o;
    return Objects.equals(this.awemeIdList, qianchuanUniAwemeAuthorizedGetV10ResponseData.awemeIdList) &&
        Objects.equals(this.pageInfo, qianchuanUniAwemeAuthorizedGetV10ResponseData.pageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeIdList, pageInfo);
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
    sb.append("class QianchuanUniAwemeAuthorizedGetV10ResponseData {\n");
    sb.append("    awemeIdList: ").append(toIndentedString(awemeIdList)).append("\n");
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
    openapiFields.add("aweme_id_list");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAuthorizedGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAuthorizedGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAuthorizedGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAuthorizedGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAuthorizedGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAuthorizedGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAuthorizedGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAuthorizedGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAuthorizedGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAuthorizedGetV10ResponseData
  */
  public static QianchuanUniAwemeAuthorizedGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAuthorizedGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAuthorizedGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

