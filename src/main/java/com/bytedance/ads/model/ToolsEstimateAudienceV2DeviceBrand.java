/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
@JsonAdapter(ToolsEstimateAudienceV2DeviceBrand.Adapter.class)
public enum ToolsEstimateAudienceV2DeviceBrand {
  
  NUBIA("NUBIA"),
  
  VIVO("VIVO"),
  
  MEIZU("MEIZU"),
  
  LENOVO("LENOVO"),
  
  HTC("HTC"),
  
  HONOR("HONOR"),
  
  GIONEE("GIONEE"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  Enum_360("360"),
  
  COOLPAD("COOLPAD"),
  
  PEPPER("PEPPER"),
  
  SAMSUNG("SAMSUNG"),
  
  SMARTISAN("SMARTISAN"),
  
  HUAWEI("HUAWEI"),
  
  HISENSE("HISENSE"),
  
  APPLE("APPLE"),
  
  OPPO("OPPO"),
  
  ONEPLUS("ONEPLUS"),
  
  SONY("SONY"),
  
  QIKU("QIKU"),
  
  NOKIA("NOKIA"),
  
  ZTE("ZTE"),
  
  LETV("LETV"),
  
  GOOGLE("GOOGLE"),
  
  TCL("TCL"),
  
  MOTO("MOTO"),
  
  LG("LG"),
  
  XIAOMI("XIAOMI");

  private String value;

  ToolsEstimateAudienceV2DeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEstimateAudienceV2DeviceBrand fromValue(String value) {
    for (ToolsEstimateAudienceV2DeviceBrand b : ToolsEstimateAudienceV2DeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEstimateAudienceV2DeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEstimateAudienceV2DeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEstimateAudienceV2DeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEstimateAudienceV2DeviceBrand.fromValue(value);
    }
  }
}

