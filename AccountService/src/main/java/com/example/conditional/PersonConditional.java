package com.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PersonConditional implements Condition {

	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		try {
			   Class.forName("com.mysql.jdbc.Driver");
			   return true;
			} catch(ClassNotFoundException e) {
				return false;
			} 
	}	

}
