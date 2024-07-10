/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus;
import com.bytedance.ads.model.QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType;
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
 * QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner {
  public static final String SERIALIZED_NAME_AWEME_AVATAR = "aweme_avatar";
  @SerializedName(SERIALIZED_NAME_AWEME_AVATAR)
  private String awemeAvatar = null;

  public static final String SERIALIZED_NAME_AWEME_HAS_LIVE_PERMISSION = "aweme_has_live_permission";
  @SerializedName(SERIALIZED_NAME_AWEME_HAS_LIVE_PERMISSION)
  private Boolean awemeHasLivePermission = null;

  public static final String SERIALIZED_NAME_AWEME_HAS_PUBLISH_PERMISSION = "aweme_has_publish_permission";
  @SerializedName(SERIALIZED_NAME_AWEME_HAS_PUBLISH_PERMISSION)
  private Boolean awemeHasPublishPermission = null;

  public static final String SERIALIZED_NAME_AWEME_HAS_UNI_PROM = "aweme_has_uni_prom";
  @SerializedName(SERIALIZED_NAME_AWEME_HAS_UNI_PROM)
  private Boolean awemeHasUniProm = null;

  public static final String SERIALIZED_NAME_AWEME_HAS_VIDEO_PERMISSION = "aweme_has_video_permission";
  @SerializedName(SERIALIZED_NAME_AWEME_HAS_VIDEO_PERMISSION)
  private Boolean awemeHasVideoPermission = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_AWEME_SHOW_ID = "aweme_show_id";
  @SerializedName(SERIALIZED_NAME_AWEME_SHOW_ID)
  private String awemeShowId = null;

  public static final String SERIALIZED_NAME_AWEME_STATUS = "aweme_status";
  @SerializedName(SERIALIZED_NAME_AWEME_STATUS)
  private QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus awemeStatus = null;

  public static final String SERIALIZED_NAME_BIND_TYPE = "bind_type";
  @SerializedName(SERIALIZED_NAME_BIND_TYPE)
  private List<QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType> bindType = null;

  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner() {
  }

  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeAvatar(String awemeAvatar) {
    
    this.awemeAvatar = awemeAvatar;
    return this;
  }

   /**
   * 
   * @return awemeAvatar
  **/
  @javax.annotation.Nullable
  public String getAwemeAvatar() {
    return awemeAvatar;
  }


  public void setAwemeAvatar(String awemeAvatar) {
    this.awemeAvatar = awemeAvatar;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeHasLivePermission(Boolean awemeHasLivePermission) {
    
    this.awemeHasLivePermission = awemeHasLivePermission;
    return this;
  }

   /**
   * 
   * @return awemeHasLivePermission
  **/
  @javax.annotation.Nullable
  public Boolean getAwemeHasLivePermission() {
    return awemeHasLivePermission;
  }


  public void setAwemeHasLivePermission(Boolean awemeHasLivePermission) {
    this.awemeHasLivePermission = awemeHasLivePermission;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeHasPublishPermission(Boolean awemeHasPublishPermission) {
    
    this.awemeHasPublishPermission = awemeHasPublishPermission;
    return this;
  }

   /**
   * 
   * @return awemeHasPublishPermission
  **/
  @javax.annotation.Nullable
  public Boolean getAwemeHasPublishPermission() {
    return awemeHasPublishPermission;
  }


  public void setAwemeHasPublishPermission(Boolean awemeHasPublishPermission) {
    this.awemeHasPublishPermission = awemeHasPublishPermission;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeHasUniProm(Boolean awemeHasUniProm) {
    
    this.awemeHasUniProm = awemeHasUniProm;
    return this;
  }

   /**
   * 
   * @return awemeHasUniProm
  **/
  @javax.annotation.Nullable
  public Boolean getAwemeHasUniProm() {
    return awemeHasUniProm;
  }


  public void setAwemeHasUniProm(Boolean awemeHasUniProm) {
    this.awemeHasUniProm = awemeHasUniProm;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeHasVideoPermission(Boolean awemeHasVideoPermission) {
    
    this.awemeHasVideoPermission = awemeHasVideoPermission;
    return this;
  }

   /**
   * 
   * @return awemeHasVideoPermission
  **/
  @javax.annotation.Nullable
  public Boolean getAwemeHasVideoPermission() {
    return awemeHasVideoPermission;
  }


  public void setAwemeHasVideoPermission(Boolean awemeHasVideoPermission) {
    this.awemeHasVideoPermission = awemeHasVideoPermission;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeName(String awemeName) {
    
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


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeShowId(String awemeShowId) {
    
    this.awemeShowId = awemeShowId;
    return this;
  }

   /**
   * 
   * @return awemeShowId
  **/
  @javax.annotation.Nullable
  public String getAwemeShowId() {
    return awemeShowId;
  }


  public void setAwemeShowId(String awemeShowId) {
    this.awemeShowId = awemeShowId;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner awemeStatus(QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus awemeStatus) {
    
    this.awemeStatus = awemeStatus;
    return this;
  }

   /**
   * Get awemeStatus
   * @return awemeStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus getAwemeStatus() {
    return awemeStatus;
  }


  public void setAwemeStatus(QianchuanAwemeAuthorizedGetV10DataAwemeIdListAwemeStatus awemeStatus) {
    this.awemeStatus = awemeStatus;
  }


  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner bindType(List<QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType> bindType) {
    
    this.bindType = bindType;
    return this;
  }

  public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner addBindTypeItem(QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType bindTypeItem) {
    if (this.bindType == null) {
      this.bindType = new ArrayList<>();
    }
    this.bindType.add(bindTypeItem);
    return this;
  }

   /**
   * 
   * @return bindType
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType> getBindType() {
    return bindType;
  }


  public void setBindType(List<QianchuanAwemeAuthorizedGetV10DataAwemeIdListBindType> bindType) {
    this.bindType = bindType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner = (QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner) o;
    return Objects.equals(this.awemeAvatar, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeAvatar) &&
        Objects.equals(this.awemeHasLivePermission, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeHasLivePermission) &&
        Objects.equals(this.awemeHasPublishPermission, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeHasPublishPermission) &&
        Objects.equals(this.awemeHasUniProm, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeHasUniProm) &&
        Objects.equals(this.awemeHasVideoPermission, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeHasVideoPermission) &&
        Objects.equals(this.awemeId, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeId) &&
        Objects.equals(this.awemeName, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeName) &&
        Objects.equals(this.awemeShowId, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeShowId) &&
        Objects.equals(this.awemeStatus, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.awemeStatus) &&
        Objects.equals(this.bindType, qianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.bindType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeAvatar, awemeHasLivePermission, awemeHasPublishPermission, awemeHasUniProm, awemeHasVideoPermission, awemeId, awemeName, awemeShowId, awemeStatus, bindType);
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
    sb.append("class QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner {\n");
    sb.append("    awemeAvatar: ").append(toIndentedString(awemeAvatar)).append("\n");
    sb.append("    awemeHasLivePermission: ").append(toIndentedString(awemeHasLivePermission)).append("\n");
    sb.append("    awemeHasPublishPermission: ").append(toIndentedString(awemeHasPublishPermission)).append("\n");
    sb.append("    awemeHasUniProm: ").append(toIndentedString(awemeHasUniProm)).append("\n");
    sb.append("    awemeHasVideoPermission: ").append(toIndentedString(awemeHasVideoPermission)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    awemeShowId: ").append(toIndentedString(awemeShowId)).append("\n");
    sb.append("    awemeStatus: ").append(toIndentedString(awemeStatus)).append("\n");
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
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
    openapiFields.add("aweme_avatar");
    openapiFields.add("aweme_has_live_permission");
    openapiFields.add("aweme_has_publish_permission");
    openapiFields.add("aweme_has_uni_prom");
    openapiFields.add("aweme_has_video_permission");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("aweme_show_id");
    openapiFields.add("aweme_status");
    openapiFields.add("bind_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner
  */
  public static QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeAuthorizedGetV10ResponseDataAwemeIdListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

