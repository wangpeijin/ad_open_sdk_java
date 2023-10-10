/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner;
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
 * QianchuanAdCreateV10ResponseDataNoticeInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanAdCreateV10ResponseDataNoticeInfosInner {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message = null;

  public static final String SERIALIZED_NAME_SEARCH_KEYWORD_ERROR = "search_keyword_error";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEYWORD_ERROR)
  private List<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner> searchKeywordError = null;

  public QianchuanAdCreateV10ResponseDataNoticeInfosInner() {
  }

  public QianchuanAdCreateV10ResponseDataNoticeInfosInner code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public QianchuanAdCreateV10ResponseDataNoticeInfosInner message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public QianchuanAdCreateV10ResponseDataNoticeInfosInner searchKeywordError(List<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner> searchKeywordError) {
    
    this.searchKeywordError = searchKeywordError;
    return this;
  }

  public QianchuanAdCreateV10ResponseDataNoticeInfosInner addSearchKeywordErrorItem(QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner searchKeywordErrorItem) {
    if (this.searchKeywordError == null) {
      this.searchKeywordError = new ArrayList<>();
    }
    this.searchKeywordError.add(searchKeywordErrorItem);
    return this;
  }

   /**
   * 
   * @return searchKeywordError
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner> getSearchKeywordError() {
    return searchKeywordError;
  }


  public void setSearchKeywordError(List<QianchuanAdCreateV10ResponseDataNoticeInfosInnerSearchKeywordErrorInner> searchKeywordError) {
    this.searchKeywordError = searchKeywordError;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10ResponseDataNoticeInfosInner qianchuanAdCreateV10ResponseDataNoticeInfosInner = (QianchuanAdCreateV10ResponseDataNoticeInfosInner) o;
    return Objects.equals(this.code, qianchuanAdCreateV10ResponseDataNoticeInfosInner.code) &&
        Objects.equals(this.message, qianchuanAdCreateV10ResponseDataNoticeInfosInner.message) &&
        Objects.equals(this.searchKeywordError, qianchuanAdCreateV10ResponseDataNoticeInfosInner.searchKeywordError);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, searchKeywordError);
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
    sb.append("class QianchuanAdCreateV10ResponseDataNoticeInfosInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    searchKeywordError: ").append(toIndentedString(searchKeywordError)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("search_keyword_error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10ResponseDataNoticeInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10ResponseDataNoticeInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10ResponseDataNoticeInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10ResponseDataNoticeInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10ResponseDataNoticeInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10ResponseDataNoticeInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10ResponseDataNoticeInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10ResponseDataNoticeInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10ResponseDataNoticeInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10ResponseDataNoticeInfosInner
  */
  public static QianchuanAdCreateV10ResponseDataNoticeInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10ResponseDataNoticeInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10ResponseDataNoticeInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
