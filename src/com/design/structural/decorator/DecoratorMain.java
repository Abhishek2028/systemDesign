package com.design.structural.decorator;

public class DecoratorMain {
}

//scenario:
//I have a messaging system.
//The user can have the following combinations to wrap the message
//Encryption, Compression, Formatting.
//The components :
//Component : The message interface
//Concrete component : Simple message in plain text
//Abstract decorator : The decorator specifying the structure.
//Encryption decorator , Compression decorator, Formatting decorator.