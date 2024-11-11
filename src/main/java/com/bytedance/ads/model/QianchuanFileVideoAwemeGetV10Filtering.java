/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class QianchuanFileVideoAwemeGetV10Filtering {
  public static final String SERIALIZED_NAME_AWEME_ITEM_IDS = "aweme_item_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_IDS)
  private List<Long> awemeItemIds = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_URL = "aweme_item_url";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_URL)
  private String awemeItemUrl = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public QianchuanFileVideoAwemeGetV10Filtering() {
  }

  public QianchuanFileVideoAwemeGetV10Filtering awemeItemIds(List<Long> awemeItemIds) {
    
    this.awemeItemIds = awemeItemIds;
    return this;
  }

  public QianchuanFileVideoAwemeGetV10Filtering addAwemeItemIdsItem(Long awemeItemIdsItem) {
    if (this.awemeItemIds == null) {
      this.awemeItemIds = new ArrayList<>();
    }
    this.awemeItemIds.add(awemeItemIdsItem);
    return this;
  }

   /**
   * 
   * @return awemeItemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeItemIds() {
    return awemeItemIds;
  }


  public void setAwemeItemIds(List<Long> awemeItemIds) {
    this.awemeItemIds = awemeItemIds;
  }


  public QianchuanFileVideoAwemeGetV10Filtering awemeItemUrl(String awemeItemUrl) {
    
    this.awemeItemUrl = awemeItemUrl;
    return this;
  }

   /**
   * 
   * @return awemeItemUrl
  **/
  @javax.annotation.Nullable
  public String getAwemeItemUrl() {
    return awemeItemUrl;
  }


  public void setAwemeItemUrl(String awemeItemUrl) {
    this.awemeItemUrl = awemeItemUrl;
  }


  public QianchuanFileVideoAwemeGetV10Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public QianchuanFileVideoAwemeGetV10Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public QianchuanFileVideoAwemeGetV10Filtering productId(Long productId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanFileVideoAwemeGetV10Filtering qianchuanFileVideoAwemeGetV10Filtering = (QianchuanFileVideoAwemeGetV10Filtering) o;
    return Objects.equals(this.awemeItemIds, qianchuanFileVideoAwemeGetV10Filtering.awemeItemIds) &&
        Objects.equals(this.awemeItemUrl, qianchuanFileVideoAwemeGetV10Filtering.awemeItemUrl) &&
        Objects.equals(this.materialIds, qianchuanFileVideoAwemeGetV10Filtering.materialIds) &&
        Objects.equals(this.productId, qianchuanFileVideoAwemeGetV10Filtering.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemIds, awemeItemUrl, materialIds, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanFileVideoAwemeGetV10Filtering {\n");
    sb.append("    awemeItemIds: ").append(toIndentedString(awemeItemIds)).append("\n");
    sb.append("    awemeItemUrl: ").append(toIndentedString(awemeItemUrl)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
    openapiFields.add("aweme_item_ids");
    openapiFields.add("aweme_item_url");
    openapiFields.add("material_ids");
    openapiFields.add("product_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFileVideoAwemeGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFileVideoAwemeGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFileVideoAwemeGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFileVideoAwemeGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFileVideoAwemeGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanFileVideoAwemeGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFileVideoAwemeGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFileVideoAwemeGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFileVideoAwemeGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanFileVideoAwemeGetV10Filtering
  */
  public static QianchuanFileVideoAwemeGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFileVideoAwemeGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanFileVideoAwemeGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

