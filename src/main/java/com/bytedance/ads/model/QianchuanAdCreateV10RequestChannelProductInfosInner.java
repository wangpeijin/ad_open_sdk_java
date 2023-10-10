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
import com.bytedance.ads.model.QianchuanAdCreateV10ChannelProductInfosChannelType;
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
 * QianchuanAdCreateV10RequestChannelProductInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanAdCreateV10RequestChannelProductInfosInner {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Long channelId = null;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private QianchuanAdCreateV10ChannelProductInfosChannelType channelType = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public QianchuanAdCreateV10RequestChannelProductInfosInner() {
  }

  public QianchuanAdCreateV10RequestChannelProductInfosInner channelId(Long channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public Long getChannelId() {
    return channelId;
  }


  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }


  public QianchuanAdCreateV10RequestChannelProductInfosInner channelType(QianchuanAdCreateV10ChannelProductInfosChannelType channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10ChannelProductInfosChannelType getChannelType() {
    return channelType;
  }


  public void setChannelType(QianchuanAdCreateV10ChannelProductInfosChannelType channelType) {
    this.channelType = channelType;
  }


  public QianchuanAdCreateV10RequestChannelProductInfosInner productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return productId
  **/
  @javax.annotation.Nullable
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
    QianchuanAdCreateV10RequestChannelProductInfosInner qianchuanAdCreateV10RequestChannelProductInfosInner = (QianchuanAdCreateV10RequestChannelProductInfosInner) o;
    return Objects.equals(this.channelId, qianchuanAdCreateV10RequestChannelProductInfosInner.channelId) &&
        Objects.equals(this.channelType, qianchuanAdCreateV10RequestChannelProductInfosInner.channelType) &&
        Objects.equals(this.productId, qianchuanAdCreateV10RequestChannelProductInfosInner.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelType, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestChannelProductInfosInner {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
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
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");
    openapiFields.add("product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestChannelProductInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestChannelProductInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestChannelProductInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestChannelProductInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestChannelProductInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestChannelProductInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestChannelProductInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestChannelProductInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestChannelProductInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestChannelProductInfosInner
  */
  public static QianchuanAdCreateV10RequestChannelProductInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestChannelProductInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestChannelProductInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
