package com.comcast.viper.hlsparserj.tags.media;

import java.net.URI;

public class ExtMap {
  private URI uri;
  private int length;
  private int offset;

  public ExtMap(URI uri, int length, int offset) {
    this.uri = uri;
    this.length = length;
    this.offset = offset;
  }

  public URI getURI() {
    return uri;
  }

  public int getLength() {
    return length;
  }

  public int getOffset() {
    return offset;
  }
}
