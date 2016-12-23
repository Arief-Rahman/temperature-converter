package com.packtpub.mastering.selenium.pageobjects;

/**
 * Created by AriefRahman on 12/23/2016.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}
