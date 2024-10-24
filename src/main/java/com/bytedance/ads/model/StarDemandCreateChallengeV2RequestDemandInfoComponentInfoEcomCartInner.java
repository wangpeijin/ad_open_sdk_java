/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner {
  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 购物车商品链接
   * @return productLink
  **/
  @javax.annotation.Nonnull
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 购物车商品标题
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner starDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner = (StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner) o;
    return Objects.equals(this.productLink, starDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner.productLink) &&
        Objects.equals(this.title, starDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLink, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner {\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("product_link");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product_link");
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner
  */
  public static StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfoComponentInfoEcomCartInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

