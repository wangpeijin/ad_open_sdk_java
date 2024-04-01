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
 * ProjectCreateV30RequestRelatedProductProductsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ProjectCreateV30RequestRelatedProductProductsInner {
  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_ID = "unique_product_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_ID)
  private Long uniqueProductId = null;

  public ProjectCreateV30RequestRelatedProductProductsInner() {
  }

  public ProjectCreateV30RequestRelatedProductProductsInner assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return assetId
  **/
  @javax.annotation.Nullable
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public ProjectCreateV30RequestRelatedProductProductsInner productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public ProjectCreateV30RequestRelatedProductProductsInner productPlatformId(Long productPlatformId) {
    
    this.productPlatformId = productPlatformId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return productPlatformId
  **/
  @javax.annotation.Nullable
  public Long getProductPlatformId() {
    return productPlatformId;
  }


  public void setProductPlatformId(Long productPlatformId) {
    this.productPlatformId = productPlatformId;
  }


  public ProjectCreateV30RequestRelatedProductProductsInner uniqueProductId(Long uniqueProductId) {
    
    this.uniqueProductId = uniqueProductId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return uniqueProductId
  **/
  @javax.annotation.Nullable
  public Long getUniqueProductId() {
    return uniqueProductId;
  }


  public void setUniqueProductId(Long uniqueProductId) {
    this.uniqueProductId = uniqueProductId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateV30RequestRelatedProductProductsInner projectCreateV30RequestRelatedProductProductsInner = (ProjectCreateV30RequestRelatedProductProductsInner) o;
    return Objects.equals(this.assetId, projectCreateV30RequestRelatedProductProductsInner.assetId) &&
        Objects.equals(this.productId, projectCreateV30RequestRelatedProductProductsInner.productId) &&
        Objects.equals(this.productPlatformId, projectCreateV30RequestRelatedProductProductsInner.productPlatformId) &&
        Objects.equals(this.uniqueProductId, projectCreateV30RequestRelatedProductProductsInner.uniqueProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, productId, productPlatformId, uniqueProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestRelatedProductProductsInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    uniqueProductId: ").append(toIndentedString(uniqueProductId)).append("\n");
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
    openapiFields.add("unique_product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestRelatedProductProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestRelatedProductProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestRelatedProductProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestRelatedProductProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestRelatedProductProductsInner>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestRelatedProductProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestRelatedProductProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestRelatedProductProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestRelatedProductProductsInner
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestRelatedProductProductsInner
  */
  public static ProjectCreateV30RequestRelatedProductProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestRelatedProductProductsInner.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestRelatedProductProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

