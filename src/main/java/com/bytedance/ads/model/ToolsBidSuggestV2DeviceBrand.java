/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@JsonAdapter(ToolsBidSuggestV2DeviceBrand.Adapter.class)
public enum ToolsBidSuggestV2DeviceBrand {
  
  MEIZU("MEIZU"),
  
  GIONEE("GIONEE"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  OPPO("OPPO"),
  
  HUAWEI("HUAWEI"),
  
  GOOGLE("GOOGLE"),
  
  HISENSE("HISENSE"),
  
  ZTE("ZTE"),
  
  SONY("SONY"),
  
  COOLPAD("COOLPAD"),
  
  VIVO("VIVO"),
  
  XIAOMI("XIAOMI"),
  
  SMARTISAN("SMARTISAN"),
  
  NUBIA("NUBIA"),
  
  LENOVO("LENOVO"),
  
  TCL("TCL"),
  
  LG("LG"),
  
  NOKIA("NOKIA"),
  
  PEPPER("PEPPER"),
  
  QIKU("QIKU"),
  
  HONOR("HONOR"),
  
  Enum_360("360"),
  
  HTC("HTC"),
  
  SAMSUNG("SAMSUNG"),
  
  LETV("LETV"),
  
  MOTO("MOTO"),
  
  ONEPLUS("ONEPLUS"),
  
  APPLE("APPLE");

  private String value;

  ToolsBidSuggestV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2DeviceBrand fromValue(String value) {
    for (ToolsBidSuggestV2DeviceBrand b : ToolsBidSuggestV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2DeviceBrand.fromValue(value);
    }
  }
}

