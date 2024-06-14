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
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  CPA("cpa"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  COUPON("coupon"),
  
  GAME_ADDICTION("game_addiction"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  CLICK_INSTALL("click_install"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  SHARE("share"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  WIFI_PLAY("wifi_play"),
  
  MESSAGE_ACTION("message_action"),
  
  VIEW("view"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  PLAY_OVER("play_over"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  CLICK_DOWNLOAD("click_download"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  CONVERT_COST("convert_cost"),
  
  IN_APP_CART("in_app_cart"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  COST("cost"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  CPC("cpc"),
  
  VOTE("vote"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  HOME_VISITED("home_visited"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  MAP_SEARCH("map_search"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  CARD_SHOW("card_show"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  COMMENT("comment"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  LOAN_CREDIT("loan_credit"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  PAY_COUNT("pay_count"),
  
  CONVERT("convert"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  REGISTER("register"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  PHONE_CONNECT("phone_connect"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  IN_APP_PAY("in_app_pay"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  LOTTERY("lottery"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  SHOW("show"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  LOCATION_CLICK("location_click"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  ACTIVE_RATE("active_rate"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  TOTAL_PLAY("total_play"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  AVG_RANK("avg_rank"),
  
  FORM("form"),
  
  DOWNLOAD_START("download_start"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  UNION_ROI_0("union_roi_0"),
  
  REDIRECT("redirect"),
  
  SHOPPING("shopping"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  VALID_PLAY("valid_play"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  MESSAGE("message"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  CONSULT("consult"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ACTIVE_COST("active_cost"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  CLICK_WEBSITE("click_website"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  DOWNLOAD("download"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  UNION_ROI_3("union_roi_3"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  PLAY_DURATION("play_duration"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  CTR("ctr"),
  
  UNION_ROI_7("union_roi_7"),
  
  PHONE("phone"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  POI_COLLECT("poi_collect"),
  
  CLICK("click"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  LIKE("like"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  ACTIVE("active"),
  
  FOLLOW("follow"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  DISLIKE("dislike"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  BUTTON("button"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  CONVERT_RATE("convert_rate"),
  
  IN_APP_UV("in_app_uv"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  DEEP_CONVERT("deep_convert"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  IN_APP_ORDER("in_app_order"),
  
  CPM("cpm"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  WECHAT("wechat"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  QQ("qq"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  LOAN_COMPLETION("loan_completion"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  REPORT("report"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  INSTALL_FINISH("install_finish"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  APPROVAL_COUNT("approval_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days");

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

