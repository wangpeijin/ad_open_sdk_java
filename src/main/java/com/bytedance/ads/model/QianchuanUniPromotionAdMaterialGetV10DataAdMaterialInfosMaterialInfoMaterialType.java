/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
@JsonAdapter(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType.Adapter.class)
public enum QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType {
  
  IMAGE("IMAGE"),
  
  LIVE_ROOM("LIVE_ROOM"),
  
  TITLE("TITLE"),
  
  VIDEO("VIDEO");

  private String value;

  QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType fromValue(String value) {
    for (QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType b : QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoMaterialType.fromValue(value);
    }
  }
}

