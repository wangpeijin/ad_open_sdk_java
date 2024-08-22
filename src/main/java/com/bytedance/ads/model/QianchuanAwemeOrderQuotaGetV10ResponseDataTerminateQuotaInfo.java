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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo {
  public static final String SERIALIZED_NAME_TERMINATE_QUOTA_SUM = "terminate_quota_sum";
  @SerializedName(SERIALIZED_NAME_TERMINATE_QUOTA_SUM)
  private Long terminateQuotaSum = null;

  public static final String SERIALIZED_NAME_TERMINATE_QUOTA_USED = "terminate_quota_used";
  @SerializedName(SERIALIZED_NAME_TERMINATE_QUOTA_USED)
  private Long terminateQuotaUsed = null;

  public QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo() {
  }

  public QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo terminateQuotaSum(Long terminateQuotaSum) {
    
    this.terminateQuotaSum = terminateQuotaSum;
    return this;
  }

   /**
   * 
   * @return terminateQuotaSum
  **/
  @javax.annotation.Nullable
  public Long getTerminateQuotaSum() {
    return terminateQuotaSum;
  }


  public void setTerminateQuotaSum(Long terminateQuotaSum) {
    this.terminateQuotaSum = terminateQuotaSum;
  }


  public QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo terminateQuotaUsed(Long terminateQuotaUsed) {
    
    this.terminateQuotaUsed = terminateQuotaUsed;
    return this;
  }

   /**
   * 
   * @return terminateQuotaUsed
  **/
  @javax.annotation.Nullable
  public Long getTerminateQuotaUsed() {
    return terminateQuotaUsed;
  }


  public void setTerminateQuotaUsed(Long terminateQuotaUsed) {
    this.terminateQuotaUsed = terminateQuotaUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo qianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo = (QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo) o;
    return Objects.equals(this.terminateQuotaSum, qianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo.terminateQuotaSum) &&
        Objects.equals(this.terminateQuotaUsed, qianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo.terminateQuotaUsed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminateQuotaSum, terminateQuotaUsed);
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
    sb.append("class QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo {\n");
    sb.append("    terminateQuotaSum: ").append(toIndentedString(terminateQuotaSum)).append("\n");
    sb.append("    terminateQuotaUsed: ").append(toIndentedString(terminateQuotaUsed)).append("\n");
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
    openapiFields.add("terminate_quota_sum");
    openapiFields.add("terminate_quota_used");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo
  */
  public static QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderQuotaGetV10ResponseDataTerminateQuotaInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

