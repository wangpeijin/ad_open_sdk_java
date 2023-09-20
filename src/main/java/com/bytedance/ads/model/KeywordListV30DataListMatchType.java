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
@JsonAdapter(KeywordListV30DataListMatchType.Adapter.class)
public enum KeywordListV30DataListMatchType {
  
  EXTENSIVE("EXTENSIVE"),
  
  PHRASE("PHRASE"),
  
  PRECISION("PRECISION");

  private String value;

  KeywordListV30DataListMatchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeywordListV30DataListMatchType fromValue(String value) {
    for (KeywordListV30DataListMatchType b : KeywordListV30DataListMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<KeywordListV30DataListMatchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeywordListV30DataListMatchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeywordListV30DataListMatchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeywordListV30DataListMatchType.fromValue(value);
    }
  }
}

