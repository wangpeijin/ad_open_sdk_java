/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdSharedBalanceInfo;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoEcpOnlyBalanceInfo;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoLocalOnlyBalanceInfo;
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
 * 通用余额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo {
  public static final String SERIALIZED_NAME_AD_ONLY_BALANCE_INFO = "ad_only_balance_info";
  @SerializedName(SERIALIZED_NAME_AD_ONLY_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo adOnlyBalanceInfo = null;

  public static final String SERIALIZED_NAME_AD_SHARED_BALANCE_INFO = "ad_shared_balance_info";
  @SerializedName(SERIALIZED_NAME_AD_SHARED_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdSharedBalanceInfo adSharedBalanceInfo = null;

  public static final String SERIALIZED_NAME_ECP_ONLY_BALANCE_INFO = "ecp_only_balance_info";
  @SerializedName(SERIALIZED_NAME_ECP_ONLY_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoEcpOnlyBalanceInfo ecpOnlyBalanceInfo = null;

  public static final String SERIALIZED_NAME_LOCAL_ONLY_BALANCE_INFO = "local_only_balance_info";
  @SerializedName(SERIALIZED_NAME_LOCAL_ONLY_BALANCE_INFO)
  private SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoLocalOnlyBalanceInfo localOnlyBalanceInfo = null;

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo() {
  }

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo adOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo adOnlyBalanceInfo) {
    
    this.adOnlyBalanceInfo = adOnlyBalanceInfo;
    return this;
  }

   /**
   * Get adOnlyBalanceInfo
   * @return adOnlyBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo getAdOnlyBalanceInfo() {
    return adOnlyBalanceInfo;
  }


  public void setAdOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo adOnlyBalanceInfo) {
    this.adOnlyBalanceInfo = adOnlyBalanceInfo;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo adSharedBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdSharedBalanceInfo adSharedBalanceInfo) {
    
    this.adSharedBalanceInfo = adSharedBalanceInfo;
    return this;
  }

   /**
   * Get adSharedBalanceInfo
   * @return adSharedBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdSharedBalanceInfo getAdSharedBalanceInfo() {
    return adSharedBalanceInfo;
  }


  public void setAdSharedBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdSharedBalanceInfo adSharedBalanceInfo) {
    this.adSharedBalanceInfo = adSharedBalanceInfo;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo ecpOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoEcpOnlyBalanceInfo ecpOnlyBalanceInfo) {
    
    this.ecpOnlyBalanceInfo = ecpOnlyBalanceInfo;
    return this;
  }

   /**
   * Get ecpOnlyBalanceInfo
   * @return ecpOnlyBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoEcpOnlyBalanceInfo getEcpOnlyBalanceInfo() {
    return ecpOnlyBalanceInfo;
  }


  public void setEcpOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoEcpOnlyBalanceInfo ecpOnlyBalanceInfo) {
    this.ecpOnlyBalanceInfo = ecpOnlyBalanceInfo;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo localOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoLocalOnlyBalanceInfo localOnlyBalanceInfo) {
    
    this.localOnlyBalanceInfo = localOnlyBalanceInfo;
    return this;
  }

   /**
   * Get localOnlyBalanceInfo
   * @return localOnlyBalanceInfo
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoLocalOnlyBalanceInfo getLocalOnlyBalanceInfo() {
    return localOnlyBalanceInfo;
  }


  public void setLocalOnlyBalanceInfo(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoLocalOnlyBalanceInfo localOnlyBalanceInfo) {
    this.localOnlyBalanceInfo = localOnlyBalanceInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo = (SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo) o;
    return Objects.equals(this.adOnlyBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.adOnlyBalanceInfo) &&
        Objects.equals(this.adSharedBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.adSharedBalanceInfo) &&
        Objects.equals(this.ecpOnlyBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.ecpOnlyBalanceInfo) &&
        Objects.equals(this.localOnlyBalanceInfo, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.localOnlyBalanceInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adOnlyBalanceInfo, adSharedBalanceInfo, ecpOnlyBalanceInfo, localOnlyBalanceInfo);
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
    sb.append("class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo {\n");
    sb.append("    adOnlyBalanceInfo: ").append(toIndentedString(adOnlyBalanceInfo)).append("\n");
    sb.append("    adSharedBalanceInfo: ").append(toIndentedString(adSharedBalanceInfo)).append("\n");
    sb.append("    ecpOnlyBalanceInfo: ").append(toIndentedString(ecpOnlyBalanceInfo)).append("\n");
    sb.append("    localOnlyBalanceInfo: ").append(toIndentedString(localOnlyBalanceInfo)).append("\n");
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
    openapiFields.add("ad_only_balance_info");
    openapiFields.add("ad_shared_balance_info");
    openapiFields.add("ecp_only_balance_info");
    openapiFields.add("local_only_balance_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo
  */
  public static SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

