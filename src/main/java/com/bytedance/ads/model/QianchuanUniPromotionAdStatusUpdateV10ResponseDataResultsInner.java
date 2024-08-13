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
import com.bytedance.ads.model.QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError;
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
 * QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError error = null;

  public static final String SERIALIZED_NAME_FLAG = "flag";
  @SerializedName(SERIALIZED_NAME_FLAG)
  private Boolean flag = null;

  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner() {
  }

  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner adId(Long adId) {
    
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


  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner error(QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError getError() {
    return error;
  }


  public void setError(QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInnerError error) {
    this.error = error;
  }


  public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner flag(Boolean flag) {
    
    this.flag = flag;
    return this;
  }

   /**
   * 
   * @return flag
  **/
  @javax.annotation.Nullable
  public Boolean getFlag() {
    return flag;
  }


  public void setFlag(Boolean flag) {
    this.flag = flag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner = (QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner) o;
    return Objects.equals(this.adId, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.adId) &&
        Objects.equals(this.error, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.error) &&
        Objects.equals(this.flag, qianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.flag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, error, flag);
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
    sb.append("class QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("flag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner
  */
  public static QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdStatusUpdateV10ResponseDataResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

