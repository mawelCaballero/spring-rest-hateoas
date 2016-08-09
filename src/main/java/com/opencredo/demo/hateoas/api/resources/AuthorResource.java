package com.opencredo.demo.hateoas.api.resources;

import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Relation(value="author", collectionRelation="authors")
public class AuthorResource extends ResourceWithEmbeddeds {

   private final String firstName;
   private final String lastName;
   private final String email; 
   private final String profile; 

   @JsonCreator
   public AuthorResource(@JsonProperty("firstName") String firstName, 
		   @JsonProperty("lastName") String lastName, 
		   @JsonProperty("email") String email, 
		   @JsonProperty("profile") String profile) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.profile = profile;
   }
   
   
   public String getFirstName() {
      return firstName;
   }   
   public String getLastName() {
      return lastName;
   }
   
   public String getEmail(){
	   return email;
   }
   
   public String getProfile(){
	   return profile;
   }
   
}
