/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ServeMarketOrderGetV10DataOrderListOrderStatus;
import com.bytedance.ads.model.ServeMarketOrderGetV10DataOrderListSkuType;
import com.bytedance.ads.model.ServeMarketOrderGetV10ResponseDataOrderListInnerFunction;
import com.bytedance.ads.model.ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner;
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
 * ServeMarketOrderGetV10ResponseDataOrderListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ServeMarketOrderGetV10ResponseDataOrderListInner {
  public static final String SERIALIZED_NAME_APP_ACTIVE_DAYS = "app_active_days";
  @SerializedName(SERIALIZED_NAME_APP_ACTIVE_DAYS)
  private Long appActiveDays = null;

  public static final String SERIALIZED_NAME_APP_AVAILABLE_USER_IDS = "app_available_user_ids";
  @SerializedName(SERIALIZED_NAME_APP_AVAILABLE_USER_IDS)
  private List<Long> appAvailableUserIds = null;

  public static final String SERIALIZED_NAME_APP_LIMIT_USER_COUNT = "app_limit_user_count";
  @SerializedName(SERIALIZED_NAME_APP_LIMIT_USER_COUNT)
  private Long appLimitUserCount = null;

  public static final String SERIALIZED_NAME_BEGIN_TIME = "begin_time";
  @SerializedName(SERIALIZED_NAME_BEGIN_TIME)
  private Long beginTime = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Long fee = null;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private ServeMarketOrderGetV10ResponseDataOrderListInnerFunction function = null;

  public static final String SERIALIZED_NAME_IS_FUNC = "is_func";
  @SerializedName(SERIALIZED_NAME_IS_FUNC)
  private Boolean isFunc = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private ServeMarketOrderGetV10DataOrderListOrderStatus orderStatus = null;

  public static final String SERIALIZED_NAME_ORIGIN_PRICE = "origin_price";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PRICE)
  private Long originPrice = null;

  public static final String SERIALIZED_NAME_PAID_USER_ID = "paid_user_id";
  @SerializedName(SERIALIZED_NAME_PAID_USER_ID)
  private Long paidUserId = null;

  public static final String SERIALIZED_NAME_PAY_TIME = "pay_time";
  @SerializedName(SERIALIZED_NAME_PAY_TIME)
  private Long payTime = null;

  public static final String SERIALIZED_NAME_SKU_DESCRIPTION = "sku_description";
  @SerializedName(SERIALIZED_NAME_SKU_DESCRIPTION)
  private String skuDescription = null;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private Long skuId = null;

  public static final String SERIALIZED_NAME_SKU_TYPE = "sku_type";
  @SerializedName(SERIALIZED_NAME_SKU_TYPE)
  private ServeMarketOrderGetV10DataOrderListSkuType skuType = null;

  public static final String SERIALIZED_NAME_SPECS = "specs";
  @SerializedName(SERIALIZED_NAME_SPECS)
  private List<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner> specs = null;

  public ServeMarketOrderGetV10ResponseDataOrderListInner() {
  }

  public ServeMarketOrderGetV10ResponseDataOrderListInner appActiveDays(Long appActiveDays) {
    
    this.appActiveDays = appActiveDays;
    return this;
  }

   /**
   * 
   * @return appActiveDays
  **/
  @javax.annotation.Nullable
  public Long getAppActiveDays() {
    return appActiveDays;
  }


  public void setAppActiveDays(Long appActiveDays) {
    this.appActiveDays = appActiveDays;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner appAvailableUserIds(List<Long> appAvailableUserIds) {
    
    this.appAvailableUserIds = appAvailableUserIds;
    return this;
  }

  public ServeMarketOrderGetV10ResponseDataOrderListInner addAppAvailableUserIdsItem(Long appAvailableUserIdsItem) {
    if (this.appAvailableUserIds == null) {
      this.appAvailableUserIds = new ArrayList<>();
    }
    this.appAvailableUserIds.add(appAvailableUserIdsItem);
    return this;
  }

   /**
   * 
   * @return appAvailableUserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAppAvailableUserIds() {
    return appAvailableUserIds;
  }


  public void setAppAvailableUserIds(List<Long> appAvailableUserIds) {
    this.appAvailableUserIds = appAvailableUserIds;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner appLimitUserCount(Long appLimitUserCount) {
    
    this.appLimitUserCount = appLimitUserCount;
    return this;
  }

   /**
   * 
   * @return appLimitUserCount
  **/
  @javax.annotation.Nullable
  public Long getAppLimitUserCount() {
    return appLimitUserCount;
  }


  public void setAppLimitUserCount(Long appLimitUserCount) {
    this.appLimitUserCount = appLimitUserCount;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner beginTime(Long beginTime) {
    
    this.beginTime = beginTime;
    return this;
  }

   /**
   * 
   * @return beginTime
  **/
  @javax.annotation.Nullable
  public Long getBeginTime() {
    return beginTime;
  }


  public void setBeginTime(Long beginTime) {
    this.beginTime = beginTime;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner fee(Long fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * 
   * @return fee
  **/
  @javax.annotation.Nullable
  public Long getFee() {
    return fee;
  }


  public void setFee(Long fee) {
    this.fee = fee;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner function(ServeMarketOrderGetV10ResponseDataOrderListInnerFunction function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nullable
  public ServeMarketOrderGetV10ResponseDataOrderListInnerFunction getFunction() {
    return function;
  }


  public void setFunction(ServeMarketOrderGetV10ResponseDataOrderListInnerFunction function) {
    this.function = function;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner isFunc(Boolean isFunc) {
    
    this.isFunc = isFunc;
    return this;
  }

   /**
   * 是否是付费功能点类型的sku
   * @return isFunc
  **/
  @javax.annotation.Nullable
  public Boolean getIsFunc() {
    return isFunc;
  }


  public void setIsFunc(Boolean isFunc) {
    this.isFunc = isFunc;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner orderStatus(ServeMarketOrderGetV10DataOrderListOrderStatus orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  public ServeMarketOrderGetV10DataOrderListOrderStatus getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(ServeMarketOrderGetV10DataOrderListOrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner originPrice(Long originPrice) {
    
    this.originPrice = originPrice;
    return this;
  }

   /**
   * 
   * @return originPrice
  **/
  @javax.annotation.Nullable
  public Long getOriginPrice() {
    return originPrice;
  }


  public void setOriginPrice(Long originPrice) {
    this.originPrice = originPrice;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner paidUserId(Long paidUserId) {
    
    this.paidUserId = paidUserId;
    return this;
  }

   /**
   * 
   * @return paidUserId
  **/
  @javax.annotation.Nullable
  public Long getPaidUserId() {
    return paidUserId;
  }


  public void setPaidUserId(Long paidUserId) {
    this.paidUserId = paidUserId;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner payTime(Long payTime) {
    
    this.payTime = payTime;
    return this;
  }

   /**
   * 
   * @return payTime
  **/
  @javax.annotation.Nullable
  public Long getPayTime() {
    return payTime;
  }


  public void setPayTime(Long payTime) {
    this.payTime = payTime;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner skuDescription(String skuDescription) {
    
    this.skuDescription = skuDescription;
    return this;
  }

   /**
   * 
   * @return skuDescription
  **/
  @javax.annotation.Nullable
  public String getSkuDescription() {
    return skuDescription;
  }


  public void setSkuDescription(String skuDescription) {
    this.skuDescription = skuDescription;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner skuId(Long skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * 
   * @return skuId
  **/
  @javax.annotation.Nullable
  public Long getSkuId() {
    return skuId;
  }


  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner skuType(ServeMarketOrderGetV10DataOrderListSkuType skuType) {
    
    this.skuType = skuType;
    return this;
  }

   /**
   * Get skuType
   * @return skuType
  **/
  @javax.annotation.Nullable
  public ServeMarketOrderGetV10DataOrderListSkuType getSkuType() {
    return skuType;
  }


  public void setSkuType(ServeMarketOrderGetV10DataOrderListSkuType skuType) {
    this.skuType = skuType;
  }


  public ServeMarketOrderGetV10ResponseDataOrderListInner specs(List<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner> specs) {
    
    this.specs = specs;
    return this;
  }

  public ServeMarketOrderGetV10ResponseDataOrderListInner addSpecsItem(ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner specsItem) {
    if (this.specs == null) {
      this.specs = new ArrayList<>();
    }
    this.specs.add(specsItem);
    return this;
  }

   /**
   * 
   * @return specs
  **/
  @javax.annotation.Nullable
  public List<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner> getSpecs() {
    return specs;
  }


  public void setSpecs(List<ServeMarketOrderGetV10ResponseDataOrderListInnerSpecsInner> specs) {
    this.specs = specs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServeMarketOrderGetV10ResponseDataOrderListInner serveMarketOrderGetV10ResponseDataOrderListInner = (ServeMarketOrderGetV10ResponseDataOrderListInner) o;
    return Objects.equals(this.appActiveDays, serveMarketOrderGetV10ResponseDataOrderListInner.appActiveDays) &&
        Objects.equals(this.appAvailableUserIds, serveMarketOrderGetV10ResponseDataOrderListInner.appAvailableUserIds) &&
        Objects.equals(this.appLimitUserCount, serveMarketOrderGetV10ResponseDataOrderListInner.appLimitUserCount) &&
        Objects.equals(this.beginTime, serveMarketOrderGetV10ResponseDataOrderListInner.beginTime) &&
        Objects.equals(this.createTime, serveMarketOrderGetV10ResponseDataOrderListInner.createTime) &&
        Objects.equals(this.endTime, serveMarketOrderGetV10ResponseDataOrderListInner.endTime) &&
        Objects.equals(this.fee, serveMarketOrderGetV10ResponseDataOrderListInner.fee) &&
        Objects.equals(this.function, serveMarketOrderGetV10ResponseDataOrderListInner.function) &&
        Objects.equals(this.isFunc, serveMarketOrderGetV10ResponseDataOrderListInner.isFunc) &&
        Objects.equals(this.orderId, serveMarketOrderGetV10ResponseDataOrderListInner.orderId) &&
        Objects.equals(this.orderStatus, serveMarketOrderGetV10ResponseDataOrderListInner.orderStatus) &&
        Objects.equals(this.originPrice, serveMarketOrderGetV10ResponseDataOrderListInner.originPrice) &&
        Objects.equals(this.paidUserId, serveMarketOrderGetV10ResponseDataOrderListInner.paidUserId) &&
        Objects.equals(this.payTime, serveMarketOrderGetV10ResponseDataOrderListInner.payTime) &&
        Objects.equals(this.skuDescription, serveMarketOrderGetV10ResponseDataOrderListInner.skuDescription) &&
        Objects.equals(this.skuId, serveMarketOrderGetV10ResponseDataOrderListInner.skuId) &&
        Objects.equals(this.skuType, serveMarketOrderGetV10ResponseDataOrderListInner.skuType) &&
        Objects.equals(this.specs, serveMarketOrderGetV10ResponseDataOrderListInner.specs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appActiveDays, appAvailableUserIds, appLimitUserCount, beginTime, createTime, endTime, fee, function, isFunc, orderId, orderStatus, originPrice, paidUserId, payTime, skuDescription, skuId, skuType, specs);
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
    sb.append("class ServeMarketOrderGetV10ResponseDataOrderListInner {\n");
    sb.append("    appActiveDays: ").append(toIndentedString(appActiveDays)).append("\n");
    sb.append("    appAvailableUserIds: ").append(toIndentedString(appAvailableUserIds)).append("\n");
    sb.append("    appLimitUserCount: ").append(toIndentedString(appLimitUserCount)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    isFunc: ").append(toIndentedString(isFunc)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    originPrice: ").append(toIndentedString(originPrice)).append("\n");
    sb.append("    paidUserId: ").append(toIndentedString(paidUserId)).append("\n");
    sb.append("    payTime: ").append(toIndentedString(payTime)).append("\n");
    sb.append("    skuDescription: ").append(toIndentedString(skuDescription)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    skuType: ").append(toIndentedString(skuType)).append("\n");
    sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
    openapiFields.add("app_active_days");
    openapiFields.add("app_available_user_ids");
    openapiFields.add("app_limit_user_count");
    openapiFields.add("begin_time");
    openapiFields.add("create_time");
    openapiFields.add("end_time");
    openapiFields.add("fee");
    openapiFields.add("function");
    openapiFields.add("is_func");
    openapiFields.add("order_id");
    openapiFields.add("order_status");
    openapiFields.add("origin_price");
    openapiFields.add("paid_user_id");
    openapiFields.add("pay_time");
    openapiFields.add("sku_description");
    openapiFields.add("sku_id");
    openapiFields.add("sku_type");
    openapiFields.add("specs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServeMarketOrderGetV10ResponseDataOrderListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServeMarketOrderGetV10ResponseDataOrderListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServeMarketOrderGetV10ResponseDataOrderListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ServeMarketOrderGetV10ResponseDataOrderListInner>() {
           @Override
           public void write(JsonWriter out, ServeMarketOrderGetV10ResponseDataOrderListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ServeMarketOrderGetV10ResponseDataOrderListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ServeMarketOrderGetV10ResponseDataOrderListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServeMarketOrderGetV10ResponseDataOrderListInner
  * @throws IOException if the JSON string is invalid with respect to ServeMarketOrderGetV10ResponseDataOrderListInner
  */
  public static ServeMarketOrderGetV10ResponseDataOrderListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServeMarketOrderGetV10ResponseDataOrderListInner.class);
  }

 /**
  * Convert an instance of ServeMarketOrderGetV10ResponseDataOrderListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

