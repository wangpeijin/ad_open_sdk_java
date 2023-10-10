/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(QianchuanAwemeOrderGetV10DataPageInfoHasMore.Adapter.class)
public enum QianchuanAwemeOrderGetV10DataPageInfoHasMore {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  QianchuanAwemeOrderGetV10DataPageInfoHasMore(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanAwemeOrderGetV10DataPageInfoHasMore fromValue(Long value) {
    for (QianchuanAwemeOrderGetV10DataPageInfoHasMore b : QianchuanAwemeOrderGetV10DataPageInfoHasMore.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<QianchuanAwemeOrderGetV10DataPageInfoHasMore> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanAwemeOrderGetV10DataPageInfoHasMore enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanAwemeOrderGetV10DataPageInfoHasMore read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return QianchuanAwemeOrderGetV10DataPageInfoHasMore.fromValue(value);
    }
  }
}

