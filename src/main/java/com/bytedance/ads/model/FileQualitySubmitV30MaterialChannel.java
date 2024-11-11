/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(FileQualitySubmitV30MaterialChannel.Adapter.class)
public enum FileQualitySubmitV30MaterialChannel {
  
  AD("AD"),
  
  DOU_PLUS("DOU_PLUS"),
  
  QC("QC");

  private String value;

  FileQualitySubmitV30MaterialChannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileQualitySubmitV30MaterialChannel fromValue(String value) {
    for (FileQualitySubmitV30MaterialChannel b : FileQualitySubmitV30MaterialChannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileQualitySubmitV30MaterialChannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileQualitySubmitV30MaterialChannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileQualitySubmitV30MaterialChannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileQualitySubmitV30MaterialChannel.fromValue(value);
    }
  }
}

