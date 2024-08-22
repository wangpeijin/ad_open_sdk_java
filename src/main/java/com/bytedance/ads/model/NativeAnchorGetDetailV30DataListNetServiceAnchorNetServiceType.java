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
@JsonAdapter(NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType.Adapter.class)
public enum NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType {
  
  GENERAL("GENERAL"),
  
  MICRO_APP("MICRO_APP"),
  
  QUICK_APP("QUICK_APP"),
  
  WECHAT_PACKAGE("WECHAT_PACKAGE"),
  
  WECOM_PACKAGE("WECOM_PACKAGE"),
  
  WECHAT_EXTERNAL_URL("WECHAT_EXTERNAL_URL");

  private String value;

  NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType fromValue(String value) {
    for (NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType b : NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NativeAnchorGetDetailV30DataListNetServiceAnchorNetServiceType.fromValue(value);
    }
  }
}

