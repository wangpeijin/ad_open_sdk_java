/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(AdGetV2DataAudienceDeviceBrand.Adapter.class)
public enum AdGetV2DataAudienceDeviceBrand {
  
  HTC("HTC"),
  
  GOOGLE("GOOGLE"),
  
  SONY("SONY"),
  
  GIONEE("GIONEE"),
  
  MOTO("MOTO"),
  
  LENOVO("LENOVO"),
  
  OPPO("OPPO"),
  
  LETV("LETV"),
  
  NUBIA("NUBIA"),
  
  NOKIA("NOKIA"),
  
  ONEPLUS("ONEPLUS"),
  
  HUAWEI("HUAWEI"),
  
  TCL("TCL"),
  
  VIVO("VIVO"),
  
  Enum_360("360"),
  
  QIKU("QIKU"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  SAMSUNG("SAMSUNG"),
  
  HISENSE("HISENSE"),
  
  MEIZU("MEIZU"),
  
  SMARTISAN("SMARTISAN"),
  
  LG("LG"),
  
  APPLE("APPLE"),
  
  PEPPER("PEPPER"),
  
  ZTE("ZTE"),
  
  XIAOMI("XIAOMI"),
  
  HONOR("HONOR"),
  
  COOLPAD("COOLPAD");

  private String value;

  AdGetV2DataAudienceDeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdGetV2DataAudienceDeviceBrand fromValue(String value) {
    for (AdGetV2DataAudienceDeviceBrand b : AdGetV2DataAudienceDeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdGetV2DataAudienceDeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdGetV2DataAudienceDeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdGetV2DataAudienceDeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdGetV2DataAudienceDeviceBrand.fromValue(value);
    }
  }
}

