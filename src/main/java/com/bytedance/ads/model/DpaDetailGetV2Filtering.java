/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DpaDetailGetV2FilteringIsRecommend;
import com.bytedance.ads.model.DpaDetailGetV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class DpaDetailGetV2Filtering {
  public static final String SERIALIZED_NAME_DPA_CATEGORIES = "dpa_categories";
  @SerializedName(SERIALIZED_NAME_DPA_CATEGORIES)
  private List<Long> dpaCategories = null;

  public static final String SERIALIZED_NAME_IS_RECOMMEND = "is_recommend";
  @SerializedName(SERIALIZED_NAME_IS_RECOMMEND)
  private DpaDetailGetV2FilteringIsRecommend isRecommend = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DpaDetailGetV2FilteringStatus status = null;

  public DpaDetailGetV2Filtering() {
  }

  public DpaDetailGetV2Filtering dpaCategories(List<Long> dpaCategories) {
    
    this.dpaCategories = dpaCategories;
    return this;
  }

  public DpaDetailGetV2Filtering addDpaCategoriesItem(Long dpaCategoriesItem) {
    if (this.dpaCategories == null) {
      this.dpaCategories = new ArrayList<>();
    }
    this.dpaCategories.add(dpaCategoriesItem);
    return this;
  }

   /**
   * 
   * @return dpaCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getDpaCategories() {
    return dpaCategories;
  }


  public void setDpaCategories(List<Long> dpaCategories) {
    this.dpaCategories = dpaCategories;
  }


  public DpaDetailGetV2Filtering isRecommend(DpaDetailGetV2FilteringIsRecommend isRecommend) {
    
    this.isRecommend = isRecommend;
    return this;
  }

   /**
   * Get isRecommend
   * @return isRecommend
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2FilteringIsRecommend getIsRecommend() {
    return isRecommend;
  }


  public void setIsRecommend(DpaDetailGetV2FilteringIsRecommend isRecommend) {
    this.isRecommend = isRecommend;
  }


  public DpaDetailGetV2Filtering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public DpaDetailGetV2Filtering productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public DpaDetailGetV2Filtering status(DpaDetailGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DpaDetailGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(DpaDetailGetV2FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaDetailGetV2Filtering dpaDetailGetV2Filtering = (DpaDetailGetV2Filtering) o;
    return Objects.equals(this.dpaCategories, dpaDetailGetV2Filtering.dpaCategories) &&
        Objects.equals(this.isRecommend, dpaDetailGetV2Filtering.isRecommend) &&
        Objects.equals(this.productId, dpaDetailGetV2Filtering.productId) &&
        Objects.equals(this.productName, dpaDetailGetV2Filtering.productName) &&
        Objects.equals(this.status, dpaDetailGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpaCategories, isRecommend, productId, productName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaDetailGetV2Filtering {\n");
    sb.append("    dpaCategories: ").append(toIndentedString(dpaCategories)).append("\n");
    sb.append("    isRecommend: ").append(toIndentedString(isRecommend)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("dpa_categories");
    openapiFields.add("is_recommend");
    openapiFields.add("product_id");
    openapiFields.add("product_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaDetailGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaDetailGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaDetailGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaDetailGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaDetailGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, DpaDetailGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaDetailGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaDetailGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaDetailGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to DpaDetailGetV2Filtering
  */
  public static DpaDetailGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaDetailGetV2Filtering.class);
  }

 /**
  * Convert an instance of DpaDetailGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

