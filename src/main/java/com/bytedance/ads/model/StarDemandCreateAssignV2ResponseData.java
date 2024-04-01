/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateAssignV2ResponseDataBillInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class StarDemandCreateAssignV2ResponseData {
  public static final String SERIALIZED_NAME_BILL_INFO = "bill_info";
  @SerializedName(SERIALIZED_NAME_BILL_INFO)
  private StarDemandCreateAssignV2ResponseDataBillInfo billInfo = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public StarDemandCreateAssignV2ResponseData() {
  }

  public StarDemandCreateAssignV2ResponseData billInfo(StarDemandCreateAssignV2ResponseDataBillInfo billInfo) {
    
    this.billInfo = billInfo;
    return this;
  }

   /**
   * Get billInfo
   * @return billInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateAssignV2ResponseDataBillInfo getBillInfo() {
    return billInfo;
  }


  public void setBillInfo(StarDemandCreateAssignV2ResponseDataBillInfo billInfo) {
    this.billInfo = billInfo;
  }


  public StarDemandCreateAssignV2ResponseData campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 需求ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public StarDemandCreateAssignV2ResponseData orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public StarDemandCreateAssignV2ResponseData addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 任务ID列表
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2ResponseData starDemandCreateAssignV2ResponseData = (StarDemandCreateAssignV2ResponseData) o;
    return Objects.equals(this.billInfo, starDemandCreateAssignV2ResponseData.billInfo) &&
        Objects.equals(this.campaignId, starDemandCreateAssignV2ResponseData.campaignId) &&
        Objects.equals(this.orderIds, starDemandCreateAssignV2ResponseData.orderIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billInfo, campaignId, orderIds);
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
    sb.append("class StarDemandCreateAssignV2ResponseData {\n");
    sb.append("    billInfo: ").append(toIndentedString(billInfo)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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
    openapiFields.add("bill_info");
    openapiFields.add("campaign_id");
    openapiFields.add("order_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2ResponseData
  */
  public static StarDemandCreateAssignV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2ResponseData.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

