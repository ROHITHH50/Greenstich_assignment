package com.GreenStitch.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserDTO {

	@Size(min = 3,max = 20 , message = "Enter minimum 3 character and maximum 20 characters in full name.")
    private String fullName;
    
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Invalid password. It must contain at least 8 characters, including at least one digit, one lowercase letter, one uppercase letter, and one special character."
        )
    private String password;
    
    @Email(message = "Enter a valid Email.")
    private String email;
    
    private String role="ROLE_USER";

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserDTO(
			@Size(min = 3, max = 20, message = "Enter minimum 3 character and maximum 20 characters in full name.") String fullName,
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Invalid password. It must contain at least 8 characters, including at least one digit, one lowercase letter, one uppercase letter, and one special character.") String password,
			@Email(message = "Enter a valid Email.") String email, String role) {
		super();
		this.fullName = fullName;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public UserDTO() {
		super();
	}
    
    
}
