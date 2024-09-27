/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarClueGetV2DataListComponentType;
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
 * StarClueGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarClueGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address = null;

  public static final String SERIALIZED_NAME_ANCHOR_NAME = "anchor_name";
  @SerializedName(SERIALIZED_NAME_ANCHOR_NAME)
  private String anchorName = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_AUTHOR_UID = "author_uid";
  @SerializedName(SERIALIZED_NAME_AUTHOR_UID)
  private Long authorUid = null;

  public static final String SERIALIZED_NAME_CAR_SERIES = "car_series";
  @SerializedName(SERIALIZED_NAME_CAR_SERIES)
  private String carSeries = null;

  public static final String SERIALIZED_NAME_CAR_TYPE = "car_type";
  @SerializedName(SERIALIZED_NAME_CAR_TYPE)
  private String carType = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private StarClueGetV2DataListComponentType componentType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone = null;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarClueGetV2ResponseDataListInner() {
  }

  public StarClueGetV2ResponseDataListInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 地址
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public StarClueGetV2ResponseDataListInner anchorName(String anchorName) {
    
    this.anchorName = anchorName;
    return this;
  }

   /**
   * 组件名称
   * @return anchorName
  **/
  @javax.annotation.Nullable
  public String getAnchorName() {
    return anchorName;
  }


  public void setAnchorName(String anchorName) {
    this.anchorName = anchorName;
  }


  public StarClueGetV2ResponseDataListInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人昵称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarClueGetV2ResponseDataListInner authorUid(Long authorUid) {
    
    this.authorUid = authorUid;
    return this;
  }

   /**
   * 达人抖音短号
   * @return authorUid
  **/
  @javax.annotation.Nullable
  public Long getAuthorUid() {
    return authorUid;
  }


  public void setAuthorUid(Long authorUid) {
    this.authorUid = authorUid;
  }


  public StarClueGetV2ResponseDataListInner carSeries(String carSeries) {
    
    this.carSeries = carSeries;
    return this;
  }

   /**
   * 车系
   * @return carSeries
  **/
  @javax.annotation.Nullable
  public String getCarSeries() {
    return carSeries;
  }


  public void setCarSeries(String carSeries) {
    this.carSeries = carSeries;
  }


  public StarClueGetV2ResponseDataListInner carType(String carType) {
    
    this.carType = carType;
    return this;
  }

   /**
   * 车型
   * @return carType
  **/
  @javax.annotation.Nullable
  public String getCarType() {
    return carType;
  }


  public void setCarType(String carType) {
    this.carType = carType;
  }


  public StarClueGetV2ResponseDataListInner city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 城市
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public StarClueGetV2ResponseDataListInner componentType(StarClueGetV2DataListComponentType componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  public StarClueGetV2DataListComponentType getComponentType() {
    return componentType;
  }


  public void setComponentType(StarClueGetV2DataListComponentType componentType) {
    this.componentType = componentType;
  }


  public StarClueGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public StarClueGetV2ResponseDataListInner demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarClueGetV2ResponseDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarClueGetV2ResponseDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarClueGetV2ResponseDataListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单id
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public StarClueGetV2ResponseDataListInner phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 电话
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public StarClueGetV2ResponseDataListInner province(String province) {
    
    this.province = province;
    return this;
  }

   /**
   * 省会
   * @return province
  **/
  @javax.annotation.Nullable
  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    this.province = province;
  }


  public StarClueGetV2ResponseDataListInner starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户id
   * @return starId
  **/
  @javax.annotation.Nullable
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
    StarClueGetV2ResponseDataListInner starClueGetV2ResponseDataListInner = (StarClueGetV2ResponseDataListInner) o;
    return Objects.equals(this.address, starClueGetV2ResponseDataListInner.address) &&
        Objects.equals(this.anchorName, starClueGetV2ResponseDataListInner.anchorName) &&
        Objects.equals(this.authorName, starClueGetV2ResponseDataListInner.authorName) &&
        Objects.equals(this.authorUid, starClueGetV2ResponseDataListInner.authorUid) &&
        Objects.equals(this.carSeries, starClueGetV2ResponseDataListInner.carSeries) &&
        Objects.equals(this.carType, starClueGetV2ResponseDataListInner.carType) &&
        Objects.equals(this.city, starClueGetV2ResponseDataListInner.city) &&
        Objects.equals(this.componentType, starClueGetV2ResponseDataListInner.componentType) &&
        Objects.equals(this.createTime, starClueGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.demandId, starClueGetV2ResponseDataListInner.demandId) &&
        Objects.equals(this.itemId, starClueGetV2ResponseDataListInner.itemId) &&
        Objects.equals(this.name, starClueGetV2ResponseDataListInner.name) &&
        Objects.equals(this.orderId, starClueGetV2ResponseDataListInner.orderId) &&
        Objects.equals(this.phone, starClueGetV2ResponseDataListInner.phone) &&
        Objects.equals(this.province, starClueGetV2ResponseDataListInner.province) &&
        Objects.equals(this.starId, starClueGetV2ResponseDataListInner.starId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, anchorName, authorName, authorUid, carSeries, carType, city, componentType, createTime, demandId, itemId, name, orderId, phone, province, starId);
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
    sb.append("class StarClueGetV2ResponseDataListInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    anchorName: ").append(toIndentedString(anchorName)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorUid: ").append(toIndentedString(authorUid)).append("\n");
    sb.append("    carSeries: ").append(toIndentedString(carSeries)).append("\n");
    sb.append("    carType: ").append(toIndentedString(carType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("anchor_name");
    openapiFields.add("author_name");
    openapiFields.add("author_uid");
    openapiFields.add("car_series");
    openapiFields.add("car_type");
    openapiFields.add("city");
    openapiFields.add("component_type");
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("item_id");
    openapiFields.add("name");
    openapiFields.add("order_id");
    openapiFields.add("phone");
    openapiFields.add("province");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("anchor_name");
    openapiRequiredFields.add("component_type");
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarClueGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarClueGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarClueGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarClueGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarClueGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, StarClueGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarClueGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarClueGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarClueGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to StarClueGetV2ResponseDataListInner
  */
  public static StarClueGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarClueGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of StarClueGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

