/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * StarDemandSearchWordModifyV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StarDemandSearchWordModifyV2Request {
  public static final String SERIALIZED_NAME_NEW_SEARCH_WORD = "new_search_word";
  @SerializedName(SERIALIZED_NAME_NEW_SEARCH_WORD)
  private String newSearchWord = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarDemandSearchWordModifyV2Request() {
  }

  public StarDemandSearchWordModifyV2Request newSearchWord(String newSearchWord) {
    
    this.newSearchWord = newSearchWord;
    return this;
  }

   /**
   * 
   * @return newSearchWord
  **/
  @javax.annotation.Nonnull
  public String getNewSearchWord() {
    return newSearchWord;
  }


  public void setNewSearchWord(String newSearchWord) {
    this.newSearchWord = newSearchWord;
  }


  public StarDemandSearchWordModifyV2Request orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nonnull
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarDemandSearchWordModifyV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandSearchWordModifyV2Request starDemandSearchWordModifyV2Request = (StarDemandSearchWordModifyV2Request) o;
    return Objects.equals(this.newSearchWord, starDemandSearchWordModifyV2Request.newSearchWord) &&
        Objects.equals(this.orderId, starDemandSearchWordModifyV2Request.orderId) &&
        Objects.equals(this.starId, starDemandSearchWordModifyV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newSearchWord, orderId, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandSearchWordModifyV2Request {\n");
    sb.append("    newSearchWord: ").append(toIndentedString(newSearchWord)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("new_search_word");
    openapiFields.add("order_id");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("new_search_word");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandSearchWordModifyV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandSearchWordModifyV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandSearchWordModifyV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandSearchWordModifyV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandSearchWordModifyV2Request>() {
           @Override
           public void write(JsonWriter out, StarDemandSearchWordModifyV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandSearchWordModifyV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandSearchWordModifyV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandSearchWordModifyV2Request
  * @throws IOException if the JSON string is invalid with respect to StarDemandSearchWordModifyV2Request
  */
  public static StarDemandSearchWordModifyV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandSearchWordModifyV2Request.class);
  }

 /**
  * Convert an instance of StarDemandSearchWordModifyV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

