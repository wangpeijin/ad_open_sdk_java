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
import com.bytedance.ads.model.LocalPromotionListV30DataPromotionListAdType;
import com.bytedance.ads.model.LocalPromotionListV30DataPromotionListLearningPhase;
import com.bytedance.ads.model.LocalPromotionListV30DataPromotionListPromotionStatusFirst;
import com.bytedance.ads.model.LocalPromotionListV30DataPromotionListPromotionStatusSecond;
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
 * LocalPromotionListV30ResponseDataPromotionListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class LocalPromotionListV30ResponseDataPromotionListInner {
  public static final String SERIALIZED_NAME_AD_TYPE = "ad_type";
  @SerializedName(SERIALIZED_NAME_AD_TYPE)
  private LocalPromotionListV30DataPromotionListAdType adType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_LEARNING_PHASE = "learning_phase";
  @SerializedName(SERIALIZED_NAME_LEARNING_PHASE)
  private LocalPromotionListV30DataPromotionListLearningPhase learningPhase = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_CREATE_TIME = "promotion_create_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CREATE_TIME)
  private String promotionCreateTime = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public static final String SERIALIZED_NAME_PROMOTION_MODIFY_TIME = "promotion_modify_time";
  @SerializedName(SERIALIZED_NAME_PROMOTION_MODIFY_TIME)
  private String promotionModifyTime = null;

  public static final String SERIALIZED_NAME_PROMOTION_NAME = "promotion_name";
  @SerializedName(SERIALIZED_NAME_PROMOTION_NAME)
  private String promotionName = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS_FIRST = "promotion_status_first";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS_FIRST)
  private LocalPromotionListV30DataPromotionListPromotionStatusFirst promotionStatusFirst = null;

  public static final String SERIALIZED_NAME_PROMOTION_STATUS_SECOND = "promotion_status_second";
  @SerializedName(SERIALIZED_NAME_PROMOTION_STATUS_SECOND)
  private List<LocalPromotionListV30DataPromotionListPromotionStatusSecond> promotionStatusSecond = null;

  public LocalPromotionListV30ResponseDataPromotionListInner() {
  }

  public LocalPromotionListV30ResponseDataPromotionListInner adType(LocalPromotionListV30DataPromotionListAdType adType) {
    
    this.adType = adType;
    return this;
  }

   /**
   * Get adType
   * @return adType
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30DataPromotionListAdType getAdType() {
    return adType;
  }


  public void setAdType(LocalPromotionListV30DataPromotionListAdType adType) {
    this.adType = adType;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 抖音号昵称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner learningPhase(LocalPromotionListV30DataPromotionListLearningPhase learningPhase) {
    
    this.learningPhase = learningPhase;
    return this;
  }

   /**
   * Get learningPhase
   * @return learningPhase
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30DataPromotionListLearningPhase getLearningPhase() {
    return learningPhase;
  }


  public void setLearningPhase(LocalPromotionListV30DataPromotionListLearningPhase learningPhase) {
    this.learningPhase = learningPhase;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 广告账户id
   * @return localAccountId
  **/
  @javax.annotation.Nullable
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionCreateTime(String promotionCreateTime) {
    
    this.promotionCreateTime = promotionCreateTime;
    return this;
  }

   /**
   * 广告创建时间，格式yyyy-MM-dd HH:mm:ss
   * @return promotionCreateTime
  **/
  @javax.annotation.Nullable
  public String getPromotionCreateTime() {
    return promotionCreateTime;
  }


  public void setPromotionCreateTime(String promotionCreateTime) {
    this.promotionCreateTime = promotionCreateTime;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionModifyTime(String promotionModifyTime) {
    
    this.promotionModifyTime = promotionModifyTime;
    return this;
  }

   /**
   * 广告更新时间，格式yyyy-MM-dd HH:mm:ss
   * @return promotionModifyTime
  **/
  @javax.annotation.Nullable
  public String getPromotionModifyTime() {
    return promotionModifyTime;
  }


  public void setPromotionModifyTime(String promotionModifyTime) {
    this.promotionModifyTime = promotionModifyTime;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionName(String promotionName) {
    
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 广告名称
   * @return promotionName
  **/
  @javax.annotation.Nullable
  public String getPromotionName() {
    return promotionName;
  }


  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionStatusFirst(LocalPromotionListV30DataPromotionListPromotionStatusFirst promotionStatusFirst) {
    
    this.promotionStatusFirst = promotionStatusFirst;
    return this;
  }

   /**
   * Get promotionStatusFirst
   * @return promotionStatusFirst
  **/
  @javax.annotation.Nullable
  public LocalPromotionListV30DataPromotionListPromotionStatusFirst getPromotionStatusFirst() {
    return promotionStatusFirst;
  }


  public void setPromotionStatusFirst(LocalPromotionListV30DataPromotionListPromotionStatusFirst promotionStatusFirst) {
    this.promotionStatusFirst = promotionStatusFirst;
  }


  public LocalPromotionListV30ResponseDataPromotionListInner promotionStatusSecond(List<LocalPromotionListV30DataPromotionListPromotionStatusSecond> promotionStatusSecond) {
    
    this.promotionStatusSecond = promotionStatusSecond;
    return this;
  }

  public LocalPromotionListV30ResponseDataPromotionListInner addPromotionStatusSecondItem(LocalPromotionListV30DataPromotionListPromotionStatusSecond promotionStatusSecondItem) {
    if (this.promotionStatusSecond == null) {
      this.promotionStatusSecond = new ArrayList<>();
    }
    this.promotionStatusSecond.add(promotionStatusSecondItem);
    return this;
  }

   /**
   * 广告二级状态
   * @return promotionStatusSecond
  **/
  @javax.annotation.Nullable
  public List<LocalPromotionListV30DataPromotionListPromotionStatusSecond> getPromotionStatusSecond() {
    return promotionStatusSecond;
  }


  public void setPromotionStatusSecond(List<LocalPromotionListV30DataPromotionListPromotionStatusSecond> promotionStatusSecond) {
    this.promotionStatusSecond = promotionStatusSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalPromotionListV30ResponseDataPromotionListInner localPromotionListV30ResponseDataPromotionListInner = (LocalPromotionListV30ResponseDataPromotionListInner) o;
    return Objects.equals(this.adType, localPromotionListV30ResponseDataPromotionListInner.adType) &&
        Objects.equals(this.awemeId, localPromotionListV30ResponseDataPromotionListInner.awemeId) &&
        Objects.equals(this.awemeName, localPromotionListV30ResponseDataPromotionListInner.awemeName) &&
        Objects.equals(this.learningPhase, localPromotionListV30ResponseDataPromotionListInner.learningPhase) &&
        Objects.equals(this.localAccountId, localPromotionListV30ResponseDataPromotionListInner.localAccountId) &&
        Objects.equals(this.projectId, localPromotionListV30ResponseDataPromotionListInner.projectId) &&
        Objects.equals(this.promotionCreateTime, localPromotionListV30ResponseDataPromotionListInner.promotionCreateTime) &&
        Objects.equals(this.promotionId, localPromotionListV30ResponseDataPromotionListInner.promotionId) &&
        Objects.equals(this.promotionModifyTime, localPromotionListV30ResponseDataPromotionListInner.promotionModifyTime) &&
        Objects.equals(this.promotionName, localPromotionListV30ResponseDataPromotionListInner.promotionName) &&
        Objects.equals(this.promotionStatusFirst, localPromotionListV30ResponseDataPromotionListInner.promotionStatusFirst) &&
        Objects.equals(this.promotionStatusSecond, localPromotionListV30ResponseDataPromotionListInner.promotionStatusSecond);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adType, awemeId, awemeName, learningPhase, localAccountId, projectId, promotionCreateTime, promotionId, promotionModifyTime, promotionName, promotionStatusFirst, promotionStatusSecond);
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
    sb.append("class LocalPromotionListV30ResponseDataPromotionListInner {\n");
    sb.append("    adType: ").append(toIndentedString(adType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    learningPhase: ").append(toIndentedString(learningPhase)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    promotionCreateTime: ").append(toIndentedString(promotionCreateTime)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionModifyTime: ").append(toIndentedString(promotionModifyTime)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionStatusFirst: ").append(toIndentedString(promotionStatusFirst)).append("\n");
    sb.append("    promotionStatusSecond: ").append(toIndentedString(promotionStatusSecond)).append("\n");
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
    openapiFields.add("ad_type");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("learning_phase");
    openapiFields.add("local_account_id");
    openapiFields.add("project_id");
    openapiFields.add("promotion_create_time");
    openapiFields.add("promotion_id");
    openapiFields.add("promotion_modify_time");
    openapiFields.add("promotion_name");
    openapiFields.add("promotion_status_first");
    openapiFields.add("promotion_status_second");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionListV30ResponseDataPromotionListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionListV30ResponseDataPromotionListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionListV30ResponseDataPromotionListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionListV30ResponseDataPromotionListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionListV30ResponseDataPromotionListInner>() {
           @Override
           public void write(JsonWriter out, LocalPromotionListV30ResponseDataPromotionListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionListV30ResponseDataPromotionListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionListV30ResponseDataPromotionListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionListV30ResponseDataPromotionListInner
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionListV30ResponseDataPromotionListInner
  */
  public static LocalPromotionListV30ResponseDataPromotionListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionListV30ResponseDataPromotionListInner.class);
  }

 /**
  * Convert an instance of LocalPromotionListV30ResponseDataPromotionListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

