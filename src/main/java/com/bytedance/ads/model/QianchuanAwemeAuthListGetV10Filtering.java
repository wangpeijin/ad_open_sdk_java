/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10FilteringAuthRange;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10FilteringAuthStatus;
import com.bytedance.ads.model.QianchuanAwemeAuthListGetV10FilteringAuthType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QianchuanAwemeAuthListGetV10Filtering {
  public static final String SERIALIZED_NAME_AUTH_RANGE = "auth_range";
  @SerializedName(SERIALIZED_NAME_AUTH_RANGE)
  private QianchuanAwemeAuthListGetV10FilteringAuthRange authRange = null;

  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private QianchuanAwemeAuthListGetV10FilteringAuthStatus authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private QianchuanAwemeAuthListGetV10FilteringAuthType authType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private List<Long> awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_SHOW_ID = "aweme_show_id";
  @SerializedName(SERIALIZED_NAME_AWEME_SHOW_ID)
  private List<String> awemeShowId = null;

  public static final String SERIALIZED_NAME_IS_CANCELLATION_PROGRESS = "is_cancellation_progress";
  @SerializedName(SERIALIZED_NAME_IS_CANCELLATION_PROGRESS)
  private Boolean isCancellationProgress = null;

  public QianchuanAwemeAuthListGetV10Filtering() {
  }

  public QianchuanAwemeAuthListGetV10Filtering authRange(QianchuanAwemeAuthListGetV10FilteringAuthRange authRange) {
    
    this.authRange = authRange;
    return this;
  }

   /**
   * Get authRange
   * @return authRange
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10FilteringAuthRange getAuthRange() {
    return authRange;
  }


  public void setAuthRange(QianchuanAwemeAuthListGetV10FilteringAuthRange authRange) {
    this.authRange = authRange;
  }


  public QianchuanAwemeAuthListGetV10Filtering authStatus(QianchuanAwemeAuthListGetV10FilteringAuthStatus authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10FilteringAuthStatus getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(QianchuanAwemeAuthListGetV10FilteringAuthStatus authStatus) {
    this.authStatus = authStatus;
  }


  public QianchuanAwemeAuthListGetV10Filtering authType(QianchuanAwemeAuthListGetV10FilteringAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthListGetV10FilteringAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(QianchuanAwemeAuthListGetV10FilteringAuthType authType) {
    this.authType = authType;
  }


  public QianchuanAwemeAuthListGetV10Filtering awemeId(List<Long> awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

  public QianchuanAwemeAuthListGetV10Filtering addAwemeIdItem(Long awemeIdItem) {
    if (this.awemeId == null) {
      this.awemeId = new ArrayList<>();
    }
    this.awemeId.add(awemeIdItem);
    return this;
  }

   /**
   * AwemeID 筛选
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(List<Long> awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAwemeAuthListGetV10Filtering awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public QianchuanAwemeAuthListGetV10Filtering awemeShowId(List<String> awemeShowId) {
    
    this.awemeShowId = awemeShowId;
    return this;
  }

  public QianchuanAwemeAuthListGetV10Filtering addAwemeShowIdItem(String awemeShowIdItem) {
    if (this.awemeShowId == null) {
      this.awemeShowId = new ArrayList<>();
    }
    this.awemeShowId.add(awemeShowIdItem);
    return this;
  }

   /**
   * 
   * @return awemeShowId
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeShowId() {
    return awemeShowId;
  }


  public void setAwemeShowId(List<String> awemeShowId) {
    this.awemeShowId = awemeShowId;
  }


  public QianchuanAwemeAuthListGetV10Filtering isCancellationProgress(Boolean isCancellationProgress) {
    
    this.isCancellationProgress = isCancellationProgress;
    return this;
  }

   /**
   * 只需要待达人确认解除授权
   * @return isCancellationProgress
  **/
  @javax.annotation.Nullable
  public Boolean getIsCancellationProgress() {
    return isCancellationProgress;
  }


  public void setIsCancellationProgress(Boolean isCancellationProgress) {
    this.isCancellationProgress = isCancellationProgress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeAuthListGetV10Filtering qianchuanAwemeAuthListGetV10Filtering = (QianchuanAwemeAuthListGetV10Filtering) o;
    return Objects.equals(this.authRange, qianchuanAwemeAuthListGetV10Filtering.authRange) &&
        Objects.equals(this.authStatus, qianchuanAwemeAuthListGetV10Filtering.authStatus) &&
        Objects.equals(this.authType, qianchuanAwemeAuthListGetV10Filtering.authType) &&
        Objects.equals(this.awemeId, qianchuanAwemeAuthListGetV10Filtering.awemeId) &&
        Objects.equals(this.awemeName, qianchuanAwemeAuthListGetV10Filtering.awemeName) &&
        Objects.equals(this.awemeShowId, qianchuanAwemeAuthListGetV10Filtering.awemeShowId) &&
        Objects.equals(this.isCancellationProgress, qianchuanAwemeAuthListGetV10Filtering.isCancellationProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authRange, authStatus, authType, awemeId, awemeName, awemeShowId, isCancellationProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeAuthListGetV10Filtering {\n");
    sb.append("    authRange: ").append(toIndentedString(authRange)).append("\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeShowId: ").append(toIndentedString(awemeShowId)).append("\n");
    sb.append("    isCancellationProgress: ").append(toIndentedString(isCancellationProgress)).append("\n");
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
    openapiFields.add("auth_range");
    openapiFields.add("auth_status");
    openapiFields.add("auth_type");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_show_id");
    openapiFields.add("is_cancellation_progress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthListGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthListGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthListGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthListGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthListGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthListGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthListGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthListGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthListGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthListGetV10Filtering
  */
  public static QianchuanAwemeAuthListGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthListGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthListGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

