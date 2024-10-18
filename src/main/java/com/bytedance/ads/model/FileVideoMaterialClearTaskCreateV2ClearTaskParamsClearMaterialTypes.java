/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes.Adapter.class)
public enum FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes {
  
  INEFFICIENT_MATERIAL("INEFFICIENT_MATERIAL"),
  
  SIMILAR_MATERIAL("SIMILAR_MATERIAL"),
  
  SIMILAR_QUEUE_MATERIAL("SIMILAR_QUEUE_MATERIAL");

  private String value;

  FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes fromValue(String value) {
    for (FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes b : FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileVideoMaterialClearTaskCreateV2ClearTaskParamsClearMaterialTypes.fromValue(value);
    }
  }
}

