/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count = null;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner() {
  }

  public ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @javax.annotation.Nullable
  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * 
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner clueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner = (ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner) o;
    return Objects.equals(this.count, clueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.count) &&
        Objects.equals(this.iconUrl, clueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.iconUrl) &&
        Objects.equals(this.name, clueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, iconUrl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("count");
    openapiFields.add("icon_url");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner>() {
           @Override
           public void write(JsonWriter out, ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner
  * @throws IOException if the JSON string is invalid with respect to ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner
  */
  public static ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner.class);
  }

 /**
  * Convert an instance of ClueCouponGetV2ResponseDataListInnerCouponResourceListInnerGiftListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

