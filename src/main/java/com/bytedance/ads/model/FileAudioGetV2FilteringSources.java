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
@JsonAdapter(FileAudioGetV2FilteringSources.Adapter.class)
public enum FileAudioGetV2FilteringSources {
  
  AD_SITE("AD_SITE"),
  
  OPEN_API("OPEN_API"),
  
  TTS_TEXT_TO_AUDIO("TTS_TEXT_TO_AUDIO");

  private String value;

  FileAudioGetV2FilteringSources(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileAudioGetV2FilteringSources fromValue(String value) {
    for (FileAudioGetV2FilteringSources b : FileAudioGetV2FilteringSources.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileAudioGetV2FilteringSources> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileAudioGetV2FilteringSources enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileAudioGetV2FilteringSources read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileAudioGetV2FilteringSources.fromValue(value);
    }
  }
}

