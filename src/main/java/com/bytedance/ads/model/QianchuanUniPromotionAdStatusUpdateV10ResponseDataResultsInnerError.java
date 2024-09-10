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
import java.util.HashMap;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError {
  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Long errorCode = null;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, String> extra = null;

  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError() {
  }

  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError errorCode(Long errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 
   * @return errorCode
  **/
  @javax.annotation.Nullable
  public Long getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }


  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError extra(Map<String, String> extra) {
    
    this.extra = extra;
    return this;
  }

  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError putExtraItem(String key, String extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * 
   * @return extra
  **/
  @javax.annotation.Nullable
  public Map<String, String> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, String> extra) {
    this.extra = extra;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError = (QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError) o;
    return Objects.equals(this.errorCode, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.errorCode) &&
        Objects.equals(this.errorMessage, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.errorMessage) &&
        Objects.equals(this.extra, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.extra);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, extra);
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
    sb.append("class QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
    openapiFields.add("error_code");
    openapiFields.add("error_message");
    openapiFields.add("extra");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError
  */
  public static QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

