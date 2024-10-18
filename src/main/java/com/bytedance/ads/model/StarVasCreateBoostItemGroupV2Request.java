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
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2BoostAction;
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2BoostType;
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2RequestCustomAudienceTag;
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
 * StarVasCreateBoostItemGroupV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarVasCreateBoostItemGroupV2Request {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bid_amount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private Long bidAmount = null;

  public static final String SERIALIZED_NAME_BOOST_ACTION = "boost_action";
  @SerializedName(SERIALIZED_NAME_BOOST_ACTION)
  private StarVasCreateBoostItemGroupV2BoostAction boostAction = null;

  public static final String SERIALIZED_NAME_BOOST_AMOUNT = "boost_amount";
  @SerializedName(SERIALIZED_NAME_BOOST_AMOUNT)
  private Long boostAmount = null;

  public static final String SERIALIZED_NAME_BOOST_HOURS = "boost_hours";
  @SerializedName(SERIALIZED_NAME_BOOST_HOURS)
  private Integer boostHours = null;

  public static final String SERIALIZED_NAME_BOOST_TYPE = "boost_type";
  @SerializedName(SERIALIZED_NAME_BOOST_TYPE)
  private StarVasCreateBoostItemGroupV2BoostType boostType = null;

  public static final String SERIALIZED_NAME_CUSTOM_AUDIENCE_TAG = "custom_audience_tag";
  @SerializedName(SERIALIZED_NAME_CUSTOM_AUDIENCE_TAG)
  private StarVasCreateBoostItemGroupV2RequestCustomAudienceTag customAudienceTag = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_PACK_ID = "pack_id";
  @SerializedName(SERIALIZED_NAME_PACK_ID)
  private Long packId = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarVasCreateBoostItemGroupV2Request() {
  }

  public StarVasCreateBoostItemGroupV2Request bidAmount(Long bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * 手动出价，乘百取整（如：0.1 -&gt; 10）。仅在boost_action为LINK_ACTION传参。如果不传，则为自动出价。可出价范围0.1~1000
   * @return bidAmount
  **/
  @javax.annotation.Nullable
  public Long getBidAmount() {
    return bidAmount;
  }


  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }


  public StarVasCreateBoostItemGroupV2Request boostAction(StarVasCreateBoostItemGroupV2BoostAction boostAction) {
    
    this.boostAction = boostAction;
    return this;
  }

   /**
   * Get boostAction
   * @return boostAction
  **/
  @javax.annotation.Nonnull
  public StarVasCreateBoostItemGroupV2BoostAction getBoostAction() {
    return boostAction;
  }


  public void setBoostAction(StarVasCreateBoostItemGroupV2BoostAction boostAction) {
    this.boostAction = boostAction;
  }


  public StarVasCreateBoostItemGroupV2Request boostAmount(Long boostAmount) {
    
    this.boostAmount = boostAmount;
    return this;
  }

   /**
   * 助推金额，单位元。范围为1千~1亿，且为100的倍数
   * @return boostAmount
  **/
  @javax.annotation.Nonnull
  public Long getBoostAmount() {
    return boostAmount;
  }


  public void setBoostAmount(Long boostAmount) {
    this.boostAmount = boostAmount;
  }


  public StarVasCreateBoostItemGroupV2Request boostHours(Integer boostHours) {
    
    this.boostHours = boostHours;
    return this;
  }

   /**
   * 自定义投放时长，单位时，仅且必须在boost_action为LINK_ACTION传参。时长范围为2天~7天。
   * @return boostHours
  **/
  @javax.annotation.Nullable
  public Integer getBoostHours() {
    return boostHours;
  }


  public void setBoostHours(Integer boostHours) {
    this.boostHours = boostHours;
  }


  public StarVasCreateBoostItemGroupV2Request boostType(StarVasCreateBoostItemGroupV2BoostType boostType) {
    
    this.boostType = boostType;
    return this;
  }

   /**
   * Get boostType
   * @return boostType
  **/
  @javax.annotation.Nonnull
  public StarVasCreateBoostItemGroupV2BoostType getBoostType() {
    return boostType;
  }


  public void setBoostType(StarVasCreateBoostItemGroupV2BoostType boostType) {
    this.boostType = boostType;
  }


  public StarVasCreateBoostItemGroupV2Request customAudienceTag(StarVasCreateBoostItemGroupV2RequestCustomAudienceTag customAudienceTag) {
    
    this.customAudienceTag = customAudienceTag;
    return this;
  }

   /**
   * Get customAudienceTag
   * @return customAudienceTag
  **/
  @javax.annotation.Nullable
  public StarVasCreateBoostItemGroupV2RequestCustomAudienceTag getCustomAudienceTag() {
    return customAudienceTag;
  }


  public void setCustomAudienceTag(StarVasCreateBoostItemGroupV2RequestCustomAudienceTag customAudienceTag) {
    this.customAudienceTag = customAudienceTag;
  }


  public StarVasCreateBoostItemGroupV2Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 加热组名称
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarVasCreateBoostItemGroupV2Request orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public StarVasCreateBoostItemGroupV2Request addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 关联指派单，指派单必须在当前同一主体账户下
   * @return orderIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public StarVasCreateBoostItemGroupV2Request packId(Long packId) {
    
    this.packId = packId;
    return this;
  }

   /**
   * 关联人群包，仅boost_type为CUSTOM_PACKAGE时传参
   * @return packId
  **/
  @javax.annotation.Nullable
  public Long getPackId() {
    return packId;
  }


  public void setPackId(Long packId) {
    this.packId = packId;
  }


  public StarVasCreateBoostItemGroupV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户ID
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasCreateBoostItemGroupV2Request starVasCreateBoostItemGroupV2Request = (StarVasCreateBoostItemGroupV2Request) o;
    return Objects.equals(this.bidAmount, starVasCreateBoostItemGroupV2Request.bidAmount) &&
        Objects.equals(this.boostAction, starVasCreateBoostItemGroupV2Request.boostAction) &&
        Objects.equals(this.boostAmount, starVasCreateBoostItemGroupV2Request.boostAmount) &&
        Objects.equals(this.boostHours, starVasCreateBoostItemGroupV2Request.boostHours) &&
        Objects.equals(this.boostType, starVasCreateBoostItemGroupV2Request.boostType) &&
        Objects.equals(this.customAudienceTag, starVasCreateBoostItemGroupV2Request.customAudienceTag) &&
        Objects.equals(this.name, starVasCreateBoostItemGroupV2Request.name) &&
        Objects.equals(this.orderIds, starVasCreateBoostItemGroupV2Request.orderIds) &&
        Objects.equals(this.packId, starVasCreateBoostItemGroupV2Request.packId) &&
        Objects.equals(this.starId, starVasCreateBoostItemGroupV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount, boostAction, boostAmount, boostHours, boostType, customAudienceTag, name, orderIds, packId, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasCreateBoostItemGroupV2Request {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
    sb.append("    boostAction: ").append(toIndentedString(boostAction)).append("\n");
    sb.append("    boostAmount: ").append(toIndentedString(boostAmount)).append("\n");
    sb.append("    boostHours: ").append(toIndentedString(boostHours)).append("\n");
    sb.append("    boostType: ").append(toIndentedString(boostType)).append("\n");
    sb.append("    customAudienceTag: ").append(toIndentedString(customAudienceTag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("bid_amount");
    openapiFields.add("boost_action");
    openapiFields.add("boost_amount");
    openapiFields.add("boost_hours");
    openapiFields.add("boost_type");
    openapiFields.add("custom_audience_tag");
    openapiFields.add("name");
    openapiFields.add("order_ids");
    openapiFields.add("pack_id");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("boost_action");
    openapiRequiredFields.add("boost_amount");
    openapiRequiredFields.add("boost_type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("order_ids");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasCreateBoostItemGroupV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasCreateBoostItemGroupV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasCreateBoostItemGroupV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasCreateBoostItemGroupV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasCreateBoostItemGroupV2Request>() {
           @Override
           public void write(JsonWriter out, StarVasCreateBoostItemGroupV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasCreateBoostItemGroupV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasCreateBoostItemGroupV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasCreateBoostItemGroupV2Request
  * @throws IOException if the JSON string is invalid with respect to StarVasCreateBoostItemGroupV2Request
  */
  public static StarVasCreateBoostItemGroupV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasCreateBoostItemGroupV2Request.class);
  }

 /**
  * Convert an instance of StarVasCreateBoostItemGroupV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

