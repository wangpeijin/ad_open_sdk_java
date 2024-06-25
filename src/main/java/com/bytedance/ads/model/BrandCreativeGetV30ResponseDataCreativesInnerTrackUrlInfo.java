/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * 监测链接
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private List<String> actionTrackUrl = null;

  public static final String SERIALIZED_NAME_CARD_SHOW_TRACK_URL = "card_show_track_url";
  @SerializedName(SERIALIZED_NAME_CARD_SHOW_TRACK_URL)
  private List<String> cardShowTrackUrl = null;

  public static final String SERIALIZED_NAME_COMMENT_TRACK_URL = "comment_track_url";
  @SerializedName(SERIALIZED_NAME_COMMENT_TRACK_URL)
  private List<String> commentTrackUrl = null;

  public static final String SERIALIZED_NAME_CONTEXT_TRACK_URL = "context_track_url";
  @SerializedName(SERIALIZED_NAME_CONTEXT_TRACK_URL)
  private List<String> contextTrackUrl = null;

  public static final String SERIALIZED_NAME_EFFECTIVE_FRAME = "effective_frame";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_FRAME)
  private List<String> effectiveFrame = null;

  public static final String SERIALIZED_NAME_FIRST_FRAME = "first_frame";
  @SerializedName(SERIALIZED_NAME_FIRST_FRAME)
  private List<String> firstFrame = null;

  public static final String SERIALIZED_NAME_INTERACT_TRACK_URL = "interact_track_url";
  @SerializedName(SERIALIZED_NAME_INTERACT_TRACK_URL)
  private List<String> interactTrackUrl = null;

  public static final String SERIALIZED_NAME_LAST_FRAME = "last_frame";
  @SerializedName(SERIALIZED_NAME_LAST_FRAME)
  private List<String> lastFrame = null;

  public static final String SERIALIZED_NAME_LIKE_CANCEL_TRACK_URL = "like_cancel_track_url";
  @SerializedName(SERIALIZED_NAME_LIKE_CANCEL_TRACK_URL)
  private List<String> likeCancelTrackUrl = null;

  public static final String SERIALIZED_NAME_LIKE_TRACK_URL = "like_track_url";
  @SerializedName(SERIALIZED_NAME_LIKE_TRACK_URL)
  private List<String> likeTrackUrl = null;

  public static final String SERIALIZED_NAME_MANUAL_FRAME = "manual_frame";
  @SerializedName(SERIALIZED_NAME_MANUAL_FRAME)
  private List<String> manualFrame = null;

  public static final String SERIALIZED_NAME_SHARE_TRACK_URL = "share_track_url";
  @SerializedName(SERIALIZED_NAME_SHARE_TRACK_URL)
  private List<String> shareTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private List<String> trackUrl = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo actionTrackUrl(List<String> actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addActionTrackUrlItem(String actionTrackUrlItem) {
    if (this.actionTrackUrl == null) {
      this.actionTrackUrl = new ArrayList<>();
    }
    this.actionTrackUrl.add(actionTrackUrlItem);
    return this;
  }

   /**
   * 点击监测链接
   * @return actionTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(List<String> actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo cardShowTrackUrl(List<String> cardShowTrackUrl) {
    
    this.cardShowTrackUrl = cardShowTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addCardShowTrackUrlItem(String cardShowTrackUrlItem) {
    if (this.cardShowTrackUrl == null) {
      this.cardShowTrackUrl = new ArrayList<>();
    }
    this.cardShowTrackUrl.add(cardShowTrackUrlItem);
    return this;
  }

   /**
   * 卡片展现第三方监测链接
   * @return cardShowTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getCardShowTrackUrl() {
    return cardShowTrackUrl;
  }


  public void setCardShowTrackUrl(List<String> cardShowTrackUrl) {
    this.cardShowTrackUrl = cardShowTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo commentTrackUrl(List<String> commentTrackUrl) {
    
    this.commentTrackUrl = commentTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addCommentTrackUrlItem(String commentTrackUrlItem) {
    if (this.commentTrackUrl == null) {
      this.commentTrackUrl = new ArrayList<>();
    }
    this.commentTrackUrl.add(commentTrackUrlItem);
    return this;
  }

   /**
   * 评论监测链接
   * @return commentTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getCommentTrackUrl() {
    return commentTrackUrl;
  }


  public void setCommentTrackUrl(List<String> commentTrackUrl) {
    this.commentTrackUrl = commentTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo contextTrackUrl(List<String> contextTrackUrl) {
    
    this.contextTrackUrl = contextTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addContextTrackUrlItem(String contextTrackUrlItem) {
    if (this.contextTrackUrl == null) {
      this.contextTrackUrl = new ArrayList<>();
    }
    this.contextTrackUrl.add(contextTrackUrlItem);
    return this;
  }

   /**
   * 第三方上下文内容监测链接
   * @return contextTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getContextTrackUrl() {
    return contextTrackUrl;
  }


  public void setContextTrackUrl(List<String> contextTrackUrl) {
    this.contextTrackUrl = contextTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo effectiveFrame(List<String> effectiveFrame) {
    
    this.effectiveFrame = effectiveFrame;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addEffectiveFrameItem(String effectiveFrameItem) {
    if (this.effectiveFrame == null) {
      this.effectiveFrame = new ArrayList<>();
    }
    this.effectiveFrame.add(effectiveFrameItem);
    return this;
  }

   /**
   * 视频有效播放监测链接
   * @return effectiveFrame
  **/
  @javax.annotation.Nullable
  public List<String> getEffectiveFrame() {
    return effectiveFrame;
  }


  public void setEffectiveFrame(List<String> effectiveFrame) {
    this.effectiveFrame = effectiveFrame;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo firstFrame(List<String> firstFrame) {
    
    this.firstFrame = firstFrame;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addFirstFrameItem(String firstFrameItem) {
    if (this.firstFrame == null) {
      this.firstFrame = new ArrayList<>();
    }
    this.firstFrame.add(firstFrameItem);
    return this;
  }

   /**
   * 视频开始播放监测链接
   * @return firstFrame
  **/
  @javax.annotation.Nullable
  public List<String> getFirstFrame() {
    return firstFrame;
  }


  public void setFirstFrame(List<String> firstFrame) {
    this.firstFrame = firstFrame;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo interactTrackUrl(List<String> interactTrackUrl) {
    
    this.interactTrackUrl = interactTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addInteractTrackUrlItem(String interactTrackUrlItem) {
    if (this.interactTrackUrl == null) {
      this.interactTrackUrl = new ArrayList<>();
    }
    this.interactTrackUrl.add(interactTrackUrlItem);
    return this;
  }

   /**
   * 互动监控链接监测链接
   * @return interactTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getInteractTrackUrl() {
    return interactTrackUrl;
  }


  public void setInteractTrackUrl(List<String> interactTrackUrl) {
    this.interactTrackUrl = interactTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo lastFrame(List<String> lastFrame) {
    
    this.lastFrame = lastFrame;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addLastFrameItem(String lastFrameItem) {
    if (this.lastFrame == null) {
      this.lastFrame = new ArrayList<>();
    }
    this.lastFrame.add(lastFrameItem);
    return this;
  }

   /**
   * 视频播放完成监测链接
   * @return lastFrame
  **/
  @javax.annotation.Nullable
  public List<String> getLastFrame() {
    return lastFrame;
  }


  public void setLastFrame(List<String> lastFrame) {
    this.lastFrame = lastFrame;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo likeCancelTrackUrl(List<String> likeCancelTrackUrl) {
    
    this.likeCancelTrackUrl = likeCancelTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addLikeCancelTrackUrlItem(String likeCancelTrackUrlItem) {
    if (this.likeCancelTrackUrl == null) {
      this.likeCancelTrackUrl = new ArrayList<>();
    }
    this.likeCancelTrackUrl.add(likeCancelTrackUrlItem);
    return this;
  }

   /**
   * 点赞取消监测链接
   * @return likeCancelTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getLikeCancelTrackUrl() {
    return likeCancelTrackUrl;
  }


  public void setLikeCancelTrackUrl(List<String> likeCancelTrackUrl) {
    this.likeCancelTrackUrl = likeCancelTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo likeTrackUrl(List<String> likeTrackUrl) {
    
    this.likeTrackUrl = likeTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addLikeTrackUrlItem(String likeTrackUrlItem) {
    if (this.likeTrackUrl == null) {
      this.likeTrackUrl = new ArrayList<>();
    }
    this.likeTrackUrl.add(likeTrackUrlItem);
    return this;
  }

   /**
   * 点赞监测链接
   * @return likeTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getLikeTrackUrl() {
    return likeTrackUrl;
  }


  public void setLikeTrackUrl(List<String> likeTrackUrl) {
    this.likeTrackUrl = likeTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo manualFrame(List<String> manualFrame) {
    
    this.manualFrame = manualFrame;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addManualFrameItem(String manualFrameItem) {
    if (this.manualFrame == null) {
      this.manualFrame = new ArrayList<>();
    }
    this.manualFrame.add(manualFrameItem);
    return this;
  }

   /**
   * 视频主动播放监测链接
   * @return manualFrame
  **/
  @javax.annotation.Nullable
  public List<String> getManualFrame() {
    return manualFrame;
  }


  public void setManualFrame(List<String> manualFrame) {
    this.manualFrame = manualFrame;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo shareTrackUrl(List<String> shareTrackUrl) {
    
    this.shareTrackUrl = shareTrackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addShareTrackUrlItem(String shareTrackUrlItem) {
    if (this.shareTrackUrl == null) {
      this.shareTrackUrl = new ArrayList<>();
    }
    this.shareTrackUrl.add(shareTrackUrlItem);
    return this;
  }

   /**
   * 分享监测链接
   * @return shareTrackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getShareTrackUrl() {
    return shareTrackUrl;
  }


  public void setShareTrackUrl(List<String> shareTrackUrl) {
    this.shareTrackUrl = shareTrackUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo trackUrl(List<String> trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo addTrackUrlItem(String trackUrlItem) {
    if (this.trackUrl == null) {
      this.trackUrl = new ArrayList<>();
    }
    this.trackUrl.add(trackUrlItem);
    return this;
  }

   /**
   * 展示监测链接
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public List<String> getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(List<String> trackUrl) {
    this.trackUrl = trackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo = (BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo) o;
    return Objects.equals(this.actionTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.actionTrackUrl) &&
        Objects.equals(this.cardShowTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.cardShowTrackUrl) &&
        Objects.equals(this.commentTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.commentTrackUrl) &&
        Objects.equals(this.contextTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.contextTrackUrl) &&
        Objects.equals(this.effectiveFrame, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.effectiveFrame) &&
        Objects.equals(this.firstFrame, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.firstFrame) &&
        Objects.equals(this.interactTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.interactTrackUrl) &&
        Objects.equals(this.lastFrame, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.lastFrame) &&
        Objects.equals(this.likeCancelTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.likeCancelTrackUrl) &&
        Objects.equals(this.likeTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.likeTrackUrl) &&
        Objects.equals(this.manualFrame, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.manualFrame) &&
        Objects.equals(this.shareTrackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.shareTrackUrl) &&
        Objects.equals(this.trackUrl, brandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.trackUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, cardShowTrackUrl, commentTrackUrl, contextTrackUrl, effectiveFrame, firstFrame, interactTrackUrl, lastFrame, likeCancelTrackUrl, likeTrackUrl, manualFrame, shareTrackUrl, trackUrl);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    cardShowTrackUrl: ").append(toIndentedString(cardShowTrackUrl)).append("\n");
    sb.append("    commentTrackUrl: ").append(toIndentedString(commentTrackUrl)).append("\n");
    sb.append("    contextTrackUrl: ").append(toIndentedString(contextTrackUrl)).append("\n");
    sb.append("    effectiveFrame: ").append(toIndentedString(effectiveFrame)).append("\n");
    sb.append("    firstFrame: ").append(toIndentedString(firstFrame)).append("\n");
    sb.append("    interactTrackUrl: ").append(toIndentedString(interactTrackUrl)).append("\n");
    sb.append("    lastFrame: ").append(toIndentedString(lastFrame)).append("\n");
    sb.append("    likeCancelTrackUrl: ").append(toIndentedString(likeCancelTrackUrl)).append("\n");
    sb.append("    likeTrackUrl: ").append(toIndentedString(likeTrackUrl)).append("\n");
    sb.append("    manualFrame: ").append(toIndentedString(manualFrame)).append("\n");
    sb.append("    shareTrackUrl: ").append(toIndentedString(shareTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("card_show_track_url");
    openapiFields.add("comment_track_url");
    openapiFields.add("context_track_url");
    openapiFields.add("effective_frame");
    openapiFields.add("first_frame");
    openapiFields.add("interact_track_url");
    openapiFields.add("last_frame");
    openapiFields.add("like_cancel_track_url");
    openapiFields.add("like_track_url");
    openapiFields.add("manual_frame");
    openapiFields.add("share_track_url");
    openapiFields.add("track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerTrackUrlInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

