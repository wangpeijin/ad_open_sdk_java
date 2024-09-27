/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ReportAdvertiserGetV2OrderField.Adapter.class)
public enum ReportAdvertiserGetV2OrderField {
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  MESSAGE("message"),
  
  CLICK("click"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  CLICK_WEBSITE("click_website"),
  
  PHONE_CONNECT("phone_connect"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  DISLIKE("dislike"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  LOTTERY("lottery"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  CTR("ctr"),
  
  MESSAGE_ACTION("message_action"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  FOLLOW("follow"),
  
  VOTE("vote"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ACTIVE_COST("active_cost"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  VIEW("view"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  UNION_ROI_0("union_roi_0"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  CPM("cpm"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  IN_APP_UV("in_app_uv"),
  
  LOAN_CREDIT("loan_credit"),
  
  LOCATION_CLICK("location_click"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  COST("cost"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  IN_APP_CART("in_app_cart"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  CARD_SHOW("card_show"),
  
  CPC("cpc"),
  
  IN_APP_ORDER("in_app_order"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  REPORT("report"),
  
  MAP_SEARCH("map_search"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  PAY_COUNT("pay_count"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  CLICK_DOWNLOAD("click_download"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  DOWNLOAD("download"),
  
  BUTTON("button"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  SHARE("share"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  FORM("form"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  REGISTER("register"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  PLAY_OVER("play_over"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  REDIRECT("redirect"),
  
  PHONE("phone"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  DEEP_CONVERT("deep_convert"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  PLAY_DURATION("play_duration"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  LIKE("like"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  CLICK_INSTALL("click_install"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  ACTIVE_RATE("active_rate"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  HOME_VISITED("home_visited"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  CONVERT_RATE("convert_rate"),
  
  APPROVAL_COUNT("approval_count"),
  
  INSTALL_FINISH("install_finish"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  WIFI_PLAY("wifi_play"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  SHOPPING("shopping"),
  
  WECHAT("wechat"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  CONVERT_COST("convert_cost"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  CONSULT("consult"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  IN_APP_PAY("in_app_pay"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  COMMENT("comment"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  QQ("qq"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  AVG_RANK("avg_rank"),
  
  UNION_ROI_3("union_roi_3"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  POI_COLLECT("poi_collect"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  COUPON("coupon"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  CONVERT("convert"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  LOAN_COMPLETION("loan_completion"),
  
  SHOW("show"),
  
  DOWNLOAD_START("download_start"),
  
  GAME_ADDICTION("game_addiction"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  VALID_PLAY("valid_play"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  CPA("cpa"),
  
  TOTAL_PLAY("total_play"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  ACTIVE("active"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  UNION_ROI_7("union_roi_7"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount");

  private String value;

  ReportAdvertiserGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdvertiserGetV2OrderField fromValue(String value) {
    for (ReportAdvertiserGetV2OrderField b : ReportAdvertiserGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdvertiserGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdvertiserGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdvertiserGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdvertiserGetV2OrderField.fromValue(value);
    }
  }
}

