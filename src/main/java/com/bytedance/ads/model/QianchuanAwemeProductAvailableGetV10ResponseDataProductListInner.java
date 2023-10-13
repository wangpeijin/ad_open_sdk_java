/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeProductAvailableGetV10DataProductListChannelType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner {
  public static final String SERIALIZED_NAME_CATEGORY_NAME = "category_name";
  @SerializedName(SERIALIZED_NAME_CATEGORY_NAME)
  private String categoryName = null;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private Long channelId = null;

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private QianchuanAwemeProductAvailableGetV10DataProductListChannelType channelType = null;

  public static final String SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE = "discount_higher_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_HIGHER_PRICE)
  private Double discountHigherPrice = null;

  public static final String SERIALIZED_NAME_DISCOUNT_LOWER_PRICE = "discount_lower_price";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_LOWER_PRICE)
  private Double discountLowerPrice = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img = null;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Long inventory = null;

  public static final String SERIALIZED_NAME_MARKETING_PRICE = "marketing_price";
  @SerializedName(SERIALIZED_NAME_MARKETING_PRICE)
  private Double marketingPrice = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PRODUCT_RATE = "product_rate";
  @SerializedName(SERIALIZED_NAME_PRODUCT_RATE)
  private Long productRate = null;

  public static final String SERIALIZED_NAME_SUPPORT_PRODUCT_NEW_OPEN = "support_product_new_open";
  @SerializedName(SERIALIZED_NAME_SUPPORT_PRODUCT_NEW_OPEN)
  private Boolean supportProductNewOpen = null;

  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner() {
  }

  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner categoryName(String categoryName) {
    
    this.categoryName = categoryName;
    return this;
  }

   /**
   * 
   * @return categoryName
  **/
  @javax.annotation.Nullable
  public String getCategoryName() {
    return categoryName;
  }


  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner channelId(Long channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * 
   * @return channelId
  **/
  @javax.annotation.Nullable
  public Long getChannelId() {
    return channelId;
  }


  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner channelType(QianchuanAwemeProductAvailableGetV10DataProductListChannelType channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * Get channelType
   * @return channelType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeProductAvailableGetV10DataProductListChannelType getChannelType() {
    return channelType;
  }


  public void setChannelType(QianchuanAwemeProductAvailableGetV10DataProductListChannelType channelType) {
    this.channelType = channelType;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner discountHigherPrice(Double discountHigherPrice) {
    
    this.discountHigherPrice = discountHigherPrice;
    return this;
  }

   /**
   * 
   * @return discountHigherPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountHigherPrice() {
    return discountHigherPrice;
  }


  public void setDiscountHigherPrice(Double discountHigherPrice) {
    this.discountHigherPrice = discountHigherPrice;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner discountLowerPrice(Double discountLowerPrice) {
    
    this.discountLowerPrice = discountLowerPrice;
    return this;
  }

   /**
   * 
   * @return discountLowerPrice
  **/
  @javax.annotation.Nullable
  public Double getDiscountLowerPrice() {
    return discountLowerPrice;
  }


  public void setDiscountLowerPrice(Double discountLowerPrice) {
    this.discountLowerPrice = discountLowerPrice;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner img(String img) {
    
    this.img = img;
    return this;
  }

   /**
   * 
   * @return img
  **/
  @javax.annotation.Nullable
  public String getImg() {
    return img;
  }


  public void setImg(String img) {
    this.img = img;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner inventory(Long inventory) {
    
    this.inventory = inventory;
    return this;
  }

   /**
   * 
   * @return inventory
  **/
  @javax.annotation.Nullable
  public Long getInventory() {
    return inventory;
  }


  public void setInventory(Long inventory) {
    this.inventory = inventory;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner marketingPrice(Double marketingPrice) {
    
    this.marketingPrice = marketingPrice;
    return this;
  }

   /**
   * 
   * @return marketingPrice
  **/
  @javax.annotation.Nullable
  public Double getMarketingPrice() {
    return marketingPrice;
  }


  public void setMarketingPrice(Double marketingPrice) {
    this.marketingPrice = marketingPrice;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner productRate(Long productRate) {
    
    this.productRate = productRate;
    return this;
  }

   /**
   * 
   * @return productRate
  **/
  @javax.annotation.Nullable
  public Long getProductRate() {
    return productRate;
  }


  public void setProductRate(Long productRate) {
    this.productRate = productRate;
  }


  public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner supportProductNewOpen(Boolean supportProductNewOpen) {
    
    this.supportProductNewOpen = supportProductNewOpen;
    return this;
  }

   /**
   * 
   * @return supportProductNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getSupportProductNewOpen() {
    return supportProductNewOpen;
  }


  public void setSupportProductNewOpen(Boolean supportProductNewOpen) {
    this.supportProductNewOpen = supportProductNewOpen;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner = (QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner) o;
    return Objects.equals(this.categoryName, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.categoryName) &&
        Objects.equals(this.channelId, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.channelId) &&
        Objects.equals(this.channelType, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.channelType) &&
        Objects.equals(this.discountHigherPrice, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.discountHigherPrice) &&
        Objects.equals(this.discountLowerPrice, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.discountLowerPrice) &&
        Objects.equals(this.id, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.id) &&
        Objects.equals(this.img, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.img) &&
        Objects.equals(this.inventory, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.inventory) &&
        Objects.equals(this.marketingPrice, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.marketingPrice) &&
        Objects.equals(this.name, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.name) &&
        Objects.equals(this.productRate, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.productRate) &&
        Objects.equals(this.supportProductNewOpen, qianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.supportProductNewOpen);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, channelId, channelType, discountHigherPrice, discountLowerPrice, id, img, inventory, marketingPrice, name, productRate, supportProductNewOpen);
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
    sb.append("class QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    discountHigherPrice: ").append(toIndentedString(discountHigherPrice)).append("\n");
    sb.append("    discountLowerPrice: ").append(toIndentedString(discountLowerPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    marketingPrice: ").append(toIndentedString(marketingPrice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productRate: ").append(toIndentedString(productRate)).append("\n");
    sb.append("    supportProductNewOpen: ").append(toIndentedString(supportProductNewOpen)).append("\n");
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
    openapiFields.add("category_name");
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");
    openapiFields.add("discount_higher_price");
    openapiFields.add("discount_lower_price");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("inventory");
    openapiFields.add("marketing_price");
    openapiFields.add("name");
    openapiFields.add("product_rate");
    openapiFields.add("support_product_new_open");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("img");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner
  */
  public static QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeProductAvailableGetV10ResponseDataProductListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

