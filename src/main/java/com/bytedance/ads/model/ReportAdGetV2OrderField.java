/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(ReportAdGetV2OrderField.Adapter.class)
public enum ReportAdGetV2OrderField {
  
  AVG_CLICK_COST("avg_click_cost"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  WECHAT("wechat"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  COST("cost"),
  
  POI_COLLECT("poi_collect"),
  
  UNION_ROI_7("union_roi_7"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  CONVERT("convert"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  SHARE("share"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  UNION_ROI_0("union_roi_0"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  APPROVAL_COUNT("approval_count"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  FORM("form"),
  
  REDIRECT("redirect"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  COUPON("coupon"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  QQ("qq"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  CONSULT("consult"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  CLICK_DOWNLOAD("click_download"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  IN_APP_UV("in_app_uv"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  VIEW("view"),
  
  LOAN_COMPLETION("loan_completion"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  PHONE("phone"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  PLAY_DURATION("play_duration"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  ACTIVE_COST("active_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  SHOPPING("shopping"),
  
  FOLLOW("follow"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  VALID_PLAY("valid_play"),
  
  CLICK("click"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  BUTTON("button"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  PLAY_OVER("play_over"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  DEEP_CONVERT("deep_convert"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  CONVERT_COST("convert_cost"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  CPA("cpa"),
  
  CLICK_INSTALL("click_install"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  GAME_ADDICTION("game_addiction"),
  
  CPC("cpc"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  DOWNLOAD("download"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  CARD_SHOW("card_show"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  MESSAGE("message"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  SHOW("show"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  LIKE("like"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  CTR("ctr"),
  
  INSTALL_FINISH("install_finish"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  PHONE_CONNECT("phone_connect"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  CLICK_WEBSITE("click_website"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  PAY_COUNT("pay_count"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  IN_APP_ORDER("in_app_order"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  UNION_ROI_3("union_roi_3"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  LOTTERY("lottery"),
  
  REPORT("report"),
  
  IN_APP_PAY("in_app_pay"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  WIFI_PLAY("wifi_play"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  LOAN_CREDIT("loan_credit"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  CONVERT_RATE("convert_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  REGISTER("register"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  MAP_SEARCH("map_search"),
  
  TOTAL_PLAY("total_play"),
  
  DOWNLOAD_START("download_start"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  COMMENT("comment"),
  
  VOTE("vote"),
  
  IN_APP_CART("in_app_cart"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  MESSAGE_ACTION("message_action"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  ACTIVE("active"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  CPM("cpm"),
  
  HOME_VISITED("home_visited"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  LOCATION_CLICK("location_click"),
  
  AVG_RANK("avg_rank"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  ACTIVE_RATE("active_rate"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  DISLIKE("dislike"),
  
  GAME_ADDICTION_RATE("game_addiction_rate");

  private String value;

  ReportAdGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportAdGetV2OrderField fromValue(String value) {
    for (ReportAdGetV2OrderField b : ReportAdGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportAdGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportAdGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportAdGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportAdGetV2OrderField.fromValue(value);
    }
  }
}

