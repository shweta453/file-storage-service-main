package com.javatechie.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ImageData")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    @Lob
    @Column(name = "imagedata",length = 1000)
    private byte[] imageData;

}
