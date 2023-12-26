/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
@JsonAdapter(QianchuanAwemeOrderCreateV10AudienceBehaviors.Adapter.class)
public enum QianchuanAwemeOrderCreateV10AudienceBehaviors {
  
  ALL("ALL"),
  
  FOLLOWED_USER("FOLLOWED_USER"),
  
  GOODS_SHARE("GOODS_SHARE"),
  
  LIKED_USER("LIKED_USER"),
  
  LIVE_WATCH("LIVE_WATCH");

  private String value;

  QianchuanAwemeOrderCreateV10AudienceBehaviors(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderCreateV10AudienceBehaviors fromValue(String value) {
    for (QianchuanAwemeOrderCreateV10AudienceBehaviors b : QianchuanAwemeOrderCreateV10AudienceBehaviors.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderCreateV10AudienceBehaviors> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderCreateV10AudienceBehaviors enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderCreateV10AudienceBehaviors read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanAwemeOrderCreateV10AudienceBehaviors.fromValue(value);
    }
  }
}

