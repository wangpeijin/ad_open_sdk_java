/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(ProjectCreateV30AudienceDeviceBrand.Adapter.class)
public enum ProjectCreateV30AudienceDeviceBrand {
  
  Enum_360("360"),
  
  APPLE("APPLE"),
  
  CHINAMOBILE("CHINAMOBILE"),
  
  COOLPAD("COOLPAD"),
  
  GIONEE("GIONEE"),
  
  GOOGLE("GOOGLE"),
  
  HISENSE("HISENSE"),
  
  HONOR("HONOR"),
  
  HTC("HTC"),
  
  HUAWEI("HUAWEI"),
  
  LENOVO("LENOVO"),
  
  LETV("LETV"),
  
  LG("LG"),
  
  MEIZU("MEIZU"),
  
  MOTO("MOTO"),
  
  NOKIA("NOKIA"),
  
  NUBIA("NUBIA"),
  
  ONEPLUS("ONEPLUS"),
  
  OPPO("OPPO"),
  
  PEPPER("PEPPER"),
  
  QIKU("QIKU"),
  
  SAMSUNG("SAMSUNG"),
  
  SMARTISAN("SMARTISAN"),
  
  SONY("SONY"),
  
  TCL("TCL"),
  
  VIVO("VIVO"),
  
  XIAOMI("XIAOMI"),
  
  ZTE("ZTE");

  private String value;

  ProjectCreateV30AudienceDeviceBrand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProjectCreateV30AudienceDeviceBrand fromValue(String value) {
    for (ProjectCreateV30AudienceDeviceBrand b : ProjectCreateV30AudienceDeviceBrand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProjectCreateV30AudienceDeviceBrand> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProjectCreateV30AudienceDeviceBrand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProjectCreateV30AudienceDeviceBrand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProjectCreateV30AudienceDeviceBrand.fromValue(value);
    }
  }
}

