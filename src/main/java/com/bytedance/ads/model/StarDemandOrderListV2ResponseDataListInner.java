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
import com.bytedance.ads.model.StarDemandOrderListV2DataListUniversalOrderStatus;
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
 * StarDemandOrderListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarDemandOrderListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NAME = "author_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NAME)
  private String authorName = null;

  public static final String SERIALIZED_NAME_AVATAR_URI = "avatar_uri";
  @SerializedName(SERIALIZED_NAME_AVATAR_URI)
  private String avatarUri = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_URI = "head_image_uri";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_URI)
  private String headImageUri = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "release_time";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private String releaseTime = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS = "universal_order_status";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS)
  private StarDemandOrderListV2DataListUniversalOrderStatus universalOrderStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public StarDemandOrderListV2ResponseDataListInner() {
  }

  public StarDemandOrderListV2ResponseDataListInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 达人id
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarDemandOrderListV2ResponseDataListInner authorName(String authorName) {
    
    this.authorName = authorName;
    return this;
  }

   /**
   * 达人名称
   * @return authorName
  **/
  @javax.annotation.Nullable
  public String getAuthorName() {
    return authorName;
  }


  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }


  public StarDemandOrderListV2ResponseDataListInner avatarUri(String avatarUri) {
    
    this.avatarUri = avatarUri;
    return this;
  }

   /**
   * 达人头像
   * @return avatarUri
  **/
  @javax.annotation.Nullable
  public String getAvatarUri() {
    return avatarUri;
  }


  public void setAvatarUri(String avatarUri) {
    this.avatarUri = avatarUri;
  }


  public StarDemandOrderListV2ResponseDataListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 需求ID
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public StarDemandOrderListV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 订单创建时间，格式：%Y-%m-%d %H:%M:%S
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public StarDemandOrderListV2ResponseDataListInner demandId(Long demandId) {
    
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


  public StarDemandOrderListV2ResponseDataListInner headImageUri(String headImageUri) {
    
    this.headImageUri = headImageUri;
    return this;
  }

   /**
   * 封面图
   * @return headImageUri
  **/
  @javax.annotation.Nullable
  public String getHeadImageUri() {
    return headImageUri;
  }


  public void setHeadImageUri(String headImageUri) {
    this.headImageUri = headImageUri;
  }


  public StarDemandOrderListV2ResponseDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id，与星图平台前端video_url中展现的视频id一致，每个视频唯一
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarDemandOrderListV2ResponseDataListInner orderId(Long orderId) {
    
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


  public StarDemandOrderListV2ResponseDataListInner releaseTime(String releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 指派任务产出物发布时间
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public String getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(String releaseTime) {
    this.releaseTime = releaseTime;
  }


  public StarDemandOrderListV2ResponseDataListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 作品名称
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StarDemandOrderListV2ResponseDataListInner universalOrderStatus(StarDemandOrderListV2DataListUniversalOrderStatus universalOrderStatus) {
    
    this.universalOrderStatus = universalOrderStatus;
    return this;
  }

   /**
   * Get universalOrderStatus
   * @return universalOrderStatus
  **/
  @javax.annotation.Nullable
  public StarDemandOrderListV2DataListUniversalOrderStatus getUniversalOrderStatus() {
    return universalOrderStatus;
  }


  public void setUniversalOrderStatus(StarDemandOrderListV2DataListUniversalOrderStatus universalOrderStatus) {
    this.universalOrderStatus = universalOrderStatus;
  }


  public StarDemandOrderListV2ResponseDataListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频id，每个视频唯一（建议使用item_id）
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public StarDemandOrderListV2ResponseDataListInner videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频链接
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOrderListV2ResponseDataListInner starDemandOrderListV2ResponseDataListInner = (StarDemandOrderListV2ResponseDataListInner) o;
    return Objects.equals(this.authorId, starDemandOrderListV2ResponseDataListInner.authorId) &&
        Objects.equals(this.authorName, starDemandOrderListV2ResponseDataListInner.authorName) &&
        Objects.equals(this.avatarUri, starDemandOrderListV2ResponseDataListInner.avatarUri) &&
        Objects.equals(this.campaignId, starDemandOrderListV2ResponseDataListInner.campaignId) &&
        Objects.equals(this.createTime, starDemandOrderListV2ResponseDataListInner.createTime) &&
        Objects.equals(this.demandId, starDemandOrderListV2ResponseDataListInner.demandId) &&
        Objects.equals(this.headImageUri, starDemandOrderListV2ResponseDataListInner.headImageUri) &&
        Objects.equals(this.itemId, starDemandOrderListV2ResponseDataListInner.itemId) &&
        Objects.equals(this.orderId, starDemandOrderListV2ResponseDataListInner.orderId) &&
        Objects.equals(this.releaseTime, starDemandOrderListV2ResponseDataListInner.releaseTime) &&
        Objects.equals(this.title, starDemandOrderListV2ResponseDataListInner.title) &&
        Objects.equals(this.universalOrderStatus, starDemandOrderListV2ResponseDataListInner.universalOrderStatus) &&
        Objects.equals(this.videoId, starDemandOrderListV2ResponseDataListInner.videoId) &&
        Objects.equals(this.videoUrl, starDemandOrderListV2ResponseDataListInner.videoUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorId, authorName, avatarUri, campaignId, createTime, demandId, headImageUri, itemId, orderId, releaseTime, title, universalOrderStatus, videoId, videoUrl);
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
    sb.append("class StarDemandOrderListV2ResponseDataListInner {\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    avatarUri: ").append(toIndentedString(avatarUri)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    headImageUri: ").append(toIndentedString(headImageUri)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    universalOrderStatus: ").append(toIndentedString(universalOrderStatus)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("author_id");
    openapiFields.add("author_name");
    openapiFields.add("avatar_uri");
    openapiFields.add("campaign_id");
    openapiFields.add("create_time");
    openapiFields.add("demand_id");
    openapiFields.add("head_image_uri");
    openapiFields.add("item_id");
    openapiFields.add("order_id");
    openapiFields.add("release_time");
    openapiFields.add("title");
    openapiFields.add("universal_order_status");
    openapiFields.add("video_id");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOrderListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOrderListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOrderListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOrderListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOrderListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOrderListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOrderListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOrderListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOrderListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOrderListV2ResponseDataListInner
  */
  public static StarDemandOrderListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOrderListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of StarDemandOrderListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

