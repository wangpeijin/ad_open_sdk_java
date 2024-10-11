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
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class LocalFileVideoAwemeGetV30FilteringAnchorInfo {
  public static final String SERIALIZED_NAME_ANCHOR_TYPES = "anchor_types";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPES)
  private List<LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes> anchorTypes = null;

  public static final String SERIALIZED_NAME_POI_IDS = "poi_ids";
  @SerializedName(SERIALIZED_NAME_POI_IDS)
  private List<Long> poiIds = null;

  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public LocalFileVideoAwemeGetV30FilteringAnchorInfo() {
  }

  public LocalFileVideoAwemeGetV30FilteringAnchorInfo anchorTypes(List<LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes> anchorTypes) {
    
    this.anchorTypes = anchorTypes;
    return this;
  }

  public LocalFileVideoAwemeGetV30FilteringAnchorInfo addAnchorTypesItem(LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes anchorTypesItem) {
    if (this.anchorTypes == null) {
      this.anchorTypes = new ArrayList<>();
    }
    this.anchorTypes.add(anchorTypesItem);
    return this;
  }

   /**
   * 要查的视频挂锚点类型数组
   * @return anchorTypes
  **/
  @javax.annotation.Nonnull
  public List<LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes> getAnchorTypes() {
    return anchorTypes;
  }


  public void setAnchorTypes(List<LocalFileVideoAwemeGetV30FilteringAnchorInfoAnchorTypes> anchorTypes) {
    this.anchorTypes = anchorTypes;
  }


  public LocalFileVideoAwemeGetV30FilteringAnchorInfo poiIds(List<Long> poiIds) {
    
    this.poiIds = poiIds;
    return this;
  }

  public LocalFileVideoAwemeGetV30FilteringAnchorInfo addPoiIdsItem(Long poiIdsItem) {
    if (this.poiIds == null) {
      this.poiIds = new ArrayList<>();
    }
    this.poiIds.add(poiIdsItem);
    return this;
  }

   /**
   * 选的门店ids，anchor_types传了5的时候必传
   * @return poiIds
  **/
  @javax.annotation.Nullable
  public List<Long> getPoiIds() {
    return poiIds;
  }


  public void setPoiIds(List<Long> poiIds) {
    this.poiIds = poiIds;
  }


  public LocalFileVideoAwemeGetV30FilteringAnchorInfo productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public LocalFileVideoAwemeGetV30FilteringAnchorInfo addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 选的商品ids，anchor_types传了6的时候必传
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoAwemeGetV30FilteringAnchorInfo localFileVideoAwemeGetV30FilteringAnchorInfo = (LocalFileVideoAwemeGetV30FilteringAnchorInfo) o;
    return Objects.equals(this.anchorTypes, localFileVideoAwemeGetV30FilteringAnchorInfo.anchorTypes) &&
        Objects.equals(this.poiIds, localFileVideoAwemeGetV30FilteringAnchorInfo.poiIds) &&
        Objects.equals(this.productIds, localFileVideoAwemeGetV30FilteringAnchorInfo.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorTypes, poiIds, productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalFileVideoAwemeGetV30FilteringAnchorInfo {\n");
    sb.append("    anchorTypes: ").append(toIndentedString(anchorTypes)).append("\n");
    sb.append("    poiIds: ").append(toIndentedString(poiIds)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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
    openapiFields.add("anchor_types");
    openapiFields.add("poi_ids");
    openapiFields.add("product_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor_types");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoAwemeGetV30FilteringAnchorInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoAwemeGetV30FilteringAnchorInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoAwemeGetV30FilteringAnchorInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoAwemeGetV30FilteringAnchorInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoAwemeGetV30FilteringAnchorInfo>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoAwemeGetV30FilteringAnchorInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoAwemeGetV30FilteringAnchorInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoAwemeGetV30FilteringAnchorInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoAwemeGetV30FilteringAnchorInfo
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoAwemeGetV30FilteringAnchorInfo
  */
  public static LocalFileVideoAwemeGetV30FilteringAnchorInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoAwemeGetV30FilteringAnchorInfo.class);
  }

 /**
  * Convert an instance of LocalFileVideoAwemeGetV30FilteringAnchorInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

