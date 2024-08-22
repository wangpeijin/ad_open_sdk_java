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
import com.bytedance.ads.model.NativeAnchorUpdateV30AnchorInfoShoppingCartAnchorLinkType;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner;
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
 * 购物车锚点，当anchor_type&#x3D;SHOPPING_CART：购物车锚点时必填
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private NativeAnchorUpdateV30AnchorInfoShoppingCartAnchorLinkType linkType = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "product_images";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages = null;

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

  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor linkType(NativeAnchorUpdateV30AnchorInfoShoppingCartAnchorLinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30AnchorInfoShoppingCartAnchorLinkType getLinkType() {
    return linkType;
  }


  public void setLinkType(NativeAnchorUpdateV30AnchorInfoShoppingCartAnchorLinkType linkType) {
    this.linkType = linkType;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor productImages(List<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages) {
    
    this.productImages = productImages;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor addProductImagesItem(NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner productImagesItem) {
    if (this.productImages == null) {
      this.productImages = new ArrayList<>();
    }
    this.productImages.add(productImagesItem);
    return this;
  }

   /**
   * 商品图片，比例1:1，至少1张
   * @return productImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> getProductImages() {
    return productImages;
  }


  public void setProductImages(List<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchorProductImagesInner> productImages) {
    this.productImages = productImages;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 商品价格，最多两位小数
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor productSource(String productSource) {
    
    this.productSource = productSource;
    return this;
  }

   /**
   * 商品来源，只支持填写淘宝/天猫/京东/拼多多/唯品会/得物
   * @return productSource
  **/
  @javax.annotation.Nullable
  public String getProductSource() {
    return productSource;
  }


  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * 商品标题，不超过35个字
   * @return productTitle
  **/
  @javax.annotation.Nullable
  public String getProductTitle() {
    return productTitle;
  }


  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 购物车小标题，不超过10个字
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
    NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor = (NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor) o;
    return Objects.equals(this.externalUrl, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.externalUrl) &&
        Objects.equals(this.linkType, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.linkType) &&
        Objects.equals(this.openUrl, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.openUrl) &&
        Objects.equals(this.productImages, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.productImages) &&
        Objects.equals(this.productPrice, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.productPrice) &&
        Objects.equals(this.productSource, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.productSource) &&
        Objects.equals(this.productTitle, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.productTitle) &&
        Objects.equals(this.title, nativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl, linkType, openUrl, productImages, productPrice, productSource, productTitle, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor {\n");
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
       if (!NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoShoppingCartAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

