package com.example.Springboot.lar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data // Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@NoArgsConstructor // Default constructor
@AllArgsConstructor // Constructor with all arguments
@Builder // An entire Builder pattern will be implemented for this department service
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    @NotBlank(message = "Please Add Department Name")
    @Length(max = 5, min = 1, message = "The name length should be shorter than 5 and longer than 1 symbols")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
