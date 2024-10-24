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
import com.bytedance.ads.model.QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner;
import com.bytedance.ads.model.QianchuanAwemeAuthorizedGetV10ResponseDataPageInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanAwemeAuthorizedGetV10ResponseData {
  public static final String SERIALIZED_NAME_AWEME_ID_LIST = "aweme_id_list";
  @SerializedName(SERIALIZED_NAME_AWEME_ID_LIST)
  private List<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private QianchuanAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo = null;

  public QianchuanAwemeAuthorizedGetV10ResponseData() {
  }

  public QianchuanAwemeAuthorizedGetV10ResponseData awemeIdList(List<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList) {
    
    this.awemeIdList = awemeIdList;
    return this;
  }

  public QianchuanAwemeAuthorizedGetV10ResponseData addAwemeIdListItem(QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeIdListItem) {
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
  public List<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> getAwemeIdList() {
    return awemeIdList;
  }


  public void setAwemeIdList(List<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> awemeIdList) {
    this.awemeIdList = awemeIdList;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseData pageInfo(QianchuanAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthorizedGetV10ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(QianchuanAwemeAuthorizedGetV10ResponseDataPageInfo pageInfo) {
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
    QianchuanAwemeAuthorizedGetV10ResponseData qianchuanAwemeAuthorizedGetV10ResponseData = (QianchuanAwemeAuthorizedGetV10ResponseData) o;
    return Objects.equals(this.awemeIdList, qianchuanAwemeAuthorizedGetV10ResponseData.awemeIdList) &&
        Objects.equals(this.pageInfo, qianchuanAwemeAuthorizedGetV10ResponseData.pageInfo);
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
    sb.append("class QianchuanAwemeAuthorizedGetV10ResponseData {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthorizedGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthorizedGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthorizedGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthorizedGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthorizedGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthorizedGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthorizedGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthorizedGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthorizedGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthorizedGetV10ResponseData
  */
  public static QianchuanAwemeAuthorizedGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthorizedGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthorizedGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

