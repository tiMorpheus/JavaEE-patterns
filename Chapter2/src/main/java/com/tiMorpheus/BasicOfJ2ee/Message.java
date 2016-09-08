package com.tiMorpheus.BasicOfJ2ee;

/**
 * POJO, который будет управляться как СDI компонент,
 * так как у него есть конструктор по умолчанию
 */
public class Message {
    public String getMessage(){
        return "Tymur";
    }
}
