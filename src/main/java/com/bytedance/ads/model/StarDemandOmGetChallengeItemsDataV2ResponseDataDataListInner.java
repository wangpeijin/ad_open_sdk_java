/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
 * StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner {
  public static final String SERIALIZED_NAME_ANDROID_ACTIVATE_CNT = "android_activate_cnt";
  @SerializedName(SERIALIZED_NAME_ANDROID_ACTIVATE_CNT)
  private Long androidActivateCnt = null;

  public static final String SERIALIZED_NAME_AUTHOR_ID = "author_id";
  @SerializedName(SERIALIZED_NAME_AUTHOR_ID)
  private Long authorId = null;

  public static final String SERIALIZED_NAME_AUTHOR_NICKNAME = "author_nickname";
  @SerializedName(SERIALIZED_NAME_AUTHOR_NICKNAME)
  private String authorNickname = null;

  public static final String SERIALIZED_NAME_COMMENT_CNT = "comment_cnt";
  @SerializedName(SERIALIZED_NAME_COMMENT_CNT)
  private Long commentCnt = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_CNT = "component_click_cnt";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_CNT)
  private Long componentClickCnt = null;

  public static final String SERIALIZED_NAME_EST_AD_COST = "est_ad_cost";
  @SerializedName(SERIALIZED_NAME_EST_AD_COST)
  private String estAdCost = null;

  public static final String SERIALIZED_NAME_EST_SALES = "est_sales";
  @SerializedName(SERIALIZED_NAME_EST_SALES)
  private String estSales = null;

  public static final String SERIALIZED_NAME_IOS_ACTIVATE_CNT = "ios_activate_cnt";
  @SerializedName(SERIALIZED_NAME_IOS_ACTIVATE_CNT)
  private Long iosActivateCnt = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_LIKE_CNT = "like_cnt";
  @SerializedName(SERIALIZED_NAME_LIKE_CNT)
  private Long likeCnt = null;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private String play = null;

  public static final String SERIALIZED_NAME_PLAY_VV = "play_vv";
  @SerializedName(SERIALIZED_NAME_PLAY_VV)
  private Long playVv = null;

  public static final String SERIALIZED_NAME_PROMOTE_CNT = "promote_cnt";
  @SerializedName(SERIALIZED_NAME_PROMOTE_CNT)
  private Long promoteCnt = null;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "release_time";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private Long releaseTime = null;

  public static final String SERIALIZED_NAME_RELEVANCE_AUDIT_RESULT = "relevance_audit_result";
  @SerializedName(SERIALIZED_NAME_RELEVANCE_AUDIT_RESULT)
  private Long relevanceAuditResult = null;

  public static final String SERIALIZED_NAME_REWARD_AMOUNT = "reward_amount";
  @SerializedName(SERIALIZED_NAME_REWARD_AMOUNT)
  private Long rewardAmount = null;

  public static final String SERIALIZED_NAME_REWARD_LEVEL = "reward_level";
  @SerializedName(SERIALIZED_NAME_REWARD_LEVEL)
  private Long rewardLevel = null;

  public static final String SERIALIZED_NAME_SETTLE_AD_SHARE = "settle_ad_share";
  @SerializedName(SERIALIZED_NAME_SETTLE_AD_SHARE)
  private String settleAdShare = null;

  public static final String SERIALIZED_NAME_SETTLE_CPS = "settle_cps";
  @SerializedName(SERIALIZED_NAME_SETTLE_CPS)
  private String settleCps = null;

  public static final String SERIALIZED_NAME_SHARE_CNT = "share_cnt";
  @SerializedName(SERIALIZED_NAME_SHARE_CNT)
  private Long shareCnt = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VALID_LIKE_CNT = "valid_like_cnt";
  @SerializedName(SERIALIZED_NAME_VALID_LIKE_CNT)
  private Long validLikeCnt = null;

  public static final String SERIALIZED_NAME_VALID_PLAY_VV = "valid_play_vv";
  @SerializedName(SERIALIZED_NAME_VALID_PLAY_VV)
  private Long validPlayVv = null;

  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner() {
  }

  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner androidActivateCnt(Long androidActivateCnt) {
    
    this.androidActivateCnt = androidActivateCnt;
    return this;
  }

   /**
   * 
   * @return androidActivateCnt
  **/
  @javax.annotation.Nullable
  public Long getAndroidActivateCnt() {
    return androidActivateCnt;
  }


  public void setAndroidActivateCnt(Long androidActivateCnt) {
    this.androidActivateCnt = androidActivateCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner authorId(Long authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * 星图达人ID
   * @return authorId
  **/
  @javax.annotation.Nullable
  public Long getAuthorId() {
    return authorId;
  }


  public void setAuthorId(Long authorId) {
    this.authorId = authorId;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner authorNickname(String authorNickname) {
    
    this.authorNickname = authorNickname;
    return this;
  }

   /**
   * 达人名称
   * @return authorNickname
  **/
  @javax.annotation.Nullable
  public String getAuthorNickname() {
    return authorNickname;
  }


  public void setAuthorNickname(String authorNickname) {
    this.authorNickname = authorNickname;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner commentCnt(Long commentCnt) {
    
    this.commentCnt = commentCnt;
    return this;
  }

   /**
   * 
   * @return commentCnt
  **/
  @javax.annotation.Nullable
  public Long getCommentCnt() {
    return commentCnt;
  }


  public void setCommentCnt(Long commentCnt) {
    this.commentCnt = commentCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner componentClickCnt(Long componentClickCnt) {
    
    this.componentClickCnt = componentClickCnt;
    return this;
  }

   /**
   * 
   * @return componentClickCnt
  **/
  @javax.annotation.Nullable
  public Long getComponentClickCnt() {
    return componentClickCnt;
  }


  public void setComponentClickCnt(Long componentClickCnt) {
    this.componentClickCnt = componentClickCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner estAdCost(String estAdCost) {
    
    this.estAdCost = estAdCost;
    return this;
  }

   /**
   * 预估广告消耗金额 预估广告消耗金额、数据更新秒级时间戳，示例：{\&quot;value\&quot;: 1, \&quot;time\&quot;:1703606399}，其中value为视频播放量，time为数据更新秒级时间戳
   * @return estAdCost
  **/
  @javax.annotation.Nullable
  public String getEstAdCost() {
    return estAdCost;
  }


  public void setEstAdCost(String estAdCost) {
    this.estAdCost = estAdCost;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner estSales(String estSales) {
    
    this.estSales = estSales;
    return this;
  }

   /**
   * 预估付费流水金额 预估付费流水、数据更新秒级时间戳，示例：{\&quot;value\&quot;: 1, \&quot;time\&quot;:1703606399}，其中value为视频播放量，time为数据更新秒级时间戳
   * @return estSales
  **/
  @javax.annotation.Nullable
  public String getEstSales() {
    return estSales;
  }


  public void setEstSales(String estSales) {
    this.estSales = estSales;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner iosActivateCnt(Long iosActivateCnt) {
    
    this.iosActivateCnt = iosActivateCnt;
    return this;
  }

   /**
   * 
   * @return iosActivateCnt
  **/
  @javax.annotation.Nullable
  public Long getIosActivateCnt() {
    return iosActivateCnt;
  }


  public void setIosActivateCnt(Long iosActivateCnt) {
    this.iosActivateCnt = iosActivateCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频ID/图文ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner likeCnt(Long likeCnt) {
    
    this.likeCnt = likeCnt;
    return this;
  }

   /**
   * 
   * @return likeCnt
  **/
  @javax.annotation.Nullable
  public Long getLikeCnt() {
    return likeCnt;
  }


  public void setLikeCnt(Long likeCnt) {
    this.likeCnt = likeCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * 
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner play(String play) {
    
    this.play = play;
    return this;
  }

   /**
   * 播放量 视频播放量、数据更新秒级时间戳，示例：{\&quot;value\&quot;: 1, \&quot;time\&quot;:1703606399}，其中value为视频播放量，time为数据更新秒级时间戳
   * @return play
  **/
  @javax.annotation.Nullable
  public String getPlay() {
    return play;
  }


  public void setPlay(String play) {
    this.play = play;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner playVv(Long playVv) {
    
    this.playVv = playVv;
    return this;
  }

   /**
   * 
   * @return playVv
  **/
  @javax.annotation.Nullable
  public Long getPlayVv() {
    return playVv;
  }


  public void setPlayVv(Long playVv) {
    this.playVv = playVv;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner promoteCnt(Long promoteCnt) {
    
    this.promoteCnt = promoteCnt;
    return this;
  }

   /**
   * 
   * @return promoteCnt
  **/
  @javax.annotation.Nullable
  public Long getPromoteCnt() {
    return promoteCnt;
  }


  public void setPromoteCnt(Long promoteCnt) {
    this.promoteCnt = promoteCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner releaseTime(Long releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 发布时间 秒级时间戳，1658073600 则表示 2022-07-18 00:00:00
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  public Long getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(Long releaseTime) {
    this.releaseTime = releaseTime;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner relevanceAuditResult(Long relevanceAuditResult) {
    
    this.relevanceAuditResult = relevanceAuditResult;
    return this;
  }

   /**
   * 
   * @return relevanceAuditResult
  **/
  @javax.annotation.Nullable
  public Long getRelevanceAuditResult() {
    return relevanceAuditResult;
  }


  public void setRelevanceAuditResult(Long relevanceAuditResult) {
    this.relevanceAuditResult = relevanceAuditResult;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner rewardAmount(Long rewardAmount) {
    
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * 
   * @return rewardAmount
  **/
  @javax.annotation.Nullable
  public Long getRewardAmount() {
    return rewardAmount;
  }


  public void setRewardAmount(Long rewardAmount) {
    this.rewardAmount = rewardAmount;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner rewardLevel(Long rewardLevel) {
    
    this.rewardLevel = rewardLevel;
    return this;
  }

   /**
   * 
   * @return rewardLevel
  **/
  @javax.annotation.Nullable
  public Long getRewardLevel() {
    return rewardLevel;
  }


  public void setRewardLevel(Long rewardLevel) {
    this.rewardLevel = rewardLevel;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner settleAdShare(String settleAdShare) {
    
    this.settleAdShare = settleAdShare;
    return this;
  }

   /**
   * 已发放达人分成金额 已发放达人分成金额、数据更新秒级时间戳，示例：{\&quot;value\&quot;: 1, \&quot;time\&quot;:1703606399}，其中value为视频播放量，time为数据更新秒级时间戳
   * @return settleAdShare
  **/
  @javax.annotation.Nullable
  public String getSettleAdShare() {
    return settleAdShare;
  }


  public void setSettleAdShare(String settleAdShare) {
    this.settleAdShare = settleAdShare;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner settleCps(String settleCps) {
    
    this.settleCps = settleCps;
    return this;
  }

   /**
   * 已发放达人分佣金额 已发放达人分佣金额、数据更新秒级时间戳，示例：{\&quot;value\&quot;: 1, \&quot;time\&quot;:1703606399}，其中value为视频播放量，time为数据更新秒级时间戳
   * @return settleCps
  **/
  @javax.annotation.Nullable
  public String getSettleCps() {
    return settleCps;
  }


  public void setSettleCps(String settleCps) {
    this.settleCps = settleCps;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner shareCnt(Long shareCnt) {
    
    this.shareCnt = shareCnt;
    return this;
  }

   /**
   * 
   * @return shareCnt
  **/
  @javax.annotation.Nullable
  public Long getShareCnt() {
    return shareCnt;
  }


  public void setShareCnt(Long shareCnt) {
    this.shareCnt = shareCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner validLikeCnt(Long validLikeCnt) {
    
    this.validLikeCnt = validLikeCnt;
    return this;
  }

   /**
   * 
   * @return validLikeCnt
  **/
  @javax.annotation.Nullable
  public Long getValidLikeCnt() {
    return validLikeCnt;
  }


  public void setValidLikeCnt(Long validLikeCnt) {
    this.validLikeCnt = validLikeCnt;
  }


  public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner validPlayVv(Long validPlayVv) {
    
    this.validPlayVv = validPlayVv;
    return this;
  }

   /**
   * 
   * @return validPlayVv
  **/
  @javax.annotation.Nullable
  public Long getValidPlayVv() {
    return validPlayVv;
  }


  public void setValidPlayVv(Long validPlayVv) {
    this.validPlayVv = validPlayVv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner = (StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner) o;
    return Objects.equals(this.androidActivateCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.androidActivateCnt) &&
        Objects.equals(this.authorId, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.authorId) &&
        Objects.equals(this.authorNickname, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.authorNickname) &&
        Objects.equals(this.commentCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.commentCnt) &&
        Objects.equals(this.componentClickCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.componentClickCnt) &&
        Objects.equals(this.estAdCost, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.estAdCost) &&
        Objects.equals(this.estSales, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.estSales) &&
        Objects.equals(this.iosActivateCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.iosActivateCnt) &&
        Objects.equals(this.itemId, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.itemId) &&
        Objects.equals(this.likeCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.likeCnt) &&
        Objects.equals(this.link, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.link) &&
        Objects.equals(this.play, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.play) &&
        Objects.equals(this.playVv, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.playVv) &&
        Objects.equals(this.promoteCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.promoteCnt) &&
        Objects.equals(this.releaseTime, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.releaseTime) &&
        Objects.equals(this.relevanceAuditResult, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.relevanceAuditResult) &&
        Objects.equals(this.rewardAmount, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.rewardAmount) &&
        Objects.equals(this.rewardLevel, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.rewardLevel) &&
        Objects.equals(this.settleAdShare, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.settleAdShare) &&
        Objects.equals(this.settleCps, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.settleCps) &&
        Objects.equals(this.shareCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.shareCnt) &&
        Objects.equals(this.title, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.title) &&
        Objects.equals(this.validLikeCnt, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.validLikeCnt) &&
        Objects.equals(this.validPlayVv, starDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.validPlayVv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidActivateCnt, authorId, authorNickname, commentCnt, componentClickCnt, estAdCost, estSales, iosActivateCnt, itemId, likeCnt, link, play, playVv, promoteCnt, releaseTime, relevanceAuditResult, rewardAmount, rewardLevel, settleAdShare, settleCps, shareCnt, title, validLikeCnt, validPlayVv);
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
    sb.append("class StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner {\n");
    sb.append("    androidActivateCnt: ").append(toIndentedString(androidActivateCnt)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    authorNickname: ").append(toIndentedString(authorNickname)).append("\n");
    sb.append("    commentCnt: ").append(toIndentedString(commentCnt)).append("\n");
    sb.append("    componentClickCnt: ").append(toIndentedString(componentClickCnt)).append("\n");
    sb.append("    estAdCost: ").append(toIndentedString(estAdCost)).append("\n");
    sb.append("    estSales: ").append(toIndentedString(estSales)).append("\n");
    sb.append("    iosActivateCnt: ").append(toIndentedString(iosActivateCnt)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    likeCnt: ").append(toIndentedString(likeCnt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    playVv: ").append(toIndentedString(playVv)).append("\n");
    sb.append("    promoteCnt: ").append(toIndentedString(promoteCnt)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    relevanceAuditResult: ").append(toIndentedString(relevanceAuditResult)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
    sb.append("    rewardLevel: ").append(toIndentedString(rewardLevel)).append("\n");
    sb.append("    settleAdShare: ").append(toIndentedString(settleAdShare)).append("\n");
    sb.append("    settleCps: ").append(toIndentedString(settleCps)).append("\n");
    sb.append("    shareCnt: ").append(toIndentedString(shareCnt)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    validLikeCnt: ").append(toIndentedString(validLikeCnt)).append("\n");
    sb.append("    validPlayVv: ").append(toIndentedString(validPlayVv)).append("\n");
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
    openapiFields.add("android_activate_cnt");
    openapiFields.add("author_id");
    openapiFields.add("author_nickname");
    openapiFields.add("comment_cnt");
    openapiFields.add("component_click_cnt");
    openapiFields.add("est_ad_cost");
    openapiFields.add("est_sales");
    openapiFields.add("ios_activate_cnt");
    openapiFields.add("item_id");
    openapiFields.add("like_cnt");
    openapiFields.add("link");
    openapiFields.add("play");
    openapiFields.add("play_vv");
    openapiFields.add("promote_cnt");
    openapiFields.add("release_time");
    openapiFields.add("relevance_audit_result");
    openapiFields.add("reward_amount");
    openapiFields.add("reward_level");
    openapiFields.add("settle_ad_share");
    openapiFields.add("settle_cps");
    openapiFields.add("share_cnt");
    openapiFields.add("title");
    openapiFields.add("valid_like_cnt");
    openapiFields.add("valid_play_vv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner>() {
           @Override
           public void write(JsonWriter out, StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner
  * @throws IOException if the JSON string is invalid with respect to StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner
  */
  public static StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner.class);
  }

 /**
  * Convert an instance of StarDemandOmGetChallengeItemsDataV2ResponseDataDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

