package com.soru;

import java.util.Map;
import java.io.Serializable;

/**
 * PubSubMessage.
 */
public class KafkaMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  private String message;

  private Map<String, String> attributes;

  private String messageId;

  private String publishTime;

  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(String publishTime) {
    this.publishTime = publishTime;
  }

}
