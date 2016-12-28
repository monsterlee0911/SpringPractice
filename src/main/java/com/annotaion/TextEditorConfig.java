package com.annotaion;

import org.springframework.context.annotation.Bean;

public class TextEditorConfig {
	  @Bean 
	   public TextEditor textEditor(){
	      return new TextEditor( spellChecker() );
	   }

	   @Bean 
	   public SpellChecker spellChecker(){
	      return new SpellChecker( );
	   }
}
