/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsAccountPlatform;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsCustomerCategory;
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
 * SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner {
  public static final String SERIALIZED_NAME_ACCOUNT_PLATFORM = "account_platform";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PLATFORM)
  private SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsAccountPlatform accountPlatform = null;

  public static final String SERIALIZED_NAME_CUSTOMER_CATEGORY = "customer_category";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_CATEGORY)
  private SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsCustomerCategory customerCategory = null;

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner() {
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner accountPlatform(SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsAccountPlatform accountPlatform) {
    
    this.accountPlatform = accountPlatform;
    return this;
  }

   /**
   * Get accountPlatform
   * @return accountPlatform
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsAccountPlatform getAccountPlatform() {
    return accountPlatform;
  }


  public void setAccountPlatform(SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsAccountPlatform accountPlatform) {
    this.accountPlatform = accountPlatform;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner customerCategory(SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsCustomerCategory customerCategory) {
    
    this.customerCategory = customerCategory;
    return this;
  }

   /**
   * Get customerCategory
   * @return customerCategory
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsCustomerCategory getCustomerCategory() {
    return customerCategory;
  }


  public void setCustomerCategory(SharedWalletWalletInfoGetV30DataWalletInfoMainWalletInfoMainSharedRangeItemsCustomerCategory customerCategory) {
    this.customerCategory = customerCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner = (SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner) o;
    return Objects.equals(this.accountPlatform, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner.accountPlatform) &&
        Objects.equals(this.customerCategory, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner.customerCategory);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountPlatform, customerCategory);
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
    sb.append("class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner {\n");
    sb.append("    accountPlatform: ").append(toIndentedString(accountPlatform)).append("\n");
    sb.append("    customerCategory: ").append(toIndentedString(customerCategory)).append("\n");
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
    openapiFields.add("account_platform");
    openapiFields.add("customer_category");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner
  */
  public static SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner.class);
  }

 /**
  * Convert an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerMainWalletInfoMainSharedRangeItemsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

