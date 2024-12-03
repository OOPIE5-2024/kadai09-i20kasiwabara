package ex09;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImagePanel extends JPanel{
  BufferedImage img;
  public void setImage(BufferedImage d) {
    super.setSize(d.getWidth(), d.getHeight());
    super.setPreferredSize(super.getSize());
    img = d;
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(img, 0, 0, null);
  }
}
