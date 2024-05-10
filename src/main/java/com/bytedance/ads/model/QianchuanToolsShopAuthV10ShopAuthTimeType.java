/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@JsonAdapter(QianchuanToolsShopAuthV10ShopAuthTimeType.Adapter.class)
public enum QianchuanToolsShopAuthV10ShopAuthTimeType {
  
  NONE("NONE"),
  
  CUSTOM("CUSTOM");

  private String value;

  QianchuanToolsShopAuthV10ShopAuthTimeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static QianchuanToolsShopAuthV10ShopAuthTimeType fromValue(String value) {
    for (QianchuanToolsShopAuthV10ShopAuthTimeType b : QianchuanToolsShopAuthV10ShopAuthTimeType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<QianchuanToolsShopAuthV10ShopAuthTimeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final QianchuanToolsShopAuthV10ShopAuthTimeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public QianchuanToolsShopAuthV10ShopAuthTimeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return QianchuanToolsShopAuthV10ShopAuthTimeType.fromValue(value);
    }
  }
}

