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
@JsonAdapter(PromotionRejectReasonGetV30DataListPromotionRejectContent.Adapter.class)
public enum PromotionRejectReasonGetV30DataListPromotionRejectContent {
  
  Enum_下载链接("下载链接"),
  
  Enum_副标题("副标题"),
  
  Enum_卡片主图("卡片主图"),
  
  Enum_卡片标题("卡片标题"),
  
  Enum_头条group("头条group"),
  
  Enum_小程序("小程序"),
  
  Enum_应用包名("应用包名"),
  
  Enum_应用名("应用名"),
  
  Enum_应用详情页("应用详情页"),
  
  Enum_录入文章("录入文章"),
  
  Enum_抖音头像("抖音头像"),
  
  Enum_抖音昵称("抖音昵称"),
  
  Enum_按钮附加创意("按钮附加创意"),
  
  Enum_推广卖点("推广卖点"),
  
  Enum_文章链接("文章链接"),
  
  Enum_来源("来源"),
  
  Enum_标题("标题"),
  
  Enum_电话号码附加创意("电话号码附加创意"),
  
  Enum_直达链接("直达链接"),
  
  Enum_落地页("落地页"),
  
  Enum_表单附加创意("表单附加创意"),
  
  Enum_视频锚点("视频锚点"),
  
  Enum_计划("计划"),
  
  Enum_附加创意("附加创意");

  private String value;

  PromotionRejectReasonGetV30DataListPromotionRejectContent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PromotionRejectReasonGetV30DataListPromotionRejectContent fromValue(String value) {
    for (PromotionRejectReasonGetV30DataListPromotionRejectContent b : PromotionRejectReasonGetV30DataListPromotionRejectContent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PromotionRejectReasonGetV30DataListPromotionRejectContent> {
    @Override
    public void write(final JsonWriter jsonWriter, final PromotionRejectReasonGetV30DataListPromotionRejectContent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PromotionRejectReasonGetV30DataListPromotionRejectContent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PromotionRejectReasonGetV30DataListPromotionRejectContent.fromValue(value);
    }
  }
}

