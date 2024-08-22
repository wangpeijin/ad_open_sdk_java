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
import com.bytedance.ads.model.ProjectCreateV30RelatedProductProductSetting;
import com.bytedance.ads.model.ProjectCreateV30RequestRelatedProductProductsInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ProjectCreateV30RequestRelatedProduct {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_ID = "product_platform_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_ID)
  private Long productPlatformId = null;

  public static final String SERIALIZED_NAME_PRODUCT_SETTING = "product_setting";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SETTING)
  private ProjectCreateV30RelatedProductProductSetting productSetting = null;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ProjectCreateV30RequestRelatedProductProductsInner> products = null;

  public static final String SERIALIZED_NAME_UNIQUE_PRODUCT_ID = "unique_product_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_PRODUCT_ID)
  private Long uniqueProductId = null;

  public ProjectCreateV30RequestRelatedProduct() {
  }

  public ProjectCreateV30RequestRelatedProduct productId(String productId) {
    
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


  public ProjectCreateV30RequestRelatedProduct productPlatformId(Long productPlatformId) {
    
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


  public ProjectCreateV30RequestRelatedProduct productSetting(ProjectCreateV30RelatedProductProductSetting productSetting) {
    
    this.productSetting = productSetting;
    return this;
  }

   /**
   * Get productSetting
   * @return productSetting
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30RelatedProductProductSetting getProductSetting() {
    return productSetting;
  }


  public void setProductSetting(ProjectCreateV30RelatedProductProductSetting productSetting) {
    this.productSetting = productSetting;
  }


  public ProjectCreateV30RequestRelatedProduct products(List<ProjectCreateV30RequestRelatedProductProductsInner> products) {
    
    this.products = products;
    return this;
  }

  public ProjectCreateV30RequestRelatedProduct addProductsItem(ProjectCreateV30RequestRelatedProductProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * 
   * @return products
  **/
  @javax.annotation.Nullable
  public List<ProjectCreateV30RequestRelatedProductProductsInner> getProducts() {
    return products;
  }


  public void setProducts(List<ProjectCreateV30RequestRelatedProductProductsInner> products) {
    this.products = products;
  }


  public ProjectCreateV30RequestRelatedProduct uniqueProductId(Long uniqueProductId) {
    
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
    ProjectCreateV30RequestRelatedProduct projectCreateV30RequestRelatedProduct = (ProjectCreateV30RequestRelatedProduct) o;
    return Objects.equals(this.productId, projectCreateV30RequestRelatedProduct.productId) &&
        Objects.equals(this.productPlatformId, projectCreateV30RequestRelatedProduct.productPlatformId) &&
        Objects.equals(this.productSetting, projectCreateV30RequestRelatedProduct.productSetting) &&
        Objects.equals(this.products, projectCreateV30RequestRelatedProduct.products) &&
        Objects.equals(this.uniqueProductId, projectCreateV30RequestRelatedProduct.uniqueProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productPlatformId, productSetting, products, uniqueProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestRelatedProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productPlatformId: ").append(toIndentedString(productPlatformId)).append("\n");
    sb.append("    productSetting: ").append(toIndentedString(productSetting)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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
    openapiFields.add("product_id");
    openapiFields.add("product_platform_id");
    openapiFields.add("product_setting");
    openapiFields.add("products");
    openapiFields.add("unique_product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestRelatedProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestRelatedProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestRelatedProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestRelatedProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestRelatedProduct>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestRelatedProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestRelatedProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestRelatedProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestRelatedProduct
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestRelatedProduct
  */
  public static ProjectCreateV30RequestRelatedProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestRelatedProduct.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestRelatedProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

