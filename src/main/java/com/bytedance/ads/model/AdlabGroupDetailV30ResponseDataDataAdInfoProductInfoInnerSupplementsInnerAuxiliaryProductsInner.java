/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner() {
  }

  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 附属商品的投放条件id
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 附属商品的商品id
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 附属商品的商品库id
   * @return productPlatformId
  **/
  @javax.annotation.Nullable
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner = (AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner) o;
    return Objects.equals(this.assetId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.assetId) &&
        Objects.equals(this.productId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.productId) &&
        Objects.equals(this.productPlatformId, adlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.productPlatformId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, productId, productPlatformId);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("product_id");
    openapiFields.add("product_platform_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner
  */
  public static AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataAdInfoProductInfoInnerSupplementsInnerAuxiliaryProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

