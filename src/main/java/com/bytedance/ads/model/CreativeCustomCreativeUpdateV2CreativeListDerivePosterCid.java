/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid.Adapter.class)
public enum CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid {
  
  NUMBER_0(0l),
  
  NUMBER_1(1l);

  private Long value;

  CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid fromValue(Long value) {
    for (CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid b : CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return CreativeCustomCreativeUpdateV2CreativeListDerivePosterCid.fromValue(value);
    }
  }
}

