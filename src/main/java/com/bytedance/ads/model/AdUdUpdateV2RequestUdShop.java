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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class AdUdUpdateV2RequestUdShop {
  public static final String SERIALIZED_NAME_UD_BRAND_NAME = "ud_brand_name";
  @SerializedName(SERIALIZED_NAME_UD_BRAND_NAME)
  private String udBrandName = null;

  public static final String SERIALIZED_NAME_UD_SHOP_ID = "ud_shop_id";
  @SerializedName(SERIALIZED_NAME_UD_SHOP_ID)
  private String udShopId = null;

  public static final String SERIALIZED_NAME_UD_SHOP_NAME = "ud_shop_name";
  @SerializedName(SERIALIZED_NAME_UD_SHOP_NAME)
  private String udShopName = null;

  public AdUdUpdateV2RequestUdShop() {
  }

  public AdUdUpdateV2RequestUdShop udBrandName(String udBrandName) {
    
    this.udBrandName = udBrandName;
    return this;
  }

   /**
   * 
   * @return udBrandName
  **/
  @javax.annotation.Nullable
  public String getUdBrandName() {
    return udBrandName;
  }


  public void setUdBrandName(String udBrandName) {
    this.udBrandName = udBrandName;
  }


  public AdUdUpdateV2RequestUdShop udShopId(String udShopId) {
    
    this.udShopId = udShopId;
    return this;
  }

   /**
   * 
   * @return udShopId
  **/
  @javax.annotation.Nullable
  public String getUdShopId() {
    return udShopId;
  }


  public void setUdShopId(String udShopId) {
    this.udShopId = udShopId;
  }


  public AdUdUpdateV2RequestUdShop udShopName(String udShopName) {
    
    this.udShopName = udShopName;
    return this;
  }

   /**
   * 
   * @return udShopName
  **/
  @javax.annotation.Nullable
  public String getUdShopName() {
    return udShopName;
  }


  public void setUdShopName(String udShopName) {
    this.udShopName = udShopName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdUdUpdateV2RequestUdShop adUdUpdateV2RequestUdShop = (AdUdUpdateV2RequestUdShop) o;
    return Objects.equals(this.udBrandName, adUdUpdateV2RequestUdShop.udBrandName) &&
        Objects.equals(this.udShopId, adUdUpdateV2RequestUdShop.udShopId) &&
        Objects.equals(this.udShopName, adUdUpdateV2RequestUdShop.udShopName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(udBrandName, udShopId, udShopName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUdUpdateV2RequestUdShop {\n");
    sb.append("    udBrandName: ").append(toIndentedString(udBrandName)).append("\n");
    sb.append("    udShopId: ").append(toIndentedString(udShopId)).append("\n");
    sb.append("    udShopName: ").append(toIndentedString(udShopName)).append("\n");
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
    openapiFields.add("ud_brand_name");
    openapiFields.add("ud_shop_id");
    openapiFields.add("ud_shop_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdUdUpdateV2RequestUdShop.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdUdUpdateV2RequestUdShop' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdUdUpdateV2RequestUdShop> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdUdUpdateV2RequestUdShop.class));

       return (TypeAdapter<T>) new TypeAdapter<AdUdUpdateV2RequestUdShop>() {
           @Override
           public void write(JsonWriter out, AdUdUpdateV2RequestUdShop value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdUdUpdateV2RequestUdShop read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdUdUpdateV2RequestUdShop given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdUdUpdateV2RequestUdShop
  * @throws IOException if the JSON string is invalid with respect to AdUdUpdateV2RequestUdShop
  */
  public static AdUdUpdateV2RequestUdShop fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdUdUpdateV2RequestUdShop.class);
  }

 /**
  * Convert an instance of AdUdUpdateV2RequestUdShop to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

