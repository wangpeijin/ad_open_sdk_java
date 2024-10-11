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
 * PromotionMaterialDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class PromotionMaterialDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private List<Long> materialId = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public PromotionMaterialDeleteV30Request() {
  }

  public PromotionMaterialDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public PromotionMaterialDeleteV30Request materialId(List<Long> materialId) {
    
    this.materialId = materialId;
    return this;
  }

  public PromotionMaterialDeleteV30Request addMaterialIdItem(Long materialIdItem) {
    if (this.materialId == null) {
      this.materialId = new ArrayList<>();
    }
    this.materialId.add(materialIdItem);
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nonnull
  public List<Long> getMaterialId() {
    return materialId;
  }


  public void setMaterialId(List<Long> materialId) {
    this.materialId = materialId;
  }


  public PromotionMaterialDeleteV30Request promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionMaterialDeleteV30Request promotionMaterialDeleteV30Request = (PromotionMaterialDeleteV30Request) o;
    return Objects.equals(this.advertiserId, promotionMaterialDeleteV30Request.advertiserId) &&
        Objects.equals(this.materialId, promotionMaterialDeleteV30Request.materialId) &&
        Objects.equals(this.promotionId, promotionMaterialDeleteV30Request.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, materialId, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionMaterialDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("material_id");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("material_id");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionMaterialDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionMaterialDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionMaterialDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionMaterialDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionMaterialDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionMaterialDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionMaterialDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionMaterialDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionMaterialDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionMaterialDeleteV30Request
  */
  public static PromotionMaterialDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionMaterialDeleteV30Request.class);
  }

 /**
  * Convert an instance of PromotionMaterialDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

