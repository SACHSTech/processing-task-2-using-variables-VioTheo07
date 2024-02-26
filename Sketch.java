import processing.core.PApplet;

/*
 * Scaling Drawn House
 * @author: Savio. T
 */

public class Sketch extends PApplet {
  // Declare Variables
  int intH = 2;
  int intW = 2;

  public void settings() {
	// put your size call here
    size(500 * intW, 500 * intH);
  }
  public void setup() {
    background(207, 159, 255);
  }
   
  public void draw() {
	
  // Creating a House

  // Main House Body
  fill(255, 182, 193);
  rect(120 * intW, 250 * intH, 200 * intW, 200 * intH);

  // Door
  fill(255, 255, 255);
  rect(195 * intW, 350 * intH, 50 * intW, 100 * intH);
  
  // Simple Roof
  fill(176, 215, 230);
  triangle(120 * intW, 250 * intH, 225 * intW, 50 * intH, 320 * intW, 250 * intH);

  // Window
  fill(255, 255, 255);
  ellipse(220 * intW, 300 * intH, 50 * intW, 50 * intH);

  // Flashy Moon
  fill(255, 255, 237);
  circle(450 * intW, 25 * intH, 300 * 2);
  }
}