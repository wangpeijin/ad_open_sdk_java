/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class QianchuanCarouselAwemeGetV10Filtering {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private Long awemeCarouselId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_URL = "aweme_item_url";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_URL)
  private String awemeItemUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public QianchuanCarouselAwemeGetV10Filtering() {
  }

  public QianchuanCarouselAwemeGetV10Filtering awemeCarouselId(Long awemeCarouselId) {
    
    this.awemeCarouselId = awemeCarouselId;
    return this;
  }

   /**
   * 挂车商品指定的筛选主页图文id
   * @return awemeCarouselId
  **/
  @javax.annotation.Nullable
  public Long getAwemeCarouselId() {
    return awemeCarouselId;
  }


  public void setAwemeCarouselId(Long awemeCarouselId) {
    this.awemeCarouselId = awemeCarouselId;
  }


  public QianchuanCarouselAwemeGetV10Filtering awemeItemUrl(String awemeItemUrl) {
    
    this.awemeItemUrl = awemeItemUrl;
    return this;
  }

   /**
   * 分享链接
   * @return awemeItemUrl
  **/
  @javax.annotation.Nullable
  public String getAwemeItemUrl() {
    return awemeItemUrl;
  }


  public void setAwemeItemUrl(String awemeItemUrl) {
    this.awemeItemUrl = awemeItemUrl;
  }


  public QianchuanCarouselAwemeGetV10Filtering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 商品id
   * minimum: 1
   * @return productId
  **/
  @javax.annotation.Nonnull
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCarouselAwemeGetV10Filtering qianchuanCarouselAwemeGetV10Filtering = (QianchuanCarouselAwemeGetV10Filtering) o;
    return Objects.equals(this.awemeCarouselId, qianchuanCarouselAwemeGetV10Filtering.awemeCarouselId) &&
        Objects.equals(this.awemeItemUrl, qianchuanCarouselAwemeGetV10Filtering.awemeItemUrl) &&
        Objects.equals(this.productId, qianchuanCarouselAwemeGetV10Filtering.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, awemeItemUrl, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCarouselAwemeGetV10Filtering {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    awemeItemUrl: ").append(toIndentedString(awemeItemUrl)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    openapiFields.add("aweme_carousel_id");
    openapiFields.add("aweme_item_url");
    openapiFields.add("product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselAwemeGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselAwemeGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselAwemeGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselAwemeGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselAwemeGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselAwemeGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselAwemeGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselAwemeGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselAwemeGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselAwemeGetV10Filtering
  */
  public static QianchuanCarouselAwemeGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselAwemeGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanCarouselAwemeGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

