/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
  
  QQ("qq"),
  
  WIFI_PLAY("wifi_play"),
  
  ATTRIBUTION_RETENTION_7D_TOTAL_COST("attribution_retention_7d_total_cost"),
  
  BUTTON("button"),
  
  PLAY_50_FEED_BREAK("play_50_feed_break"),
  
  LIVE_COMPONENT_CLICK_RATE("live_component_click_rate"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_4DAYS("attribution_game_in_app_roi_4days"),
  
  REPORT("report"),
  
  PLAY_DURATION_3S("play_duration_3s"),
  
  PLAY_DURATION_2S_RATE("play_duration_2s_rate"),
  
  UNION_ROI_7("union_roi_7"),
  
  COMMUTE_FIRST_PAY_COUNT("commute_first_pay_count"),
  
  LUBAN_LIVE_ENTER_CNT("luban_live_enter_cnt"),
  
  PHONE_EFFECTIVE("phone_effective"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COUNT("attribution_active_pay_intra_one_day_count"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_AMOUNT("attribution_active_pay_intra_one_day_amount"),
  
  LUBAN_LIVE_PAY_ORDER_COUNT("luban_live_pay_order_count"),
  
  ATTRIBUTION_RETENTION_5D_COST("attribution_retention_5d_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_8DAYS("attribution_game_in_app_roi_8days"),
  
  DOWNLOAD_FINISH_COST("download_finish_cost"),
  
  DISLIKE("dislike"),
  
  IN_APP_UV("in_app_uv"),
  
  MAP_SEARCH("map_search"),
  
  PLAY_25_FEED_BREAK_RATE("play_25_feed_break_rate"),
  
  ADVANCED_CREATIVE_PHONE_CLICK("advanced_creative_phone_click"),
  
  DOWNLOAD_FINISH("download_finish"),
  
  LOCATION_CLICK("location_click"),
  
  ADVANCED_CREATIVE_COUPON_ADDITION("advanced_creative_coupon_addition"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_RATE("attribution_next_day_open_rate"),
  
  DOWNLOAD("download"),
  
  ATTRIBUTION_DAY_ACTIVE_PAY_COUNT("attribution_day_active_pay_count"),
  
  CARD_SHOW("card_show"),
  
  VALID_PLAY_RATE("valid_play_rate"),
  
  LIVE_FANS_CLUB_JOIN_CNT("live_fans_club_join_cnt"),
  
  SHOW("show"),
  
  DOWNLOAD_FINISH_RATE("download_finish_rate"),
  
  CONSULT("consult"),
  
  PLAY_DURATION("play_duration"),
  
  ATTRIBUTION_DEEP_CONVERT_COST("attribution_deep_convert_cost"),
  
  CLICK_SHOPWINDOW("click_shopwindow"),
  
  WECHAT_FIRST_PAY_RATE("wechat_first_pay_rate"),
  
  PRE_CONVERT_COST("pre_convert_cost"),
  
  IN_APP_CART("in_app_cart"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_ROI("attribution_active_pay_intra_one_day_roi"),
  
  AVG_RANK("avg_rank"),
  
  PLAY_DURATION_2S("play_duration_2s"),
  
  FIRST_RENTAL_ORDER_COUNT("first_rental_order_count"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_COST("attribution_next_day_open_cost"),
  
  ATTRIBUTION_NEXT_DAY_OPEN_CNT("attribution_next_day_open_cnt"),
  
  ATTRIBUTION_MICRO_GAME_0D_ROI("attribution_micro_game_0d_roi"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COST("attribution_active_pay_7d_cost"),
  
  GAME_ADDICTION_RATE("game_addiction_rate"),
  
  ATTRIBUTION_WECHAT_PAY_30D_ROI("attribution_wechat_pay_30d_roi"),
  
  LOAN_CREDIT_RATE("loan_credit_rate"),
  
  REDIRECT_TO_SHOP("redirect_to_shop"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_2DAYS("attribution_game_in_app_ltv_2days"),
  
  DOWNLOAD_START_COST("download_start_cost"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COST("attribution_wechat_first_pay_30d_cost"),
  
  WECHAT_FIRST_PAY_COST("wechat_first_pay_cost"),
  
  PRE_LOAN_CREDIT_COST("pre_loan_credit_cost"),
  
  WECHAT_FIRST_PAY_COUNT("wechat_first_pay_count"),
  
  STAT_UNION_LTV_7("stat_union_ltv_7"),
  
  ATTRIBUTION_RETENTION_6D_RATE("attribution_retention_6d_rate"),
  
  STAT_UNION_LTV_3("stat_union_ltv_3"),
  
  ATTRIBUTION_RETENTION_3D_RATE("attribution_retention_3d_rate"),
  
  PLAY_OVER("play_over"),
  
  WECHAT_LOGIN_COST("wechat_login_cost"),
  
  PLAY_25_FEED_BREAK("play_25_feed_break"),
  
  ATTRIBUTION_RETENTION_4D_CNT("attribution_retention_4d_cnt"),
  
  LOAN_CREDIT_COST("loan_credit_cost"),
  
  UNION_ROI_0("union_roi_0"),
  
  ATTRIBUTION_MICRO_GAME_3D_LTV("attribution_micro_game_3d_ltv"),
  
  ATTRIBUTION_RETENTION_2D_CNT("attribution_retention_2d_cnt"),
  
  DEEP_CONVERT_COST("deep_convert_cost"),
  
  WECHAT("wechat"),
  
  LUBAN_LIVE_SLIDECART_CLICK_CNT("luban_live_slidecart_click_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_3DAYS("attribution_game_in_app_roi_3days"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_5DAYS("attribution_game_in_app_roi_5days"),
  
  PRE_LOAN_CREDIT("pre_loan_credit"),
  
  AVG_CLICK_COST("avg_click_cost"),
  
  LUBAN_ORDER_ROI("luban_order_roi"),
  
  STAT_PAY_AMOUNT("stat_pay_amount"),
  
  LUBAN_LIVE_GIFT_AMOUNT("luban_live_gift_amount"),
  
  VOTE("vote"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_COUNT("attribution_active_pay_7d_count"),
  
  FOLLOW("follow"),
  
  ATTRIBUTION_RETENTION_5D_CNT("attribution_retention_5d_cnt"),
  
  PRE_CONVERT_RATE("pre_convert_rate"),
  
  LOAN_COMPLETION_COST("loan_completion_cost"),
  
  CLICK_DOWNLOAD("click_download"),
  
  CONSULT_EFFECTIVE("consult_effective"),
  
  ATTRIBUTION_RETENTION_2D_RATE("attribution_retention_2d_rate"),
  
  WIFI_PLAY_RATE("wifi_play_rate"),
  
  SHOPPING("shopping"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_2DAYS("attribution_game_in_app_roi_2days"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_RATE("attribution_active_pay_7d_rate"),
  
  PAY_COUNT("pay_count"),
  
  ATTRIBUTION_DEEP_CONVERT("attribution_deep_convert"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_6DAYS("attribution_game_in_app_roi_6days"),
  
  CLICK("click"),
  
  ATTRIBUTION_MICRO_GAME_0D_LTV("attribution_micro_game_0d_ltv"),
  
  PHONE_CONFIRM("phone_confirm"),
  
  ATTRIBUTION_RETENTION_6D_COST("attribution_retention_6d_cost"),
  
  CONVERT("convert"),
  
  CLICK_INSTALL("click_install"),
  
  NEXT_DAY_OPEN_RATE("next_day_open_rate"),
  
  GAME_ADDICTION("game_addiction"),
  
  ACTIVE_REGISTER_COST("active_register_cost"),
  
  PLAY_100_FEED_BREAK_RATE("play_100_feed_break_rate"),
  
  AVG_SHOW_COST("avg_show_cost"),
  
  LUBAN_LIVE_SHARE_CNT("luban_live_share_cnt"),
  
  LOAN_COMPLETION_RATE("loan_completion_rate"),
  
  REGISTER("register"),
  
  ATTRIBUTION_RETENTION_7D_CNT("attribution_retention_7d_cnt"),
  
  ATTRIBUTION_GAME_PAY_7D_COUNT("attribution_game_pay_7d_count"),
  
  LIVE_COMPONENT_CLICK_COUNT("live_component_click_count"),
  
  DOWNLOAD_START("download_start"),
  
  LUBAN_LIVE_COMMENT_CNT("luban_live_comment_cnt"),
  
  IES_MUSIC_CLICK("ies_music_click"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_COUNT("attribution_wechat_first_pay_30d_count"),
  
  LUBAN_ORDER_STAT_AMOUNT("luban_order_stat_amount"),
  
  ADVANCED_CREATIVE_FORM_CLICK("advanced_creative_form_click"),
  
  LUBAN_LIVE_PAY_ORDER_STAT_COST("luban_live_pay_order_stat_cost"),
  
  VALID_PLAY_COST("valid_play_cost"),
  
  PLAY_DURATION_3S_RATE("play_duration_3s_rate"),
  
  PAY_AMOUNT_ROI("pay_amount_roi"),
  
  LOAN_CREDIT("loan_credit"),
  
  MESSAGE("message"),
  
  COUPON_SINGLE_PAGE("coupon_single_page"),
  
  PLAY_100_FEED_BREAK("play_100_feed_break"),
  
  IES_CHALLENGE_CLICK("ies_challenge_click"),
  
  MESSAGE_ACTION("message_action"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COUNT("attribution_wechat_login_30d_count"),
  
  COST("cost"),
  
  IN_APP_DETAIL_UV("in_app_detail_uv"),
  
  LUBAN_LIVE_CLICK_PRODUCT_CNT("luban_live_click_product_cnt"),
  
  CONVERT_RATE("convert_rate"),
  
  ATTRIBUTION_CONVERT_COST("attribution_convert_cost"),
  
  ATTRIBUTION_RETENTION_5D_RATE("attribution_retention_5d_rate"),
  
  ATTRIBUTION_RETENTION_3D_CNT("attribution_retention_3d_cnt"),
  
  INSTALL_FINISH_COST("install_finish_cost"),
  
  LOAN_COMPLETION("loan_completion"),
  
  CUSTOMER_EFFECTIVE("customer_effective"),
  
  PHONE_CONNECT("phone_connect"),
  
  FORM("form"),
  
  ATTRIBUTION_MICRO_GAME_7D_ROI("attribution_micro_game_7d_roi"),
  
  HOME_VISITED("home_visited"),
  
  ATTRIBUTION_RETENTION_7D_SUM_CNT("attribution_retention_7d_sum_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_3DAYS("attribution_game_in_app_ltv_3days"),
  
  ATTRIBUTION_DAY_ACITVE_PAY_COUNT("attribution_day_acitve_pay_count"),
  
  INSTALL_FINISH("install_finish"),
  
  POI_ADDRESS_CLICK("poi_address_click"),
  
  AVERAGE_PLAY_TIME_PER_PLAY("average_play_time_per_play"),
  
  CPC("cpc"),
  
  VIEW("view"),
  
  NEXT_DAY_OPEN("next_day_open"),
  
  IN_APP_PAY("in_app_pay"),
  
  PLAY_DURATION_10S_RATE("play_duration_10s_rate"),
  
  ATTRIBUTION_RETENTION_7D_RATE("attribution_retention_7d_rate"),
  
  CLICK_WEBSITE("click_website"),
  
  LUBAN_LIVE_FOLLOW_CNT("luban_live_follow_cnt"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_1DAY("attribution_game_in_app_ltv_1day"),
  
  POI_COLLECT("poi_collect"),
  
  DEEP_CONVERT("deep_convert"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_7DAYS("attribution_game_in_app_ltv_7days"),
  
  PLAY_DURATION_10S("play_duration_10s"),
  
  CPM("cpm"),
  
  ATTRIBUTION_RETENTION_7D_COST("attribution_retention_7d_cost"),
  
  GAME_PAY_COST("game_pay_cost"),
  
  WECHAT_LOGIN_COUNT("wechat_login_count"),
  
  COUPON("coupon"),
  
  PLAY_75_FEED_BREAK("play_75_feed_break"),
  
  LUBAN_LIVE_GIFT_CNT("luban_live_gift_cnt"),
  
  CONVERT_SHOW_RATE("convert_show_rate"),
  
  ADVANCED_CREATIVE_COUNSEL_CLICK("advanced_creative_counsel_click"),
  
  ATTRIBUTION_MICRO_GAME_3D_ROI("attribution_micro_game_3d_roi"),
  
  SHARE("share"),
  
  ATTRIBUTION_GAME_PAY_7D_COST("attribution_game_pay_7d_cost"),
  
  ATTRIBUTION_RETENTION_2D_COST("attribution_retention_2d_cost"),
  
  PHONE("phone"),
  
  LIVE_WATCH_ONE_MINUTE_COUNT("live_watch_one_minute_count"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_7DAYS("attribution_game_in_app_roi_7days"),
  
  AVERAGE_PLAY_PROGRESS("average_play_progress"),
  
  PLAY_DURATION_5S_RATE("play_duration_5s_rate"),
  
  LIVE_COMPONENT_CLICK_COST("live_component_click_cost"),
  
  COMMENT("comment"),
  
  NEXT_DAY_OPEN_COST("next_day_open_cost"),
  
  ATTRIBUTION_GAME_IN_APP_ROI_1DAY("attribution_game_in_app_roi_1day"),
  
  TOTAL_PLAY("total_play"),
  
  PLAY_OVER_RATE("play_over_rate"),
  
  ACTIVE_PAY_RATE("active_pay_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_6DAYS("attribution_game_in_app_ltv_6days"),
  
  ATTRIBUTION_RETENTION_4D_COST("attribution_retention_4d_cost"),
  
  ACTIVE_COST("active_cost"),
  
  ATTRIBUTION_WECHAT_PAY_30D_AMOUNT("attribution_wechat_pay_30d_amount"),
  
  DEEP_CONVERT_RATE("deep_convert_rate"),
  
  ACTIVE_RATE("active_rate"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_5DAYS("attribution_game_in_app_ltv_5days"),
  
  PLAY_DURATION_SUM("play_duration_sum"),
  
  PRE_CONVERT_COUNT("pre_convert_count"),
  
  ATTRIBUTION_ACTIVE_PAY_7D_PER_COUNT("attribution_active_pay_7d_per_count"),
  
  CLICK_CALL_DY("click_call_dy"),
  
  CPA("cpa"),
  
  CTR("ctr"),
  
  ACTIVE("active"),
  
  INSTALL_FINISH_RATE("install_finish_rate"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_COST("attribution_active_pay_intra_one_day_cost"),
  
  ATTRIBUTION_WECHAT_FIRST_PAY_30D_RATE("attribution_wechat_first_pay_30d_rate"),
  
  PLAY_50_FEED_BREAK_RATE("play_50_feed_break_rate"),
  
  LOTTERY("lottery"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_4DAYS("attribution_game_in_app_ltv_4days"),
  
  ACTIVE_PAY_AMOUNT("active_pay_amount"),
  
  ATTRIBUTION_MICRO_GAME_7D_LTV("attribution_micro_game_7d_ltv"),
  
  ATTRIBUTION_GAME_IN_APP_LTV_8DAYS("attribution_game_in_app_ltv_8days"),
  
  SUBMIT_CERTIFICATION_COUNT("submit_certification_count"),
  
  REDIRECT("redirect"),
  
  PLAY_75_FEED_BREAK_RATE("play_75_feed_break_rate"),
  
  LUBAN_ORDER_CNT("luban_order_cnt"),
  
  ATTRIBUTION_RETENTION_3D_COST("attribution_retention_3d_cost"),
  
  DOWNLOAD_START_RATE("download_start_rate"),
  
  ATTRIBUTION_RETENTION_6D_CNT("attribution_retention_6d_cnt"),
  
  VALID_PLAY("valid_play"),
  
  CLICK_LANDING_PAGE("click_landing_page"),
  
  ATTRIBUTION_CONVERT("attribution_convert"),
  
  ATTRIBUTION_WECHAT_LOGIN_30D_COST("attribution_wechat_login_30d_cost"),
  
  AVERAGE_VIDEO_PLAY("average_video_play"),
  
  LIKE("like"),
  
  IN_APP_ORDER("in_app_order"),
  
  GAME_ADDICTION_COST("game_addiction_cost"),
  
  INTERACT_PER_COST("interact_per_cost"),
  
  ATTRIBUTION_RETENTION_4D_RATE("attribution_retention_4d_rate"),
  
  WECHAT_PAY_AMOUNT("wechat_pay_amount"),
  
  STAT_UNION_LTV_0("stat_union_ltv_0"),
  
  ACTIVE_PAY_COST("active_pay_cost"),
  
  ADVANCED_CREATIVE_FORM_SUBMIT("advanced_creative_form_submit"),
  
  GAME_PAY_COUNT("game_pay_count"),
  
  ATTRIBUTION_ACTIVE_PAY_INTRA_ONE_DAY_RATE("attribution_active_pay_intra_one_day_rate"),
  
  APPROVAL_COUNT("approval_count"),
  
  UNION_ROI_3("union_roi_3"),
  
  FIRST_ORDER_COUNT("first_order_count"),
  
  CONVERT_COST("convert_cost"),
  
  ACTIVE_REGISTER_RATE("active_register_rate");

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

