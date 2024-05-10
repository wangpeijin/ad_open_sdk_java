/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfoSubSharedRange;
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
 * 投放钱包(小钱包)信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo {
  public static final String SERIALIZED_NAME_ADV_CNT = "adv_cnt";
  @SerializedName(SERIALIZED_NAME_ADV_CNT)
  private Long advCnt = null;

  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private Long mainWalletId = null;

  public static final String SERIALIZED_NAME_SUB_SHARED_RANGE = "sub_shared_range";
  @SerializedName(SERIALIZED_NAME_SUB_SHARED_RANGE)
  private SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfoSubSharedRange subSharedRange = null;

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo() {
  }

  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo advCnt(Long advCnt) {
    
    this.advCnt = advCnt;
    return this;
  }

   /**
   * 钱包下的 adv 数量
   * @return advCnt
  **/
  @javax.annotation.Nullable
  public Long getAdvCnt() {
    return advCnt;
  }


  public void setAdvCnt(Long advCnt) {
    this.advCnt = advCnt;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo mainWalletId(Long mainWalletId) {
    
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * 所属大钱包ID
   * @return mainWalletId
  **/
  @javax.annotation.Nullable
  public Long getMainWalletId() {
    return mainWalletId;
  }


  public void setMainWalletId(Long mainWalletId) {
    this.mainWalletId = mainWalletId;
  }


  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo subSharedRange(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfoSubSharedRange subSharedRange) {
    
    this.subSharedRange = subSharedRange;
    return this;
  }

   /**
   * Get subSharedRange
   * @return subSharedRange
  **/
  @javax.annotation.Nullable
  public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfoSubSharedRange getSubSharedRange() {
    return subSharedRange;
  }


  public void setSubSharedRange(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfoSubSharedRange subSharedRange) {
    this.subSharedRange = subSharedRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo = (SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo) o;
    return Objects.equals(this.advCnt, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.advCnt) &&
        Objects.equals(this.mainWalletId, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.mainWalletId) &&
        Objects.equals(this.subSharedRange, sharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.subSharedRange);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advCnt, mainWalletId, subSharedRange);
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
    sb.append("class SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo {\n");
    sb.append("    advCnt: ").append(toIndentedString(advCnt)).append("\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
    sb.append("    subSharedRange: ").append(toIndentedString(subSharedRange)).append("\n");
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
    openapiFields.add("adv_cnt");
    openapiFields.add("main_wallet_id");
    openapiFields.add("sub_shared_range");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo
  */
  public static SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletInfoGetV30ResponseDataWalletInfoInnerSubWalletInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

