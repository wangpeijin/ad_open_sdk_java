/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAc;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceActionDays;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceActionScene;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAge;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAudienceMode;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAutoExtendEnabled;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAutoExtendTargets;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAwemeFanBehaviors;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceDistrict;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceElectricFenceRegion;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceExcludeLimitedRegion;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceGender;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceLivePlatformTags;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceLocationType;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceNewCustomer;
import com.bytedance.ads.model.QianchuanAdCreateV10AudiencePlatform;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceSearchExtended;
import com.bytedance.ads.model.QianchuanAdCreateV10AudienceSmartInterestAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestAudience {
  public static final String SERIALIZED_NAME_AC = "ac";
  @SerializedName(SERIALIZED_NAME_AC)
  private List<QianchuanAdCreateV10AudienceAc> ac = null;

  public static final String SERIALIZED_NAME_ACTION_CATEGORIES = "action_categories";
  @SerializedName(SERIALIZED_NAME_ACTION_CATEGORIES)
  private List<Long> actionCategories = null;

  public static final String SERIALIZED_NAME_ACTION_DAYS = "action_days";
  @SerializedName(SERIALIZED_NAME_ACTION_DAYS)
  private QianchuanAdCreateV10AudienceActionDays actionDays = null;

  public static final String SERIALIZED_NAME_ACTION_SCENE = "action_scene";
  @SerializedName(SERIALIZED_NAME_ACTION_SCENE)
  private List<QianchuanAdCreateV10AudienceActionScene> actionScene = null;

  public static final String SERIALIZED_NAME_ACTION_WORDS = "action_words";
  @SerializedName(SERIALIZED_NAME_ACTION_WORDS)
  private List<Long> actionWords = null;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private List<QianchuanAdCreateV10AudienceAge> age = null;

  public static final String SERIALIZED_NAME_AUDIENCE_MODE = "audience_mode";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_MODE)
  private QianchuanAdCreateV10AudienceAudienceMode audienceMode = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_ENABLED = "auto_extend_enabled";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_ENABLED)
  private QianchuanAdCreateV10AudienceAutoExtendEnabled autoExtendEnabled = null;

  public static final String SERIALIZED_NAME_AUTO_EXTEND_TARGETS = "auto_extend_targets";
  @SerializedName(SERIALIZED_NAME_AUTO_EXTEND_TARGETS)
  private List<QianchuanAdCreateV10AudienceAutoExtendTargets> autoExtendTargets = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_ACCOUNTS = "aweme_fan_accounts";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_ACCOUNTS)
  private List<Long> awemeFanAccounts = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS = "aweme_fan_behaviors";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS)
  private List<QianchuanAdCreateV10AudienceAwemeFanBehaviors> awemeFanBehaviors = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS = "aweme_fan_behaviors_days";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_BEHAVIORS_DAYS)
  private QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays = null;

  public static final String SERIALIZED_NAME_AWEME_FAN_CATEGORIES = "aweme_fan_categories";
  @SerializedName(SERIALIZED_NAME_AWEME_FAN_CATEGORIES)
  private List<Long> awemeFanCategories = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private List<Long> city = null;

  public static final String SERIALIZED_NAME_DISTRICT = "district";
  @SerializedName(SERIALIZED_NAME_DISTRICT)
  private QianchuanAdCreateV10AudienceDistrict district = null;

  public static final String SERIALIZED_NAME_DISTRICT_TYPE = "district_type";
  @SerializedName(SERIALIZED_NAME_DISTRICT_TYPE)
  private Boolean districtType = null;

  public static final String SERIALIZED_NAME_ELECTRIC_FENCE_REGION = "electric_fence_region";
  @SerializedName(SERIALIZED_NAME_ELECTRIC_FENCE_REGION)
  private QianchuanAdCreateV10AudienceElectricFenceRegion electricFenceRegion = null;

  public static final String SERIALIZED_NAME_EXCLUDE_LIMITED_REGION = "exclude_limited_region";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_LIMITED_REGION)
  private QianchuanAdCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private QianchuanAdCreateV10AudienceGender gender = null;

  public static final String SERIALIZED_NAME_INTEREST_CATEGORIES = "interest_categories";
  @SerializedName(SERIALIZED_NAME_INTEREST_CATEGORIES)
  private List<Long> interestCategories = null;

  public static final String SERIALIZED_NAME_INTEREST_WORDS = "interest_words";
  @SerializedName(SERIALIZED_NAME_INTEREST_WORDS)
  private List<Long> interestWords = null;

  public static final String SERIALIZED_NAME_LIVE_PLATFORM_TAGS = "live_platform_tags";
  @SerializedName(SERIALIZED_NAME_LIVE_PLATFORM_TAGS)
  private List<QianchuanAdCreateV10AudienceLivePlatformTags> livePlatformTags = null;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "location_type";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private QianchuanAdCreateV10AudienceLocationType locationType = null;

  public static final String SERIALIZED_NAME_NEW_CUSTOMER = "new_customer";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMER)
  private QianchuanAdCreateV10AudienceNewCustomer newCustomer = null;

  public static final String SERIALIZED_NAME_ORIENTATION_ID = "orientation_id";
  @SerializedName(SERIALIZED_NAME_ORIENTATION_ID)
  private Long orientationId = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<QianchuanAdCreateV10AudiencePlatform> platform = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE = "retargeting_tags_exclude";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_EXCLUDE)
  private List<Long> retargetingTagsExclude = null;

  public static final String SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE = "retargeting_tags_include";
  @SerializedName(SERIALIZED_NAME_RETARGETING_TAGS_INCLUDE)
  private List<Long> retargetingTagsInclude = null;

  public static final String SERIALIZED_NAME_SEARCH_EXTENDED = "search_extended";
  @SerializedName(SERIALIZED_NAME_SEARCH_EXTENDED)
  private QianchuanAdCreateV10AudienceSearchExtended searchExtended = null;

  public static final String SERIALIZED_NAME_SMART_INTEREST_ACTION = "smart_interest_action";
  @SerializedName(SERIALIZED_NAME_SMART_INTEREST_ACTION)
  private QianchuanAdCreateV10AudienceSmartInterestAction smartInterestAction = null;

  public QianchuanAdCreateV10RequestAudience() {
  }

  public QianchuanAdCreateV10RequestAudience ac(List<QianchuanAdCreateV10AudienceAc> ac) {
    
    this.ac = ac;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAcItem(QianchuanAdCreateV10AudienceAc acItem) {
    if (this.ac == null) {
      this.ac = new ArrayList<>();
    }
    this.ac.add(acItem);
    return this;
  }

   /**
   * 
   * @return ac
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceAc> getAc() {
    return ac;
  }


  public void setAc(List<QianchuanAdCreateV10AudienceAc> ac) {
    this.ac = ac;
  }


  public QianchuanAdCreateV10RequestAudience actionCategories(List<Long> actionCategories) {
    
    this.actionCategories = actionCategories;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addActionCategoriesItem(Long actionCategoriesItem) {
    if (this.actionCategories == null) {
      this.actionCategories = new ArrayList<>();
    }
    this.actionCategories.add(actionCategoriesItem);
    return this;
  }

   /**
   * 
   * @return actionCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getActionCategories() {
    return actionCategories;
  }


  public void setActionCategories(List<Long> actionCategories) {
    this.actionCategories = actionCategories;
  }


  public QianchuanAdCreateV10RequestAudience actionDays(QianchuanAdCreateV10AudienceActionDays actionDays) {
    
    this.actionDays = actionDays;
    return this;
  }

   /**
   * Get actionDays
   * @return actionDays
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceActionDays getActionDays() {
    return actionDays;
  }


  public void setActionDays(QianchuanAdCreateV10AudienceActionDays actionDays) {
    this.actionDays = actionDays;
  }


  public QianchuanAdCreateV10RequestAudience actionScene(List<QianchuanAdCreateV10AudienceActionScene> actionScene) {
    
    this.actionScene = actionScene;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addActionSceneItem(QianchuanAdCreateV10AudienceActionScene actionSceneItem) {
    if (this.actionScene == null) {
      this.actionScene = new ArrayList<>();
    }
    this.actionScene.add(actionSceneItem);
    return this;
  }

   /**
   * 
   * @return actionScene
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceActionScene> getActionScene() {
    return actionScene;
  }


  public void setActionScene(List<QianchuanAdCreateV10AudienceActionScene> actionScene) {
    this.actionScene = actionScene;
  }


  public QianchuanAdCreateV10RequestAudience actionWords(List<Long> actionWords) {
    
    this.actionWords = actionWords;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addActionWordsItem(Long actionWordsItem) {
    if (this.actionWords == null) {
      this.actionWords = new ArrayList<>();
    }
    this.actionWords.add(actionWordsItem);
    return this;
  }

   /**
   * 
   * @return actionWords
  **/
  @javax.annotation.Nullable
  public List<Long> getActionWords() {
    return actionWords;
  }


  public void setActionWords(List<Long> actionWords) {
    this.actionWords = actionWords;
  }


  public QianchuanAdCreateV10RequestAudience age(List<QianchuanAdCreateV10AudienceAge> age) {
    
    this.age = age;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAgeItem(QianchuanAdCreateV10AudienceAge ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<>();
    }
    this.age.add(ageItem);
    return this;
  }

   /**
   * 
   * @return age
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceAge> getAge() {
    return age;
  }


  public void setAge(List<QianchuanAdCreateV10AudienceAge> age) {
    this.age = age;
  }


  public QianchuanAdCreateV10RequestAudience audienceMode(QianchuanAdCreateV10AudienceAudienceMode audienceMode) {
    
    this.audienceMode = audienceMode;
    return this;
  }

   /**
   * Get audienceMode
   * @return audienceMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceAudienceMode getAudienceMode() {
    return audienceMode;
  }


  public void setAudienceMode(QianchuanAdCreateV10AudienceAudienceMode audienceMode) {
    this.audienceMode = audienceMode;
  }


  public QianchuanAdCreateV10RequestAudience autoExtendEnabled(QianchuanAdCreateV10AudienceAutoExtendEnabled autoExtendEnabled) {
    
    this.autoExtendEnabled = autoExtendEnabled;
    return this;
  }

   /**
   * Get autoExtendEnabled
   * @return autoExtendEnabled
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceAutoExtendEnabled getAutoExtendEnabled() {
    return autoExtendEnabled;
  }


  public void setAutoExtendEnabled(QianchuanAdCreateV10AudienceAutoExtendEnabled autoExtendEnabled) {
    this.autoExtendEnabled = autoExtendEnabled;
  }


  public QianchuanAdCreateV10RequestAudience autoExtendTargets(List<QianchuanAdCreateV10AudienceAutoExtendTargets> autoExtendTargets) {
    
    this.autoExtendTargets = autoExtendTargets;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAutoExtendTargetsItem(QianchuanAdCreateV10AudienceAutoExtendTargets autoExtendTargetsItem) {
    if (this.autoExtendTargets == null) {
      this.autoExtendTargets = new ArrayList<>();
    }
    this.autoExtendTargets.add(autoExtendTargetsItem);
    return this;
  }

   /**
   * 
   * @return autoExtendTargets
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceAutoExtendTargets> getAutoExtendTargets() {
    return autoExtendTargets;
  }


  public void setAutoExtendTargets(List<QianchuanAdCreateV10AudienceAutoExtendTargets> autoExtendTargets) {
    this.autoExtendTargets = autoExtendTargets;
  }


  public QianchuanAdCreateV10RequestAudience awemeFanAccounts(List<Long> awemeFanAccounts) {
    
    this.awemeFanAccounts = awemeFanAccounts;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAwemeFanAccountsItem(Long awemeFanAccountsItem) {
    if (this.awemeFanAccounts == null) {
      this.awemeFanAccounts = new ArrayList<>();
    }
    this.awemeFanAccounts.add(awemeFanAccountsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanAccounts
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanAccounts() {
    return awemeFanAccounts;
  }


  public void setAwemeFanAccounts(List<Long> awemeFanAccounts) {
    this.awemeFanAccounts = awemeFanAccounts;
  }


  public QianchuanAdCreateV10RequestAudience awemeFanBehaviors(List<QianchuanAdCreateV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    
    this.awemeFanBehaviors = awemeFanBehaviors;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAwemeFanBehaviorsItem(QianchuanAdCreateV10AudienceAwemeFanBehaviors awemeFanBehaviorsItem) {
    if (this.awemeFanBehaviors == null) {
      this.awemeFanBehaviors = new ArrayList<>();
    }
    this.awemeFanBehaviors.add(awemeFanBehaviorsItem);
    return this;
  }

   /**
   * 
   * @return awemeFanBehaviors
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceAwemeFanBehaviors> getAwemeFanBehaviors() {
    return awemeFanBehaviors;
  }


  public void setAwemeFanBehaviors(List<QianchuanAdCreateV10AudienceAwemeFanBehaviors> awemeFanBehaviors) {
    this.awemeFanBehaviors = awemeFanBehaviors;
  }


  public QianchuanAdCreateV10RequestAudience awemeFanBehaviorsDays(QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
    return this;
  }

   /**
   * Get awemeFanBehaviorsDays
   * @return awemeFanBehaviorsDays
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays getAwemeFanBehaviorsDays() {
    return awemeFanBehaviorsDays;
  }


  public void setAwemeFanBehaviorsDays(QianchuanAdCreateV10AudienceAwemeFanBehaviorsDays awemeFanBehaviorsDays) {
    this.awemeFanBehaviorsDays = awemeFanBehaviorsDays;
  }


  public QianchuanAdCreateV10RequestAudience awemeFanCategories(List<Long> awemeFanCategories) {
    
    this.awemeFanCategories = awemeFanCategories;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addAwemeFanCategoriesItem(Long awemeFanCategoriesItem) {
    if (this.awemeFanCategories == null) {
      this.awemeFanCategories = new ArrayList<>();
    }
    this.awemeFanCategories.add(awemeFanCategoriesItem);
    return this;
  }

   /**
   * 
   * @return awemeFanCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeFanCategories() {
    return awemeFanCategories;
  }


  public void setAwemeFanCategories(List<Long> awemeFanCategories) {
    this.awemeFanCategories = awemeFanCategories;
  }


  public QianchuanAdCreateV10RequestAudience city(List<Long> city) {
    
    this.city = city;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addCityItem(Long cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * 
   * @return city
  **/
  @javax.annotation.Nullable
  public List<Long> getCity() {
    return city;
  }


  public void setCity(List<Long> city) {
    this.city = city;
  }


  public QianchuanAdCreateV10RequestAudience district(QianchuanAdCreateV10AudienceDistrict district) {
    
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceDistrict getDistrict() {
    return district;
  }


  public void setDistrict(QianchuanAdCreateV10AudienceDistrict district) {
    this.district = district;
  }


  public QianchuanAdCreateV10RequestAudience districtType(Boolean districtType) {
    
    this.districtType = districtType;
    return this;
  }

   /**
   * 
   * @return districtType
  **/
  @javax.annotation.Nullable
  public Boolean getDistrictType() {
    return districtType;
  }


  public void setDistrictType(Boolean districtType) {
    this.districtType = districtType;
  }


  public QianchuanAdCreateV10RequestAudience electricFenceRegion(QianchuanAdCreateV10AudienceElectricFenceRegion electricFenceRegion) {
    
    this.electricFenceRegion = electricFenceRegion;
    return this;
  }

   /**
   * Get electricFenceRegion
   * @return electricFenceRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceElectricFenceRegion getElectricFenceRegion() {
    return electricFenceRegion;
  }


  public void setElectricFenceRegion(QianchuanAdCreateV10AudienceElectricFenceRegion electricFenceRegion) {
    this.electricFenceRegion = electricFenceRegion;
  }


  public QianchuanAdCreateV10RequestAudience excludeLimitedRegion(QianchuanAdCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    
    this.excludeLimitedRegion = excludeLimitedRegion;
    return this;
  }

   /**
   * Get excludeLimitedRegion
   * @return excludeLimitedRegion
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceExcludeLimitedRegion getExcludeLimitedRegion() {
    return excludeLimitedRegion;
  }


  public void setExcludeLimitedRegion(QianchuanAdCreateV10AudienceExcludeLimitedRegion excludeLimitedRegion) {
    this.excludeLimitedRegion = excludeLimitedRegion;
  }


  public QianchuanAdCreateV10RequestAudience gender(QianchuanAdCreateV10AudienceGender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceGender getGender() {
    return gender;
  }


  public void setGender(QianchuanAdCreateV10AudienceGender gender) {
    this.gender = gender;
  }


  public QianchuanAdCreateV10RequestAudience interestCategories(List<Long> interestCategories) {
    
    this.interestCategories = interestCategories;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addInterestCategoriesItem(Long interestCategoriesItem) {
    if (this.interestCategories == null) {
      this.interestCategories = new ArrayList<>();
    }
    this.interestCategories.add(interestCategoriesItem);
    return this;
  }

   /**
   * 
   * @return interestCategories
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestCategories() {
    return interestCategories;
  }


  public void setInterestCategories(List<Long> interestCategories) {
    this.interestCategories = interestCategories;
  }


  public QianchuanAdCreateV10RequestAudience interestWords(List<Long> interestWords) {
    
    this.interestWords = interestWords;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addInterestWordsItem(Long interestWordsItem) {
    if (this.interestWords == null) {
      this.interestWords = new ArrayList<>();
    }
    this.interestWords.add(interestWordsItem);
    return this;
  }

   /**
   * 
   * @return interestWords
  **/
  @javax.annotation.Nullable
  public List<Long> getInterestWords() {
    return interestWords;
  }


  public void setInterestWords(List<Long> interestWords) {
    this.interestWords = interestWords;
  }


  public QianchuanAdCreateV10RequestAudience livePlatformTags(List<QianchuanAdCreateV10AudienceLivePlatformTags> livePlatformTags) {
    
    this.livePlatformTags = livePlatformTags;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addLivePlatformTagsItem(QianchuanAdCreateV10AudienceLivePlatformTags livePlatformTagsItem) {
    if (this.livePlatformTags == null) {
      this.livePlatformTags = new ArrayList<>();
    }
    this.livePlatformTags.add(livePlatformTagsItem);
    return this;
  }

   /**
   * 
   * @return livePlatformTags
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudienceLivePlatformTags> getLivePlatformTags() {
    return livePlatformTags;
  }


  public void setLivePlatformTags(List<QianchuanAdCreateV10AudienceLivePlatformTags> livePlatformTags) {
    this.livePlatformTags = livePlatformTags;
  }


  public QianchuanAdCreateV10RequestAudience locationType(QianchuanAdCreateV10AudienceLocationType locationType) {
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceLocationType getLocationType() {
    return locationType;
  }


  public void setLocationType(QianchuanAdCreateV10AudienceLocationType locationType) {
    this.locationType = locationType;
  }


  public QianchuanAdCreateV10RequestAudience newCustomer(QianchuanAdCreateV10AudienceNewCustomer newCustomer) {
    
    this.newCustomer = newCustomer;
    return this;
  }

   /**
   * Get newCustomer
   * @return newCustomer
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceNewCustomer getNewCustomer() {
    return newCustomer;
  }


  public void setNewCustomer(QianchuanAdCreateV10AudienceNewCustomer newCustomer) {
    this.newCustomer = newCustomer;
  }


  public QianchuanAdCreateV10RequestAudience orientationId(Long orientationId) {
    
    this.orientationId = orientationId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return orientationId
  **/
  @javax.annotation.Nullable
  public Long getOrientationId() {
    return orientationId;
  }


  public void setOrientationId(Long orientationId) {
    this.orientationId = orientationId;
  }


  public QianchuanAdCreateV10RequestAudience platform(List<QianchuanAdCreateV10AudiencePlatform> platform) {
    
    this.platform = platform;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addPlatformItem(QianchuanAdCreateV10AudiencePlatform platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdCreateV10AudiencePlatform> getPlatform() {
    return platform;
  }


  public void setPlatform(List<QianchuanAdCreateV10AudiencePlatform> platform) {
    this.platform = platform;
  }


  public QianchuanAdCreateV10RequestAudience retargetingTagsExclude(List<Long> retargetingTagsExclude) {
    
    this.retargetingTagsExclude = retargetingTagsExclude;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addRetargetingTagsExcludeItem(Long retargetingTagsExcludeItem) {
    if (this.retargetingTagsExclude == null) {
      this.retargetingTagsExclude = new ArrayList<>();
    }
    this.retargetingTagsExclude.add(retargetingTagsExcludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsExclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsExclude() {
    return retargetingTagsExclude;
  }


  public void setRetargetingTagsExclude(List<Long> retargetingTagsExclude) {
    this.retargetingTagsExclude = retargetingTagsExclude;
  }


  public QianchuanAdCreateV10RequestAudience retargetingTagsInclude(List<Long> retargetingTagsInclude) {
    
    this.retargetingTagsInclude = retargetingTagsInclude;
    return this;
  }

  public QianchuanAdCreateV10RequestAudience addRetargetingTagsIncludeItem(Long retargetingTagsIncludeItem) {
    if (this.retargetingTagsInclude == null) {
      this.retargetingTagsInclude = new ArrayList<>();
    }
    this.retargetingTagsInclude.add(retargetingTagsIncludeItem);
    return this;
  }

   /**
   * 
   * @return retargetingTagsInclude
  **/
  @javax.annotation.Nullable
  public List<Long> getRetargetingTagsInclude() {
    return retargetingTagsInclude;
  }


  public void setRetargetingTagsInclude(List<Long> retargetingTagsInclude) {
    this.retargetingTagsInclude = retargetingTagsInclude;
  }


  public QianchuanAdCreateV10RequestAudience searchExtended(QianchuanAdCreateV10AudienceSearchExtended searchExtended) {
    
    this.searchExtended = searchExtended;
    return this;
  }

   /**
   * Get searchExtended
   * @return searchExtended
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceSearchExtended getSearchExtended() {
    return searchExtended;
  }


  public void setSearchExtended(QianchuanAdCreateV10AudienceSearchExtended searchExtended) {
    this.searchExtended = searchExtended;
  }


  public QianchuanAdCreateV10RequestAudience smartInterestAction(QianchuanAdCreateV10AudienceSmartInterestAction smartInterestAction) {
    
    this.smartInterestAction = smartInterestAction;
    return this;
  }

   /**
   * Get smartInterestAction
   * @return smartInterestAction
  **/
  @javax.annotation.Nullable
  public QianchuanAdCreateV10AudienceSmartInterestAction getSmartInterestAction() {
    return smartInterestAction;
  }


  public void setSmartInterestAction(QianchuanAdCreateV10AudienceSmartInterestAction smartInterestAction) {
    this.smartInterestAction = smartInterestAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestAudience qianchuanAdCreateV10RequestAudience = (QianchuanAdCreateV10RequestAudience) o;
    return Objects.equals(this.ac, qianchuanAdCreateV10RequestAudience.ac) &&
        Objects.equals(this.actionCategories, qianchuanAdCreateV10RequestAudience.actionCategories) &&
        Objects.equals(this.actionDays, qianchuanAdCreateV10RequestAudience.actionDays) &&
        Objects.equals(this.actionScene, qianchuanAdCreateV10RequestAudience.actionScene) &&
        Objects.equals(this.actionWords, qianchuanAdCreateV10RequestAudience.actionWords) &&
        Objects.equals(this.age, qianchuanAdCreateV10RequestAudience.age) &&
        Objects.equals(this.audienceMode, qianchuanAdCreateV10RequestAudience.audienceMode) &&
        Objects.equals(this.autoExtendEnabled, qianchuanAdCreateV10RequestAudience.autoExtendEnabled) &&
        Objects.equals(this.autoExtendTargets, qianchuanAdCreateV10RequestAudience.autoExtendTargets) &&
        Objects.equals(this.awemeFanAccounts, qianchuanAdCreateV10RequestAudience.awemeFanAccounts) &&
        Objects.equals(this.awemeFanBehaviors, qianchuanAdCreateV10RequestAudience.awemeFanBehaviors) &&
        Objects.equals(this.awemeFanBehaviorsDays, qianchuanAdCreateV10RequestAudience.awemeFanBehaviorsDays) &&
        Objects.equals(this.awemeFanCategories, qianchuanAdCreateV10RequestAudience.awemeFanCategories) &&
        Objects.equals(this.city, qianchuanAdCreateV10RequestAudience.city) &&
        Objects.equals(this.district, qianchuanAdCreateV10RequestAudience.district) &&
        Objects.equals(this.districtType, qianchuanAdCreateV10RequestAudience.districtType) &&
        Objects.equals(this.electricFenceRegion, qianchuanAdCreateV10RequestAudience.electricFenceRegion) &&
        Objects.equals(this.excludeLimitedRegion, qianchuanAdCreateV10RequestAudience.excludeLimitedRegion) &&
        Objects.equals(this.gender, qianchuanAdCreateV10RequestAudience.gender) &&
        Objects.equals(this.interestCategories, qianchuanAdCreateV10RequestAudience.interestCategories) &&
        Objects.equals(this.interestWords, qianchuanAdCreateV10RequestAudience.interestWords) &&
        Objects.equals(this.livePlatformTags, qianchuanAdCreateV10RequestAudience.livePlatformTags) &&
        Objects.equals(this.locationType, qianchuanAdCreateV10RequestAudience.locationType) &&
        Objects.equals(this.newCustomer, qianchuanAdCreateV10RequestAudience.newCustomer) &&
        Objects.equals(this.orientationId, qianchuanAdCreateV10RequestAudience.orientationId) &&
        Objects.equals(this.platform, qianchuanAdCreateV10RequestAudience.platform) &&
        Objects.equals(this.retargetingTagsExclude, qianchuanAdCreateV10RequestAudience.retargetingTagsExclude) &&
        Objects.equals(this.retargetingTagsInclude, qianchuanAdCreateV10RequestAudience.retargetingTagsInclude) &&
        Objects.equals(this.searchExtended, qianchuanAdCreateV10RequestAudience.searchExtended) &&
        Objects.equals(this.smartInterestAction, qianchuanAdCreateV10RequestAudience.smartInterestAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ac, actionCategories, actionDays, actionScene, actionWords, age, audienceMode, autoExtendEnabled, autoExtendTargets, awemeFanAccounts, awemeFanBehaviors, awemeFanBehaviorsDays, awemeFanCategories, city, district, districtType, electricFenceRegion, excludeLimitedRegion, gender, interestCategories, interestWords, livePlatformTags, locationType, newCustomer, orientationId, platform, retargetingTagsExclude, retargetingTagsInclude, searchExtended, smartInterestAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestAudience {\n");
    sb.append("    ac: ").append(toIndentedString(ac)).append("\n");
    sb.append("    actionCategories: ").append(toIndentedString(actionCategories)).append("\n");
    sb.append("    actionDays: ").append(toIndentedString(actionDays)).append("\n");
    sb.append("    actionScene: ").append(toIndentedString(actionScene)).append("\n");
    sb.append("    actionWords: ").append(toIndentedString(actionWords)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    audienceMode: ").append(toIndentedString(audienceMode)).append("\n");
    sb.append("    autoExtendEnabled: ").append(toIndentedString(autoExtendEnabled)).append("\n");
    sb.append("    autoExtendTargets: ").append(toIndentedString(autoExtendTargets)).append("\n");
    sb.append("    awemeFanAccounts: ").append(toIndentedString(awemeFanAccounts)).append("\n");
    sb.append("    awemeFanBehaviors: ").append(toIndentedString(awemeFanBehaviors)).append("\n");
    sb.append("    awemeFanBehaviorsDays: ").append(toIndentedString(awemeFanBehaviorsDays)).append("\n");
    sb.append("    awemeFanCategories: ").append(toIndentedString(awemeFanCategories)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    districtType: ").append(toIndentedString(districtType)).append("\n");
    sb.append("    electricFenceRegion: ").append(toIndentedString(electricFenceRegion)).append("\n");
    sb.append("    excludeLimitedRegion: ").append(toIndentedString(excludeLimitedRegion)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    interestCategories: ").append(toIndentedString(interestCategories)).append("\n");
    sb.append("    interestWords: ").append(toIndentedString(interestWords)).append("\n");
    sb.append("    livePlatformTags: ").append(toIndentedString(livePlatformTags)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    newCustomer: ").append(toIndentedString(newCustomer)).append("\n");
    sb.append("    orientationId: ").append(toIndentedString(orientationId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    retargetingTagsExclude: ").append(toIndentedString(retargetingTagsExclude)).append("\n");
    sb.append("    retargetingTagsInclude: ").append(toIndentedString(retargetingTagsInclude)).append("\n");
    sb.append("    searchExtended: ").append(toIndentedString(searchExtended)).append("\n");
    sb.append("    smartInterestAction: ").append(toIndentedString(smartInterestAction)).append("\n");
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
    openapiFields.add("action_categories");
    openapiFields.add("action_days");
    openapiFields.add("action_scene");
    openapiFields.add("action_words");
    openapiFields.add("age");
    openapiFields.add("audience_mode");
    openapiFields.add("auto_extend_enabled");
    openapiFields.add("auto_extend_targets");
    openapiFields.add("aweme_fan_accounts");
    openapiFields.add("aweme_fan_behaviors");
    openapiFields.add("aweme_fan_behaviors_days");
    openapiFields.add("aweme_fan_categories");
    openapiFields.add("city");
    openapiFields.add("district");
    openapiFields.add("district_type");
    openapiFields.add("electric_fence_region");
    openapiFields.add("exclude_limited_region");
    openapiFields.add("gender");
    openapiFields.add("interest_categories");
    openapiFields.add("interest_words");
    openapiFields.add("live_platform_tags");
    openapiFields.add("location_type");
    openapiFields.add("new_customer");
    openapiFields.add("orientation_id");
    openapiFields.add("platform");
    openapiFields.add("retargeting_tags_exclude");
    openapiFields.add("retargeting_tags_include");
    openapiFields.add("search_extended");
    openapiFields.add("smart_interest_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestAudience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestAudience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestAudience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestAudience.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestAudience>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestAudience value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestAudience read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestAudience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestAudience
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestAudience
  */
  public static QianchuanAdCreateV10RequestAudience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestAudience.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestAudience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

