package com.abhinav.ChatServer.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    String senderName;
    String receiverName;
    String message;
    String date;
    Status Status;
}
