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
import com.bytedance.ads.model.DpaVideoGetV2FilteringImageMode;
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
public class DpaVideoGetV2Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private DpaVideoGetV2FilteringImageMode imageMode = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_PLATFORM_IDS = "product_platform_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PLATFORM_IDS)
  private List<Long> productPlatformIds = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public DpaVideoGetV2Filtering() {
  }

  public DpaVideoGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public DpaVideoGetV2Filtering imageMode(DpaVideoGetV2FilteringImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public DpaVideoGetV2FilteringImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(DpaVideoGetV2FilteringImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public DpaVideoGetV2Filtering packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public DpaVideoGetV2Filtering packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public DpaVideoGetV2Filtering productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public DpaVideoGetV2Filtering addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public DpaVideoGetV2Filtering productPlatformIds(List<Long> productPlatformIds) {
    
    this.productPlatformIds = productPlatformIds;
    return this;
  }

  public DpaVideoGetV2Filtering addProductPlatformIdsItem(Long productPlatformIdsItem) {
    if (this.productPlatformIds == null) {
      this.productPlatformIds = new ArrayList<>();
    }
    this.productPlatformIds.add(productPlatformIdsItem);
    return this;
  }

   /**
   * 
   * @return productPlatformIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductPlatformIds() {
    return productPlatformIds;
  }


  public void setProductPlatformIds(List<Long> productPlatformIds) {
    this.productPlatformIds = productPlatformIds;
  }


  public DpaVideoGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaVideoGetV2Filtering dpaVideoGetV2Filtering = (DpaVideoGetV2Filtering) o;
    return Objects.equals(this.endTime, dpaVideoGetV2Filtering.endTime) &&
        Objects.equals(this.imageMode, dpaVideoGetV2Filtering.imageMode) &&
        Objects.equals(this.packageId, dpaVideoGetV2Filtering.packageId) &&
        Objects.equals(this.packageName, dpaVideoGetV2Filtering.packageName) &&
        Objects.equals(this.productIds, dpaVideoGetV2Filtering.productIds) &&
        Objects.equals(this.productPlatformIds, dpaVideoGetV2Filtering.productPlatformIds) &&
        Objects.equals(this.startTime, dpaVideoGetV2Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, imageMode, packageId, packageName, productIds, productPlatformIds, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaVideoGetV2Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    productPlatformIds: ").append(toIndentedString(productPlatformIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("image_mode");
    openapiFields.add("package_id");
    openapiFields.add("package_name");
    openapiFields.add("product_ids");
    openapiFields.add("product_platform_ids");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaVideoGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaVideoGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaVideoGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaVideoGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaVideoGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, DpaVideoGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaVideoGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaVideoGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaVideoGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to DpaVideoGetV2Filtering
  */
  public static DpaVideoGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaVideoGetV2Filtering.class);
  }

 /**
  * Convert an instance of DpaVideoGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

