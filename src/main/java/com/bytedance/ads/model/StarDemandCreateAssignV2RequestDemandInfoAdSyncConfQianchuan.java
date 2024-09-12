/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
 * 产出物推送千川配置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan {
  public static final String SERIALIZED_NAME_AD_SYNC = "ad_sync";
  @SerializedName(SERIALIZED_NAME_AD_SYNC)
  private Integer adSync = null;

  public static final String SERIALIZED_NAME_AD_SYNC_ORIGIN = "ad_sync_origin";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_ORIGIN)
  private Long adSyncOrigin = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTO_SYNC = "auto_sync";
  @SerializedName(SERIALIZED_NAME_AUTO_SYNC)
  private Long autoSync = null;

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_PICS = "product_pics";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PICS)
  private List<String> productPics = null;

  public static final String SERIALIZED_NAME_SYNC_DURATION = "sync_duration";
  @SerializedName(SERIALIZED_NAME_SYNC_DURATION)
  private Long syncDuration = null;

  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan() {
  }

  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan adSync(Integer adSync) {
    
    this.adSync = adSync;
    return this;
  }

   /**
   * 是否用于视频素材投放（头像跳落地页）：2&#x3D;是；1&#x3D;否（用于原视频投放） 默认推送素材（为2，头像跳落地页）。内容服务为2不可改
   * @return adSync
  **/
  @javax.annotation.Nullable
  public Integer getAdSync() {
    return adSync;
  }


  public void setAdSync(Integer adSync) {
    this.adSync = adSync;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan adSyncOrigin(Long adSyncOrigin) {
    
    this.adSyncOrigin = adSyncOrigin;
    return this;
  }

   /**
   * 是否投放原生视频 0或不填 &#x3D; 否；1 &#x3D; 是
   * @return adSyncOrigin
  **/
  @javax.annotation.Nullable
  public Long getAdSyncOrigin() {
    return adSyncOrigin;
  }


  public void setAdSyncOrigin(Long adSyncOrigin) {
    this.adSyncOrigin = adSyncOrigin;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan autoSync(Long autoSync) {
    
    this.autoSync = autoSync;
    return this;
  }

   /**
   * 是否自动投放 0或不填 &#x3D; 否；1 &#x3D; 是
   * @return autoSync
  **/
  @javax.annotation.Nullable
  public Long getAutoSync() {
    return autoSync;
  }


  public void setAutoSync(Long autoSync) {
    this.autoSync = autoSync;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 推广产品链接
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan productPics(List<String> productPics) {
    
    this.productPics = productPics;
    return this;
  }

  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan addProductPicsItem(String productPicsItem) {
    if (this.productPics == null) {
      this.productPics = new ArrayList<>();
    }
    this.productPics.add(productPicsItem);
    return this;
  }

   /**
   * 推广产品图片文件名（材料上传接口中使用到的文件名）
   * @return productPics
  **/
  @javax.annotation.Nullable
  public List<String> getProductPics() {
    return productPics;
  }


  public void setProductPics(List<String> productPics) {
    this.productPics = productPics;
  }


  public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan syncDuration(Long syncDuration) {
    
    this.syncDuration = syncDuration;
    return this;
  }

   /**
   * 投放原生视频的投放时间（单位：天） 大于0的整数 
   * @return syncDuration
  **/
  @javax.annotation.Nullable
  public Long getSyncDuration() {
    return syncDuration;
  }


  public void setSyncDuration(Long syncDuration) {
    this.syncDuration = syncDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan = (StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan) o;
    return Objects.equals(this.adSync, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.adSync) &&
        Objects.equals(this.adSyncOrigin, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.adSyncOrigin) &&
        Objects.equals(this.advertiserId, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.advertiserId) &&
        Objects.equals(this.autoSync, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.autoSync) &&
        Objects.equals(this.productLink, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.productLink) &&
        Objects.equals(this.productPics, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.productPics) &&
        Objects.equals(this.syncDuration, starDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.syncDuration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSync, adSyncOrigin, advertiserId, autoSync, productLink, productPics, syncDuration);
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
    sb.append("class StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan {\n");
    sb.append("    adSync: ").append(toIndentedString(adSync)).append("\n");
    sb.append("    adSyncOrigin: ").append(toIndentedString(adSyncOrigin)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    autoSync: ").append(toIndentedString(autoSync)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productPics: ").append(toIndentedString(productPics)).append("\n");
    sb.append("    syncDuration: ").append(toIndentedString(syncDuration)).append("\n");
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
    openapiFields.add("ad_sync");
    openapiFields.add("ad_sync_origin");
    openapiFields.add("advertiser_id");
    openapiFields.add("auto_sync");
    openapiFields.add("product_link");
    openapiFields.add("product_pics");
    openapiFields.add("sync_duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan
  */
  public static StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2RequestDemandInfoAdSyncConfQianchuan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

