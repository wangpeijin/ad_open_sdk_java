/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
 * 品牌信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class PromotionUpdateV30RequestBrandInfo {
  public static final String SERIALIZED_NAME_BRAND_NAME_ID = "brand_name_id";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME_ID)
  private Long brandNameId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_ID = "cdp_brand_id";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_ID)
  private Long cdpBrandId = null;

  public static final String SERIALIZED_NAME_CDP_BRAND_NAME = "cdp_brand_name";
  @SerializedName(SERIALIZED_NAME_CDP_BRAND_NAME)
  private String cdpBrandName = null;

  public static final String SERIALIZED_NAME_ECOM_BRAND_ID = "ecom_brand_id";
  @SerializedName(SERIALIZED_NAME_ECOM_BRAND_ID)
  private Long ecomBrandId = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAME_IDS = "sub_brand_name_ids";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAME_IDS)
  private List<String> subBrandNameIds = null;

  public static final String SERIALIZED_NAME_SUB_BRAND_NAMES = "sub_brand_names";
  @SerializedName(SERIALIZED_NAME_SUB_BRAND_NAMES)
  private List<String> subBrandNames = null;

  public static final String SERIALIZED_NAME_YUNTU_CATEGORY_ID = "yuntu_category_id";
  @SerializedName(SERIALIZED_NAME_YUNTU_CATEGORY_ID)
  private Long yuntuCategoryId = null;

  public PromotionUpdateV30RequestBrandInfo() {
  }

  public PromotionUpdateV30RequestBrandInfo brandNameId(Long brandNameId) {
    
    this.brandNameId = brandNameId;
    return this;
  }

   /**
   * 云图品牌id
   * @return brandNameId
  **/
  @javax.annotation.Nullable
  public Long getBrandNameId() {
    return brandNameId;
  }


  public void setBrandNameId(Long brandNameId) {
    this.brandNameId = brandNameId;
  }


  public PromotionUpdateV30RequestBrandInfo cdpBrandId(Long cdpBrandId) {
    
    this.cdpBrandId = cdpBrandId;
    return this;
  }

   /**
   * cdp品牌id
   * @return cdpBrandId
  **/
  @javax.annotation.Nullable
  public Long getCdpBrandId() {
    return cdpBrandId;
  }


  public void setCdpBrandId(Long cdpBrandId) {
    this.cdpBrandId = cdpBrandId;
  }


  public PromotionUpdateV30RequestBrandInfo cdpBrandName(String cdpBrandName) {
    
    this.cdpBrandName = cdpBrandName;
    return this;
  }

   /**
   * 云图品牌名称
   * @return cdpBrandName
  **/
  @javax.annotation.Nullable
  public String getCdpBrandName() {
    return cdpBrandName;
  }


  public void setCdpBrandName(String cdpBrandName) {
    this.cdpBrandName = cdpBrandName;
  }


  public PromotionUpdateV30RequestBrandInfo ecomBrandId(Long ecomBrandId) {
    
    this.ecomBrandId = ecomBrandId;
    return this;
  }

   /**
   * 电商品牌id
   * @return ecomBrandId
  **/
  @javax.annotation.Nullable
  public Long getEcomBrandId() {
    return ecomBrandId;
  }


  public void setEcomBrandId(Long ecomBrandId) {
    this.ecomBrandId = ecomBrandId;
  }


  public PromotionUpdateV30RequestBrandInfo subBrandNameIds(List<String> subBrandNameIds) {
    
    this.subBrandNameIds = subBrandNameIds;
    return this;
  }

  public PromotionUpdateV30RequestBrandInfo addSubBrandNameIdsItem(String subBrandNameIdsItem) {
    if (this.subBrandNameIds == null) {
      this.subBrandNameIds = new ArrayList<>();
    }
    this.subBrandNameIds.add(subBrandNameIdsItem);
    return this;
  }

   /**
   * 
   * @return subBrandNameIds
  **/
  @javax.annotation.Nullable
  public List<String> getSubBrandNameIds() {
    return subBrandNameIds;
  }


  public void setSubBrandNameIds(List<String> subBrandNameIds) {
    this.subBrandNameIds = subBrandNameIds;
  }


  public PromotionUpdateV30RequestBrandInfo subBrandNames(List<String> subBrandNames) {
    
    this.subBrandNames = subBrandNames;
    return this;
  }

  public PromotionUpdateV30RequestBrandInfo addSubBrandNamesItem(String subBrandNamesItem) {
    if (this.subBrandNames == null) {
      this.subBrandNames = new ArrayList<>();
    }
    this.subBrandNames.add(subBrandNamesItem);
    return this;
  }

   /**
   * 子品牌名称
   * @return subBrandNames
  **/
  @javax.annotation.Nullable
  public List<String> getSubBrandNames() {
    return subBrandNames;
  }


  public void setSubBrandNames(List<String> subBrandNames) {
    this.subBrandNames = subBrandNames;
  }


  public PromotionUpdateV30RequestBrandInfo yuntuCategoryId(Long yuntuCategoryId) {
    
    this.yuntuCategoryId = yuntuCategoryId;
    return this;
  }

   /**
   * 品牌分类id
   * @return yuntuCategoryId
  **/
  @javax.annotation.Nullable
  public Long getYuntuCategoryId() {
    return yuntuCategoryId;
  }


  public void setYuntuCategoryId(Long yuntuCategoryId) {
    this.yuntuCategoryId = yuntuCategoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestBrandInfo promotionUpdateV30RequestBrandInfo = (PromotionUpdateV30RequestBrandInfo) o;
    return Objects.equals(this.brandNameId, promotionUpdateV30RequestBrandInfo.brandNameId) &&
        Objects.equals(this.cdpBrandId, promotionUpdateV30RequestBrandInfo.cdpBrandId) &&
        Objects.equals(this.cdpBrandName, promotionUpdateV30RequestBrandInfo.cdpBrandName) &&
        Objects.equals(this.ecomBrandId, promotionUpdateV30RequestBrandInfo.ecomBrandId) &&
        Objects.equals(this.subBrandNameIds, promotionUpdateV30RequestBrandInfo.subBrandNameIds) &&
        Objects.equals(this.subBrandNames, promotionUpdateV30RequestBrandInfo.subBrandNames) &&
        Objects.equals(this.yuntuCategoryId, promotionUpdateV30RequestBrandInfo.yuntuCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandNameId, cdpBrandId, cdpBrandName, ecomBrandId, subBrandNameIds, subBrandNames, yuntuCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestBrandInfo {\n");
    sb.append("    brandNameId: ").append(toIndentedString(brandNameId)).append("\n");
    sb.append("    cdpBrandId: ").append(toIndentedString(cdpBrandId)).append("\n");
    sb.append("    cdpBrandName: ").append(toIndentedString(cdpBrandName)).append("\n");
    sb.append("    ecomBrandId: ").append(toIndentedString(ecomBrandId)).append("\n");
    sb.append("    subBrandNameIds: ").append(toIndentedString(subBrandNameIds)).append("\n");
    sb.append("    subBrandNames: ").append(toIndentedString(subBrandNames)).append("\n");
    sb.append("    yuntuCategoryId: ").append(toIndentedString(yuntuCategoryId)).append("\n");
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
    openapiFields.add("brand_name_id");
    openapiFields.add("cdp_brand_id");
    openapiFields.add("cdp_brand_name");
    openapiFields.add("ecom_brand_id");
    openapiFields.add("sub_brand_name_ids");
    openapiFields.add("sub_brand_names");
    openapiFields.add("yuntu_category_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestBrandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestBrandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestBrandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestBrandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestBrandInfo>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestBrandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestBrandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestBrandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestBrandInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestBrandInfo
  */
  public static PromotionUpdateV30RequestBrandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestBrandInfo.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestBrandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

