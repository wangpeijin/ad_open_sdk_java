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
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoAc;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoAges;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoGender;
import com.bytedance.ads.model.BrandAdCreateV30AudienceInfoPlatform;
import com.bytedance.ads.model.BrandAdCreateV30RequestAudienceInfoDistrictInfo;
import com.bytedance.ads.model.BrandAdCreateV30RequestAudienceInfoRetargetingInfo;
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
 * 定向
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class BrandAdCreateV30RequestAudienceInfo {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private BrandAdCreateV30AudienceInfoAc ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORY = "action_category";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORY)
  private List<Long> actionCategory = null;

  public static final String SERIALIZED_NAME_AGES = "ages";
  @SerializedName(SERIALIZED_NAME_AGES)
  private List<BrandAdCreateV30AudienceInfoAges> ages = null;

  public static final String SERIALIZED_NAME_DISTRICT_INFO = "district_info";
  @SerializedName(SERIALIZED_NAME_DISTRICT_INFO)
  private BrandAdCreateV30RequestAudienceInfoDistrictInfo districtInfo = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private BrandAdCreateV30AudienceInfoGender gender = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private BrandAdCreateV30AudienceInfoPlatform platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_INFO = "retargeting_info";
  @SerializedName(SERIALIZED_NAME_RETARGETING_INFO)
  private BrandAdCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo = null;

  public BrandAdCreateV30RequestAudienceInfo() {
  }

  public BrandAdCreateV30RequestAudienceInfo ac(BrandAdCreateV30AudienceInfoAc ac) {
    
    this.ac = ac;
    return this;
  }

   /**
   * Get ac
   * @return ac
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoAc getAc() {
    return ac;
  }


  public void setAc(BrandAdCreateV30AudienceInfoAc ac) {
    this.ac = ac;
  }


  public BrandAdCreateV30RequestAudienceInfo actionCategory(List<Long> actionCategory) {
    
    this.actionCategory = actionCategory;
    return this;
  }

  public BrandAdCreateV30RequestAudienceInfo addActionCategoryItem(Long actionCategoryItem) {
    if (this.actionCategory == null) {
      this.actionCategory = new ArrayList<>();
    }
    this.actionCategory.add(actionCategoryItem);
    return this;
  }

   /**
   * 兴趣定向
   * @return actionCategory
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategory() {
    return actionCategory;
  }


  public void setActionCategory(List<Long> actionCategory) {
    this.actionCategory = actionCategory;
  }


  public BrandAdCreateV30RequestAudienceInfo ages(List<BrandAdCreateV30AudienceInfoAges> ages) {
    
    this.ages = ages;
    return this;
  }

  public BrandAdCreateV30RequestAudienceInfo addAgesItem(BrandAdCreateV30AudienceInfoAges agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<>();
    }
    this.ages.add(agesItem);
    return this;
  }

   /**
   * 年龄定向，支持的枚举值：&lt;br&gt; BETWEEN18_23：18～23岁&lt;br&gt; BETWEEN24_30：24～30岁&lt;br&gt; BETWEEN31_40：31～40岁&lt;br&gt; BETWEEN41_49：41～49岁&lt;br&gt; ABOVE50：50岁及以上&lt;br&gt; UNLIMITED：不限
   * @return ages
  **/
  @javax.annotation.Nullable
  public List<BrandAdCreateV30AudienceInfoAges> getAges() {
    return ages;
  }


  public void setAges(List<BrandAdCreateV30AudienceInfoAges> ages) {
    this.ages = ages;
  }


  public BrandAdCreateV30RequestAudienceInfo districtInfo(BrandAdCreateV30RequestAudienceInfoDistrictInfo districtInfo) {
    
    this.districtInfo = districtInfo;
    return this;
  }

   /**
   * Get districtInfo
   * @return districtInfo
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30RequestAudienceInfoDistrictInfo getDistrictInfo() {
    return districtInfo;
  }


  public void setDistrictInfo(BrandAdCreateV30RequestAudienceInfoDistrictInfo districtInfo) {
    this.districtInfo = districtInfo;
  }


  public BrandAdCreateV30RequestAudienceInfo gender(BrandAdCreateV30AudienceInfoGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoGender getGender() {
    return gender;
  }


  public void setGender(BrandAdCreateV30AudienceInfoGender gender) {
    this.gender = gender;
  }


  public BrandAdCreateV30RequestAudienceInfo platform(BrandAdCreateV30AudienceInfoPlatform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30AudienceInfoPlatform getPlatform() {
    return platform;
  }


  public void setPlatform(BrandAdCreateV30AudienceInfoPlatform platform) {
    this.platform = platform;
  }


  public BrandAdCreateV30RequestAudienceInfo retargetingInfo(BrandAdCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo) {
    
    this.retargetingInfo = retargetingInfo;
    return this;
  }

   /**
   * Get retargetingInfo
   * @return retargetingInfo
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30RequestAudienceInfoRetargetingInfo getRetargetingInfo() {
    return retargetingInfo;
  }


  public void setRetargetingInfo(BrandAdCreateV30RequestAudienceInfoRetargetingInfo retargetingInfo) {
    this.retargetingInfo = retargetingInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdCreateV30RequestAudienceInfo brandAdCreateV30RequestAudienceInfo = (BrandAdCreateV30RequestAudienceInfo) o;
    return Objects.equals(this.ac, brandAdCreateV30RequestAudienceInfo.ac) &&
        Objects.equals(this.actionCategory, brandAdCreateV30RequestAudienceInfo.actionCategory) &&
        Objects.equals(this.ages, brandAdCreateV30RequestAudienceInfo.ages) &&
        Objects.equals(this.districtInfo, brandAdCreateV30RequestAudienceInfo.districtInfo) &&
        Objects.equals(this.gender, brandAdCreateV30RequestAudienceInfo.gender) &&
        Objects.equals(this.platform, brandAdCreateV30RequestAudienceInfo.platform) &&
        Objects.equals(this.retargetingInfo, brandAdCreateV30RequestAudienceInfo.retargetingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategory, ages, districtInfo, gender, platform, retargetingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdCreateV30RequestAudienceInfo {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategory: ").append(toIndentedString(actionCategory)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    districtInfo: ").append(toIndentedString(districtInfo)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingInfo: ").append(toIndentedString(retargetingInfo)).append("\n");
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
    openapiFields.add("ac");
    openapiFields.add("action_category");
    openapiFields.add("ages");
    openapiFields.add("district_info");
    openapiFields.add("gender");
    openapiFields.add("platform");
    openapiFields.add("retargeting_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdCreateV30RequestAudienceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdCreateV30RequestAudienceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdCreateV30RequestAudienceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdCreateV30RequestAudienceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdCreateV30RequestAudienceInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdCreateV30RequestAudienceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdCreateV30RequestAudienceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdCreateV30RequestAudienceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdCreateV30RequestAudienceInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdCreateV30RequestAudienceInfo
  */
  public static BrandAdCreateV30RequestAudienceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdCreateV30RequestAudienceInfo.class);
  }

 /**
  * Convert an instance of BrandAdCreateV30RequestAudienceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

