/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner {
  public static final String SERIALIZED_NAME_ALLOW_COUPON = "allow_coupon";
  @SerializedName(SERIALIZED_NAME_ALLOW_COUPON)
  private Boolean allowCoupon = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner() {
  }

  public QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner allowCoupon(Boolean allowCoupon) {
    
    this.allowCoupon = allowCoupon;
    return this;
  }

   /**
   * 
   * @return allowCoupon
  **/
  @javax.annotation.Nullable
  public Boolean getAllowCoupon() {
    return allowCoupon;
  }


  public void setAllowCoupon(Boolean allowCoupon) {
    this.allowCoupon = allowCoupon;
  }


  public QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner awemeId(Long awemeId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner qianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner = (QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner) o;
    return Objects.equals(this.allowCoupon, qianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner.allowCoupon) &&
        Objects.equals(this.awemeId, qianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner.awemeId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCoupon, awemeId);
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
    sb.append("class QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner {\n");
    sb.append("    allowCoupon: ").append(toIndentedString(allowCoupon)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
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
    openapiFields.add("allow_coupon");
    openapiFields.add("aweme_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner
  */
  public static QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner.class);
  }

 /**
  * Convert an instance of QianchuanToolsAllowCouponV10ResponseDataAwemeAllowCouponInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

