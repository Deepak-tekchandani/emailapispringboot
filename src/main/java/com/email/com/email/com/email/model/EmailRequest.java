package com.email.com.email.com.email.model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class EmailRequest {

   private String to;
   private String subject;
   private String message;



}
