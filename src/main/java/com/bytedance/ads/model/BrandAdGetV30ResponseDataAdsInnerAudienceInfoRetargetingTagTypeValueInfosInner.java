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
 * BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_APP_ID_LIST = "app_id_list";
  @SerializedName(SERIALIZED_NAME_APP_ID_LIST)
  private List<Long> appIdList = null;

  public static final String SERIALIZED_NAME_CATEGORY_LIST = "category_list";
  @SerializedName(SERIALIZED_NAME_CATEGORY_LIST)
  private List<Long> categoryList = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private Long expireTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PULL_OFF_TAG_STATUS = "pull_off_tag_status";
  @SerializedName(SERIALIZED_NAME_PULL_OFF_TAG_STATUS)
  private Long pullOffTagStatus = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner() {
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner appIdList(List<Long> appIdList) {
    
    this.appIdList = appIdList;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner addAppIdListItem(Long appIdListItem) {
    if (this.appIdList == null) {
      this.appIdList = new ArrayList<>();
    }
    this.appIdList.add(appIdListItem);
    return this;
  }

   /**
   * 
   * @return appIdList
  **/
  @javax.annotation.Nullable
  public List<Long> getAppIdList() {
    return appIdList;
  }


  public void setAppIdList(List<Long> appIdList) {
    this.appIdList = appIdList;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner categoryList(List<Long> categoryList) {
    
    this.categoryList = categoryList;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner addCategoryListItem(Long categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

   /**
   * 
   * @return categoryList
  **/
  @javax.annotation.Nullable
  public List<Long> getCategoryList() {
    return categoryList;
  }


  public void setCategoryList(List<Long> categoryList) {
    this.categoryList = categoryList;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner expireTime(Long expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * 
   * @return expireTime
  **/
  @javax.annotation.Nullable
  public Long getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(Long expireTime) {
    this.expireTime = expireTime;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner pullOffTagStatus(Long pullOffTagStatus) {
    
    this.pullOffTagStatus = pullOffTagStatus;
    return this;
  }

   /**
   * 
   * @return pullOffTagStatus
  **/
  @javax.annotation.Nullable
  public Long getPullOffTagStatus() {
    return pullOffTagStatus;
  }


  public void setPullOffTagStatus(Long pullOffTagStatus) {
    this.pullOffTagStatus = pullOffTagStatus;
  }


  public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner = (BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner) o;
    return Objects.equals(this.advertiserId, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.advertiserId) &&
        Objects.equals(this.appIdList, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.appIdList) &&
        Objects.equals(this.categoryList, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.categoryList) &&
        Objects.equals(this.endTime, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.endTime) &&
        Objects.equals(this.expireTime, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.expireTime) &&
        Objects.equals(this.id, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.id) &&
        Objects.equals(this.name, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.name) &&
        Objects.equals(this.pullOffTagStatus, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.pullOffTagStatus) &&
        Objects.equals(this.startTime, brandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, appIdList, categoryList, endTime, expireTime, id, name, pullOffTagStatus, startTime);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    appIdList: ").append(toIndentedString(appIdList)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pullOffTagStatus: ").append(toIndentedString(pullOffTagStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("app_id_list");
    openapiFields.add("category_list");
    openapiFields.add("end_time");
    openapiFields.add("expire_time");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("pull_off_tag_status");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expire_time");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner
  */
  public static BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerAudienceInfoRetargetingTagTypeValueInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

