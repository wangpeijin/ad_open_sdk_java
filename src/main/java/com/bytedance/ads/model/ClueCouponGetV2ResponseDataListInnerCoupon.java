/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponDetailV2ResponseDataCouponGlobalLimit;
import com.bytedance.ads.model.ClueCouponGetV2DataListCouponNeedPhone;
import com.bytedance.ads.model.ClueCouponGetV2DataListCouponNeedSmsVerify;
import com.bytedance.ads.model.ClueCouponGetV2DataListCouponStatus;
import com.bytedance.ads.model.ClueCouponGetV2ResponseDataListInnerCouponResourceListInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ClueCouponGetV2ResponseDataListInnerCoupon {
  public static final String SERIALIZED_NAME_COUPON_ID = "coupon_id";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Long couponId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DELIVER_END = "deliver_end";
  @SerializedName(SERIALIZED_NAME_DELIVER_END)
  private String deliverEnd = null;

  public static final String SERIALIZED_NAME_DELIVER_START = "deliver_start";
  @SerializedName(SERIALIZED_NAME_DELIVER_START)
  private String deliverStart = null;

  public static final String SERIALIZED_NAME_GLOBAL_LIMIT = "global_limit";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIMIT)
  private ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit = null;

  public static final String SERIALIZED_NAME_NEED_PHONE = "need_phone";
  @SerializedName(SERIALIZED_NAME_NEED_PHONE)
  private ClueCouponGetV2DataListCouponNeedPhone needPhone = null;

  public static final String SERIALIZED_NAME_NEED_SMS_VERIFY = "need_sms_verify";
  @SerializedName(SERIALIZED_NAME_NEED_SMS_VERIFY)
  private ClueCouponGetV2DataListCouponNeedSmsVerify needSmsVerify = null;

  public static final String SERIALIZED_NAME_RESOURCE_LIST = "resource_list";
  @SerializedName(SERIALIZED_NAME_RESOURCE_LIST)
  private List<ClueCouponGetV2ResponseDataListInnerCouponResourceListInner> resourceList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ClueCouponGetV2DataListCouponStatus status = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime = null;

  public static final String SERIALIZED_NAME_USER_LIMIT = "user_limit";
  @SerializedName(SERIALIZED_NAME_USER_LIMIT)
  private ClueCouponDetailV2ResponseDataCouponGlobalLimit userLimit = null;

  public ClueCouponGetV2ResponseDataListInnerCoupon() {
  }

  
  public ClueCouponGetV2ResponseDataListInnerCoupon(
     String createTime, 
     String updateTime
  ) {
    this();
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

  public ClueCouponGetV2ResponseDataListInnerCoupon couponId(Long couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * 
   * @return couponId
  **/
  @javax.annotation.Nullable
  public Long getCouponId() {
    return couponId;
  }


  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }


   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }




  public ClueCouponGetV2ResponseDataListInnerCoupon deliverEnd(String deliverEnd) {
    
    this.deliverEnd = deliverEnd;
    return this;
  }

   /**
   * 
   * @return deliverEnd
  **/
  @javax.annotation.Nullable
  public String getDeliverEnd() {
    return deliverEnd;
  }


  public void setDeliverEnd(String deliverEnd) {
    this.deliverEnd = deliverEnd;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon deliverStart(String deliverStart) {
    
    this.deliverStart = deliverStart;
    return this;
  }

   /**
   * 
   * @return deliverStart
  **/
  @javax.annotation.Nullable
  public String getDeliverStart() {
    return deliverStart;
  }


  public void setDeliverStart(String deliverStart) {
    this.deliverStart = deliverStart;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon globalLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit) {
    
    this.globalLimit = globalLimit;
    return this;
  }

   /**
   * Get globalLimit
   * @return globalLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataCouponGlobalLimit getGlobalLimit() {
    return globalLimit;
  }


  public void setGlobalLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit globalLimit) {
    this.globalLimit = globalLimit;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon needPhone(ClueCouponGetV2DataListCouponNeedPhone needPhone) {
    
    this.needPhone = needPhone;
    return this;
  }

   /**
   * Get needPhone
   * @return needPhone
  **/
  @javax.annotation.Nullable
  public ClueCouponGetV2DataListCouponNeedPhone getNeedPhone() {
    return needPhone;
  }


  public void setNeedPhone(ClueCouponGetV2DataListCouponNeedPhone needPhone) {
    this.needPhone = needPhone;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon needSmsVerify(ClueCouponGetV2DataListCouponNeedSmsVerify needSmsVerify) {
    
    this.needSmsVerify = needSmsVerify;
    return this;
  }

   /**
   * Get needSmsVerify
   * @return needSmsVerify
  **/
  @javax.annotation.Nullable
  public ClueCouponGetV2DataListCouponNeedSmsVerify getNeedSmsVerify() {
    return needSmsVerify;
  }


  public void setNeedSmsVerify(ClueCouponGetV2DataListCouponNeedSmsVerify needSmsVerify) {
    this.needSmsVerify = needSmsVerify;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon resourceList(List<ClueCouponGetV2ResponseDataListInnerCouponResourceListInner> resourceList) {
    
    this.resourceList = resourceList;
    return this;
  }

  public ClueCouponGetV2ResponseDataListInnerCoupon addResourceListItem(ClueCouponGetV2ResponseDataListInnerCouponResourceListInner resourceListItem) {
    if (this.resourceList == null) {
      this.resourceList = new ArrayList<>();
    }
    this.resourceList.add(resourceListItem);
    return this;
  }

   /**
   * 
   * @return resourceList
  **/
  @javax.annotation.Nullable
  public List<ClueCouponGetV2ResponseDataListInnerCouponResourceListInner> getResourceList() {
    return resourceList;
  }


  public void setResourceList(List<ClueCouponGetV2ResponseDataListInnerCouponResourceListInner> resourceList) {
    this.resourceList = resourceList;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon status(ClueCouponGetV2DataListCouponStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ClueCouponGetV2DataListCouponStatus getStatus() {
    return status;
  }


  public void setStatus(ClueCouponGetV2DataListCouponStatus status) {
    this.status = status;
  }


  public ClueCouponGetV2ResponseDataListInnerCoupon title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * 
   * @return updateTime
  **/
  @javax.annotation.Nullable
  public String getUpdateTime() {
    return updateTime;
  }




  public ClueCouponGetV2ResponseDataListInnerCoupon userLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit userLimit) {
    
    this.userLimit = userLimit;
    return this;
  }

   /**
   * Get userLimit
   * @return userLimit
  **/
  @javax.annotation.Nullable
  public ClueCouponDetailV2ResponseDataCouponGlobalLimit getUserLimit() {
    return userLimit;
  }


  public void setUserLimit(ClueCouponDetailV2ResponseDataCouponGlobalLimit userLimit) {
    this.userLimit = userLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponGetV2ResponseDataListInnerCoupon clueCouponGetV2ResponseDataListInnerCoupon = (ClueCouponGetV2ResponseDataListInnerCoupon) o;
    return Objects.equals(this.couponId, clueCouponGetV2ResponseDataListInnerCoupon.couponId) &&
        Objects.equals(this.createTime, clueCouponGetV2ResponseDataListInnerCoupon.createTime) &&
        Objects.equals(this.deliverEnd, clueCouponGetV2ResponseDataListInnerCoupon.deliverEnd) &&
        Objects.equals(this.deliverStart, clueCouponGetV2ResponseDataListInnerCoupon.deliverStart) &&
        Objects.equals(this.globalLimit, clueCouponGetV2ResponseDataListInnerCoupon.globalLimit) &&
        Objects.equals(this.needPhone, clueCouponGetV2ResponseDataListInnerCoupon.needPhone) &&
        Objects.equals(this.needSmsVerify, clueCouponGetV2ResponseDataListInnerCoupon.needSmsVerify) &&
        Objects.equals(this.resourceList, clueCouponGetV2ResponseDataListInnerCoupon.resourceList) &&
        Objects.equals(this.status, clueCouponGetV2ResponseDataListInnerCoupon.status) &&
        Objects.equals(this.title, clueCouponGetV2ResponseDataListInnerCoupon.title) &&
        Objects.equals(this.updateTime, clueCouponGetV2ResponseDataListInnerCoupon.updateTime) &&
        Objects.equals(this.userLimit, clueCouponGetV2ResponseDataListInnerCoupon.userLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponId, createTime, deliverEnd, deliverStart, globalLimit, needPhone, needSmsVerify, resourceList, status, title, updateTime, userLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClueCouponGetV2ResponseDataListInnerCoupon {\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    deliverEnd: ").append(toIndentedString(deliverEnd)).append("\n");
    sb.append("    deliverStart: ").append(toIndentedString(deliverStart)).append("\n");
    sb.append("    globalLimit: ").append(toIndentedString(globalLimit)).append("\n");
    sb.append("    needPhone: ").append(toIndentedString(needPhone)).append("\n");
    sb.append("    needSmsVerify: ").append(toIndentedString(needSmsVerify)).append("\n");
    sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    userLimit: ").append(toIndentedString(userLimit)).append("\n");
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
    openapiFields.add("coupon_id");
    openapiFields.add("create_time");
    openapiFields.add("deliver_end");
    openapiFields.add("deliver_start");
    openapiFields.add("global_limit");
    openapiFields.add("need_phone");
    openapiFields.add("need_sms_verify");
    openapiFields.add("resource_list");
    openapiFields.add("status");
    openapiFields.add("title");
    openapiFields.add("update_time");
    openapiFields.add("user_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponGetV2ResponseDataListInnerCoupon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponGetV2ResponseDataListInnerCoupon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponGetV2ResponseDataListInnerCoupon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponGetV2ResponseDataListInnerCoupon.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponGetV2ResponseDataListInnerCoupon>() {
           @Override
           public void write(JsonWriter out, ClueCouponGetV2ResponseDataListInnerCoupon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponGetV2ResponseDataListInnerCoupon read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponGetV2ResponseDataListInnerCoupon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponGetV2ResponseDataListInnerCoupon
  * @throws IOException if the JSON string is invalid with respect to ClueCouponGetV2ResponseDataListInnerCoupon
  */
  public static ClueCouponGetV2ResponseDataListInnerCoupon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponGetV2ResponseDataListInnerCoupon.class);
  }

 /**
  * Convert an instance of ClueCouponGetV2ResponseDataListInnerCoupon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

