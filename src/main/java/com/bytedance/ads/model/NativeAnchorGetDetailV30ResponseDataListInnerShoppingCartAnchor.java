/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorGetDetailV30DataListShoppingCartAnchorLinkType;
import com.bytedance.ads.model.NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor {
  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private NativeAnchorGetDetailV30DataListShoppingCartAnchorLinkType linkType = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGES = "product_images";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGES)
  private List<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner> productImages = null;

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

  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor() {
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor linkType(NativeAnchorGetDetailV30DataListShoppingCartAnchorLinkType linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * Get linkType
   * @return linkType
  **/
  @javax.annotation.Nullable
  public NativeAnchorGetDetailV30DataListShoppingCartAnchorLinkType getLinkType() {
    return linkType;
  }


  public void setLinkType(NativeAnchorGetDetailV30DataListShoppingCartAnchorLinkType linkType) {
    this.linkType = linkType;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor productImages(List<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner> productImages) {
    
    this.productImages = productImages;
    return this;
  }

  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor addProductImagesItem(NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner productImagesItem) {
    if (this.productImages == null) {
      this.productImages = new ArrayList<>();
    }
    this.productImages.add(productImagesItem);
    return this;
  }

   /**
   * 
   * @return productImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner> getProductImages() {
    return productImages;
  }


  public void setProductImages(List<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchorProductImagesInner> productImages) {
    this.productImages = productImages;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor productSource(String productSource) {
    
    this.productSource = productSource;
    return this;
  }

   /**
   * 
   * @return productSource
  **/
  @javax.annotation.Nullable
  public String getProductSource() {
    return productSource;
  }


  public void setProductSource(String productSource) {
    this.productSource = productSource;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * 
   * @return productTitle
  **/
  @javax.annotation.Nullable
  public String getProductTitle() {
    return productTitle;
  }


  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
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
    NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor = (NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor) o;
    return Objects.equals(this.externalUrl, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.externalUrl) &&
        Objects.equals(this.linkType, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.linkType) &&
        Objects.equals(this.openUrl, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.openUrl) &&
        Objects.equals(this.productImages, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.productImages) &&
        Objects.equals(this.productPrice, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.productPrice) &&
        Objects.equals(this.productSource, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.productSource) &&
        Objects.equals(this.productTitle, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.productTitle) &&
        Objects.equals(this.title, nativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalUrl, linkType, openUrl, productImages, productPrice, productSource, productTitle, title);
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
    sb.append("class NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor {\n");
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
       if (!NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor
  */
  public static NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorGetDetailV30ResponseDataListInnerShoppingCartAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

