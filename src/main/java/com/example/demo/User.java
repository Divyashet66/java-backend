package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.apache.maven.model.Dependency;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include. NON_NULL)
public class User {
    private String Application_Type;
    private String artifactId;
    private String name;
    private String version;
    private List<Dependency> dependencies;
    private Long port;
    private String url;
    private String username;
    private String driverClassName;
    private String password;
}
