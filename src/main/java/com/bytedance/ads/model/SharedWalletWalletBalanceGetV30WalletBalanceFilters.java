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
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30WalletBalanceFiltersAccountPlatformType;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30WalletBalanceFiltersDeliveryType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
public class SharedWalletWalletBalanceGetV30WalletBalanceFilters {
  public static final String SERIALIZED_NAME_ACCOUNT_PLATFORM_TYPE = "account_platform_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PLATFORM_TYPE)
  private SharedWalletWalletBalanceGetV30WalletBalanceFiltersAccountPlatformType accountPlatformType = null;

  public static final String SERIALIZED_NAME_CAPITAL_TYPE = "capital_type";
  @SerializedName(SERIALIZED_NAME_CAPITAL_TYPE)
  private SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType capitalType = null;

  public static final String SERIALIZED_NAME_DELIVERY_TYPE = "delivery_type";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TYPE)
  private SharedWalletWalletBalanceGetV30WalletBalanceFiltersDeliveryType deliveryType = null;

  public SharedWalletWalletBalanceGetV30WalletBalanceFilters() {
  }

  public SharedWalletWalletBalanceGetV30WalletBalanceFilters accountPlatformType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersAccountPlatformType accountPlatformType) {
    
    this.accountPlatformType = accountPlatformType;
    return this;
  }

   /**
   * Get accountPlatformType
   * @return accountPlatformType
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30WalletBalanceFiltersAccountPlatformType getAccountPlatformType() {
    return accountPlatformType;
  }


  public void setAccountPlatformType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersAccountPlatformType accountPlatformType) {
    this.accountPlatformType = accountPlatformType;
  }


  public SharedWalletWalletBalanceGetV30WalletBalanceFilters capitalType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType capitalType) {
    
    this.capitalType = capitalType;
    return this;
  }

   /**
   * Get capitalType
   * @return capitalType
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType getCapitalType() {
    return capitalType;
  }


  public void setCapitalType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersCapitalType capitalType) {
    this.capitalType = capitalType;
  }


  public SharedWalletWalletBalanceGetV30WalletBalanceFilters deliveryType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersDeliveryType deliveryType) {
    
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30WalletBalanceFiltersDeliveryType getDeliveryType() {
    return deliveryType;
  }


  public void setDeliveryType(SharedWalletWalletBalanceGetV30WalletBalanceFiltersDeliveryType deliveryType) {
    this.deliveryType = deliveryType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletBalanceGetV30WalletBalanceFilters sharedWalletWalletBalanceGetV30WalletBalanceFilters = (SharedWalletWalletBalanceGetV30WalletBalanceFilters) o;
    return Objects.equals(this.accountPlatformType, sharedWalletWalletBalanceGetV30WalletBalanceFilters.accountPlatformType) &&
        Objects.equals(this.capitalType, sharedWalletWalletBalanceGetV30WalletBalanceFilters.capitalType) &&
        Objects.equals(this.deliveryType, sharedWalletWalletBalanceGetV30WalletBalanceFilters.deliveryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPlatformType, capitalType, deliveryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedWalletWalletBalanceGetV30WalletBalanceFilters {\n");
    sb.append("    accountPlatformType: ").append(toIndentedString(accountPlatformType)).append("\n");
    sb.append("    capitalType: ").append(toIndentedString(capitalType)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
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
    openapiFields.add("account_platform_type");
    openapiFields.add("capital_type");
    openapiFields.add("delivery_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletBalanceGetV30WalletBalanceFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletBalanceGetV30WalletBalanceFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletBalanceGetV30WalletBalanceFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletBalanceGetV30WalletBalanceFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletBalanceGetV30WalletBalanceFilters>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletBalanceGetV30WalletBalanceFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletBalanceGetV30WalletBalanceFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletBalanceGetV30WalletBalanceFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletBalanceGetV30WalletBalanceFilters
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletBalanceGetV30WalletBalanceFilters
  */
  public static SharedWalletWalletBalanceGetV30WalletBalanceFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletBalanceGetV30WalletBalanceFilters.class);
  }

 /**
  * Convert an instance of SharedWalletWalletBalanceGetV30WalletBalanceFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

