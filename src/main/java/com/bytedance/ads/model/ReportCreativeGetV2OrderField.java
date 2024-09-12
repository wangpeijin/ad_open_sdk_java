/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ReportCreativeGetV2OrderField.Adapter.class)
public enum ReportCreativeGetV2OrderField {
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  SHOPPING("shopping"),
  
  CONSULT("consult"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  VALID_PLAY("valid_play"),
  
  REPORT("report"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  PAY_COUNT("pay_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  TOTAL_PLAY("total_play"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  QQ("qq"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  COMMENT("comment"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  CLICK_INSTALL("click_install"),
  
  LOTTERY("lottery"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  CPA("cpa"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  MAP_SEARCH("map_search"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  IN_APP_CART("in_app_cart"),
  
  LOCATION_CLICK("location_click"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  ACTIVE_RATE("active_rate"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  CONVERT("convert"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  VIEW("view"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  FOLLOW("follow"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  CLICK_DOWNLOAD("click_download"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  GAME_ADDICTION("game_addiction"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  CPC("cpc"),
  
  CARD_SHOW("card_show"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  CTR("ctr"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  CLICK_WEBSITE("click_website"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  IN_APP_UV("in_app_uv"),
  
  LOAN_CREDIT("loan_credit"),
  
  COST("cost"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  UNION_ROI_7("union_roi_7"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  PHONE("phone"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  REGISTER("register"),
  
  DISLIKE("dislike"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  AVG_RANK("avg_rank"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  COUPON("coupon"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  PLAY_OVER("play_over"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  HOME_VISITED("home_visited"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  IN_APP_PAY("in_app_pay"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  UNION_ROI_3("union_roi_3"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  DOWNLOAD("download"),
  
  MESSAGE_ACTION("message_action"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  DEEP_CONVERT("deep_convert"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  MESSAGE("message"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  WECHAT("wechat"),
  
  DOWNLOAD_START("download_start"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  VOTE("vote"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  IN_APP_ORDER("in_app_order"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  CONVERT_RATE("convert_rate"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  UNION_ROI_0("union_roi_0"),
  
  FORM("form"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  LOAN_COMPLETION("loan_completion"),
  
  ACTIVE_COST("active_cost"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  WIFI_PLAY("wifi_play"),
  
  CLICK("click"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  PHONE_CONNECT("phone_connect"),
  
  PLAY_DURATION("play_duration"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  CONVERT_COST("convert_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  APPROVAL_COUNT("approval_count"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  INSTALL_FINISH("install_finish"),
  
  BUTTON("button"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  LIKE("like"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  POI_COLLECT("poi_collect"),
  
  SHARE("share"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  REDIRECT("redirect"),
  
  SHOW("show"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  ACTIVE("active"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  CPM("cpm");

  private String value;

  ReportCreativeGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCreativeGetV2OrderField fromValue(String value) {
    for (ReportCreativeGetV2OrderField b : ReportCreativeGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCreativeGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCreativeGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCreativeGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCreativeGetV2OrderField.fromValue(value);
    }
  }
}

