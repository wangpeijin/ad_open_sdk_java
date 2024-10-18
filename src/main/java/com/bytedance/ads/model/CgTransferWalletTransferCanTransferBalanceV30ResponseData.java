/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class CgTransferWalletTransferCanTransferBalanceV30ResponseData {
  public static final String SERIALIZED_NAME_CAN_TRANSFER_DETAIL_LIST = "can_transfer_detail_list";
  @SerializedName(SERIALIZED_NAME_CAN_TRANSFER_DETAIL_LIST)
  private List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner> canTransferDetailList = null;

  public CgTransferWalletTransferCanTransferBalanceV30ResponseData() {
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseData canTransferDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner> canTransferDetailList) {
    
    this.canTransferDetailList = canTransferDetailList;
    return this;
  }

  public CgTransferWalletTransferCanTransferBalanceV30ResponseData addCanTransferDetailListItem(CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner canTransferDetailListItem) {
    if (this.canTransferDetailList == null) {
      this.canTransferDetailList = new ArrayList<>();
    }
    this.canTransferDetailList.add(canTransferDetailListItem);
    return this;
  }

   /**
   * 可转余额信息列表
   * @return canTransferDetailList
  **/
  @javax.annotation.Nullable
  public List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner> getCanTransferDetailList() {
    return canTransferDetailList;
  }


  public void setCanTransferDetailList(List<CgTransferWalletTransferCanTransferBalanceV30ResponseDataCanTransferDetailListInner> canTransferDetailList) {
    this.canTransferDetailList = canTransferDetailList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CgTransferWalletTransferCanTransferBalanceV30ResponseData cgTransferWalletTransferCanTransferBalanceV30ResponseData = (CgTransferWalletTransferCanTransferBalanceV30ResponseData) o;
    return Objects.equals(this.canTransferDetailList, cgTransferWalletTransferCanTransferBalanceV30ResponseData.canTransferDetailList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(canTransferDetailList);
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
    sb.append("class CgTransferWalletTransferCanTransferBalanceV30ResponseData {\n");
    sb.append("    canTransferDetailList: ").append(toIndentedString(canTransferDetailList)).append("\n");
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
    openapiFields.add("can_transfer_detail_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CgTransferWalletTransferCanTransferBalanceV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CgTransferWalletTransferCanTransferBalanceV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CgTransferWalletTransferCanTransferBalanceV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CgTransferWalletTransferCanTransferBalanceV30ResponseData>() {
           @Override
           public void write(JsonWriter out, CgTransferWalletTransferCanTransferBalanceV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CgTransferWalletTransferCanTransferBalanceV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CgTransferWalletTransferCanTransferBalanceV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to CgTransferWalletTransferCanTransferBalanceV30ResponseData
  */
  public static CgTransferWalletTransferCanTransferBalanceV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CgTransferWalletTransferCanTransferBalanceV30ResponseData.class);
  }

 /**
  * Convert an instance of CgTransferWalletTransferCanTransferBalanceV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

