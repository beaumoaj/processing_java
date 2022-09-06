package $package;

import processing.core.PApplet;

/**
 * Write a comment here to describe this application.
 * This is a template for a Java program using Processing.
 * 
 * @author YourName
 * @version 1.0
 */
public class ${app-name} extends PApplet {

    public void settings() {
        size(600, 400);
    }

    public void draw() {
        
    }

    //---------------------------------------------------------------------
    // Unless instructed otherwise, do not edit the code below this line...

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[]{"${package}.${app-name}"};
        PApplet.main(appletArgs);
    }
}
