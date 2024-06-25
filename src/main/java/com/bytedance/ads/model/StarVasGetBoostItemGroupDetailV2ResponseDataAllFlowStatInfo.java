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
 * 全流量业务指标
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo {
  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private Long comment = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_PV = "component_click_pv";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_PV)
  private Long componentClickPv = null;

  public static final String SERIALIZED_NAME_COMPONENT_CTR = "component_ctr";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CTR)
  private Long componentCtr = null;

  public static final String SERIALIZED_NAME_CONVERT_COUNT = "convert_count";
  @SerializedName(SERIALIZED_NAME_CONVERT_COUNT)
  private Long convertCount = null;

  public static final String SERIALIZED_NAME_FINISHED_WATCHER_UV = "finished_watcher_uv";
  @SerializedName(SERIALIZED_NAME_FINISHED_WATCHER_UV)
  private Long finishedWatcherUv = null;

  public static final String SERIALIZED_NAME_LIKE = "like";
  @SerializedName(SERIALIZED_NAME_LIKE)
  private Long like = null;

  public static final String SERIALIZED_NAME_PLAY = "play";
  @SerializedName(SERIALIZED_NAME_PLAY)
  private Long play = null;

  public static final String SERIALIZED_NAME_PLAY_RATE_WITH5S = "play_rate_with5s";
  @SerializedName(SERIALIZED_NAME_PLAY_RATE_WITH5S)
  private Long playRateWith5s = null;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Long share = null;

  public static final String SERIALIZED_NAME_TARGET_WATCHER_UV = "target_watcher_uv";
  @SerializedName(SERIALIZED_NAME_TARGET_WATCHER_UV)
  private Long targetWatcherUv = null;

  public static final String SERIALIZED_NAME_TOTAL_WATCHER_UV = "total_watcher_uv";
  @SerializedName(SERIALIZED_NAME_TOTAL_WATCHER_UV)
  private Long totalWatcherUv = null;

  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo() {
  }

  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo comment(Long comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * 评论数
   * @return comment
  **/
  @javax.annotation.Nullable
  public Long getComment() {
    return comment;
  }


  public void setComment(Long comment) {
    this.comment = comment;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo componentClickPv(Long componentClickPv) {
    
    this.componentClickPv = componentClickPv;
    return this;
  }

   /**
   * 组件点击数，仅BoostAction&#x3D;LINK_ACTION有效
   * @return componentClickPv
  **/
  @javax.annotation.Nullable
  public Long getComponentClickPv() {
    return componentClickPv;
  }


  public void setComponentClickPv(Long componentClickPv) {
    this.componentClickPv = componentClickPv;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo componentCtr(Long componentCtr) {
    
    this.componentCtr = componentCtr;
    return this;
  }

   /**
   * 组件CTR，百分数*100取整，如:1% -&gt; 100，仅BoostAction&#x3D;LINK_ACTION有效
   * @return componentCtr
  **/
  @javax.annotation.Nullable
  public Long getComponentCtr() {
    return componentCtr;
  }


  public void setComponentCtr(Long componentCtr) {
    this.componentCtr = componentCtr;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo convertCount(Long convertCount) {
    
    this.convertCount = convertCount;
    return this;
  }

   /**
   * 转化数，仅BoostAction&#x3D;LINK_ACTION有效
   * @return convertCount
  **/
  @javax.annotation.Nullable
  public Long getConvertCount() {
    return convertCount;
  }


  public void setConvertCount(Long convertCount) {
    this.convertCount = convertCount;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo finishedWatcherUv(Long finishedWatcherUv) {
    
    this.finishedWatcherUv = finishedWatcherUv;
    return this;
  }

   /**
   * 业务目标人群实际覆盖数，仅BoostType&#x3D;CUSTOM_PACKAGE&amp;&amp; BoostAction&#x3D;NATIVE_ACTION有效
   * @return finishedWatcherUv
  **/
  @javax.annotation.Nullable
  public Long getFinishedWatcherUv() {
    return finishedWatcherUv;
  }


  public void setFinishedWatcherUv(Long finishedWatcherUv) {
    this.finishedWatcherUv = finishedWatcherUv;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo like(Long like) {
    
    this.like = like;
    return this;
  }

   /**
   * 点赞数
   * @return like
  **/
  @javax.annotation.Nullable
  public Long getLike() {
    return like;
  }


  public void setLike(Long like) {
    this.like = like;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo play(Long play) {
    
    this.play = play;
    return this;
  }

   /**
   * 播放数
   * @return play
  **/
  @javax.annotation.Nullable
  public Long getPlay() {
    return play;
  }


  public void setPlay(Long play) {
    this.play = play;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo playRateWith5s(Long playRateWith5s) {
    
    this.playRateWith5s = playRateWith5s;
    return this;
  }

   /**
   * 五秒播放率
   * @return playRateWith5s
  **/
  @javax.annotation.Nullable
  public Long getPlayRateWith5s() {
    return playRateWith5s;
  }


  public void setPlayRateWith5s(Long playRateWith5s) {
    this.playRateWith5s = playRateWith5s;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo share(Long share) {
    
    this.share = share;
    return this;
  }

   /**
   * 分享数
   * @return share
  **/
  @javax.annotation.Nullable
  public Long getShare() {
    return share;
  }


  public void setShare(Long share) {
    this.share = share;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo targetWatcherUv(Long targetWatcherUv) {
    
    this.targetWatcherUv = targetWatcherUv;
    return this;
  }

   /**
   * 业务目标人群预期覆盖数，仅BoostType&#x3D;CUSTOM_PACKAGE&amp;&amp; BoostAction&#x3D;NATIVE_ACTION有效
   * @return targetWatcherUv
  **/
  @javax.annotation.Nullable
  public Long getTargetWatcherUv() {
    return targetWatcherUv;
  }


  public void setTargetWatcherUv(Long targetWatcherUv) {
    this.targetWatcherUv = targetWatcherUv;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo totalWatcherUv(Long totalWatcherUv) {
    
    this.totalWatcherUv = totalWatcherUv;
    return this;
  }

   /**
   * 视频总人群覆盖数，仅BoostType&#x3D;CUSTOM_PACKAGE&amp;&amp; BoostAction&#x3D;NATIVE_ACTION有效
   * @return totalWatcherUv
  **/
  @javax.annotation.Nullable
  public Long getTotalWatcherUv() {
    return totalWatcherUv;
  }


  public void setTotalWatcherUv(Long totalWatcherUv) {
    this.totalWatcherUv = totalWatcherUv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo = (StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo) o;
    return Objects.equals(this.comment, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.comment) &&
        Objects.equals(this.componentClickPv, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.componentClickPv) &&
        Objects.equals(this.componentCtr, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.componentCtr) &&
        Objects.equals(this.convertCount, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.convertCount) &&
        Objects.equals(this.finishedWatcherUv, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.finishedWatcherUv) &&
        Objects.equals(this.like, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.like) &&
        Objects.equals(this.play, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.play) &&
        Objects.equals(this.playRateWith5s, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.playRateWith5s) &&
        Objects.equals(this.share, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.share) &&
        Objects.equals(this.targetWatcherUv, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.targetWatcherUv) &&
        Objects.equals(this.totalWatcherUv, starVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.totalWatcherUv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, componentClickPv, componentCtr, convertCount, finishedWatcherUv, like, play, playRateWith5s, share, targetWatcherUv, totalWatcherUv);
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
    sb.append("class StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo {\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    componentClickPv: ").append(toIndentedString(componentClickPv)).append("\n");
    sb.append("    componentCtr: ").append(toIndentedString(componentCtr)).append("\n");
    sb.append("    convertCount: ").append(toIndentedString(convertCount)).append("\n");
    sb.append("    finishedWatcherUv: ").append(toIndentedString(finishedWatcherUv)).append("\n");
    sb.append("    like: ").append(toIndentedString(like)).append("\n");
    sb.append("    play: ").append(toIndentedString(play)).append("\n");
    sb.append("    playRateWith5s: ").append(toIndentedString(playRateWith5s)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    targetWatcherUv: ").append(toIndentedString(targetWatcherUv)).append("\n");
    sb.append("    totalWatcherUv: ").append(toIndentedString(totalWatcherUv)).append("\n");
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
    openapiFields.add("comment");
    openapiFields.add("component_click_pv");
    openapiFields.add("component_ctr");
    openapiFields.add("convert_count");
    openapiFields.add("finished_watcher_uv");
    openapiFields.add("like");
    openapiFields.add("play");
    openapiFields.add("play_rate_with5s");
    openapiFields.add("share");
    openapiFields.add("target_watcher_uv");
    openapiFields.add("total_watcher_uv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comment");
    openapiRequiredFields.add("like");
    openapiRequiredFields.add("play");
    openapiRequiredFields.add("play_rate_with5s");
    openapiRequiredFields.add("share");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo
  */
  public static StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo.class);
  }

 /**
  * Convert an instance of StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

