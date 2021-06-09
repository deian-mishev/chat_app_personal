package com.chat.dao;

import java.time.LocalDate;
import java.util.UUID;

import javax.validation.constraints.Past;

import com.chat.model.MessageStatus;
import com.chat.annotations.SQLInjectionSafe;
import com.chat.annotations.UUIDA;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

    @UUIDA
    @JsonProperty("userId")
    private UUID userId;

    @UUIDA
    @JsonProperty("chatId")
    private UUID chatId;

    @UUIDA
    @JsonProperty("senderId")
    private UUID senderId;

    @UUIDA
    @JsonProperty("recipientId")
    private UUID recipientId;

    @SQLInjectionSafe
    @JsonProperty("senderName")
    private String senderName;

    @SQLInjectionSafe
    @JsonProperty("recipientName")
    private String recipientName;

    @SQLInjectionSafe
    @JsonProperty("content")
    private String content;

    @Past
    @JsonProperty("timestamp")
    private LocalDate timestamp;

    @JsonProperty("status")
    private MessageStatus status;
}
