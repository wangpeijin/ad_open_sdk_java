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
import com.bytedance.ads.model.NativeAnchorCreateV30AnchorInfoShoppingCartAnchorLinkType;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner;
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
 * 购物车锚点
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private NativeAnchorCreateV30AnchorInfoShoppingCartAnchorLinkType linkType = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "product_images";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages = null;

  public static final String SERIALIZED_NAME_PRODUCT_PRICE = "product_price";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PRICE)
  private Double productPrice = null;

  public static final String SERIALIZED_NAME_PRODUCT_SOURCE = "product_source";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SOURCE)
  private String productSource = null;

  public static final String SERIALIZED_NAME_PRODUCT_TITLE = "product_title";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TITLE)
  private String productTitle = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 必填，落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor linkType(NativeAnchorCreateV30AnchorInfoShoppingCartAnchorLinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30AnchorInfoShoppingCartAnchorLinkType getLinkType() {
    return linkType;
  }


  public void setLinkType(NativeAnchorCreateV30AnchorInfoShoppingCartAnchorLinkType linkType) {
    this.linkType = linkType;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接，选填
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor productImages(List<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages) {
    
    this.productImages = productImages;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor addProductImagesItem(NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner productImagesItem) {
    if (this.productImages == null) {
      this.productImages = new ArrayList<>();
    }
    this.productImages.add(productImagesItem);
    return this;
  }

   /**
   * 必填，商品图片，比例1:1，至少1张
   * @return productImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> getProductImages() {
    return productImages;
  }


  public void setProductImages(List<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages) {
    this.productImages = productImages;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 必填，商品价格，最多两位小数
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor productSource(String productSource) {
    
    this.productSource = productSource;
    return this;
  }

   /**
   * 必填，商品来源，只支持填写淘宝/天猫/京东/拼多多/唯品会/得物
   * @return productSource
  **/
  @javax.annotation.Nullable
  public String getProductSource() {
    return productSource;
  }


  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * 必填，商品标题，不超过35个字
   * @return productTitle
  **/
  @javax.annotation.Nullable
  public String getProductTitle() {
    return productTitle;
  }


  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 必填，购物车小标题，不超过10个字
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor = (NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor) o;
    return Objects.equals(this.externalUrl, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.externalUrl) &&
        Objects.equals(this.linkType, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.linkType) &&
        Objects.equals(this.openUrl, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.openUrl) &&
        Objects.equals(this.productImages, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.productImages) &&
        Objects.equals(this.productPrice, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.productPrice) &&
        Objects.equals(this.productSource, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.productSource) &&
        Objects.equals(this.productTitle, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.productTitle) &&
        Objects.equals(this.title, nativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl, linkType, openUrl, productImages, productPrice, productSource, productTitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor {\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    productImages: ").append(toIndentedString(productImages)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productSource: ").append(toIndentedString(productSource)).append("\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("external_url");
    openapiFields.add("link_type");
    openapiFields.add("open_url");
    openapiFields.add("product_images");
    openapiFields.add("product_price");
    openapiFields.add("product_source");
    openapiFields.add("product_title");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor
  */
  public static NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoShoppingCartAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

