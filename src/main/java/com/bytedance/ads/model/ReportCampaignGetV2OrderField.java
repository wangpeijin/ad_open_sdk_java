/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@JsonAdapter(ReportCampaignGetV2OrderField.Adapter.class)
public enum ReportCampaignGetV2OrderField {
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  CONSULT("consult"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  LIKE("like"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  LOCATION_CLICK("location_click"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  SHOW("show"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  VIEW("view"),
  
  TOTAL_PLAY("total_play"),
  
  REDIRECT("redirect"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  UNION_ROI_3("union_roi_3"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  POI_COLLECT("poi_collect"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  AVG_RANK("avg_rank"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  LOAN_CREDIT("loan_credit"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  VOTE("vote"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  MAP_SEARCH("map_search"),
  
  CONVERT_RATE("convert_rate"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  WECHAT("wechat"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  CPM("cpm"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  UNION_ROI_0("union_roi_0"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  APPROVAL_COUNT("approval_count"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  COUPON("coupon"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  FOLLOW("follow"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  GAME_ADDICTION("game_addiction"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  DEEP_CONVERT("deep_convert"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  LOAN_COMPLETION("loan_completion"),
  
  WIFI_PLAY("wifi_play"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  PHONE_CONNECT("phone_connect"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  LOTTERY("lottery"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  COST("cost"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  CLICK_DOWNLOAD("click_download"),
  
  CLICK_INSTALL("click_install"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  ACTIVE_COST("active_cost"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  CARD_SHOW("card_show"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  ACTIVE("active"),
  
  ACTIVE_REGISTER_RATE("active_register_rate"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  PHONE("phone"),
  
  REGISTER("register"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  QQ("qq"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  CLICK_WEBSITE("click_website"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  DOWNLOAD("download"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  PAY_COUNT("pay_count"),
  
  BUTTON("button"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  FORM("form"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  MESSAGE("message"),
  
  CPC("cpc"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  INSTALL_FINISH("install_finish"),
  
  SHOPPING("shopping"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  DISLIKE("dislike"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  HOME_VISITED("home_visited"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  IN_APP_UV("in_app_uv"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  CTR("ctr"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  REPORT("report"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  PLAY_DURATION("play_duration"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  CONVERT_COST("convert_cost"),
  
  IN_APP_ORDER("in_app_order"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  MESSAGE_ACTION("message_action"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  COMMENT("comment"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  DOWNLOAD_START("download_start"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  CLICK("click"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  ACTIVE_RATE("active_rate"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  IN_APP_CART("in_app_cart"),
  
  CONVERT("convert"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  UNION_ROI_7("union_roi_7"),
  
  CPA("cpa"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  VALID_PLAY("valid_play"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  PLAY_OVER("play_over"),
  
  IN_APP_PAY("in_app_pay"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  SHARE("share"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount");

  private String value;

  ReportCampaignGetV2OrderField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReportCampaignGetV2OrderField fromValue(String value) {
    for (ReportCampaignGetV2OrderField b : ReportCampaignGetV2OrderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReportCampaignGetV2OrderField> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReportCampaignGetV2OrderField enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReportCampaignGetV2OrderField read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReportCampaignGetV2OrderField.fromValue(value);
    }
  }
}

