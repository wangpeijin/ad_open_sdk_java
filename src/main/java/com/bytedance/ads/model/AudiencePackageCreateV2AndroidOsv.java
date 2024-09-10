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
@JsonAdapter(AudiencePackageCreateV2AndroidOsv.Adapter.class)
public enum AudiencePackageCreateV2AndroidOsv {
  
  Enum_5_1("5.1"),
  
  Enum_7_0("7.0"),
  
  Enum_2_2("2.2"),
  
  Enum_4_0("4.0"),
  
  Enum_4_5("4.5"),
  
  Enum_2_3("2.3"),
  
  NONE("NONE"),
  
  Enum_5_0("5.0"),
  
  Enum_8_0("8.0"),
  
  Enum_3_2("3.2"),
  
  Enum_9_0("9.0"),
  
  Enum_6_0("6.0"),
  
  Enum_4_1("4.1"),
  
  Enum_10_0("10.0"),
  
  Enum_2_1("2.1"),
  
  Enum_8_1("8.1"),
  
  Enum_3_1("3.1"),
  
  Enum_10_1("10.1"),
  
  Enum_3_0("3.0"),
  
  Enum_0_0("0.0"),
  
  Enum_7_1("7.1"),
  
  Enum_2_0("2.0"),
  
  Enum_11_0("11.0"),
  
  Enum_4_2("4.2"),
  
  Enum_4_4("4.4"),
  
  Enum_4_3("4.3");

  private String value;

  AudiencePackageCreateV2AndroidOsv(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudiencePackageCreateV2AndroidOsv fromValue(String value) {
    for (AudiencePackageCreateV2AndroidOsv b : AudiencePackageCreateV2AndroidOsv.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AudiencePackageCreateV2AndroidOsv> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudiencePackageCreateV2AndroidOsv enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudiencePackageCreateV2AndroidOsv read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudiencePackageCreateV2AndroidOsv.fromValue(value);
    }
  }
}

