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
import com.bytedance.ads.model.YuntuBrandInfoGetV30ResponseDataIndustryInfosInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class YuntuBrandInfoGetV30ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_INDUSTRY_INFOS = "industry_infos";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_INFOS)
  private List<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner> industryInfos = null;

  public static final String SERIALIZED_NAME_USER_DISPLAY_NAME = "user_display_name";
  @SerializedName(SERIALIZED_NAME_USER_DISPLAY_NAME)
  private String userDisplayName = null;

  public YuntuBrandInfoGetV30ResponseData() {
  }

  public YuntuBrandInfoGetV30ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 云图品牌虚拟 adv_id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public YuntuBrandInfoGetV30ResponseData industryInfos(List<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner> industryInfos) {
    
    this.industryInfos = industryInfos;
    return this;
  }

  public YuntuBrandInfoGetV30ResponseData addIndustryInfosItem(YuntuBrandInfoGetV30ResponseDataIndustryInfosInner industryInfosItem) {
    if (this.industryInfos == null) {
      this.industryInfos = new ArrayList<>();
    }
    this.industryInfos.add(industryInfosItem);
    return this;
  }

   /**
   * 行业信息列表，创建人群包及创建人群标签时使用。
   * @return industryInfos
  **/
  @javax.annotation.Nullable
  public List<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner> getIndustryInfos() {
    return industryInfos;
  }


  public void setIndustryInfos(List<YuntuBrandInfoGetV30ResponseDataIndustryInfosInner> industryInfos) {
    this.industryInfos = industryInfos;
  }


  public YuntuBrandInfoGetV30ResponseData userDisplayName(String userDisplayName) {
    
    this.userDisplayName = userDisplayName;
    return this;
  }

   /**
   * 用户名称，创建人群标签时使用。
   * @return userDisplayName
  **/
  @javax.annotation.Nullable
  public String getUserDisplayName() {
    return userDisplayName;
  }


  public void setUserDisplayName(String userDisplayName) {
    this.userDisplayName = userDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YuntuBrandInfoGetV30ResponseData yuntuBrandInfoGetV30ResponseData = (YuntuBrandInfoGetV30ResponseData) o;
    return Objects.equals(this.advertiserId, yuntuBrandInfoGetV30ResponseData.advertiserId) &&
        Objects.equals(this.industryInfos, yuntuBrandInfoGetV30ResponseData.industryInfos) &&
        Objects.equals(this.userDisplayName, yuntuBrandInfoGetV30ResponseData.userDisplayName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, industryInfos, userDisplayName);
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
    sb.append("class YuntuBrandInfoGetV30ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    industryInfos: ").append(toIndentedString(industryInfos)).append("\n");
    sb.append("    userDisplayName: ").append(toIndentedString(userDisplayName)).append("\n");
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
    openapiFields.add("industry_infos");
    openapiFields.add("user_display_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!YuntuBrandInfoGetV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'YuntuBrandInfoGetV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<YuntuBrandInfoGetV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(YuntuBrandInfoGetV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<YuntuBrandInfoGetV30ResponseData>() {
           @Override
           public void write(JsonWriter out, YuntuBrandInfoGetV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public YuntuBrandInfoGetV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of YuntuBrandInfoGetV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of YuntuBrandInfoGetV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to YuntuBrandInfoGetV30ResponseData
  */
  public static YuntuBrandInfoGetV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, YuntuBrandInfoGetV30ResponseData.class);
  }

 /**
  * Convert an instance of YuntuBrandInfoGetV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

