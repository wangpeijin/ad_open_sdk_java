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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class ReportRubeexGetV2ResponseDataListInnerMetrics {
  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Long clickCnt = null;

  public static final String SERIALIZED_NAME_CONVERSION_COST = "conversion_cost";
  @SerializedName(SERIALIZED_NAME_CONVERSION_COST)
  private Double conversionCost = null;

  public static final String SERIALIZED_NAME_CONVERSION_RATE = "conversion_rate";
  @SerializedName(SERIALIZED_NAME_CONVERSION_RATE)
  private Double conversionRate = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Long convertCnt = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CPC = "cpc";
  @SerializedName(SERIALIZED_NAME_CPC)
  private Double cpc = null;

  public static final String SERIALIZED_NAME_CPM = "cpm";
  @SerializedName(SERIALIZED_NAME_CPM)
  private Double cpm = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_COUNT = "custom_finish_play_playable_count";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_COUNT)
  private Long customFinishPlayPlayableCount = null;

  public static final String SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_LAYER_RATE = "custom_finish_play_playable_layer_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_LAYER_RATE)
  private Double customFinishPlayPlayableLayerRate = null;

  public static final String SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_RATE = "custom_finish_play_playable_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FINISH_PLAY_PLAYABLE_RATE)
  private Double customFinishPlayPlayableRate = null;

  public static final String SERIALIZED_NAME_CUSTOM_LOAD_MAIN_SCENE_COUNT = "custom_load_main_scene_count";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LOAD_MAIN_SCENE_COUNT)
  private Long customLoadMainSceneCount = null;

  public static final String SERIALIZED_NAME_CUSTOM_LOAD_MAIN_SCENE_RATE = "custom_load_main_scene_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LOAD_MAIN_SCENE_RATE)
  private Double customLoadMainSceneRate = null;

  public static final String SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_COUNT = "custom_start_play_playable_count";
  @SerializedName(SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_COUNT)
  private Long customStartPlayPlayableCount = null;

  public static final String SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_LAYER_RATE = "custom_start_play_playable_layer_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_LAYER_RATE)
  private Double customStartPlayPlayableLayerRate = null;

  public static final String SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_RATE = "custom_start_play_playable_rate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_START_PLAY_PLAYABLE_RATE)
  private Double customStartPlayPlayableRate = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_BUTTON_CLICK_COUNT_ALL = "download_button_click_count_all";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_BUTTON_CLICK_COUNT_ALL)
  private Long downloadButtonClickCountAll = null;

  public static final String SERIALIZED_NAME_ENTER_SECTION_COUNT = "enter_section_count";
  @SerializedName(SERIALIZED_NAME_ENTER_SECTION_COUNT)
  private Long enterSectionCount = null;

  public static final String SERIALIZED_NAME_PLAY_DURATION_AVG_SDK = "play_duration_avg_sdk";
  @SerializedName(SERIALIZED_NAME_PLAY_DURATION_AVG_SDK)
  private Double playDurationAvgSdk = null;

  public static final String SERIALIZED_NAME_PLAY_DURATION_SDK = "play_duration_sdk";
  @SerializedName(SERIALIZED_NAME_PLAY_DURATION_SDK)
  private Double playDurationSdk = null;

  public static final String SERIALIZED_NAME_PLAYABLE_CTR = "playable_ctr";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_CTR)
  private Double playableCtr = null;

  public static final String SERIALIZED_NAME_PLAYABLE_DURATION_USER_COUNT = "playable_duration_user_count";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_DURATION_USER_COUNT)
  private Long playableDurationUserCount = null;

  public static final String SERIALIZED_NAME_PRE_PLAY_DURATION_AVG_SDK = "pre_play_duration_avg_sdk";
  @SerializedName(SERIALIZED_NAME_PRE_PLAY_DURATION_AVG_SDK)
  private Double prePlayDurationAvgSdk = null;

  public static final String SERIALIZED_NAME_PRE_PLAY_DURATION_SDK = "pre_play_duration_sdk";
  @SerializedName(SERIALIZED_NAME_PRE_PLAY_DURATION_SDK)
  private Double prePlayDurationSdk = null;

  public static final String SERIALIZED_NAME_PREDEFINE_PAGEVIEW_COUNT = "predefine_pageview_count";
  @SerializedName(SERIALIZED_NAME_PREDEFINE_PAGEVIEW_COUNT)
  private Long predefinePageviewCount = null;

  public static final String SERIALIZED_NAME_SDK_PLAYABLE_SHOW_COUNT = "sdk_playable_show_count";
  @SerializedName(SERIALIZED_NAME_SDK_PLAYABLE_SHOW_COUNT)
  private Long sdkPlayableShowCount = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Long showCnt = null;

  public ReportRubeexGetV2ResponseDataListInnerMetrics() {
  }

  public ReportRubeexGetV2ResponseDataListInnerMetrics clickCnt(Long clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Long getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Long clickCnt) {
    this.clickCnt = clickCnt;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics conversionCost(Double conversionCost) {
    
    this.conversionCost = conversionCost;
    return this;
  }

   /**
   * 
   * @return conversionCost
  **/
  @javax.annotation.Nullable
  public Double getConversionCost() {
    return conversionCost;
  }


  public void setConversionCost(Double conversionCost) {
    this.conversionCost = conversionCost;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics conversionRate(Double conversionRate) {
    
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * 
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  public Double getConversionRate() {
    return conversionRate;
  }


  public void setConversionRate(Double conversionRate) {
    this.conversionRate = conversionRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics convertCnt(Long convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Long getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Long convertCnt) {
    this.convertCnt = convertCnt;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics cpc(Double cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * 
   * @return cpc
  **/
  @javax.annotation.Nullable
  public Double getCpc() {
    return cpc;
  }


  public void setCpc(Double cpc) {
    this.cpc = cpc;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics cpm(Double cpm) {
    
    this.cpm = cpm;
    return this;
  }

   /**
   * 
   * @return cpm
  **/
  @javax.annotation.Nullable
  public Double getCpm() {
    return cpm;
  }


  public void setCpm(Double cpm) {
    this.cpm = cpm;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customFinishPlayPlayableCount(Long customFinishPlayPlayableCount) {
    
    this.customFinishPlayPlayableCount = customFinishPlayPlayableCount;
    return this;
  }

   /**
   * 
   * @return customFinishPlayPlayableCount
  **/
  @javax.annotation.Nullable
  public Long getCustomFinishPlayPlayableCount() {
    return customFinishPlayPlayableCount;
  }


  public void setCustomFinishPlayPlayableCount(Long customFinishPlayPlayableCount) {
    this.customFinishPlayPlayableCount = customFinishPlayPlayableCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customFinishPlayPlayableLayerRate(Double customFinishPlayPlayableLayerRate) {
    
    this.customFinishPlayPlayableLayerRate = customFinishPlayPlayableLayerRate;
    return this;
  }

   /**
   * 
   * @return customFinishPlayPlayableLayerRate
  **/
  @javax.annotation.Nullable
  public Double getCustomFinishPlayPlayableLayerRate() {
    return customFinishPlayPlayableLayerRate;
  }


  public void setCustomFinishPlayPlayableLayerRate(Double customFinishPlayPlayableLayerRate) {
    this.customFinishPlayPlayableLayerRate = customFinishPlayPlayableLayerRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customFinishPlayPlayableRate(Double customFinishPlayPlayableRate) {
    
    this.customFinishPlayPlayableRate = customFinishPlayPlayableRate;
    return this;
  }

   /**
   * 
   * @return customFinishPlayPlayableRate
  **/
  @javax.annotation.Nullable
  public Double getCustomFinishPlayPlayableRate() {
    return customFinishPlayPlayableRate;
  }


  public void setCustomFinishPlayPlayableRate(Double customFinishPlayPlayableRate) {
    this.customFinishPlayPlayableRate = customFinishPlayPlayableRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customLoadMainSceneCount(Long customLoadMainSceneCount) {
    
    this.customLoadMainSceneCount = customLoadMainSceneCount;
    return this;
  }

   /**
   * 
   * @return customLoadMainSceneCount
  **/
  @javax.annotation.Nullable
  public Long getCustomLoadMainSceneCount() {
    return customLoadMainSceneCount;
  }


  public void setCustomLoadMainSceneCount(Long customLoadMainSceneCount) {
    this.customLoadMainSceneCount = customLoadMainSceneCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customLoadMainSceneRate(Double customLoadMainSceneRate) {
    
    this.customLoadMainSceneRate = customLoadMainSceneRate;
    return this;
  }

   /**
   * 
   * @return customLoadMainSceneRate
  **/
  @javax.annotation.Nullable
  public Double getCustomLoadMainSceneRate() {
    return customLoadMainSceneRate;
  }


  public void setCustomLoadMainSceneRate(Double customLoadMainSceneRate) {
    this.customLoadMainSceneRate = customLoadMainSceneRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customStartPlayPlayableCount(Long customStartPlayPlayableCount) {
    
    this.customStartPlayPlayableCount = customStartPlayPlayableCount;
    return this;
  }

   /**
   * 
   * @return customStartPlayPlayableCount
  **/
  @javax.annotation.Nullable
  public Long getCustomStartPlayPlayableCount() {
    return customStartPlayPlayableCount;
  }


  public void setCustomStartPlayPlayableCount(Long customStartPlayPlayableCount) {
    this.customStartPlayPlayableCount = customStartPlayPlayableCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customStartPlayPlayableLayerRate(Double customStartPlayPlayableLayerRate) {
    
    this.customStartPlayPlayableLayerRate = customStartPlayPlayableLayerRate;
    return this;
  }

   /**
   * 
   * @return customStartPlayPlayableLayerRate
  **/
  @javax.annotation.Nullable
  public Double getCustomStartPlayPlayableLayerRate() {
    return customStartPlayPlayableLayerRate;
  }


  public void setCustomStartPlayPlayableLayerRate(Double customStartPlayPlayableLayerRate) {
    this.customStartPlayPlayableLayerRate = customStartPlayPlayableLayerRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics customStartPlayPlayableRate(Double customStartPlayPlayableRate) {
    
    this.customStartPlayPlayableRate = customStartPlayPlayableRate;
    return this;
  }

   /**
   * 
   * @return customStartPlayPlayableRate
  **/
  @javax.annotation.Nullable
  public Double getCustomStartPlayPlayableRate() {
    return customStartPlayPlayableRate;
  }


  public void setCustomStartPlayPlayableRate(Double customStartPlayPlayableRate) {
    this.customStartPlayPlayableRate = customStartPlayPlayableRate;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics downloadButtonClickCountAll(Long downloadButtonClickCountAll) {
    
    this.downloadButtonClickCountAll = downloadButtonClickCountAll;
    return this;
  }

   /**
   * 
   * @return downloadButtonClickCountAll
  **/
  @javax.annotation.Nullable
  public Long getDownloadButtonClickCountAll() {
    return downloadButtonClickCountAll;
  }


  public void setDownloadButtonClickCountAll(Long downloadButtonClickCountAll) {
    this.downloadButtonClickCountAll = downloadButtonClickCountAll;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics enterSectionCount(Long enterSectionCount) {
    
    this.enterSectionCount = enterSectionCount;
    return this;
  }

   /**
   * 
   * @return enterSectionCount
  **/
  @javax.annotation.Nullable
  public Long getEnterSectionCount() {
    return enterSectionCount;
  }


  public void setEnterSectionCount(Long enterSectionCount) {
    this.enterSectionCount = enterSectionCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics playDurationAvgSdk(Double playDurationAvgSdk) {
    
    this.playDurationAvgSdk = playDurationAvgSdk;
    return this;
  }

   /**
   * 
   * @return playDurationAvgSdk
  **/
  @javax.annotation.Nullable
  public Double getPlayDurationAvgSdk() {
    return playDurationAvgSdk;
  }


  public void setPlayDurationAvgSdk(Double playDurationAvgSdk) {
    this.playDurationAvgSdk = playDurationAvgSdk;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics playDurationSdk(Double playDurationSdk) {
    
    this.playDurationSdk = playDurationSdk;
    return this;
  }

   /**
   * 
   * @return playDurationSdk
  **/
  @javax.annotation.Nullable
  public Double getPlayDurationSdk() {
    return playDurationSdk;
  }


  public void setPlayDurationSdk(Double playDurationSdk) {
    this.playDurationSdk = playDurationSdk;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics playableCtr(Double playableCtr) {
    
    this.playableCtr = playableCtr;
    return this;
  }

   /**
   * 
   * @return playableCtr
  **/
  @javax.annotation.Nullable
  public Double getPlayableCtr() {
    return playableCtr;
  }


  public void setPlayableCtr(Double playableCtr) {
    this.playableCtr = playableCtr;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics playableDurationUserCount(Long playableDurationUserCount) {
    
    this.playableDurationUserCount = playableDurationUserCount;
    return this;
  }

   /**
   * 
   * @return playableDurationUserCount
  **/
  @javax.annotation.Nullable
  public Long getPlayableDurationUserCount() {
    return playableDurationUserCount;
  }


  public void setPlayableDurationUserCount(Long playableDurationUserCount) {
    this.playableDurationUserCount = playableDurationUserCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics prePlayDurationAvgSdk(Double prePlayDurationAvgSdk) {
    
    this.prePlayDurationAvgSdk = prePlayDurationAvgSdk;
    return this;
  }

   /**
   * 
   * @return prePlayDurationAvgSdk
  **/
  @javax.annotation.Nullable
  public Double getPrePlayDurationAvgSdk() {
    return prePlayDurationAvgSdk;
  }


  public void setPrePlayDurationAvgSdk(Double prePlayDurationAvgSdk) {
    this.prePlayDurationAvgSdk = prePlayDurationAvgSdk;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics prePlayDurationSdk(Double prePlayDurationSdk) {
    
    this.prePlayDurationSdk = prePlayDurationSdk;
    return this;
  }

   /**
   * 
   * @return prePlayDurationSdk
  **/
  @javax.annotation.Nullable
  public Double getPrePlayDurationSdk() {
    return prePlayDurationSdk;
  }


  public void setPrePlayDurationSdk(Double prePlayDurationSdk) {
    this.prePlayDurationSdk = prePlayDurationSdk;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics predefinePageviewCount(Long predefinePageviewCount) {
    
    this.predefinePageviewCount = predefinePageviewCount;
    return this;
  }

   /**
   * 
   * @return predefinePageviewCount
  **/
  @javax.annotation.Nullable
  public Long getPredefinePageviewCount() {
    return predefinePageviewCount;
  }


  public void setPredefinePageviewCount(Long predefinePageviewCount) {
    this.predefinePageviewCount = predefinePageviewCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics sdkPlayableShowCount(Long sdkPlayableShowCount) {
    
    this.sdkPlayableShowCount = sdkPlayableShowCount;
    return this;
  }

   /**
   * 
   * @return sdkPlayableShowCount
  **/
  @javax.annotation.Nullable
  public Long getSdkPlayableShowCount() {
    return sdkPlayableShowCount;
  }


  public void setSdkPlayableShowCount(Long sdkPlayableShowCount) {
    this.sdkPlayableShowCount = sdkPlayableShowCount;
  }


  public ReportRubeexGetV2ResponseDataListInnerMetrics showCnt(Long showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Long getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Long showCnt) {
    this.showCnt = showCnt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRubeexGetV2ResponseDataListInnerMetrics reportRubeexGetV2ResponseDataListInnerMetrics = (ReportRubeexGetV2ResponseDataListInnerMetrics) o;
    return Objects.equals(this.clickCnt, reportRubeexGetV2ResponseDataListInnerMetrics.clickCnt) &&
        Objects.equals(this.conversionCost, reportRubeexGetV2ResponseDataListInnerMetrics.conversionCost) &&
        Objects.equals(this.conversionRate, reportRubeexGetV2ResponseDataListInnerMetrics.conversionRate) &&
        Objects.equals(this.convertCnt, reportRubeexGetV2ResponseDataListInnerMetrics.convertCnt) &&
        Objects.equals(this.cost, reportRubeexGetV2ResponseDataListInnerMetrics.cost) &&
        Objects.equals(this.cpc, reportRubeexGetV2ResponseDataListInnerMetrics.cpc) &&
        Objects.equals(this.cpm, reportRubeexGetV2ResponseDataListInnerMetrics.cpm) &&
        Objects.equals(this.ctr, reportRubeexGetV2ResponseDataListInnerMetrics.ctr) &&
        Objects.equals(this.customFinishPlayPlayableCount, reportRubeexGetV2ResponseDataListInnerMetrics.customFinishPlayPlayableCount) &&
        Objects.equals(this.customFinishPlayPlayableLayerRate, reportRubeexGetV2ResponseDataListInnerMetrics.customFinishPlayPlayableLayerRate) &&
        Objects.equals(this.customFinishPlayPlayableRate, reportRubeexGetV2ResponseDataListInnerMetrics.customFinishPlayPlayableRate) &&
        Objects.equals(this.customLoadMainSceneCount, reportRubeexGetV2ResponseDataListInnerMetrics.customLoadMainSceneCount) &&
        Objects.equals(this.customLoadMainSceneRate, reportRubeexGetV2ResponseDataListInnerMetrics.customLoadMainSceneRate) &&
        Objects.equals(this.customStartPlayPlayableCount, reportRubeexGetV2ResponseDataListInnerMetrics.customStartPlayPlayableCount) &&
        Objects.equals(this.customStartPlayPlayableLayerRate, reportRubeexGetV2ResponseDataListInnerMetrics.customStartPlayPlayableLayerRate) &&
        Objects.equals(this.customStartPlayPlayableRate, reportRubeexGetV2ResponseDataListInnerMetrics.customStartPlayPlayableRate) &&
        Objects.equals(this.downloadButtonClickCountAll, reportRubeexGetV2ResponseDataListInnerMetrics.downloadButtonClickCountAll) &&
        Objects.equals(this.enterSectionCount, reportRubeexGetV2ResponseDataListInnerMetrics.enterSectionCount) &&
        Objects.equals(this.playDurationAvgSdk, reportRubeexGetV2ResponseDataListInnerMetrics.playDurationAvgSdk) &&
        Objects.equals(this.playDurationSdk, reportRubeexGetV2ResponseDataListInnerMetrics.playDurationSdk) &&
        Objects.equals(this.playableCtr, reportRubeexGetV2ResponseDataListInnerMetrics.playableCtr) &&
        Objects.equals(this.playableDurationUserCount, reportRubeexGetV2ResponseDataListInnerMetrics.playableDurationUserCount) &&
        Objects.equals(this.prePlayDurationAvgSdk, reportRubeexGetV2ResponseDataListInnerMetrics.prePlayDurationAvgSdk) &&
        Objects.equals(this.prePlayDurationSdk, reportRubeexGetV2ResponseDataListInnerMetrics.prePlayDurationSdk) &&
        Objects.equals(this.predefinePageviewCount, reportRubeexGetV2ResponseDataListInnerMetrics.predefinePageviewCount) &&
        Objects.equals(this.sdkPlayableShowCount, reportRubeexGetV2ResponseDataListInnerMetrics.sdkPlayableShowCount) &&
        Objects.equals(this.showCnt, reportRubeexGetV2ResponseDataListInnerMetrics.showCnt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCnt, conversionCost, conversionRate, convertCnt, cost, cpc, cpm, ctr, customFinishPlayPlayableCount, customFinishPlayPlayableLayerRate, customFinishPlayPlayableRate, customLoadMainSceneCount, customLoadMainSceneRate, customStartPlayPlayableCount, customStartPlayPlayableLayerRate, customStartPlayPlayableRate, downloadButtonClickCountAll, enterSectionCount, playDurationAvgSdk, playDurationSdk, playableCtr, playableDurationUserCount, prePlayDurationAvgSdk, prePlayDurationSdk, predefinePageviewCount, sdkPlayableShowCount, showCnt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRubeexGetV2ResponseDataListInnerMetrics {\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    conversionCost: ").append(toIndentedString(conversionCost)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    cpm: ").append(toIndentedString(cpm)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    customFinishPlayPlayableCount: ").append(toIndentedString(customFinishPlayPlayableCount)).append("\n");
    sb.append("    customFinishPlayPlayableLayerRate: ").append(toIndentedString(customFinishPlayPlayableLayerRate)).append("\n");
    sb.append("    customFinishPlayPlayableRate: ").append(toIndentedString(customFinishPlayPlayableRate)).append("\n");
    sb.append("    customLoadMainSceneCount: ").append(toIndentedString(customLoadMainSceneCount)).append("\n");
    sb.append("    customLoadMainSceneRate: ").append(toIndentedString(customLoadMainSceneRate)).append("\n");
    sb.append("    customStartPlayPlayableCount: ").append(toIndentedString(customStartPlayPlayableCount)).append("\n");
    sb.append("    customStartPlayPlayableLayerRate: ").append(toIndentedString(customStartPlayPlayableLayerRate)).append("\n");
    sb.append("    customStartPlayPlayableRate: ").append(toIndentedString(customStartPlayPlayableRate)).append("\n");
    sb.append("    downloadButtonClickCountAll: ").append(toIndentedString(downloadButtonClickCountAll)).append("\n");
    sb.append("    enterSectionCount: ").append(toIndentedString(enterSectionCount)).append("\n");
    sb.append("    playDurationAvgSdk: ").append(toIndentedString(playDurationAvgSdk)).append("\n");
    sb.append("    playDurationSdk: ").append(toIndentedString(playDurationSdk)).append("\n");
    sb.append("    playableCtr: ").append(toIndentedString(playableCtr)).append("\n");
    sb.append("    playableDurationUserCount: ").append(toIndentedString(playableDurationUserCount)).append("\n");
    sb.append("    prePlayDurationAvgSdk: ").append(toIndentedString(prePlayDurationAvgSdk)).append("\n");
    sb.append("    prePlayDurationSdk: ").append(toIndentedString(prePlayDurationSdk)).append("\n");
    sb.append("    predefinePageviewCount: ").append(toIndentedString(predefinePageviewCount)).append("\n");
    sb.append("    sdkPlayableShowCount: ").append(toIndentedString(sdkPlayableShowCount)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
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
    openapiFields.add("click_cnt");
    openapiFields.add("conversion_cost");
    openapiFields.add("conversion_rate");
    openapiFields.add("convert_cnt");
    openapiFields.add("cost");
    openapiFields.add("cpc");
    openapiFields.add("cpm");
    openapiFields.add("ctr");
    openapiFields.add("custom_finish_play_playable_count");
    openapiFields.add("custom_finish_play_playable_layer_rate");
    openapiFields.add("custom_finish_play_playable_rate");
    openapiFields.add("custom_load_main_scene_count");
    openapiFields.add("custom_load_main_scene_rate");
    openapiFields.add("custom_start_play_playable_count");
    openapiFields.add("custom_start_play_playable_layer_rate");
    openapiFields.add("custom_start_play_playable_rate");
    openapiFields.add("download_button_click_count_all");
    openapiFields.add("enter_section_count");
    openapiFields.add("play_duration_avg_sdk");
    openapiFields.add("play_duration_sdk");
    openapiFields.add("playable_ctr");
    openapiFields.add("playable_duration_user_count");
    openapiFields.add("pre_play_duration_avg_sdk");
    openapiFields.add("pre_play_duration_sdk");
    openapiFields.add("predefine_pageview_count");
    openapiFields.add("sdk_playable_show_count");
    openapiFields.add("show_cnt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRubeexGetV2ResponseDataListInnerMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRubeexGetV2ResponseDataListInnerMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRubeexGetV2ResponseDataListInnerMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRubeexGetV2ResponseDataListInnerMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRubeexGetV2ResponseDataListInnerMetrics>() {
           @Override
           public void write(JsonWriter out, ReportRubeexGetV2ResponseDataListInnerMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRubeexGetV2ResponseDataListInnerMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRubeexGetV2ResponseDataListInnerMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRubeexGetV2ResponseDataListInnerMetrics
  * @throws IOException if the JSON string is invalid with respect to ReportRubeexGetV2ResponseDataListInnerMetrics
  */
  public static ReportRubeexGetV2ResponseDataListInnerMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRubeexGetV2ResponseDataListInnerMetrics.class);
  }

 /**
  * Convert an instance of ReportRubeexGetV2ResponseDataListInnerMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

