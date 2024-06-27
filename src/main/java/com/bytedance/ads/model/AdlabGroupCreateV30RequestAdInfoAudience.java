/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceConvertedTimeDuration;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceDistrict;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceGender;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceHideIfConverted;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceLocationType;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudiencePlatform;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAudienceSuperiorPopularityType;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner;
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
 * 定向信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class AdlabGroupCreateV30RequestAdInfoAudience {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<List<Long>> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_PACKAGE_ID = "audience_package_id";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_PACKAGE_ID)
  private Long audiencePackageId = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private Long autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_CONVERTED_TIME_DURATION = "converted_time_duration";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TIME_DURATION)
  private AdlabGroupCreateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private AdlabGroupCreateV30AdInfoAudienceDistrict district = null;

  public static final String SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE = "exclude_flow_package";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FLOW_PACKAGE)
  private List<Long> excludeFlowPackage = null;

  public static final String SERIALIZED_NAME_FLOW_PACKAGE = "flow_package";
  @SerializedName(SERIALIZED_NAME_FLOW_PACKAGE)
  private List<Long> flowPackage = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private AdlabGroupCreateV30AdInfoAudienceGender gender = null;

  public static final String SERIALIZED_NAME_GEOLOCATION = "geolocation";
  @SerializedName(SERIALIZED_NAME_GEOLOCATION)
  private List<AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner> geolocation = null;

  public static final String SERIALIZED_NAME_HIDE_IF_CONVERTED = "hide_if_converted";
  @SerializedName(SERIALIZED_NAME_HIDE_IF_CONVERTED)
  private AdlabGroupCreateV30AdInfoAudienceHideIfConverted hideIfConverted = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private AdlabGroupCreateV30AdInfoAudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<AdlabGroupCreateV30AdInfoAudiencePlatform> platform = null;

  public static final String SERIALIZED_NAME_REGION_VERSION = "region_version";
  @SerializedName(SERIALIZED_NAME_REGION_VERSION)
  private String regionVersion = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SUPERIOR_POPULARITY_TYPE = "superior_popularity_type";
  @SerializedName(SERIALIZED_NAME_SUPERIOR_POPULARITY_TYPE)
  private AdlabGroupCreateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType = null;

  public AdlabGroupCreateV30RequestAdInfoAudience() {
  }

  public AdlabGroupCreateV30RequestAdInfoAudience age(List<List<Long>> age) {
    
    this.age = age;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addAgeItem(List<Long> ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 年龄
   * @return age
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getAge() {
    return age;
  }


  public void setAge(List<List<Long>> age) {
    this.age = age;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience audiencePackageId(Long audiencePackageId) {
    
    this.audiencePackageId = audiencePackageId;
    return this;
  }

   /**
   * 定向包ID
   * @return audiencePackageId
  **/
  @javax.annotation.Nullable
  public Long getAudiencePackageId() {
    return audiencePackageId;
  }


  public void setAudiencePackageId(Long audiencePackageId) {
    this.audiencePackageId = audiencePackageId;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience autoExtendEnabled(Long autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * 是否开启智能放量
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public Long getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(Long autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience autoExtendTargets(List<AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addAutoExtendTargetsItem(AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 可放开定向，该字段不为空时表示开启智能放量，传空时表示不开启智能放量
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<AdlabGroupCreateV30AdInfoAudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 地域定向省市或者区县列表，当district&#x3D;CITY时必填
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience convertedTimeDuration(AdlabGroupCreateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    
    this.convertedTimeDuration = convertedTimeDuration;
    return this;
  }

   /**
   * Get convertedTimeDuration
   * @return convertedTimeDuration
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceConvertedTimeDuration getConvertedTimeDuration() {
    return convertedTimeDuration;
  }


  public void setConvertedTimeDuration(AdlabGroupCreateV30AdInfoAudienceConvertedTimeDuration convertedTimeDuration) {
    this.convertedTimeDuration = convertedTimeDuration;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience district(AdlabGroupCreateV30AdInfoAudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(AdlabGroupCreateV30AdInfoAudienceDistrict district) {
    this.district = district;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience excludeFlowPackage(List<Long> excludeFlowPackage) {
    
    this.excludeFlowPackage = excludeFlowPackage;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addExcludeFlowPackageItem(Long excludeFlowPackageItem) {
    if (this.excludeFlowPackage == null) {
      this.excludeFlowPackage = new ArrayList<>();
    }
    this.excludeFlowPackage.add(excludeFlowPackageItem);
    return this;
  }

   /**
   * 排除定向逻辑，当广告位只选择穿山甲时可选 定向逻辑和排除定向逻辑只能选其一
   * @return excludeFlowPackage
  **/
  @javax.annotation.Nullable
  public List<Long> getExcludeFlowPackage() {
    return excludeFlowPackage;
  }


  public void setExcludeFlowPackage(List<Long> excludeFlowPackage) {
    this.excludeFlowPackage = excludeFlowPackage;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience flowPackage(List<Long> flowPackage) {
    
    this.flowPackage = flowPackage;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addFlowPackageItem(Long flowPackageItem) {
    if (this.flowPackage == null) {
      this.flowPackage = new ArrayList<>();
    }
    this.flowPackage.add(flowPackageItem);
    return this;
  }

   /**
   * 定向逻辑，当广告位只选择穿山甲时可选 定向逻辑和排除定向逻辑只能选其一
   * @return flowPackage
  **/
  @javax.annotation.Nullable
  public List<Long> getFlowPackage() {
    return flowPackage;
  }


  public void setFlowPackage(List<Long> flowPackage) {
    this.flowPackage = flowPackage;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience gender(AdlabGroupCreateV30AdInfoAudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceGender getGender() {
    return gender;
  }


  public void setGender(AdlabGroupCreateV30AdInfoAudienceGender gender) {
    this.gender = gender;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience geolocation(List<AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner> geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addGeolocationItem(AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner geolocationItem) {
    if (this.geolocation == null) {
      this.geolocation = new ArrayList<>();
    }
    this.geolocation.add(geolocationItem);
    return this;
  }

   /**
   * 商圈定向，当district选择\&quot;BUSINESS_DISTRICT\&quot;时必填，最多允许选择100个
   * @return geolocation
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner> getGeolocation() {
    return geolocation;
  }


  public void setGeolocation(List<AdlabGroupCreateV30RequestAdInfoAudienceGeolocationInner> geolocation) {
    this.geolocation = geolocation;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience hideIfConverted(AdlabGroupCreateV30AdInfoAudienceHideIfConverted hideIfConverted) {
    
    this.hideIfConverted = hideIfConverted;
    return this;
  }

   /**
   * Get hideIfConverted
   * @return hideIfConverted
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceHideIfConverted getHideIfConverted() {
    return hideIfConverted;
  }


  public void setHideIfConverted(AdlabGroupCreateV30AdInfoAudienceHideIfConverted hideIfConverted) {
    this.hideIfConverted = hideIfConverted;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience locationType(AdlabGroupCreateV30AdInfoAudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(AdlabGroupCreateV30AdInfoAudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience platform(List<AdlabGroupCreateV30AdInfoAudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addPlatformItem(AdlabGroupCreateV30AdInfoAudiencePlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 平台，当下载方式包含下载链接时，平台类型需与选择的下载链接类型对应，当下载方式不包含下载链接的时候，平台可多选。
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30AdInfoAudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<AdlabGroupCreateV30AdInfoAudiencePlatform> platform) {
    this.platform = platform;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience regionVersion(String regionVersion) {
    
    this.regionVersion = regionVersion;
    return this;
  }

   /**
   * 行政区域版本号
   * @return regionVersion
  **/
  @javax.annotation.Nullable
  public String getRegionVersion() {
    return regionVersion;
  }


  public void setRegionVersion(String regionVersion) {
    this.regionVersion = regionVersion;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 排除人群包列表（自定义人群） 内容为人群包id
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfoAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 定向人群包列表（自定义人群） 内容为人群包id
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public AdlabGroupCreateV30RequestAdInfoAudience superiorPopularityType(AdlabGroupCreateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    
    this.superiorPopularityType = superiorPopularityType;
    return this;
  }

   /**
   * Get superiorPopularityType
   * @return superiorPopularityType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAudienceSuperiorPopularityType getSuperiorPopularityType() {
    return superiorPopularityType;
  }


  public void setSuperiorPopularityType(AdlabGroupCreateV30AdInfoAudienceSuperiorPopularityType superiorPopularityType) {
    this.superiorPopularityType = superiorPopularityType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestAdInfoAudience adlabGroupCreateV30RequestAdInfoAudience = (AdlabGroupCreateV30RequestAdInfoAudience) o;
    return Objects.equals(this.age, adlabGroupCreateV30RequestAdInfoAudience.age) &&
        Objects.equals(this.audiencePackageId, adlabGroupCreateV30RequestAdInfoAudience.audiencePackageId) &&
        Objects.equals(this.autoExtendEnabled, adlabGroupCreateV30RequestAdInfoAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, adlabGroupCreateV30RequestAdInfoAudience.autoExtendTargets) &&
        Objects.equals(this.city, adlabGroupCreateV30RequestAdInfoAudience.city) &&
        Objects.equals(this.convertedTimeDuration, adlabGroupCreateV30RequestAdInfoAudience.convertedTimeDuration) &&
        Objects.equals(this.district, adlabGroupCreateV30RequestAdInfoAudience.district) &&
        Objects.equals(this.excludeFlowPackage, adlabGroupCreateV30RequestAdInfoAudience.excludeFlowPackage) &&
        Objects.equals(this.flowPackage, adlabGroupCreateV30RequestAdInfoAudience.flowPackage) &&
        Objects.equals(this.gender, adlabGroupCreateV30RequestAdInfoAudience.gender) &&
        Objects.equals(this.geolocation, adlabGroupCreateV30RequestAdInfoAudience.geolocation) &&
        Objects.equals(this.hideIfConverted, adlabGroupCreateV30RequestAdInfoAudience.hideIfConverted) &&
        Objects.equals(this.locationType, adlabGroupCreateV30RequestAdInfoAudience.locationType) &&
        Objects.equals(this.platform, adlabGroupCreateV30RequestAdInfoAudience.platform) &&
        Objects.equals(this.regionVersion, adlabGroupCreateV30RequestAdInfoAudience.regionVersion) &&
        Objects.equals(this.retargetingTagsExclude, adlabGroupCreateV30RequestAdInfoAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, adlabGroupCreateV30RequestAdInfoAudience.retargetingTagsInclude) &&
        Objects.equals(this.superiorPopularityType, adlabGroupCreateV30RequestAdInfoAudience.superiorPopularityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, audiencePackageId, autoExtendEnabled, autoExtendTargets, city, convertedTimeDuration, district, excludeFlowPackage, flowPackage, gender, geolocation, hideIfConverted, locationType, platform, regionVersion, retargetingTagsExclude, retargetingTagsInclude, superiorPopularityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestAdInfoAudience {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audiencePackageId: ").append(toIndentedString(audiencePackageId)).append("\n");
    sb.append("    autoExtendEnabled: ").append(toIndentedString(autoExtendEnabled)).append("\n");
    sb.append("    autoExtendTargets: ").append(toIndentedString(autoExtendTargets)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    convertedTimeDuration: ").append(toIndentedString(convertedTimeDuration)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    excludeFlowPackage: ").append(toIndentedString(excludeFlowPackage)).append("\n");
    sb.append("    flowPackage: ").append(toIndentedString(flowPackage)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    hideIfConverted: ").append(toIndentedString(hideIfConverted)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    regionVersion: ").append(toIndentedString(regionVersion)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
    sb.append("    retargetingTagsInclude: ").append(toIndentedString(retargetingTagsInclude)).append("\n");
    sb.append("    superiorPopularityType: ").append(toIndentedString(superiorPopularityType)).append("\n");
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
    openapiFields.add("age");
    openapiFields.add("audience_package_id");
    openapiFields.add("auto_extend_enabled");
    openapiFields.add("auto_extend_targets");
    openapiFields.add("city");
    openapiFields.add("converted_time_duration");
    openapiFields.add("district");
    openapiFields.add("exclude_flow_package");
    openapiFields.add("flow_package");
    openapiFields.add("gender");
    openapiFields.add("geolocation");
    openapiFields.add("hide_if_converted");
    openapiFields.add("location_type");
    openapiFields.add("platform");
    openapiFields.add("region_version");
    openapiFields.add("retargeting_tags_exclude");
    openapiFields.add("retargeting_tags_include");
    openapiFields.add("superior_popularity_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestAdInfoAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestAdInfoAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestAdInfoAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestAdInfoAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestAdInfoAudience>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestAdInfoAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestAdInfoAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestAdInfoAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestAdInfoAudience
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestAdInfoAudience
  */
  public static AdlabGroupCreateV30RequestAdInfoAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestAdInfoAudience.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestAdInfoAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

