import java.awt.*;
import javax.swing.*;
import java.util.*;

class Main extends Canvas {
  int width;
  int height;
  final int l = 25;
  Pix[] data;

  public void paint(Graphics g) {
    for (int i = 0; i < data.length; i++) {
      data[i].render(g, this.l);
    }
  }

  public static void main(String[] args) {
    Main m = new Main();
    m.height = 1000;
    m.width = 1000;
    JFrame f = new JFrame("Java Project - Terrain 3D - ShShop by ShZil");

    f.getContentPane().setBackground(Color.black);
    //f.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
    f.add(m);
    f.setSize(m.width,m.height);
    f.setVisible(true);

    int w = m.width/m.l;
    int h = m.height/m.l;

    m.data = new Pix[w*h];
    for (int i = 0; i < m.data.length; i++) {
      m.data[i] = new Pix(i % w, i / w, (float)Math.random());
    }
  }
}
