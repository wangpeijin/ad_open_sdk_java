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
import com.bytedance.ads.model.QianchuanAdvertiserTypeGetV10DataListEcpType;
import com.bytedance.ads.model.QianchuanAdvertiserTypeGetV10DataListShopBusinessType;
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
 * QianchuanAdvertiserTypeGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAdvertiserTypeGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ECP_TYPE = "ecp_type";
  @SerializedName(SERIALIZED_NAME_ECP_TYPE)
  private QianchuanAdvertiserTypeGetV10DataListEcpType ecpType = null;

  public static final String SERIALIZED_NAME_SHOP_BUSINESS_TYPE = "shop_business_type";
  @SerializedName(SERIALIZED_NAME_SHOP_BUSINESS_TYPE)
  private QianchuanAdvertiserTypeGetV10DataListShopBusinessType shopBusinessType = null;

  public QianchuanAdvertiserTypeGetV10ResponseDataListInner() {
  }

  public QianchuanAdvertiserTypeGetV10ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAdvertiserTypeGetV10ResponseDataListInner ecpType(QianchuanAdvertiserTypeGetV10DataListEcpType ecpType) {
    
    this.ecpType = ecpType;
    return this;
  }

   /**
   * Get ecpType
   * @return ecpType
  **/
  @javax.annotation.Nullable
  public QianchuanAdvertiserTypeGetV10DataListEcpType getEcpType() {
    return ecpType;
  }


  public void setEcpType(QianchuanAdvertiserTypeGetV10DataListEcpType ecpType) {
    this.ecpType = ecpType;
  }


  public QianchuanAdvertiserTypeGetV10ResponseDataListInner shopBusinessType(QianchuanAdvertiserTypeGetV10DataListShopBusinessType shopBusinessType) {
    
    this.shopBusinessType = shopBusinessType;
    return this;
  }

   /**
   * Get shopBusinessType
   * @return shopBusinessType
  **/
  @javax.annotation.Nullable
  public QianchuanAdvertiserTypeGetV10DataListShopBusinessType getShopBusinessType() {
    return shopBusinessType;
  }


  public void setShopBusinessType(QianchuanAdvertiserTypeGetV10DataListShopBusinessType shopBusinessType) {
    this.shopBusinessType = shopBusinessType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdvertiserTypeGetV10ResponseDataListInner qianchuanAdvertiserTypeGetV10ResponseDataListInner = (QianchuanAdvertiserTypeGetV10ResponseDataListInner) o;
    return Objects.equals(this.advertiserId, qianchuanAdvertiserTypeGetV10ResponseDataListInner.advertiserId) &&
        Objects.equals(this.ecpType, qianchuanAdvertiserTypeGetV10ResponseDataListInner.ecpType) &&
        Objects.equals(this.shopBusinessType, qianchuanAdvertiserTypeGetV10ResponseDataListInner.shopBusinessType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, ecpType, shopBusinessType);
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
    sb.append("class QianchuanAdvertiserTypeGetV10ResponseDataListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    ecpType: ").append(toIndentedString(ecpType)).append("\n");
    sb.append("    shopBusinessType: ").append(toIndentedString(shopBusinessType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("ecp_type");
    openapiFields.add("shop_business_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdvertiserTypeGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdvertiserTypeGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdvertiserTypeGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdvertiserTypeGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdvertiserTypeGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdvertiserTypeGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdvertiserTypeGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdvertiserTypeGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdvertiserTypeGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdvertiserTypeGetV10ResponseDataListInner
  */
  public static QianchuanAdvertiserTypeGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdvertiserTypeGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdvertiserTypeGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

