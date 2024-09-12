/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCompensateStatusGetV10DataListCompensateStatus;
import com.bytedance.ads.model.QianchuanAdCompensateStatusGetV10DataListStatus;
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
 * QianchuanAdCompensateStatusGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class QianchuanAdCompensateStatusGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_COMPENSATE_STATUS = "compensate_status";
  @SerializedName(SERIALIZED_NAME_COMPENSATE_STATUS)
  private QianchuanAdCompensateStatusGetV10DataListCompensateStatus compensateStatus = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAdCompensateStatusGetV10DataListStatus status = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public QianchuanAdCompensateStatusGetV10ResponseDataListInner() {
  }

  public QianchuanAdCompensateStatusGetV10ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdCompensateStatusGetV10ResponseDataListInner compensateStatus(QianchuanAdCompensateStatusGetV10DataListCompensateStatus compensateStatus) {
    
    this.compensateStatus = compensateStatus;
    return this;
  }

   /**
   * Get compensateStatus
   * @return compensateStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAdCompensateStatusGetV10DataListCompensateStatus getCompensateStatus() {
    return compensateStatus;
  }


  public void setCompensateStatus(QianchuanAdCompensateStatusGetV10DataListCompensateStatus compensateStatus) {
    this.compensateStatus = compensateStatus;
  }


  public QianchuanAdCompensateStatusGetV10ResponseDataListInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public QianchuanAdCompensateStatusGetV10ResponseDataListInner status(QianchuanAdCompensateStatusGetV10DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAdCompensateStatusGetV10DataListStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAdCompensateStatusGetV10DataListStatus status) {
    this.status = status;
  }


  public QianchuanAdCompensateStatusGetV10ResponseDataListInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCompensateStatusGetV10ResponseDataListInner qianchuanAdCompensateStatusGetV10ResponseDataListInner = (QianchuanAdCompensateStatusGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanAdCompensateStatusGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.compensateStatus, qianchuanAdCompensateStatusGetV10ResponseDataListInner.compensateStatus) &&
        Objects.equals(this.reason, qianchuanAdCompensateStatusGetV10ResponseDataListInner.reason) &&
        Objects.equals(this.status, qianchuanAdCompensateStatusGetV10ResponseDataListInner.status) &&
        Objects.equals(this.url, qianchuanAdCompensateStatusGetV10ResponseDataListInner.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, compensateStatus, reason, status, url);
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
    sb.append("class QianchuanAdCompensateStatusGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    compensateStatus: ").append(toIndentedString(compensateStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("compensate_status");
    openapiFields.add("reason");
    openapiFields.add("status");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCompensateStatusGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCompensateStatusGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCompensateStatusGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCompensateStatusGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCompensateStatusGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCompensateStatusGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCompensateStatusGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCompensateStatusGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCompensateStatusGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCompensateStatusGetV10ResponseDataListInner
  */
  public static QianchuanAdCompensateStatusGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCompensateStatusGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCompensateStatusGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

